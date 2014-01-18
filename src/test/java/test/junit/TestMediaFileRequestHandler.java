package test.junit;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Arrays;

import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.junit.Test;

import sagex.remote.media.MediaFileRequestHandler;
import test.junit.lib.UnitUtils;

public class TestMediaFileRequestHandler {
	public class TestOutputStream extends ServletOutputStream {
		ByteArrayOutputStream baos = new ByteArrayOutputStream();

		@Override
		public void write(int b) throws IOException {
			baos.write(b);
		}
		
		public byte[] getBytes() {
			return baos.toByteArray();
		}
		
		public void reset() {
			baos = new ByteArrayOutputStream();
		}
	}
	
	
	@Test
	public void testRangeDownload() throws IOException {
		HttpServletRequest req = mock(HttpServletRequest.class);
		HttpServletResponse resp = mock(HttpServletResponse.class);

		final TestOutputStream tos = new TestOutputStream();
		when(resp.getOutputStream()).thenReturn(tos);
		
		File f = UnitUtils.CreateFile("testdownload.mpg", 1024*1024);

		// test range 1
		MediaFileRequestHandler mfrh = new MediaFileRequestHandler();
		mfrh.doRangeRequest(f, req, resp, 1, new long[]{0,10});
		byte data1[] = tos.getBytes();
		verifyData(data1, f, 0, 10);

		// test range 2
		mfrh = new MediaFileRequestHandler();
		tos.reset();
		mfrh.doRangeRequest(f, req, resp, 1, new long[]{10,20});
		byte data2[] = tos.getBytes();
		verifyData(data2, f, 10, 20);
		
		// verify that the range 1 and range2 are not the same range
		if (Arrays.equals(data1, data2)) {
			fail("Something is wrong different segments are the same");
		}
		
		// verify the range1 + range2 is same as range3
		mfrh = new MediaFileRequestHandler();
		tos.reset();
		mfrh.doRangeRequest(f, req, resp, 1, new long[]{0,20});
		byte data3[] = tos.getBytes();
		verifyData(data3, f, 0, 20);
		
		byte data4[] = new byte[20];
		System.arraycopy(data1, 0, data4, 0, data1.length);
		System.arraycopy(data2, 0, data4, 10, data2.length);
		
		if (!Arrays.equals(data3, data4)) {
			fail("The 2 ranges of 10 bytes each are different than the 20 byte read!!!");
		}
		
		verifyData(data4, f, 0, 20);
		
		// test complete file
		mfrh = new MediaFileRequestHandler();
		tos.reset();
		mfrh.doRangeRequest(f, req, resp, 1, new long[]{0,f.length()});
		data2 = tos.getBytes();
		verifyData(data2, f, 0, f.length());
		System.out.println("Done");
	}

	private void verifyData(byte[] data, File f, long start, long end) throws IOException {
		// verify we read the coorrect amount of data
		assertEquals((end-start), data.length);
		
		byte[] data2 = new byte[data.length];
		// verify that we read the correct data
		RandomAccessFile raf = new RandomAccessFile(f, "r");
		raf.seek(start);
		raf.read(data2, 0, data2.length);
		raf.close();
		if (!Arrays.equals(data, data2)) {
			fail("Data in outputstream is not the same as what was read from the file");
		}
	}

	@Test
	public void testRangeParsing() {
		testRange("bytes=-1024", 2048, 0, 1024);
		testRange("bytes=1024-1048", 2048, 1024, 1048);
		testRange("bytes=1024-", 2048, 1024, 2048);
		testRange("bytes=", 2048, 0, 2048);
	}

	private void testRange(String rangeHeader, int fileSize, int start, int end) {
		MediaFileRequestHandler rh = new MediaFileRequestHandler();
		long startEnd[] = rh.getRanges(rangeHeader, fileSize);
		assertTrue("Range Pase failed for: " + rangeHeader, startEnd != null);
		assertEquals(start, startEnd[0]);
		assertEquals(end, startEnd[1]);
	}
}

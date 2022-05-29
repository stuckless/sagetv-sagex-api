package org.jdna.sage.api.generator;

import java.util.ArrayList;
import java.util.List;

import org.jdna.configuration.ConfigurationManager;
import org.jdna.url.URLSaxParser;
import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import sagex.util.ILog;
import sagex.util.LogProvider;

// KEB - updated 5/27/2022 to match new javadocs format that now does not include frames
public class PackageParser extends URLSaxParser {
	private static final ILog log = LogProvider.getLogger(PackageParser.class);
	private String[] skipNames = null;
	private List<String> urls = new ArrayList<String>();

	public PackageParser(String url) {
		super(url);
		log.info("PackageParser url:" + url);
		skipNames = ConfigurationManager.getInstance().getProperty("sage.ignore", "package-summary.html").split("\\s*,\\s*");
	}

	@Override
	public void startElement(String uri, String localName, String name, Attributes atts) throws SAXException {
		if (isTag("A", localName)) {
			String url = atts.getValue("href");
			String title = atts.getValue("title");
			if(title!=null && title.equals("class in sage.api")){
				boolean skip = false;
				for (int i = 0; i < skipNames.length; i++) {
					if (url.endsWith(skipNames[i])) {
						skip = true;
						break;
					}
				}
				if (!skip) {
					urls.add(url);
				}
			}
		}
	}

	public List<String> getUrls() {
		return urls;
	}

}

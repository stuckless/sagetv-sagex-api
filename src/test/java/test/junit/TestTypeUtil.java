package test.junit;

import org.junit.Assert;
import org.junit.Test;

import sagex.util.TypesUtil;

public class TestTypeUtil {
    @Test
    public void testTypeConversion() {
        Assert.assertEquals("Test", TypesUtil.fromString("Test", String.class));
        Assert.assertEquals(10, TypesUtil.fromString("10", int.class));
        Assert.assertEquals(true, TypesUtil.fromString("true", boolean.class));
    }
}

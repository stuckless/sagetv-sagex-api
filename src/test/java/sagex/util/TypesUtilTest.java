package sagex.util;

import org.junit.Test;

import static org.junit.Assert.*;

public class TypesUtilTest {

    @Test
    public void toSageRefParts() {
        String parts[] = TypesUtil.toSageRefParts("a:b");
        assertEquals("a", parts[0]);
        assertEquals("b", parts[1]);
    }
}
package com.packt.cookbook;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppIT {
    /**
     * Test add
     */
    @Test
    public void testAdd() {
        App app = new App();
        assertEquals(5, app.add(3, 2));
    }
}

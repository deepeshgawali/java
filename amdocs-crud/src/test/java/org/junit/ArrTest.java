package org.junit;

import static org.junit.Assert.*;

public class ArrTest {

    @Test  
    public void testFindMax(){  
        assertEquals(49,Calculator.findMax(new int[]{1,3,4,2}));  
        assertEquals(-1,Calculator.findMax(new int[]{-12,-1,-3,-4,-2}));  
    }  
}


package org.junit;


import static org.junit.Assert.assertEquals;

import org.junit.Calculator;
import org.junit.Test;
 
public class CalcTest {
	Calculator calc = new Calculator();
	@Test
    public void addTest() {
    assertEquals(10,calc.add(2,8));
	}
	@Test
	public void subTest() {
		assertEquals(23,calc.sub(28,5));
	}
	@Test
	public void mulTest() {
		assertEquals(140,calc.mul(28,5));
	}
	@Test
	public void divTest() {
		assertEquals(20,calc.div(100,5));
	}
	@After
	public void msg() {
		System.out.print("sarting of testcase \n");
	}
}

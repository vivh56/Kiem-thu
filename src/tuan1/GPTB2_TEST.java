package tuan1;

import static org.junit.Assert.*;

import org.junit.Test;

import tuan1.GPTB2;

public class GPTB2_TEST {

	@Test
	public void test() {
		GPTB2 a= new GPTB2(1,2,-3);
		double x1=a.getX1();
		double x2=a.getX2();
		int flag=a.getFlag();
		assertEquals(-3.0, x1,0.001);
		
		assertEquals(1.0, x2,0.001);
		assertEquals(1, flag);
	}

}

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class ArithmeticTest {

	@Before
	public void setUp() throws Exception {
		System.out.println("About to start the test");
	}

	@After
	public void tearDown() throws Exception {
		System.out.println("Test is over");
	}

	@Test
	public final void testIsPositive() {
		
		Arithmetic ar=new Arithmetic();
		assertTrue(ar.isPosititve(8));
		assertFalse(ar.isPosititve(-6));
		
	}
	

	@Test
	public final void testMultiply() {
		
		Arithmetic ar=new Arithmetic();
		assertEquals(10,ar.multiply(5,2));
		
	}
	
	@Test
	public final void testGetMax() {
		
		Arithmetic ar=new Arithmetic();
		assertEquals(18,ar.getMax(12,18));
		
	}

	

}

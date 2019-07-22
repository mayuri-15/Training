import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class StringManipTest {

	@Before
	public void setUp() throws Exception {
		System.out.println("About to start the test");
	}

	@After
	public void tearDown() throws Exception {
		System.out.println("The test is over");
	}

	@Test
	public final void testStringManip() {
		StringManip sm=new StringManip("mayuri","MAYURI");
		assertEquals(sm.actual.toUpperCase(),sm.expected);
		
	}

}

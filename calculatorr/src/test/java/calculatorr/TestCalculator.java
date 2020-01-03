package calculatorr;

import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
/**
 * 
 * @author mfakhakhar
 *it is use to test the test cases of java project
 */
public class TestCalculator {

	private Calculator cal=new Calculator();
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		
		System.out.println("program Start Testing without problem");
	}
    
	/**
	 * this test is use to find maximum value is correct or not
	 */
	@Test
	public void MaxTest() {
		assertEquals(5, cal.findMax(3, 2, 5));
		assertNotEquals(2, cal.findMax(3, 5, 2));
		//assertEquals(-1, cal.findMax(-1, -12, -3));
		
	}
	
	/**
	 * this test is use to find Squre value is correct or not
	 */
	 
	@Test  
	public void Squre(){  
		assertEquals(9,cal.square(3));  
	}

	/**
	 * this test is use to finad -1 value squre  value is correct or not
	 */
	@Test (expected = IllegalArgumentException.class) 
	public void Square2(){  
		cal.square(-1);  
	}
	
	
	
	/**
	 * this test is use to find cube value is correct or not
	 */
	

	@Test  
	public void Cube(){  
		assertEquals(8,cal.Cube(2));  
		//assertNotEquals(2, cal.Cube(2));
	}

	
	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		System.out.println("Test are complete");
	}

}

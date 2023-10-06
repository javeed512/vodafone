package tests;

import static org.junit.Assert.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import calsi.CalculatorService;

class CalculatorServiceTest {

	static CalculatorService cal;

	
	@BeforeAll
	public static void beforeAll() {

		cal = new CalculatorService();
		
		System.out.println("Before All");

	}
	
	@AfterAll
	public static void afterAll() {
		
		  System.out.println("After All test cases");
	}
	
	@BeforeEach
	public  void beforeEach() {
		
		System.out.println("before each test case");
		
	}
	
	
	@AfterEach
	public  void afterEach() {
		
		System.out.println("after each test case");
		
	}
	

	@Test
	@DisplayName("Add Testing")
	void testAdd() {

		int actualValue = cal.add(4, 5);

		assertEquals(9, actualValue); // assertEquals(expected,actual)

		System.out.println("add test");
		
	}

	@Test
	void testSub() {

		
		int actual =  cal.sub(6, 5);
		
		assertTrue(actual == 1);
		
		System.out.println("sub test");
		
	}

	@Test
	@Disabled
	void testMul() {
		
		int actual = cal.mul(5, 4);
		
		assertNotEquals(10, actual);
		
		System.out.println("mul test");

	}

	@Test
	@DisplayName("Div Testing")
	void testDiv() {

		int actual = cal.div(10, 2);
		
		assertTrue(actual > 0);
		
		
		System.out.println("div test");
	}
	
	@Test
	public void testCalObj() {
		
		assertNotNull(cal);
		
	}
	

}

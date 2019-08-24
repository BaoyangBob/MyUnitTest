package UnitNGTest.test;

import UnitNGTest.main.Calculator;
import UnitNGTest.main.CalculatorImpl;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;


import static org.junit.jupiter.api.Assertions.assertEquals;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class CalculatorTest {

	private int max;
	private int a;
	private int b;
	private Calculator calc;

	@BeforeAll
	public void prepareSomeNumbers() {
		this.max = Integer.MAX_VALUE;
		this.a = 1;
		this.b = 1;
		this.calc = new CalculatorImpl();
	}

	@AfterAll
	public void testFinished() {
		this.max = 0;
		this.a = 0;
		this.b = 0;
		System.out.println("Done.");
	}

	@Test
	public void testAdd() {
		assertEquals(2, calc.add(a, b));
	}

	@Test()
	public void testOverflow() {
		assertEquals((long) max + max, (long) calc.add(max, max));		
	}
}

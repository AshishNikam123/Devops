import static org.junit.Assert.*;

import org.junit.Test;

public class calculatorTest {

	@Test
	public void testSum() {
		calculatordemo cal=new calculatordemo();
		assertEquals(5,cal.sum(2, 3));
		System.out.println("passSum");
	}
	@Test
	public void testSubstract() {
		calculatordemo cal=new calculatordemo();
		assertEquals(2,cal.substract(4,2));
		System.out.println("passSubstratct");
	}
	@Test
	public void testMultiply() {
		calculatordemo cal=new calculatordemo();
		assertEquals(6,cal.multiply(2, 3));
		System.out.println("passMultiply");
	}
	@Test
	public void testDivide() {
		calculatordemo cal=new calculatordemo();
		assertEquals(4,cal.divide(8, 2));
		System.out.println("passDivide");
	}

}

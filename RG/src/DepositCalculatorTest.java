import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class DepositCalculatorTest {

	@Test
	public void testDeposit() {
		DepositCalculator test = new DepositCalculator();
		double result = test.Deposit(20000.0 , 7.0, 2);
		assertEquals(22898, result,0);
	}


	@Test
	public void testDeposit1() {
		DepositCalculator test = new DepositCalculator();
		double result = test.Deposit(32000.0 , 12.0, 2);
		assertEquals(40140.8, result,0);
	}
}

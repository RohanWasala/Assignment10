package JUnitPackage;

import static org.junit.Assert.*;

import org.junit.Test;

public class Test_addNumber {

	@Test
	public void test() {
		JUnitFunction junit = new JUnitFunction();
		int ans = junit.addNumber(100, 999);
		assertEquals(1099, ans);
		//assertEquals(2000, ans);
	}

}

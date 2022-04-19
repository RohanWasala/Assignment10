package JUnitPackage;

import static org.junit.Assert.*;

import org.junit.Test;

public class Test_addString {

	@Test
	public void test() {
		JUnitFunction junitstring = new JUnitFunction();
		String result = junitstring.addString("Hello ", "World!");
		assertEquals("Hello World!", result);
		//assertEquals("HelloWorld!", result);
	}

}

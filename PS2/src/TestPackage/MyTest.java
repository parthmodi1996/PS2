package TestPackage;
import MainPackage.MyInteger;
import static org.junit.Assert.*;
import java.lang.Character;

import org.junit.Test;

public class MyTest {

	@Test
	public void testMyInt() {
		int num = RandomInt.randInt(10, 100);
		System.out.println("The number is " + num);
		MyInteger test = new MyInteger(num);
		assertTrue("Testing Time", test.isPrime());
	}
}

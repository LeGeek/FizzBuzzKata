import static org.junit.Assert.*;

import org.junit.Test;


public class FizzBuzzTest {
	FizzBuzz fizzbuzz = new FizzBuzz();

	@Test
	public void testShouldReturnNumberWhenGiveANonMultipleOf3Or5() {
		assertEquals("1", fizzbuzz.StringFor(1));
		assertEquals("2", fizzbuzz.StringFor(2));
	}
	
	@Test
	public void testShouldReturnFizzWhenGiveAMultipleOf3() {
		assertEquals("Fizz", fizzbuzz.StringFor(3));
		assertEquals("Fizz", fizzbuzz.StringFor(6));
	}
	
	@Test
	public void testShouldReturnBuzzWhenGiveAMultipleOf5() {
		assertEquals("Buzz", fizzbuzz.StringFor(5));
		assertEquals("Buzz", fizzbuzz.StringFor(10));
	}
	
	@Test
	public void testShouldReturnFizzBuzzWhenGiveAMultipleOf3And5() {
		assertEquals("FizzBuzz", fizzbuzz.StringFor(15));
		assertEquals("FizzBuzz", fizzbuzz.StringFor(30));
	}
	
	
	@Test(expected=IndexOutOfBoundsException.class)
	public void testShouldThrowIndexOutOfBoundsExceptionWhenGiveOutOfRangeNumber() {
		fizzbuzz.StringFor(102);
		fizzbuzz.StringFor(101);
		fizzbuzz.StringFor(-1);
		fizzbuzz.StringFor(0);
	}
}

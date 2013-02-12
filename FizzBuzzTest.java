import static org.junit.Assert.*;

import org.junit.Test;


public class FizzBuzzTest {
	@Test
	public void testShouldReturnNumberWhenGiveANonMultipleOf3Or5() {
		assertEquals("1", FizzBuzz.returnAnwser(1));
		assertEquals("2", FizzBuzz.returnAnwser(2));
	}
	
	@Test
	public void testShouldReturnFizzWhenGiveAMultipleOf3() {
		assertEquals("Fizz", FizzBuzz.returnAnwser(3));
		assertEquals("Fizz", FizzBuzz.returnAnwser(6));
	}
	
	@Test
	public void testShouldReturnBuzzWhenGiveAMultipleOf5() {
		assertEquals("Buzz", FizzBuzz.returnAnwser(5));
		assertEquals("Buzz", FizzBuzz.returnAnwser(10));
	}
	
	@Test
	public void testShouldReturnFizzBuzzWhenGiveAMultipleOf3And5() {
		assertEquals("FizzBuzz", FizzBuzz.returnAnwser(15));
		assertEquals("FizzBuzz", FizzBuzz.returnAnwser(30));
	}
	
	
	@Test(expected=IndexOutOfBoundsException.class)
	public void testShouldThrowIndexOutOfBoundsExceptionWhenGiveOutOfRangeNumber() {
		FizzBuzz.returnAnwser(102);
		FizzBuzz.returnAnwser(101);
		FizzBuzz.returnAnwser(-1);
		FizzBuzz.returnAnwser(0);
	}
}
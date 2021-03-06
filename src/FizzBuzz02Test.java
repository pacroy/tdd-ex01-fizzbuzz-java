import static org.junit.Assert.*;

import org.junit.Test;

public class FizzBuzz02Test {

	@Test
	public void should_return_number_when_not_multiple_of_any() {
		FizzBuzz02 fb = getNewFizzBuzz();
		assertEquals("1", fb.say(1));
		assertEquals("2", fb.say(2));
	}

	@Test
	public void should_return_fizz_when_multiples_of_three() {
		FizzBuzz02 fb = getNewFizzBuzz();
		assertEquals("Fizz", fb.say(3));
		assertEquals("Fizz", fb.say(6));
		assertEquals("Fizz", fb.say(9));
	}
	
	@Test
	public void should_return_buzz_when_multiples_of_five() {
		FizzBuzz02 fb = getNewFizzBuzz();
		assertEquals("Buzz", fb.say(5));
		assertEquals("Buzz", fb.say(10));
	}
	
	@Test
	public void should_return_fizzbuzz_when_multiples_of_fifteen() {
		FizzBuzz02 fb = getNewFizzBuzz();
		assertEquals("FizzBuzz", fb.say(15));
		assertEquals("FizzBuzz", fb.say(30));
	}
	
	@Test
	public void should_return_wow_when_multiples_of_seven() {
		FizzBuzz02 fb = getNewFizzBuzz();
		assertEquals("Wow", fb.say(7));
		assertEquals("Wow", fb.say(14));
	}
	
	@Test
	public void should_return_fizzwow_when_multiples_of_21() {
		FizzBuzz02 fb = getNewFizzBuzz();
		assertEquals("FizzWow", fb.say(21));
		assertEquals("FizzWow", fb.say(42));
	}
	
	@Test
	public void should_return_buzzwow_when_multiples_of_35() {
		FizzBuzz02 fb = getNewFizzBuzz();
		assertEquals("BuzzWow", fb.say(35));
		assertEquals("BuzzWow", fb.say(70));
	}
	
	@Test
	public void should_return_fizzbuzzwow_when_multiples_of_105() {
		FizzBuzz02 fb = getNewFizzBuzz();
		assertEquals("FizzBuzzWow", fb.say(105));
		assertEquals("FizzBuzzWow", fb.say(210));
	}

	private FizzBuzz02 getNewFizzBuzz() {
		FizzBuzz02 fb = new FizzBuzz02();
		fb.setFizzBuzzRules(new FizzBuzzRule02[] { new FizzRule02(),
			       				   				   new BuzzRule02(),
			       				   				   new WowRule02() });
		return fb;
	}

}

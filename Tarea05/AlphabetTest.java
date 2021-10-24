package Alphabet;

import static org.junit.Assert.*;

import org.junit.Test;

public class AlphabetTest {

	private Alphabet alphabet = new Alphabet();
	
	@Test
	public void itsALetterWithLowerCaseLetterTest() {
		boolean result_a = alphabet.itsALetter('a');
		assertTrue(result_a);
	}
	
	@Test
	public void itsALetterWithUpperCaseLetterTest() {
		boolean result_a = alphabet.itsALetter('A');
		assertTrue(result_a);
	}
	
	@Test
	public void itsALetterWithGreaterThanUpperCaseLettersTest() {
		boolean result = alphabet.itsALetter('_');
		assertFalse(result);
	}
	
	@Test
	public void itsALetterWithSmallerThanUpperCaseLettersTest() {
		boolean result = alphabet.itsALetter('0');
		assertFalse(result);
	}
	
	@Test
	public void itsALetterWithGreaterThanLowerCaseLettersTest() {
		boolean result = alphabet.itsALetter('}');
		assertFalse(result);
	}
	
	@Test
	public void inverseLowerToUpperTest() {
		char inverse_lower = alphabet.inverse('k');
		assertEquals(inverse_lower, 'K');	
	}
	
	@Test
	public void inverseUpperToLowerTest() {
		char inverse_upper = alphabet.inverse('R');
		assertEquals(inverse_upper, 'r');
	}
}

package Alphabet;

public class Alphabet {
	
	public boolean itsALetter(char c) {
		return (((c >= 'a')&&(c <= 'z')) || ((c >='A') && (c <= 'Z')));
	}
	
	public char inverse(char c) {
		if (Character.isUpperCase(c)) {
			return Character.toLowerCase(c);
		}
		else
			return Character.toUpperCase(c);
	}
}

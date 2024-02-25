




package jtc;
public class Str {
	
	public boolean isPalindrome(String word) {
		String reverseWord = "";
		int startIndex = word.length() - 1;
		for(int i = startIndex; i >= 0; i --) {
			reverseWord = reverseWord + word.charAt(i);
		}
		return word.equals(reverseWord);
	}

}








public class WordCount {

	public static int wordCount(String sentence) {
		int count = 1;
	
		char lastChar = sentence.charAt(0);
		
		for(int i = 1; i < sentence.length(); i ++) {
			if(sentence.charAt(i) == ' ' && lastChar != ' ') { 
				count ++;
			}
			lastChar = sentence.charAt(i);
		}
		
		return count;
	}
	
	public static void main(String[] args) {
		int count1 = wordCount("This is a sentence");	
		int count2 = wordCount("This  ");
		System.out.println(count2);
	}
}


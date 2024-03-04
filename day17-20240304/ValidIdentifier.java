





public class ValidIdentifier {
	public static boolean isDigit(char c) {
		if(c == '0' || c == '1' || c == '2' || c == '3' || c == '4' || c == '5'
				|| c == '6' || c == '7' || c == '8' || c == '9') {
				return true;
		} else { 
			return false;
		}
	}


	public static void main(String[] args) {
		
		System.out.println("isDigit('a') " + isDigit('a'));
		System.out.println("isDigit('1') " + isDigit('1'));
	}
}


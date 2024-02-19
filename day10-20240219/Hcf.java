




public class Hcf {

	public static int min(int a, int b) {
		return a < b ? a : b;
	}
	
	public static int hcf_efficient(int a, int b) {
		int limit = min(a, b);
		int hcf = 1;
		for(int i = limit; i > 0; i --) {   // more efficient
			if(a % i == 0 && b % i == 0) {
				hcf = i;
				break;
			}
		}
		return hcf;
	}
	
	public static int hcf_normal(int a, int b) {
		int limit = min(a, b);
		int hcf = 1;
		for(int i = 1; i <= limit; i ++) {
			if(a % i == 0 && b % i == 0) {
				hcf = i;
			}
		}
		return hcf;
	}

	public static void main(String[] args) {
		for(int i = 1000000; i <= 2000000; i ++) {
			//System.out.println(hcf_efficient(i, 2 * i));
			System.out.println(hcf_normal(i, 2 * i));
		}
	}
}


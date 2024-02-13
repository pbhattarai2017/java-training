




class Wallet {
	private int amount;
	String username;
	//parameterized constructor
	Wallet(String name) {
		amount = 0;
		username = name;
	}
	void addAmount(int amountToAdd) {
		if(amountToAdd <= 0) {
			System.out.println("Error: amount must be positive");
		} else {
			amount = amount + amountToAdd;
		}
	}
	void deductAmount(int amountToDeduct) {
		if(amount < amountToDeduct) {
			System.out.println("Error: deduct amount too big");
		} else {
			amount = amount - amountToDeduct;
		}
	}
	int getAmount() {
		return amount;
	}
	
	@Override
	public String toString() {
	  return String.format("Wallet[username = %s, amount = %d]", username, amount);
	}
} // end-of-Wallet-class

public class Constructor {
	public static void main(String[] args) {
		Wallet myWallet = new Wallet("user1");
		myWallet.addAmount(1000);
		System.out.println(myWallet);
	}
}

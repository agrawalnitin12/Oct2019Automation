package java_practice;

public class Account {

	int accNum;
	String Name;
	float balance;

	public void insert(int acc, String n, float bal) {
		accNum = acc;
		Name = n;
		balance = bal;
	}

	public void deposit(float amt) {
		balance = balance + amt;
		System.out.println(amt+"deposited");
	}

	public void withdraw(float amt) {
		if (amt > balance) {
			System.out.println("insufficient balance");
		} else {
			balance = balance - amt;
			System.out.println(amt+"witdrawn");
		}
	}

	public void checkBalance() {
		System.out.println("the balance is: " + balance);
	}

	public void displayInformation() {
		System.out.println(accNum + ", " + Name + "," + balance);
	}

	public static void main(String[] args) {
		Account a = new Account();
		a.insert(299015, "Nitin", 10000);
		a.displayInformation();
		a.checkBalance();
		a.deposit(5000);
		a.checkBalance();
		a.withdraw(2000);
		a.checkBalance();
	}
}

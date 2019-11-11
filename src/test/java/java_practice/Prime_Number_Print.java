package java_practice;

public class Prime_Number_Print {

	public static void main(String[] args) {
		listPrimeNumbers(100);
		System.out.println("Loop Started");
	}

	public static void listPrimeNumbers(int n) {
		System.out.println("List of Prime Numbers: ");
		for (int i = 1; i <= n; i++) {
			if (isPrimeNumber(i)) 
				System.out.println(i);
		}
	}

	public static boolean isPrimeNumber(int n) {
		if (n <= 1) {
			return false;
		}
		if (n > 1) {
			for (int i = 2; i < n; i++) {
				if (n % i == 0)
					return false;
			}
		}
		return true;
	}
}

package java_practice;

public class Palindrome {

	public static void main(String[] args) {
		String name = "abcd";
		int len = name.length();
		String rev = "";
		
		for(int i = len-1;i>=0;i--) {
			rev = rev+name.charAt(i);
		}
		if (rev.equals(name)) {
			System.out.println("palindrome");
		}
		else
			System.out.println("Not palindrome");

	}

}

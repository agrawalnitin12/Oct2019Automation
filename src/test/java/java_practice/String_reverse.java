package java_practice;

public class String_reverse {

	public static void main(String[] args) {
		String s1 = "Australia";
		int len = s1.length();
		for (int i = len-1; i>=0;i--) {
			System.out.print(s1.charAt(i));
		}

	}

}

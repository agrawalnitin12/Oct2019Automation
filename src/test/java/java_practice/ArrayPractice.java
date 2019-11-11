package java_practice;

import java.util.Scanner;

public class ArrayPractice {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number of subjects: ");
		int n = scan.nextInt();

		int marks[] = new int[n];
		int tot = 0;

		for (int i = 0; i < n; i++) {
			System.out.println("Enter the marks: ");
			marks[i] = scan.nextInt();
			tot = tot + marks[i];
		}
		System.out.println("The total marks are: " + tot);
		float percent = (float) tot / n;
		System.out.println("The percent are: " + percent);
		scan.close();
	}
}

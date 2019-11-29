package java_practice;

public class A6 implements Printable,Showable{

	public static void main(String[] args) {
		A6 a = new A6();
		a.print();
		a.Show();

	}

	public void Show() {
		System.out.println("showing");
		
	}

	public void print() {
		System.out.println("printing");
		
	}

}

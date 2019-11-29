package java_practice;

public class StaticConcept {
	
	int i = 10;
	static int j = 20;
	
	public void sum() {
		int k = i + j;
	}
	
	public static void main(String[] args) {
		StaticConcept s = new StaticConcept();
		int k = s.i+ j;
		s.sum();
	}

}

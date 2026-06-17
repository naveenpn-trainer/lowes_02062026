package assessments.quiz;
class A11 {
	public A11(long l) {
		System.out.println("Constructor with long argument is called");
	}

	public A11(int i) {
		System.out.println("Constructor with int argument is called");
	}
}

public class Q13 {
	public static void main(String[] args) {
		A11 obj = new A11(23);
	}
}



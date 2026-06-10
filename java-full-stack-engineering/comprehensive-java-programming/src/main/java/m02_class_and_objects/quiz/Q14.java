package assessments.quiz;
class A12 {
	public A12(long l) {
		System.out.println("Constructor with long argument is called");
	}

	public A12(int i) {
		System.out.println("Constructor with int argument is called");
	}
}

public class Q14 {
	public static void main(String[] args) {
		A12 obj = new A12(23L);
	}
}


package assessments.quiz;
class A9 {
	A9() {
		System.out.println("Constructor with no arguments called");
	}

	A9(float i) {
		System.out.println("Constructor with float arguments is called");
	}

	A9(double b) {
		System.out.println("Constructor with double arguments is called");
	}
}

public class Q11 {
	public static void main(String[] args) {
		A9 obj3 = new A9(23.0);
	}
}


package assessments.quiz;
class A14 {
	static A14() {
		System.out.println("static constructor");
	}
}

public class Q16 {
	public static void main(String[] args) {
		A14 obj = new A14();
	}
}

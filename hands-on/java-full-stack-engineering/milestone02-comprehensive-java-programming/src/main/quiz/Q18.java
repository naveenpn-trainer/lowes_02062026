package assessments.quiz;
class B {
	B() {
		System.out.print("Constructor\t");
	}

	static {
		System.out.print("Static Block\t");
	}
	{
		System.out.print("Instance I\t");
	}
}

public class Q18 {
	public static void main(String[] args) {
		B obj1 = new B();
		B obj2 = new B();
	}
}



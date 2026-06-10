package assessments.quiz;
class A {
	A() {
		System.out.print("Constructor\t");
	}

	{
		System.out.print("Instance I\t");
	}
	{
		System.out.print("Instance II\t");
	}
}

public class Q17 {
	public static void main(String[] args) {
		A obj = new A();

	}
}


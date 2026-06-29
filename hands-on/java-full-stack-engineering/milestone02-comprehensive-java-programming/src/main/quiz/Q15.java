package assessments.quiz;
class A13 {
	A13(byte b) {
		this(23);
		System.out.print("Byte\t");
	}

	A13(int i) {
		this(100L);
		System.out.print("int\t");
	}

	A13(long l) {
		this(100f);
		System.out.print("long\t");
	}

	A13(float f) {
		this(10.d);
		System.out.print("float\t");
	}

	A13(double d) {
		System.out.print("double\t");
	}
}
public class Q15 {
	public static void main(String[] args) {
		A13 obj = new A13((byte) 1);
	}
}
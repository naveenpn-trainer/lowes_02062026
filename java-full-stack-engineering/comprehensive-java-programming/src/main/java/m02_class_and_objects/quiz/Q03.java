package assessments.quiz;

class A1 {
	private int id;

	public void setId(int idd) {
		System.out.println(id);
	}
}

public class Q03 {
	public static void main(String[] args) {
		A1 obj1 = new A1();
		obj1.setId(23);
	}
}

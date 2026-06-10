package assessments.quiz;

class A4 {
	private int id;

	public void setId(int id) {
		id = id;
	}

	public int getId() {
		return id;
	}
}

public class Q06 {
	public static void main(String[] args) {
		A4 obj1 = new A4();
		obj1.setId(100);
		System.out.println(obj1.getId());
	}
}



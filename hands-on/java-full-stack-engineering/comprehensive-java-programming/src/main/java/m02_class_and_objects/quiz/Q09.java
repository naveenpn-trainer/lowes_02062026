package assessments.quiz;

class A7 {
	private int id;

	A7(int id) {
		this.id = id;
	}

	public void setId(int id) {
		id = id;
	}

	public int getId() {
		return id;
	}
}

public class Q09 {
	public static void main(String[] args) {
		A7 obj = null;
		// System.out.println(obj.getId());
		obj.setId(100);
		System.out.println(obj.getId());
	}
}

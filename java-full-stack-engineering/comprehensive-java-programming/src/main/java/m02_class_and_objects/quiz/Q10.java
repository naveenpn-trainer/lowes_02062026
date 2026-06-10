package assessments.quiz;
class A8 {
	private int id;

	private void setId() {
		this.id = 23;
	}

	public void getId() {
		setId();
		System.out.println(this.id);
	}
}

public class Q10 {
	public static void main(String[] args) {
		A8 obj = new A8();
		obj.getId();
	}
}



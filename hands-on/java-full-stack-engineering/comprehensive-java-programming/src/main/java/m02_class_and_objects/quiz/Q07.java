package assessments.quiz;

class A5 {
	private int id;

	A5(int id) {
		this.id = id;
	}

	public void setId(int id) {
		id = id;
	}

	public int getId() {
		return id;
	}
}

public class Q07 {
	public static void main(String[] args) {
		A5 obj = new A5(23);
		System.out.print(obj.getId()+"\t");
		obj.setId(100);
		System.out.println(obj.getId());
	}
}




package assessments.quiz;

class B12 {
	private String firstName;

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public B12 changeData() {
		B12 ob1 = new B12();
		ob1.setFirstName("NPN Training");
		return ob1;
	}
}

public class Q08 {
	public static void main(String[] args) {
		B12 obj1 = new B12();
		obj1.setFirstName("Naveen");
		System.out.print(obj1.getFirstName()+"\t");
		B12 obj2 = obj1.changeData();
		System.out.print(obj1.getFirstName()+"\t");
		System.out.print(obj2.getFirstName()+"\t");

	}
}
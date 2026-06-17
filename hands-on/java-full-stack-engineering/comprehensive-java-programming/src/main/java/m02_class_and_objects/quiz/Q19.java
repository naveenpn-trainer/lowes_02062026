package assessments.quiz;

class B14 {
	private int id;
	private String firstName = "NPN Training";

	public void changeData() {
		this.firstName = "Naveen P.N";
		B14 obj = new B14();
		printData();
		printData(obj);
		method(obj);
	}
	public void method(B14 obj) {
		obj.firstName = "Naveen";
		B14 ob = function(this);
	}
	public B14 function(B14 obj) {
		obj.firstName = "NPN";
		printData();
		return obj;
	}
	public void printData() {
		System.out.print(firstName+"\t");
	}
	public void printData(B14 o) {
		System.out.print(o.firstName+"\t");
	}
}
public class Q19 {
	public static void main(String[] args) {
		B14 obj = new B14();
		obj.changeData();
		obj.printData();

	}
}
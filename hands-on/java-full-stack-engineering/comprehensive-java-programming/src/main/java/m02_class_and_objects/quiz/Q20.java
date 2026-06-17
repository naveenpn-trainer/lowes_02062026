package assessments.quiz;

class B4 {
	public void callMe() {
		System.out.println("Hi");
	}

	public void callMe(int i) {
		System.out.println("Hello");
	}

	public void printMsg(String s) {
		System.out.println("NPN Training");
	}
}

public class Q20 {
	public static void main(String[] args) {
		new B4().callMe(23);
	}
}



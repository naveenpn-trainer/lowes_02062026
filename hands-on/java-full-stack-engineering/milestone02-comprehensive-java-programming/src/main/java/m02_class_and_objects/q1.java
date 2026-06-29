package m02_class_and_objects;

class B14 {
    private int id;
    private String firstName = "NPN Training";

    B14(B14 b){
        b.firstName = "Shruthi";
    }

    public void changeData() {
        this.firstName = "Naveen P.N";
        B14 obj = new B14(this);
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
        printData(obj);
        return obj;
    }

    public B14 function(B14 obj, B14 obj1) {
        obj.firstName = this.firstName;
        obj1.firstName = this.firstName;
        printData(obj1);
        return obj;
    }
    public void printData() {
        System.out.print(firstName+"\t");
    }
    public void printData(B14 o) {
        System.out.print(o.firstName+"\t");
    }
}
public class q1 {
    public static void main(String[] args) {
        /*B14 obj = new B14();
        obj.changeData();
        obj.printData();*/

    }
}

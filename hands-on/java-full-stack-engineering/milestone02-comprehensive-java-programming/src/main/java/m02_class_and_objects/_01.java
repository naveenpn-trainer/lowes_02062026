package m02_class_and_objects;
class A{
    A(){
        System.out.println("Constructor INvoked");
    }
    A(int x){
        System.out.println("(x)");
    }
}
public class _01 {
    public static void main(String[] args) {
        A obj1 = new A();
        A obj2 = new A(2);
    }
}

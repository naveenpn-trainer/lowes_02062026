package m02_class_and_objects;
class B{
    int x;

    public B(int x) {
        this.x = x;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }
}
public class _03_ObjectReference {
    public static void main(String[] args) {
        B obj1 = new B(10);
        B obj2 = obj1;
        System.out.println(obj1.x);
        System.out.println(obj2.x);
        obj2.x = 100;
        System.out.println(obj1.x);
    }


}

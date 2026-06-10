package m02_class_and_objects;
class H{
    public H m01(){
        System.out.println("m01()");
        return this;
    }

    public H m02(){
        System.out.println("m02()");
        return this;
    }
}
public class _12_ObjectClass {
    public static void main(String[] args) {
        new H().m01().m02();
        System.out.println(new StringBuilder("A").append("B").append("B"));
    }
}

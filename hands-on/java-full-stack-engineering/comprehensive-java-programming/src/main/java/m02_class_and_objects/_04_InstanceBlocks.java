package m02_class_and_objects;
class C{

    int x = 10;

    static {
        System.out.println("Static 01");
    }

    C(){
        System.out.println("Constructor Invoked");
    }


    {
        System.out.println("Instance Blocked - I");
    }

    {
        System.out.println("Instance Blocked - II");
    }


    void m01(){
        {
            
        }
        System.out.println("m01 Invoked");
    }
}
public class _04_InstanceBlocks {
    public static void main(String[] args) {
        C obj1 = new C();
        C obj2 = new C();
    }
}

package m02_class_and_objects;
class G{
    String s;

    public G(String s) {
        this.s = s;
    }
}
public class _11_ObjectClass {
    public static void main(String[] args) {
        String s1 = "Naveen";
        String s2 = "Naveen";
        System.out.println(s1==s2);
        System.out.println(s1.equals(s2));

        G g1 = new G("Naveen");
        G g2 = new G("Naveen");
        System.out.println(g1==g2);
        System.out.println(g1.equals(g2));
    }
}

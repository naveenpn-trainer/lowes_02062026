package m02_class_and_objects;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

class Beverage {
   private String name;

    public Beverage(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Beverage{" +
                "name='" + name + '\'' +
                '}';
    }


}
public class _10_ObjectClass {
    public static void main(String[] args) {
        List l = new ArrayList(Arrays.asList(1,2,3));
        System.out.println(l);
        Beverage f = new Beverage("Classical Tea");
        System.out.println(f);
    }
}

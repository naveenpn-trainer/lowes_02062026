package m02_class_and_objects;
abstract class Human{
    abstract void hobbies();
    abstract void speakingTone();
}
class Women extends Human{

    @Override
    void hobbies() {
        System.out.println("Window Shopping");
    }

    @Override
    void speakingTone() {
        System.out.println("Before marriage huge after marriage terrible");
    }
}
public class _06_AbstractClasses {
}

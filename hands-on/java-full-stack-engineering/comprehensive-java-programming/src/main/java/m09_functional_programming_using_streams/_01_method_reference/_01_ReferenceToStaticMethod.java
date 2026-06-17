package m09_functional_programming_using_streams._01_method_reference;

interface MathOperation {
    abstract int operate(int x, int y);
}

class MathUtils {
    static int add(int x, int y) {
        return x + y;
    }
}

public class _01_ReferenceToStaticMethod {
    public static void main(String[] args) {
        System.out.println(MathUtils.add(1, 2));
//        MathOperation mathOperation = (x,y)->{return x+y;};
        MathOperation mathOperation = MathUtils::add;
        mathOperation.operate(2, 3);

    }
}
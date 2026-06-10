package m01_language_fundamentals;
/*
    Array Declaration + Instantiation
 */
public class ArrayCreation_02 {
    public static void main(String[] args) {
        String []programmingLanguages = new String[5];
        for (String programmingLanguage : programmingLanguages) {
            System.out.println(programmingLanguage);
        }
    }
}

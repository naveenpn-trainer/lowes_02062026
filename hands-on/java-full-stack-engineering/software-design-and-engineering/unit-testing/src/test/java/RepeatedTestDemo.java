import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.RepetitionInfo;

public class RepeatedTestDemo {
    @RepeatedTest(value = 5)
    @DisplayName("Test Addition Repeatedly")
    public void addTest(){
        System.out.println("addTest method is calling ..");
    }

    @RepeatedTest(3)
    void repeat(RepetitionInfo info) {
        System.out.println(
                "Current: " + info.getCurrentRepetition());

        System.out.println(
                "Total: " + info.getTotalRepetitions());
    }
}

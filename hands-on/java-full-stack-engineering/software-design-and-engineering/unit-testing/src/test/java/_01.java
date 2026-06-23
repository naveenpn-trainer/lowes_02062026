import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.EnabledOnOs;
import org.junit.jupiter.api.condition.OS;

public class _01 {
    @EnabledOnOs(OS.WINDOWS)
    @Test
    void runOnlyOnWindows() {
        System.out.println("Execute only on windows");
    }

    @EnabledOnOs(OS.LINUX)
    @Test
    void runOnlyOnLinux() {
        System.out.println("Execute only on windows");
    }
}

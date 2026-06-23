package lowes.utils;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;

public class LifecycleTest {

    @BeforeAll
    public static void beforeAll(){
        System.out.println("@BeforeAll");
    }

    @BeforeEach
    public void beforeTest(){
        System.out.println("@BeforeEach");
    }
}

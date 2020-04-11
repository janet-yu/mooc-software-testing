package tudelft.gettingstarted;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class GettingStartedTest {

    GettingStarted g;

    @BeforeEach
    public void setup() {
        g = new GettingStarted();
    }
    // each test case is represented by a method! use @Test to indicate a method is a test case
    // oracle = what we expect to him/something that makes sure the test has passed
    @Test
    public void addFiveTo20() {
        int result = g.addFive(20);
        // first parameters = expected, second is actual
        Assertions.assertEquals(25,result);
    }

//    UNCOMMENT THE CODE BELOW, AND FILL THE GAPS!
    @Test
    public void addFiveToZero() {
        int result = g.addFive(0);
        Assertions.assertEquals(5, result);
    }

    @Test
    public void addFiveToMinus20() {
        int result = g.addFive(-20);
        Assertions.assertEquals(-15,result);
    }

    // separate test cases is MUCH BETTER than shoving them all into one method
    // bc when one fails, we see the name of the test case,
    // and then we get a better idea of what bugs we have in the program

//    @Test
//    public void badPractice() {
//        int result = g.addFive(0);
//        // if one fails, the rest of the assertions will not run!
//        Assertions.assertEquals(5, result);
//        result = g.addFive(1);
//        Assertions.assertEquals(6, result);
//    }

}

import jdk.nashorn.internal.runtime.regexp.joni.constants.Arguments;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.testng.Assert;
//import org.junit.jupiter.params.ParameterizedTest;
import java.util.stream.Stream;


public class Homework15TestJunit {

    @BeforeAll
    public static void beforeClass() {
        System.out.println("Before all tests..");
    }

    @BeforeEach
    public void beforeMethod() {
        System.out.println("Before each test..");
    }

    @AfterEach
    public void afterMethod() {
        System.out.println("After each test..");
    }

    @AfterAll
    public static void afterClass() {
        System.out.println("After all tests..");
    }


//    @org.jetbrains.annotations.NotNull
//    public static Stream<Arguments> ticketNumbersPositiveJU() {
//        return Stream.of(
//                Arguments.of("123321"),
//                arguments("111111"),
//                arguments("999999")
//        );
//    }
//

//    public static Object[][] ticketNumbersPositiveJU() {
//        return new Object[][]{
//                {1, 2, 3, 3, 2, 1},
//                {1, 1, 1, 1, 1, 1},
//                {9, 9, 9, 9, 9, 9},
//
//        };
//    }
//
//    @ParametrizedTest
//    @MethodSource("ticketNumbersPositiveJU")
//    public void verifyLuckyTicketPositiveJU(int[] paramOneArray) {
//        boolean actualResult = Homework15.checkLuck(paramOneArray);
//        Assert.assertTrue(actualResult, "Ticket is not lucky");
//
//    }
}







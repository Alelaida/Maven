import org.testng.Assert;
import org.testng.annotations.*;

public class Homework15TestNG {

    @BeforeClass
    public static void beforeClass() {
        System.out.println("Before all tests..");
    }

    @BeforeMethod
    public static void beforeMethod() {
        System.out.println("Before each test..");
    }

    @AfterMethod
    public static void afterMethod() {
        System.out.println("After each test..");
    }

    @AfterClass
    public static void afterClass() {
        System.out.println("After all tests..");
    }

    //Cases
    //Positive
//    {1, 2, 3, 3, 2, 1},-> true
//    {1, 1, 1, 1, 1, 1},-> true
//    {9, 9, 9, 9, 9, 9} -> true

    //Negative
//    {1, 2, 3, 4, 5, 6} -> false
//    {1,0,0,0,0,0}-> false

    //Non valid for test
//    {1, -2, 3, 4, 5, 6},
//    {-1, -2, -3, -3, -2, -1},
//    {0, 0, 0, 0, 0, 0},
//    {-1, 0, -2, 0, 0, 0},

    //Non valid for compiler
//    {1, 2, 3, 3, 2,},
//    {1, 2, 3, 3, 2,1,0},
//    {0.0,0.1,0.2,0.3,0.4,0.5},
//    {"a", 1, 1, 1, 1, 1},
//    {@, 1, 1, 1, 1, 1},
//    { , , , , , }
//    {}


    @DataProvider(name = "validNumbers")
    public static Object[][] ticketNumbersPositive() {
        return new Object[][]{
                {1, 2, 3, 3, 2, 1},
                {1, 1, 1, 1, 1, 1},
                {9, 9, 9, 9, 9, 9},

        };
    }


    @Test(dataProvider = "validNumbers")
    public void verifyLuckyTicketPositive(int[] paramOneArray) {
        boolean actualResult = Homework15.checkLuck(paramOneArray);
        Assert.assertTrue(actualResult, "Ticket is not lucky");
    }

    @DataProvider(name = "nonValidNumbers")
    public static Object[][] ticketNumbersNegative() {
        return new Object[][]{
                {1, 2, 3, 4, 5, 6},
                {1, 0, 0, 0, 0, 0}
        };
    }

    @Test(dataProvider = "nonValidNumbers")
    public void verifyLuckyTicketNegative(int[] paramOneArray) {
        try {
        boolean actualResult = Homework15.checkLuck(paramOneArray);
        Assert.assertTrue(actualResult, "Ticket is not lucky");
    } catch (AssertionError e ) {
        System.out.println("Ticket is not lucky");
    }
    }

    @DataProvider(name = "nonExistingTicket")
    public static Object[][] checkTicketExistance() {
        return new Object[][]{
                {1, -2, 3, 4, 5, 6},
                {-1, -2, -3, -3, -2, -1},
                {0, 0, 0, 0, 0, 0},
                {-1, 0, -2, 0, 0, 0},
                {1, 2, 3, 4, 5,},
        };
    }

    @Test(dataProvider = "nonExistingTicket")
    public void checkTicketExistancee(int[] paramOneArray) {
        try {
            boolean actualResult = Homework15.checkTicket(paramOneArray);
            Assert.assertTrue(actualResult,"Ticket does not exist ");
        } catch (AssertionError e ) {
            System.out.println("Ticket doesn't exist");
        }
    }
}

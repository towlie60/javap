package tests.Testng.TestNG;

//import org.junit.Assert;
import org.testng.Assert;
import org.testng.annotations.Test;
//import org.junit.Test;

import java.text.ParseException;

public class ExceptionTest {


    //"123"
    //"ab123ab"
    public static int parseStringIntoInteger(String str) {
//        throw new IndexOutOfBoundsException();
        return Integer.parseInt(str);
    }



    @Test(groups = "regression2")
    public void positive() {
        int actual= parseStringIntoInteger("1234");
        Assert.assertEquals(actual, 1234);
    }


    @Test(groups = "regression2")
    public void negative() {
        try {
            parseStringIntoInteger("abc123");
            Assert.fail();
        } catch (NumberFormatException e) {
            System.out.println("Exception was thrown");
            Assert.assertTrue(true);
        }
    }
    /** how do you test exceptions?
     * by using expectedExceptions attribute
     */
    @Test(expectedExceptions = NumberFormatException.class)
    public void negativeBetterWay(){
        parseStringIntoInteger("abc1234");
    }
}
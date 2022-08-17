package tests.runners.runners;


import Methods.testclasses.ClassesToTests;
import org.junit.Assert;
import org.junit.Test;

public class AssertDemo2 {


    @Test
    public void test1() {
        //fail
        System.out.println("HEllo World");
        if (false) {
            Assert.fail("" +
                    "User login unsuccessful"); // we use fail method
        } else {
            Assert.fail("No internet connection");
        }
        //in setup part of the test
        System.out.println("After Fail");

    }

    @Test
    public void assertEqualsMethod() {
        int result = 100 % 8;
        Assert.assertEquals("Modulo operation failure", 4, result);
        System.out.println("Done testing module feature");
    }


    @Test
    public void assertEqualsWithDouble() {
//As a Weather company we would like to provide our customers weathers in both F and C.
        //C should be rounded to 2 decimal points.
        //
        //   System.out.println("Converted" + 90 + "farenheit to C and result it " + actualC);
        double actualC = ClassesToTests.convertFtoC(80.0);

        System.out.println("Converted " + 90 + " farenheit to C and result is " + actualC);
        //if the expected result is wrong the tester has problem
        //if the acutual result is wrong the dev has a problem

        //validating the result of our program
        Assert.assertEquals("Fahranheit to Celcius converter failure ", 26.7, actualC, 0.0);
        System.out.println("Done Testing F to C feature ");
    }

    @Test
    //test data vs production data.
    public void convertNegativeCase() {
        double actual = ClassesToTests.convertFtoC(-20);

        Assert.assertEquals("Fahranheit to Celcius converter failure in negative F", -28.889, actual, 0.0);
    }

    @Test
    public void convert0toTest() {
        double actual = ClassesToTests.convertFtoC(0);

        Assert.assertEquals("Fahranheit to Celcius converter failure in negative F", -17.76, actual, 0.0);
    }

    //Where do I get Test Data from?
    //TDD -> write tests first then start development
    //your development will be complete when all tests pass
    @Test
    public void reverseArrayTest1() {
        String[] arr = {"Happy", "World", "123", "43253", "2332"};

        String actual = ClassesToTests.reversesArray(arr);

        Assert.assertEquals("Reverse Array failure", "2332 -> 43253 -> 123 -> World -> Happy -->", actual);
    }

    @Test
    public void reverseArrayTest2() {
        String[] arr = new String[4];

        String actual = ClassesToTests.reversesArray(arr);

        Assert.assertEquals("Reverse Array failure", null, actual);
    }


    @Test
    public void assertNull() {
        //some functionalities will have return null by requirement
        String[] arr = new String[4];

        String actual = ClassesToTests.reversesArray(arr);

        Assert.assertNull("Reverse Array failure", actual);

    }


    @Test
    public void assertNotNull() {
        //some functionalities will have return null by requirement
        String[] arr = {"12", "243"};

        String actual = ClassesToTests.reversesArray(arr);

        //actual  != null
        //null is a location in memory used for letting variable (references) to point to nothing.
        Assert.assertNotNull("Reverse Array program failure", actual);
    }

    @Test
    public void nullCaseTest() {
        //some functionalities will have return null by requirement
        String[] arr = null;
        String actual = ClassesToTests.reversesArray(arr);

        //actual  != null
        //null is a location in memory used for letting variable (references) to point to nothing.
        Assert.assertEquals("Reverse Array program failure", "Nulls are not supported",  actual);

    }
}
//"user johnDoeTest login unsuccessful"
  //      "After Fail "

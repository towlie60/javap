package tests.runners1;


import lists.MoveToEnd;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import tests.jnuit.AssertionDemo;
import tests.jnuit.JunitDemo;
import tests.jnuit.MoveToEndTest;
import tests.jnuit.SecondTestClass;
import tests.runners.runners.AssertDemo2;
import tests.runners.runners.FirstTest;

@RunWith(Suite.class)
@Suite.SuiteClasses({AssertionDemo.class,
        FirstTest.class,
        AssertDemo2.class,
        JunitDemo.class,
        MoveToEndTest.class,
        SecondTestClass.class})
public class RegressionRunner {

    @BeforeClass
    public static void beforeAll() {
        System.out.println("Selenium open chrome");
        System.out.println("Selenium go to amazon.com");
        System.out.println("Selenium make sure my window is maximized");
    }

    @AfterClass
    public static void tearup(){
        System.out.println("Close the browser");
        System.out.println("Clean the mess you made");
    }
}

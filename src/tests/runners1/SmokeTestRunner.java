package tests.runners1;


import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import tests.runners.runners.AssertDemo2;
import tests.runners.runners.FirstTest;

@RunWith(Suite.class)
@Suite.SuiteClasses({FirstTest.class, AssertDemo2.class})
public class SmokeTestRunner {
}

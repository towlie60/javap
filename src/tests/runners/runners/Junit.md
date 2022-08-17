####https://mvnrepostiory.com/ - to find all java libraries 

## JUNIt
//
//            1. java unit testing —> Junit is an open source java library that helps excuting unit tests in automated way
//
##   open source —> means free to use
//
//    java library- means some java program (classes) that we can use to achieve some tasks. so some company (guys) developed a program that solves a problem so we just reuse their solutions.
//
//    right now all we have to do is to learn how to use programs that someone has created
//
 ##    ex of libraries:
//
//    jdk libraries → scanner, system, random, math, string.
//
//    external libraries —> junit, TestNG, Cucumber, Selenium, JDBC, RestAssured, Jackson, Hamcrest.
  ##           .jar → is the final artifact of a java program.
//    external libraries are not included into our problem, so we have to dowload .jar(java architype) file and import it to our java project
//
//    some .jar file(libraries) will have a dependency on other .jar files(libraries)
//
//    java is super cool in that it you can create programs for user to use or you create programs for other developers to use.
//
//
##            dependency —> dependent on, can not work without some other jar file.
//
//    what is a method?
//
//            -is a block of code which runs only when we call it?
//
//            -we use methods in order to avoid repetition of the same logic in the code. you can use the logic everywhere you need it. if there is a change in the logic then you only need to change it in one place. that gives you great code maintainability.
//
##    unit test —> is a test of a java method. this is done developer of an application
//
//    unit test is the first test in the whole hierachy of tests.
//
//    unit test if a first level of test automation
//
//    junit helps getting result of method, and creating report. it helps executing multiple(1000 tests) at once.
//}

// steps to import for files
1. download jar file
2. open intellij --> file 
3. project structure 
4. choose libraries on the left panel 
5. hit + sign 
6. choose java
7. find .jar file click 
8. and ok. 



####Project zipping. 
external libraries are not included into zip files
When you zip your project and send it to someone else 
That someone else will have to import jar files again

####Junit Test Definition(Initialization) error
When you have junit test running exception
it means the test didn't even run
initialize --> init() --> start
having one test defined incorrectly will block any of the test
to run Every application in world has startup process(check)
before it fully starts it has to go through multiple checks
like check if the application has access to DB.
check if the has internet connection
same thing with Junit. Before it runs any tests it will
check if all tests are defined properly


//Before Annotation
Before annotation is a public void method. Which runs once before 
every single test. When you have some common precondition steps
for every test in the same class you can put @before so that 
you dont have to repeat the same steps for many tests. 

Before and After annotations are known as hooks. 

####After Annotation
After annotation is a public void method. Which runs once after
every single test. When you have some common tear up(cleanup) steps
for every test in the same class you can put @after so that
you dont have to repeat the same steps for many tests. 

After us guaranteed to run whether the test it's running after 
passes or fails. 


####BeforeClass Annotation
Before class annotation will be run only once before all tests. 
Only once per one class. BeforeClass will run first before
@before annotation.
@BeforeClass method must be a static. 

ex: Open Browser Since you dont have to spend time for 
opening and closing the browser. Bc Browsers are released versions 
from big companies like Google, Apple so you can trust them

AfterClass will also run only once after all tests

###Assert 
assertions are the validating part of a test 

in junit there are multiple assertion options and every single assertion has a parameter that takes a custom error message

Testing good practices
1. In my framework I always put custom error messages on my assertions in order to be able to identify the point 
of failure from the first glance, which helps me find the root cause of a test failure quicker.

2. Every test case must be independent of each other - if an Sdet or QA or Dev designs a test depends on the 
result of a previous test, it will cause the new test to fail just because the first test failed. In such scenarios
which are extremely common, our framework will be producing false reports about tests. 

3. 



1. Assert.fail() --> when this method is called test will fail
with AssertionException.
Assert.fail(String msg) --> we can pass a custom message

2. 
a. int, short, byte, long -Assert.assertEquals(String msg, int expectedResult, int actualResult);
b. double, float - Assert.assertEquals(String msg, double  expectedResult, double actualResult, double delta);
delta is decimal difference between expected and actual results you want to allow for your test.

c. String --> Assert.asserEquals(String msg, String expectedm String actual);

d. assertNull -> you pass an object(non-primitive) to assertNull(String msg, Object obj);
e. assertNotNull -> you pass an object(non-primitive) to assertNotNull(String msg, Object obj); and it will return
true if the object is not null.
f. assertTrue -> assertTrue(String msg, boolean actual) -> if actual result is true then test passes
g. assertFalse -> assertFalse(String msg, boolean actual) -> if actual result is false then test passes



##Runner classes
In order to run multiple Test Classes together we need to implement Junit 
Test Runner class.

Runner class can be configured with the help of some Junit annotations

1. @RunWith(Suite.class) -> RunWith annotation takes differnt params and we
need to pass Suite.class

2. @Suite.SuiteClasses({list all test classes you want to unclude separated by a comma })
ex:

   @RunWith(Suite.class)
   @Suite.SuiteClasses({FirstTest.class, AssertDemo2.class})
   public class SmokeTestRunner{} 
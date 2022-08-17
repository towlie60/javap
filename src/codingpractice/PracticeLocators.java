//package codingpractice;
//
//import org.junit.Assert;
//import org.junit.Test;
//
//public class PracticeLocators {
//    @Test
//    public  void testPartialLink()  throws InterruptedException {
//
//
//
//        WebDriverManager.chromedriver().setup();
//
//        driver = new ChromeDriver();
//
//        driver.get("https://www.google.com/");
//        //using partial link text we will click on How Search works
//
//        WebElement link = driver.findElement(By.partialLinkText("How Search"));
//        link.click();
//        Thread.sleep(2000);
//        //Discover How Google Search Works
//
//        String expected = "Discover How Google Search Works";
//
//        Assert.assertTrue("Title verification failed. Expected: "+expected+". Actual:"
//                +driver.getTitle(), driver.getTitle().contains(expected));
//}

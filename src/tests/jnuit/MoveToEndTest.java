package tests.jnuit;


import lists.MoveToEnd;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class MoveToEndTest {

    //check if ll targeted value was moved to end in unsorted arraylist
    //we don't want to change the order of the whole array
    // but we want to swap only the targeted value and the value at the end of the list.
    //list in this case.
    //@Test annotation works only with methods so it'll complain if ypu don't
    //put a method underneath it
    @Test
    public void oneValueWasMovedToEndTest() {
        // All tests will have three sections:
        // 1.setup (precondition -- for the execution);

        // I have sth to execute, but b4 doing that, I need sth to
        // 2.execution;
        // 3. validation;

        //SETUP
        ArrayList<Integer> nums = new ArrayList<>();
        nums.add(99);
        nums.add(88);
        nums.add(50);
        nums.add(-100);
        nums.add(10);
        // 99,88,50,-100,10 --> given
        // 99,88,50,-100, 88 --> expected
        int target = 88;
        MoveToEnd moveToEnd = new MoveToEnd();
        // we call it actual as it comes from the program
        //EXECUTION
        List<Integer> actual = moveToEnd.moveElementToEnd(nums, target);
        //VALIDATION -> make sure that expected actual and that actual results meets the expected
        List<Integer> expected = new ArrayList<>();
        expected.add(99);
        expected.add(10);
        expected.add(50);
        expected.add(-100);
        expected.add(88);
        Assert.assertEquals(expected, actual);

    }
    //target value = q0
    //[10,947, 54,10]
    //expected - [54 ,947, 10, 10]
    //Checks if all targeted values are moved to the end of ArrayList
    // all targeted values are swapped with the element from the end of the ArrayList if
    //values that are swapped take the index of targeted value
    //targeted values is swapped with last element that is not equal to targeted value.


    @Test
    public void allTargetElementMovedToEndOfList() {
        // All tests will have three sections:
        // 1.setup (precondition -- for the execution);

        // I have sth to execute, but b4 doing that, I need sth to
        // 2.execution;
        // 3. validation;

        //SETUP
        ArrayList<Integer> nums = new ArrayList<>();
        nums.add(99);
        nums.add(0);
        nums.add(50);
        nums.add(0);
        nums.add(10);
        nums.add(80);
        nums.add(65);
        nums.add(0);
        nums.add(80);
        nums.add(10);
        // 99, 0, 50, 0, -10, 80, 65, 0 ,80, 10 --> given
        //  99, 10 , 50, 0, 80, -10, 80, 65, 0 , 0, 0  --> expected
        int target = 0;
        MoveToEnd moveToEnd = new MoveToEnd();
        //mv.moveElementToEnd(nums,target);

        //EXECUTION
        List<Integer> actual = moveToEnd.moveElementToEnd(nums, target);

        //VALIDATION -> make sure that expected actual and that actual results meets the expected
        List<Integer> expected = new ArrayList<>();
        expected.add(99);
        expected.add(10);
        expected.add(50);
        expected.add(80);
        expected.add(10);
        expected.add(80);
        expected.add(65);
        expected.add(0);
        expected.add(0);
        expected.add(0);

        Assert.assertEquals(expected, actual);

    }


    //pt2 1:31
    @Test
    public void matchAtEndTest() {
        // All tests will have three sections:
        // 1.setup (precondition -- for the execution);

        // I have sth to execute, but b4 doing that, I need sth to
        // 2.execution;
        // 3. validation;

        //SETUP
        ArrayList<Integer> nums = new ArrayList<>();
        nums.add(10);
        nums.add(947);
        nums.add(54);
        nums.add(10);

        // 99, 0, 50, 0, -10, 80, 65, 0 ,80, 10 --> given
        //  99, 10 , 50, 0, 80, -10, 80, 65, 0 , 0, 0  --> expected
        int target = 10;
        MoveToEnd moveToEnd = new MoveToEnd();
        //mv.moveElementToEnd(nums,target);

        //EXECUTION
        List<Integer> actual = moveToEnd.moveElementToEnd(nums, target);

        //VALIDATION -> make sure that expected actual and that actual results meets the expected
        List<Integer> expected = new ArrayList<>();
        expected.add(54);
        expected.add(947);
        expected.add(10);
        expected.add(10);


        Assert.assertEquals(expected, actual);

    }

    //pt 3 1:34
    @Test
    public void oneElementListTargetThatValueTest() {
        // All tests will have three sections:
        // 1.setup (precondition -- for the execution);

        // I have sth to execute, but b4 doing that, I need sth to
        // 2.execution;
        // 3. validation;

        //SETUP
        ArrayList<Integer> nums = new ArrayList<>();
        nums.add(10);

        // 99, 0, 50, 0, -10, 80, 65, 0 ,80, 10 --> given
        //  99, 10 , 50, 0, 80, -10, 80, 65, 0 , 0, 0  --> expected
        int target = 10;
        MoveToEnd moveToEnd = new MoveToEnd();
        //mv.moveElementToEnd(nums,target);

        //EXECUTION
        List<Integer> actual = moveToEnd.moveElementToEnd(nums, target);

        //VALIDATION -> make sure that expected actual and that actual results meets the expected
        List<Integer> expected = new ArrayList<>();

        expected.add(10);


        Assert.assertEquals(expected, actual);

    }
//135.00
    @Test
    public void oneElementWithWrongTarget() {
        // All tests will have three sections:
        // 1.setup (precondition -- for the execution);

        // I have sth to execute, but b4 doing that, I need sth to
        // 2.execution;
        // 3. validation;

        //SETUP
        ArrayList<Integer> nums = new ArrayList<>();
        nums.add(10);

        // 99, 0, 50, 0, -10, 80, 65, 0 ,80, 10 --> given
        //  99, 10 , 50, 0, 80, -10, 80, 65, 0 , 0, 0  --> expected
        int target = 0;
        MoveToEnd moveToEnd = new MoveToEnd();
        //mv.moveElementToEnd(nums,target);

        //EXECUTION
        List<Integer> actual = moveToEnd.moveElementToEnd(nums, target);

        //VALIDATION -> make sure that expected actual and that actual results meets the expected
        List<Integer> expected = new ArrayList<>();

        expected.add(10);


        Assert.assertEquals(expected, actual);

    }
//1:35
    @Test
    public void wrongTargetTest(){
        // All tests will have three sections:
        // 1.setup (precondition -- for the execution);

        // I have sth to execute, but b4 doing that, I need sth to
        // 2.execution;
        // 3. validation;

        //SETUP
        ArrayList<Integer> nums = new ArrayList<>();
        nums.add(10);
        nums.add(947);
        nums.add(54);
        nums.add(10);

        // 99, 0, 50, 0, -10, 80, 65, 0 ,80, 10 --> given
        //  99, 10 , 50, 0, 80, -10, 80, 65, 0 , 0, 0  --> expected
        int target = -44;
        MoveToEnd moveToEnd = new MoveToEnd();
        //mv.moveElementToEnd(nums,target);

        //EXECUTION
        List<Integer>actual= moveToEnd.moveElementToEnd(nums, target);

        //VALIDATION -> make sure that expected actual and that actual results meets the expected
        List<Integer> expected = new ArrayList<>();

        expected.add(10);
        expected.add(947);
        expected.add(54);
        expected.add(10);



        Assert.assertEquals(expected,actual);

    }
}



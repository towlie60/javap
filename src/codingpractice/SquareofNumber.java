package codingpractice;

public class SquareofNumber {
    public static void main(String[] args) {
         int raisedNumber, numberToRaise;

         numberToRaise = 3;
         raisedNumber = raisedToTheSecondPower(numberToRaise);
        System.out.println("Square of 3 is" + raisedNumber);
        numberToRaise = 4;
       raisedNumber = raisedToTheSecondPower(numberToRaise);
        System.out.println("Sqaure of 4 is" + raisedNumber);
    }
    static int raisedToTheSecondPower(int inputNumber) {
        return inputNumber * inputNumber;
     // return Math.pow(inputNumber,2);
    }
}

package loops;

public class FibonacciNumbers {

    public static void main(String[] args) {



    //public static void FibonacciNumbers() {
        //1 1 2 3 5 8 13 21 34 55
        FibonacciNumbers(8);

    }

  //for(int i = 0; i<=10; i++) {
  public static void FibonacciNumbers(int n ) {
      int num = 0;
      int num2 = 1;
      System.out.print("1 ");

      for(int i = 1; i<n; i++){
          int sum = num+num2;
          num = num2;
          num2 = sum;
     //     System.out.print(sum );
          //num = 1
          //num2 = 2
          //sum = 3

          //num = 2
          //num2 = 3
          //sum = 5

          //num = 3
          //num2 = 5
          //sum = 8


          System.out.print(sum + " ");
      }
  }

    }

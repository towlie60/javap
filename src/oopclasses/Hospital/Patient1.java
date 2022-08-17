package oopclasses.Hospital;

public class Patient1 {
 //static final int MAX;
    //ddd-ddd-dddd
    //enum ->

    private static int IbuprofenPrice = 120;
    private static int advilPrice = 10;
    private static int halls = 5;

    private String dob;
    private String fullName;
    private char gender;
    private  String phoneNumber;
    private final String nationality;
    private double balance;

    public Patient1(String dob, String fullName, char gender, String phoneNumber, String nationality) {
        //give initial state of an object.
        this.dob = dob;
        this.fullName = fullName;

            this.gender = gender;
     //  } else{
        //   System.out.println("Np such gender exists: " + gender);
       // System.out.println("Choose a valid gender by calling setGender method");
  //  }
           //nnn-nnn-nnnn
        this.phoneNumber = phoneNumber;
        this.nationality = nationality;
    }
    //  public Patient(String dob, String fullName, char gender, String phoneNumber, String nationality) {
         /*
         Instead of writing this:
         this.dob = dob;
         this.gender = gender;
         this.phoneNumber = phoneNumberl
         we can use this() method:
         this(dob, fullName, gender, phoneNumber);
         or we can use it just that way:
          */

    //  this(dob, fullName, gender, phoneNumber, "American");

    public Patient1(String dob, String fullName, char gender, String phoneNumber) {
        this(dob, fullName, gender, phoneNumber, "American");
    }

    public Patient1(String fullName, char gender, String phoneNumber, String nationality) {
        this("xxx/xx/xxxx", fullName, gender, phoneNumber, nationality);
    }

    /**
     *  Give user ability to create a Patient Object
     * without DOB
     *  and without natiaonality
     * <p>
     * default DOB should be - xx/xx/xxxx
     * default nationality should be - American
     * @param fullName
     * @param gender
     * @param phoneNumber
     */
    public Patient1(String fullName, char gender, String phoneNumber) {

        this("xx/xx/xxxx",fullName,gender,phoneNumber);
    }
    //instance variables are accessible anywhere in the class

    /**
     * Prints out full info about a Patient
     *
     */
    public void printAllInfo(){
        System.out.println("Patient Info");
        System.out.println("Full Name: " + fullName);
        System.out.println("Date of Birth: " + dob);
        System.out.println("Gender: " + gender);
        System.out.println("phone: " + phoneNumber);
        System.out.println("Balance: " + balance);
    }
    //return the age of the patient
    //return 0 for default ages xx/xx/xxxx
    public int getAge(){
        //01/22/1994
       int year = Integer.parseInt(dob.substring(dob.lastIndexOf("/")+1));
       return 2021 - year;
    }
    //which ever patient object will call this method
    //we will change their number

    public void changeNumber(String phoneNumber){
        this.phoneNumber = phoneNumber ;
}
       //updates balance
      //Charge patients if they orderMedicine
     //if the medicine is Ibuprofen patient needs to be charged $120
    //if the medicine is advil patient needs to be charged $10
    //if the medicine is halls charge $5
    //if we dont sell the medicine Say we dont have that medicine.

    public void orderMedicine(String medicine){
        switch(medicine){
            case"Ibuprofen":
                this.balance += 5;
                break;
            case "Advil":
                this.balance += advilPrice;
                break;
            case "Halls":
                this.balance += halls;
                break;
            default:
                System.out.println("We do not have such medicine");
        }
    }

    public void payBalance(double amount) {
        if (amount > this.balance) {
          //  amount-=this.balance;
          //  this.balance = 0;
            System.out.println("We charge you" + amount + ".Your balance is: " + this.balance);
            amount-=this.balance;
            System.out.println("Your change is" +amount);

            this.balance = 0;

        } else
        {
            this.balance -= amount;
        }
    }

    /**
     * Mutator method
     * just call it setter method
     * it updates the desired instance variable
     * after the value gets checked
     * @param gender
     */
    public void setGender(char gender) {
        if (gender == 'M' || gender == 'F' || gender == ' ') {
            this.gender = gender;
        }
        else {
            System.out.println("No such gender exists: " + gender);
        }
    }

    public char getGender(){
        return gender;
    }
 public String getDob(){
        return dob;
    }
    public void setDob(String dob){
        this.dob=dob;
}
}
    //payBalance

//        this.dob = "xx/xx/xxxxx";
//        this.fullName =  fullName;
//        this.gender = gender;
//        this.phoneNumber = phoneNumber;
//        this.nationality = "American";
     //   this();



            //this keyword is redundant
//            this.dob = "xx/x/xxxx";
//            this.fullName = fullName;
//            this.gender = gender;
//            this.phoneNumber = phoneNumber;
//            this.nationality = nationality;


//
//    public Patient(String dob, String alex_marino, char m, String phoneNumber) {
//        this.dob = dob;
//        this.fullName = fullName;
//        this.gender = gender;
//        this.phoneNumber = phoneNumber;
//        //hard coded value
//        this.nationality = "American";

//           public Patient(String dob, String alex_marino, char m, String phoneNumber) {
//         //calls another constructor
//            this(dob,fullName,gender,phoneNumber,"American");
//            //hard coded value
//            this.nationality =;

//



    

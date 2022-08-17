package arithmetic_operators;

public class AssignmentOperatorspt2 {
    public static void main (String [] args) {

        //given that salary grows 3% per year
        //find me what will be my salary after 5 years.
        int currentYear = 2020;
        int periodOfYears = 2;
        double currentYearSalary = 100_000.00; // (we can separate number with _ for readability purposes.)

        double salaryIncrease = 1.03; //
        //(salary * 0.03) + 100_000
        //100_000 * 1.03


        currentYearSalary*=salaryIncrease;
        currentYearSalary*=salaryIncrease;
        currentYearSalary*=salaryIncrease;
        currentYearSalary*=salaryIncrease;
        System.out.println(currentYearSalary);
    }

}

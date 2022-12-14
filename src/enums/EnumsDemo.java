package enums;

import static enums.TaxMaritalStatus.*;
public class EnumsDemo {


    public static void main(String[] args) {
        //  isWorkDay("1223rfegdfvddasdfadfgasdgadgs");
        //  isWorkDay("sunday");

        System.out.println(isWorkDay(DaysInWeek.THURSDAY));

        calculateTax(120_000, TaxMaritalStatus.MARRIED_FILE_AS_SINGLE);
        calculateTax(120_00, SINGLE);
        calculateTax(120_00, MARRIED);
        calculateTax(120_00, SINGLE);

        //isWorkDay(DaysInWeek.valueOf("OneMoreSunday"));

        System.out.println(MARRIED.getValue());
        System.out.println(MARRIED.toString());
    }

    private static void calculateTax(int i, TaxMaritalStatus marriedFileAsSingle) {
    }

    //  private static void calculateTax(int i, TaxMaritalStatus marriedFileAsSingle) {


    //    public static boolean isWorkDay(String day) {
//        return true;
//    }
    public static boolean isWorkDay(DaysInWeek days) {

        switch (days) {
            case MONDAY:
            case TUESDAY:
            case WEDNESDAY:
            case THURSDAY:
            case FRIDAY:
                return true;
            case SUNDAY:
            case SATURDAY:
                return false;
            default:
            return false;
        }
    }

    public static double CalculateTax(double annualIncome, TaxMaritalStatus maritalStatus) {

        if(maritalStatus.equals(TaxMaritalStatus.MARRIED) && annualIncome<60_000) {
            return annualIncome * 0.10;
        }
        else if (maritalStatus.equals(TaxMaritalStatus.SINGLE) && annualIncome < 100_000){
            return annualIncome* 0.30;
        }
        return 0;

    }
}

//package SprintWeek;
//
//class Date1 {
//    private int year;
//    private int month;
//    private int day;
//
//    // constructor of class
//    public Date1(int year, int month, int day)
//    {
//        this.year = year;
//        this.month = month;
//        this.day = day;
//    }
//    // getter and setters for year, month and day
//    public int getYear()
//    {
//        return year;
//    }
//    public void setYear(int year)
//    {
//        this.year = year;
//    }
//    public int getMonth()
//    {
//        return month;
//    }
//    public void setMonth(int month)
//    {
//        this.month = month;
//    }
//    public int getDay()
//    {
//        return day;
//    }
//    public void setDay(int day)
//    {
//        this.day = day;
//    }
//
//    public String toString()
//    {
//        // returning date in "MM/DD/YYYY" format
//        return String.format("%02d/%02d/%04d",this.month, this.day, this.year);
//    }
//
//    // defining setDate method
//    public void setDate(int year, int month, int day)
//    {
//        this.year = year;
//        this.month = month;
//        this.day = day;
//    }
//}
//// Driver class
//public class MyDate1
//{
//    public static void main(String[] args)
//    {
//        // creating Date object
//        date1 d = new date1(2016,4,6);
//        // printing value of date
//        System.out.println(d);
//        // calling methods of Date to print output
//        d.setDate(2012,12,23);
//        System.out.println(d);
//        System.out.println("Year is: "+d.getYear());
//        System.out.println("Month is: "+d.getMonth());
//        System.out.println("Day is: "+d.getDay());
//        d.setDay(2);
//        d.setMonth(1);
//        d.setYear(2968);
//        System.out.println(d);
//    }
//
//    private static class date1 {
//        public date1(int i, int i1, int i2) {
//        }
//
//        public void setDate(int i, int i1, int i2) {
//        }
//    }
//}

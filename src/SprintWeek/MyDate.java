package SprintWeek;

 class Date {


        private int year;
        private int month;
        private int day;


        public Date(int year, int month, int day)
        {
            this.year = year;
            this.month = month;
            this.day = day;
        }

        public int getYear()
        {
            return year;
        }
        public void setYear(int year)
        {
            this.year = year;
        }
        public int getMonth()
        {
            return month;
        }
        public void setMonth(int month)
        {
            this.month = month;
        }
        public int getDay()
        {
            return day;
        }
        public void setDay(int day)
        {
            this.day = day;
        }


        public String toString()
        {

            return String.format("%02d/%02d/%04d",this.month, this.day, this.year);
        }


        public void setDate(int year, int month, int day)
        {
            this.year = year;
            this.month = month;
            this.day = day;
        }
    }

    public class MyDate
    {
        public static void main(String[] args)
        {

            Date d = new Date(2016,4,6);

            System.out.println(d);

            d.setDate(2012,12,23);
            System.out.println(d);
            System.out.println("Year is: "+d.getYear());
            System.out.println("Month is: "+d.getMonth());
            System.out.println("Day is: "+d.getDay());
            d.setDay(2);
            d.setMonth(1);
            d.setYear(2968);
            System.out.println(d);
        }
    }

package Clocl;

public class Clock {
    public int hours;
    public int minutes;
    public int seconds;

    //Default constructor to Initialize time by 12:00:00
    public Clock(){
        //TODO implement no args constructor with default values
        hours = 12;
        minutes = 0;
        seconds = 0;
    }

    //Parameterized constructor to make time using seconds
    public Clock(int seconds){
        //TODO implement 1 arg constructor

        // Get hours by dividing seconds by 3600
        hours = seconds/3600;
        //now store remaining seconds in seconds
        seconds  = seconds - (hours*3600);
        //Get minutes by dividing seconds by 60
        minutes = seconds /60;
        //Now store remaining seconds in seconds
        this.seconds = seconds - (minutes*60);
    }

    //Parameterized constructor to store hour,min,sec in class attributes
    public Clock(int hours, int minutes, int seconds){
        //TODO implement all args constructor
        this.hours = hours;
        this.minutes = minutes;
        this.seconds = seconds;
    }

    //Function to set time according to the number of seconds
    //Same logic explained above in constructor
    public void setClock(int seconds){
        //TODO implement this method
        hours = seconds/3600;
        seconds  = seconds - (hours*3600);
        minutes = seconds /60;
        this.seconds = seconds - (minutes*60);
    }

    //Getter to get hours
    public int getHours() {
        //TODO implement this method
        return hours;
    }

    //Setter to set hours
    public void setHours(int hours) {
        //TODO implement this method
        this.hours = hours;
    }

    //Getter to get minutes
    public int getMinutes() {
        //TODO implement this method
        return minutes;
    }

    //Setter to set minutes
    public void setMinutes(int minutes) {
        //TODO implement this method
        this.minutes = minutes;
    }

    //Getter to get seconds
    public int getSeconds() {
        //TODO implement this method
        return seconds;
    }

    //Setter to set seconds
    public void setSeconds(int seconds) {
        //TODO implement this method
        this.seconds = seconds;
    }

    //Function to increment in time by second
    public void tick(){
        //TODO implement this method
        //increment in second
        seconds++;
        //if seconds reached to 60 then set seconds to 0 and increment in minutes
        if(seconds==60)
        {
            seconds=0;
            minutes++;
        }
        //if minutes reached to 60 then set minutes to 0 and increment in hours
        if(minutes==60)
        {
            minutes=0;
            hours++;
        }
        //If hours reached to 24 then reset it to 0
        if(hours==24)
            hours=0;
    }

    //Function to decrement in time by a second
    public void tickDown(){
        //TODO implement this method
        //decrement in seconds
        seconds--;
        //if seconds less than 0 then set seconds to 59 and decrement in minutes
        if(seconds<0)
        {
            seconds=59;
            minutes--;
        }
        //if minutes less than 0 then set minutes to 59 and decrement in hours
        if(minutes<0)
        {
            minutes=59;
            hours--;
        }
        //if hours less than 0 then set it to 23
        if(hours<0)
            hours=23;
    }

    //Function to add clock in clock of class (first clock)
    public void addClock (Clock clock) {
        //TODO implement this method
        //get hours of second clock and add it to hours of first clock
        hours += clock.getHours();
        //get hours of minutes clock and add it to minutes of first clock
        minutes +=clock.getMinutes();
        //get seconds of second clock and add it to seconds of first clock
        seconds +=clock.getSeconds();

        //add all seconds in seconds
        seconds += hours*3600 + minutes*60;
        //then set time using setCLock function
        setClock(seconds);
    }

    //function to subtract clock times
    public Clock subtractClock(Clock clock) {

        //Created clock object to keep difference of both time clocks
        Clock diff = new Clock(0,0,0);
        //Create copies of both clocks to keep values of both clocks
        Clock clock1 = new Clock(hours,minutes,seconds);
        Clock clock2 = new Clock(clock.hours,clock.minutes,clock.seconds);

        //if seconds of second clock is greater then first clock
        //Then decrement in minutes and increment in seconds by 60
        if(clock2.seconds > clock1.seconds)
        {
            clock1.minutes--;
            clock1.seconds += 60;
        }

        //get difference of seconds by subtracting
        diff.seconds = clock1.seconds - clock2.seconds;

        //if minutes of second clock is greater then first clock
        //Then decrement in hours and increment in minutes by 60
        if(clock2.minutes > clock1.minutes)
        {
            clock1.hours--;
            clock1.minutes += 60;
        }

        //get minutes and hours by subtracting
        diff.minutes = clock1.minutes-clock2.minutes;
        diff.hours = clock1.hours-clock2.hours;

        // return the difference time
        return diff;
    }

    //Function to return time in a proper format
    public String toString() {
        //TODO implement this method

        //Initialize time variable
        String time="";
        //if hours less than 10 then add 0 before hour
        if(hours<10)
            time +="0";
        time+=Integer.toString(hours)+":";

        //if minutes less than 10 then add 0 before minutes
        if(minutes<10)
            time +="0";
        time+=Integer.toString(minutes)+":";

        //if seconds less than 10 then add 0 before seconds
        if(seconds<10)
            time +="0";
        time+=Integer.toString(seconds);

        return time;
    }
    }
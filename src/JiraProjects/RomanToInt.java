package JiraProjects;

import java.util.Scanner;

public class RomanToInt {


    //CLASS named Main
 //   public class Main {

        //main method
        public static void main(String[] args)
        {
            //Initialize object of scanner class
            Scanner scan = new Scanner(System.in);
            //Take input the number in Roman
            System.out.print("Enter number in Roman: ");
            String s = scan.next();

            //Convert Roman number in integer and print by calling function
            System.out.println("Number in integer: " + romanToInteger(s));
        }

        //Function to convert roman number into an integer,
        //Parameter: String of Roman number
        //Return: Integer representing integer value of roman number
        static public int romanToInteger(String s)
        {
            //variable to store integer value
            int integer = 0;

            //for loop to iterate each character of roman
            for (int i = 0; i < s.length(); i++)
            {
                //if character is 'I'
                if(s.charAt(i)=='I')
                {
                    //check if next character is 'V' then it means it's 4 so add 4 in integer and skip next character
                    if(i<s.length()-1 && s.charAt(i+1)=='V')
                    {
                        integer += 4;
                        i++;
                    }
                    //check if next character is 'X' then it means it's 9 so add 9 in integer and skip next character
                    else if(i<s.length()-1 && s.charAt(i+1)=='X')
                    {
                        integer += 9;
                        i++;
                    }
                    //Otherwise add the value of 'I' which is 1
                    else
                        integer++;
                }
                //if character is 'V'
                else if(s.charAt(i)=='V')
                    integer +=5;
                    //if character is 'X'
                else if(s.charAt(i)=='X')
                {
                    //check if next character is 'L' then it means it's 40 so add 40 in integer and skip next character
                    if(i<s.length()-1 && s.charAt(i+1)=='L')
                    {
                        integer += 40;
                        i++;
                    }
                    //check if next character is 'C' then it means it's 90 so add 90 in integer and skip next character
                    else if(i<s.length()-1 && s.charAt(i+1)=='C')
                    {
                        integer += 90;
                        i++;
                    }
                    //Otherwise add the value of 'X' which is 10
                    else
                        integer+=10;
                }
                //if character is 'L'
                else if(s.charAt(i)=='L')
                    integer +=50;
                    //if character is 'C'
                else if(s.charAt(i)=='C')
                {
                    //check if next character is 'D' then it means it's 400 so add 400 in integer and skip next character
                    if(i<s.length()-1 && s.charAt(i+1)=='D')
                    {
                        integer += 400;
                        i++;
                    }
                    //check if next character is 'M' then it means it's 900 so add 900 in integer and skip next character
                    else if(i<s.length()-1 && s.charAt(i+1)=='M')
                    {
                        integer += 900;
                        i++;
                    }
                    //Otherwise add the value of 'C' which is 100
                    else
                        integer+=100;
                }
                //if character is 'D'
                else if(s.charAt(i)=='D')
                    integer +=500;
                    //if character is 'M'
                else if(s.charAt(i)=='M')
                    integer +=1000;
            }

            //return integer
            return integer;
        }
    }



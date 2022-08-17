package JiraProjects;

import java.util.Scanner;

public class RomanToInt2 {

    public static void main(String[] args)
    {

        Scanner scan = new Scanner(System.in);

        System.out.print("Enter number in Roman: ");
        String s = scan.next();


        System.out.println("Number in integer: " + romanToInteger(s));
    }

    static public int romanToInteger(String s)
    {

        int integer = 0;


        for (int i = 0; i < s.length(); i++)
        {

            if(s.charAt(i)=='I')
            {

                if(i<s.length()-1 && s.charAt(i+1)=='V')
                {
                    integer += 4;
                    i++;
                }

                else if(i<s.length()-1 && s.charAt(i+1)=='X')
                {
                    integer += 9;
                    i++;
                }

                else
                    integer++;
            }

            else if(s.charAt(i)=='V')
                integer +=5;

            else if(s.charAt(i)=='X')
            {

                if(i<s.length()-1 && s.charAt(i+1)=='L')
                {
                    integer += 40;
                    i++;
                }

                else if(i<s.length()-1 && s.charAt(i+1)=='C')
                {
                    integer += 90;
                    i++;
                }

                else
                    integer+=10;
            }

            else if(s.charAt(i)=='L')
                integer +=50;

            else if(s.charAt(i)=='C')
            {

                if(i<s.length()-1 && s.charAt(i+1)=='D')
                {
                    integer += 400;
                    i++;
                }

                else if(i<s.length()-1 && s.charAt(i+1)=='M')
                {
                    integer += 900;
                    i++;
                }

                else
                    integer+=100;
            }

            else if(s.charAt(i)=='D')
                integer +=500;

            else if(s.charAt(i)=='M')
                integer +=1000;
        }

        return integer;
    }

}


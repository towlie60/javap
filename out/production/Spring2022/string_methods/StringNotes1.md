## Strings

##How to call string Methods?
we use any String, be it a variable,
and follow it by ".";

ex: String str = "Hello";
str. --> from here you can access all
String methods that are available


### public String concat(String str)
concat method takes a String and add
to the original String and return to the result

ex: String str = "Hello";//original String
String result = str.concat("World"); ==>



###public int length();
number characters in the string
ex: String str ="Hello";
int numOfCharacters = str.length(); => 5;

.length() get the quantity of the characters, has nothing do with the positions
note: dont start from 0;
all special character as space, "," are considered as on
single character as well. So we do count them as well.


###public char charAt(int index);
charAt method takes an int value and uses the value
to return one character.

How is int index used? charAt method uses int index as a position of
a character in a string to be returned

ex: String tr = "Hello";
// which number(integer) you need to provide will
//depend on the reqs(task);

the index must be inside the range of 0-4 or 0 and str.length-1;
char secondLetter = str.charAt(1);


What happens if the value is negative in CharAt(-10)
if the index it out of range(both negative or more than length -1) than
java will throw an Exception() runtime error.
StringIndexOutofBoundsException


###public boolean isEmpty()
it return true if the String is empty;
false otherwise;

ex;
String str="";
boolean result = str.isEmpty(); //true

String str = "Hello";
str.isEmpty(); //false

####public String substring(int i)
access modifier - protected, private, default.
public we can use in any class

return type --> String. Result of the method.

name of the method is substring.
param --> information which we have to provide(give) to the method

This method is public method that takes an int does something with that String and returns a new String

it returns a substring from the given index(i)
ex: String str = "Hello";
str.substring(2); => llo;

takes the starting and goes till the end of the string


###public String substring(int i, int j);
it takes two integers uses them return a string.

i --> starting point inclusive.
j --> ending point, exclusive.

String str = "DevX School";

str.substring(0,4) => DevX;
str.substring(5) => School;

###public int indexOf(String s)
takes a string and return an int.

s--> represents a substring of which you want to find the index of. it could also be
just one character.

indexOf return the index of a first occurrence of the given substring.
if the substring doesnt exist in this String then return -1;

ex:"DevXSchool".indexOf("S") => 4;

ex: "Hello World".indexOf("or"); =>7

ex: "Java SDET".indexOf("ava"); => 1

ex:"Senior SDET".indexOf("Seniorita"); =>-1;

ex:"Brooklyn".indexOf("o"); => 2;


###public int indexOf(String s, int i)

s --> substring
i --> index

return the index of a first occurence of a substring(s), however start lookin for substring
from a given index(i).

i--> specifies what needs to be skipped. Skip everything until then index, and compare from there

ex: String str = "Mega Mega Megafon"
str.indexOf("e",3); => 6;


str.indexOf("ga",4); => 7;



###public int lastIndexOf(String str)
so it will return the index of last str occurrence

ex: String str = "Hello"
str.indexOf("l"); ==> 2
str.lastIndexOf("l"); ==> 3


    ex: String str1= "DevXSchool is cool";
     str1.indexOf("ool"); ==> 7
     str1.indexOf("o",8); ==> 8

     str1.lastIndexOf("ool") => 15
     str1.lastIndexOf("o") => 16;


public boolean equals(String str);
it returns true if the values of each String are equal. Regardless of
how each Strings have been initialized

String str = "Hello";
String str1 = new String("Hello");
str.equals(str1); => true;

String str = "Hello"'
String str1 = "Hello";
str.equals(str1); => false. bc it's case sensitive.

String str = "Hello";
str.equals("Hello"); //false;


###public boolean equalsIgnoreCase (String str)
compares the values of two strings with cases ignored

ex: String str = "DevXSchool"
str.equalsIgnoreCase("devxschool")// return true, bc letters match
//cases ignored.

//userName. are usually case insensitive


###public string toLowerCase()
transfer all String characters to lowercase. if the characters
are special character nothing happens to them.
@$%^&*()+_

ex: String str ="HeLLO";
String str1 = str.toLowerCase() --> return a new String "hello";
//doesnt change the original String
// so str is still "HeLLO"

####public String toUpperCase()
transfers all String Characters to upper case. if the characters
are special character nothing happens to them
@$%^&*()+_

String str1 = str.toUpperCase() --> return a new String "HELLO"";
//doesnt change the original String
// so str is still "HELLO"


###public String trim()
removes the white spaces before and after the String. does not remove the whitespaces
in between

ex: String str = "Hello"
str.trim => return "Hello"

String str = "Hello"
str.trim => return "Hello"

       String str = "Hello"
           str.trim => return "Hello"

           String str = "Hello"
               str.trim => return "Hello World"


####public String replace(char oldChar, char newChar)
change all occurences of oldChar to newChar and return a new String.
if there no oldChar occurences then return the original String.

     String str= "DevX School"
     str.replace('c','s') => "DevX School"

     String str = "United States of America"
     str.replace('e', 'i') => United States Of America


###public String replace(String oldSubString, String newSubString)
change the whole substring to a new substring within the original String and
return the resulting String.

String str = "Hello world "
str.replace("world", "World")

String str = "Hello world";
str.replace("world", "my beautiful World") => Hello my beautiful World


###public String replaceFirst(String oldSubString, String new SubString)
replace only the first occurence of the oldSubstring to new Substring.

string str = "Hello 2021 World"
str.replace("ell","") => Ho Hell of a 2021 World


###public boolean contains(String str)
checks if the String contains the given subString. if yes then return true
otherwise return false. 

it doesnt have to be a separate word. it can be a part of one world as well. Or  
it can even be multiple words. 

String str = "Macbook Pro"
str.contains("Book") -> true. 

str.contains("ok Pro"); --> true 

str.contains("acb"); -> false; case sensitive 

###public boolean startsWith(String str)

return true if the string strts with the given String(str). 

String str ="hello World";
str.startsWith("h") // return true
str.startsWith("he") // return true


we can use this for sorting. 


###Pool vs Heap

Any method that returns a String internally creates a new String in the heap.

ex: 
String str = "hello"
string str1 = "hello".trim();
str==str1 //false;

str.equals(str1);//true

###Immutability

string values will only change if you actually reassign the value of a string

string str = "Hello";
string str2 = str.concat("World")

System.out.println(str)//Hello 
System.out.println(str)//Hello World 


the only way we can make the following statement printout something else is by reassigning
str ="Mars";
System.out.println(str) --> Mars

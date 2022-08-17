##Lists

-Lists have are dynamic. Size can be dynamically changed at the runtime. (while program is running)
-Lists have many methods
-Lists can only store non-primitive data types (objects), so we can not store primitive like int,double, char
rather we have to use Wrapperclass for each primitive data type.


###Wrapper classes
each primitive data type has a wrapper class which is essentially a workaround for lists to be able to store 
data t ypes such as Integers, double.

int -> Integer
double --> Double
char --> Character 
boolean --> Boolean 
float -> Float


we can still perform all arthmetical operation using Wrapper Class


All Wrapper classes have util static method like parseInt, parseDouble that help us to
convert Strings to Wrapper Classes.


####Boxing vs Unboxing Wrapper Classes
There is an automated process of converting primitive and wrapper class data types 
between each other.

autoboxing => when you assign a literal values to
corresponding wrapper classes
this process is called autoboxing.
ex: 

integer num =1;
int num2 =10;
Integer num3= num2



unboxing => when you assign a Wrapper class value to a primitive data type
ex:

Integer num1 = new Integer(12);
int num2= num1;


###Convert Lists to Arrays
There are some problems which would require you to convert Lists to Arrays
it is posisble in Java List has a method called toArray();


###Object 
Object is a data type(class) which is the Adam(Eve) of all classes. Every single class 
in java extend (Inheritance) from object class



###Collections class
is a helper class for Lists like Arrays class for arrays

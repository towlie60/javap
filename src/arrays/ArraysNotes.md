###Arrays

In case of different data type array - such arrays are not allowed in Java.

In case of same data type but two different info. ex: you want to store bunch of ages and weights together
that's allowed by java bc ages and weigths can be store in INT. 
they have to be stored in different arrays.


###Garbage Collector 
Java has an automated process of deleting unused objects in 
the heap. This process is achieved by Garbage Collector.

system.gc();

Garbage collector will delete the obejects from heap if there are no references to it
(there are no variables pointing to it)

in order to manually delet an object from the heap. I need to 
assign a variable (or all variables) pointing to the object 
to null. and call System.gc();


###null
if a variable is pointing to a null and try to call a method
from that variable java will throw a NullPointer Runtime Exception

###method available 
the method available when accessing an element in an array will 
be defined by the data type of your array 

###HashCode
what happens if I print out a variable of the array?

System.out.println(animals);//HashCode of a memory location
HashCode is an address of an object in the heap.

###Arrays class
Utilization - in programming means some helper classes which help us to solve some certain problems.
So everytime we need to solve that problem we can 
refer to the utilization class.

arrays have an util class called Arrays

###equals() in array
any array has equals() method. 

int[] arr1={1,34,6,7} ==> int[] arr1 = new int[4]; arr[0]=1;arr1[1]=34 etc;
int[] arr2= {1,34,6,7} 


arr1.equals.(arr2); //it compares if both variables refer to the same object

in case of arrays == and eqauls are the same. 
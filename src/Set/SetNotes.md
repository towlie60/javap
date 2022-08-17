### SET
Set is a collection that implements collection 
interface. It can store elements of same data type. 
But Elements can not be duplicate. So it's a
collection of unique values. 
Values in a Set are unordered.

So you should consider using a SET if you 
want to avoid duplicate values and you dont 
acutally care about the order of valu es. 
ex: 

phone numbers --> cell phone numbers on a phone 
ssn of all citizens in Gov applications 
ssn for credit company 
EmployeeID, StudentID.
Number in a line in DMV. 


####Methods 
Dont have get method like Like lists. BC get method requires indexes.

###public boolean add(E value)
add method will add the value and return true if the value 
doesnt already exist in the Set

add method will return false and not add anything ifthe 
Set already contains the value 

####public boolean addAll(Collection collection)
its going to add the colection to the set 

####Iterators
boolean hasNext(): It returns true if Iterator has more element to iterate. similar to isEmpty();
Object next(): It returns the next element in the collection until the hasNext()method return true. This method throws ‘NoSuchElementException’ if there is no next element.
void remove(): It removes the current element in the collection. This method throws ‘IllegalStateException’ if this function is called before next( ) is invoked.


###LinkedHashSet 
Collection of Unique Ordered Objects. Insertion order


###TreeSet
Collection of Unique Ordered Objects. Alphabetic, or numeric order, asc by default, can be changed.
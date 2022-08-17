###Exceptions

-IndexOutOfBoundException
-ParseException
-ArrayStoreException
-NullPointerException
-ClassCastException
-NumberFormatException


Debugging and troubleshooting -> process of finding the root cause of an issue. goal is to fix a problem



###StackTrace
Trace to the place where the exception was thrown 



###Unchecked Exceptions do not have to be handled or declared 

List of Unchekced (Runtime Exceptions)

-IndexOutOfBoundException
-NullPointerException
-Arithmetic Exception 


####Checked Exceptions have to be handled or declared

Handled means the code that throws a checked exception is wrapped inside a try catch block
try {
FileWriter fileWriter = new FileWriter(path, true);

        fileWriter.write(txt);
        fileWriter.close();
    } catch (IOException io) {
        System.out.println("Catch in a method");
    }

###Throw vs Throws 
Throws keyword is used to declare checked exceptions in the method signature

Throw keyword is a command for java to fail the program with the given exception 
Declaring an exception means putting throws Exception keyword in the method declaration


####Finally 
finally is a block of code which can be placed after try or catch block. Finally block runs regardless whether
an Exception was thrown or not 

Finally block are needed for close statements. WriteFile and ReadFile Classes use bufferedStreams(byte[])
which need to be closed after usage. So if an exception is thrown while writing or reading a file some bytes could 
end up reading a file 
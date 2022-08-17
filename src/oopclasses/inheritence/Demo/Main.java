package oopclasses.inheritence.Demo;

public class Main {

    public static void main(String[] args) {
        Animal animal= new FourLeg();
        //The value from a Datatype class will be used for variables;
        System.out.println(animal.name);



        FourLeg fourLeg = new FourLeg();
        System.out.println(fourLeg.name);

        Animal animal1 = new FourLeg();
        //Whatever the data type of a variable is value from that class will be retrieved;
        System.out.println(((FourLeg)animal).name);


        //methods that are available are defined by the dataType of a variable, not an object assigned.
        //methods that are going to be executed are defined by the object themselves
        animal.printName();

        //call hello method using animal variable
        ((FourLeg)animal1).hello();
    }
}

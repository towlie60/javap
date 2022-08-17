package oopclasses.inheritence.human;

public abstract class AbstractPerson implements Human, Health{


    private double foodConsumed;
    private double weight;

    public AbstractPerson(double foodConsumed, double weight) {
        this.foodConsumed = foodConsumed;
        this.weight = weight;

    }

    public double getFoodConsumed() {
        return foodConsumed;
    }

    public double getWeight() {
        return weight;
    }
}

//we wanted to create an app for men and women
//we wanted for this man and women to have some functions
//so we created an interface which both man and women must have
//but it's primary purpose is to put common characteristics of concrete classes. Man and women.
//and at the same time not to worry about the abstract methods that are inherited from the human interface.
//
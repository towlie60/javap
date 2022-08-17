package oopclasses.inheritence;

import java.util.ArrayList;
import java.util.List;

//inhertence helps us inherit variables and methods from Parent Classes
//employee is a superclass, (parent class0
//engineer is a subclass (child-class)

//General
public class Engineer extends Employee {
    List<String> tools = new ArrayList<>();
    //onTarget or not on Target
    private boolean isOnTarget;
    public double salary;

    public Engineer(String name, String dob, String title, double salary) {
        //calling a constructor from the direct super class
       super(name,dob,title,salary);
       super.salary = salary;
    }

    public List<String> getTools() {
        return tools;
    }

    public void setTools(List<String>tools) {
        this.tools = tools;
    }
    public void promote() { //(int promotion){
   super.salary += 10000;
    }

    public void promote(int promotion) {

    }

   @Override
    public Double grantBonus() {
        return salary * 0.2;

    }
//
//    @Override//printTitle is a private method in Employee(Super) class private methods
    //are not inherited, thus they can not be overridden
//    public void printTitle(){
//
//    }

    public void printTitle() {

    }

    public Double bonus() {
        if (isOnTarget) {
           return grantBonus();
        } else {
            return (Double) super.grantBonus();
        }
    }
    public void setOnTarget(boolean isOnTarget) {
        this.isOnTarget = isOnTarget;
    }

    /**
     * same rule as overriding instance methods
     * but we call it method hiding
     * @param salary
     * @return
     */
    public static double getW2(double salary) {
        return salary * 0.20;
    }
}
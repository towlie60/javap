package oopclasses.inheritence.abstractclass;

    /**
     * abstract is a class that can contain abstract and non-abstract (regular) methods;
     */
    public abstract class car extends Vehicle {



       //abstract class constructors are used purely to initialize the instance variables
        // constructors can be called in subclasses using super() keyword
        public car (String vin, String model, long mileage, String make, String color) {
        super(vin, model, mileage, make, color);
        }

        //any class that extends Car must have drive
        //with their own implement
        public abstract void drive();

            public void print() { System.out.println("Hello from Car class"); }

            public void rollDownWindow() {
                System.out.println("Rolling down the window");

        }
    }
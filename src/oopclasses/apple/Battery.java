package oopclasses.apple;

public class Battery {
   // private String capacity;
    private int lifePercentage =100; //how much life left
    private boolean isDecimalMode= false;

    public void showPercentage() {
        if(isDecimalMode) {
            System.out.println(lifePercentage + "%");
        }else {
            System.out.println((int)lifePercentage + "%");
        }
    }

    /**
     *
     */
    public void switchMode(){
   if (isDecimalMode) {
       isDecimalMode = false;
   }
   else {
       isDecimalMode = true;
   }
    }

//    public boolean checkIfCharged() {
//        if(getLifePercentage() > 0) {
//            isUncharged = false;
//        }else {
//            isUncharged = true;
//        }
//        return isUncharged;
//    }
//
//    public void decreaseBattery(int percentage) {
//        lifePercentage -= percentage;
//        if(lifePercentage < 1) {
//            System.out.println("The battery is uncharged!");
//        }
//    }

  //  public void switchMode() {

    // public void switchMode() {
    }


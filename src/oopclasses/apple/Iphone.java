package oopclasses.apple;

import java.util.ArrayList;
import java.util.List;

//create a program which will mimic Iphone
//Once user will buy an Iphone we will create a new Iphone object
//A a method which can add, buy apps from AppStore;
public class Iphone {

    private String model;
    private int memory;
    private String color;
    //instance variable which defines that Iphones will have list of applications
    private List<IosApp> apps;
    private Battery battery;
    private List<Contact> contactList;

    //In order to create an iphone you only need to provide
    //model, memory, battery and color;
    //default apps will appStore, facetime, calander;
    //default contacts are empty;


    public Iphone(String model, int memory, String color, Battery battery) {
        this.model = model;
        this.memory = memory;
        this.color = color;
        this.battery = battery;
        this.apps = new ArrayList<>();
        this.contactList = new ArrayList<>();
        //we can call methods in a constructor;
        addDefaultApps();
        showAllApps();
    }

    /**
     * declared it private --> bc we dont want iphones to have addDefaultApps functionality, rather
     * it's only used in this class for
     */
   public void addDefaultApps() {
     IosApp appStore = new IosApp("AppStore", "1.4.3", 1.34, 0);
     IosApp facetime = new IosApp("FaceTime", "2.2.3", 2.4, 0);
     IosApp calendar = new IosApp("Calender", "3.2.3", 2.4, 0);
     this.apps.add(appStore);
     this.apps.add(facetime);
     this.apps.add(calendar);
   }

   //add a functionality for an Iphone which will addNewApps from AppStore;//
    public void downloadNewApp(String appName, AppStore appStore) {
       for (IosApp app : appStore.getApps()) {
           if(app.getName().equalsIgnoreCase(appName)) {
               apps.add(app);
           }
       }

   }


   public void showAllApps(){
       for (IosApp app: apps) {
           System.out.println(" || " + app.getName());

       }

       System.out.println();
   }

    public Battery getBattery() {
        return battery;
    }
}


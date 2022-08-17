package oopclasses.hotel;

import com.sun.javafx.image.IntPixelGetter;

import java.util.HashMap;
import java.util.Map;

public class HyattApp {

    public static void main(String[] args) {

        //when you have to pass in a collection into a param
        //good practice is to create it before

      //  bedTypeMap.put("2","Queen");
        //bedTypeMap.get("1");
        //1 -> 1bed,1bath, KingBed
        //2-> 2bd,1bath,1king,1queen
        //3->2bd,2bath,2King
        //4->2bd,2bath,2Queen
        //5->3bd,2bath,2King,1Queen
        Map<String, Integer> bedTypeMap = new HashMap<>();
        bedTypeMap.put("King",1);

        Room room1 = new Room(100,1,1,bedTypeMap,true);
        System.out.println(room1.isAvailable);
        System.out.println(room1.beds);
        System.out.println(room1.bedTypes);

        Map<String, Integer> bedTypeMap2 = new HashMap<>();
        bedTypeMap2.put("King",1);
        bedTypeMap2.put("Queen",1);


        Room room2 = new Room(101,2,1, bedTypeMap2, true);

        Map<String, Integer> bedTypeMap3 = new HashMap<>();
        bedTypeMap3.put("King",2);
        Room room3 = new Room(102,2,2,bedTypeMap3,true);

        Map<String, Integer> bedTypeMap4 = new HashMap<>();
        bedTypeMap4.put("Queen",2);
        Room room4 = new Room(103,1,1,bedTypeMap4,true);

        Map<String, Integer> bedTypeMap5 = new HashMap<>();
        bedTypeMap5.put("Queen",1);
        bedTypeMap5.put("King",2);
        Room room5 = new Room(104,3,2,bedTypeMap5,true);

        System.out.println(room4.beds + "bd");
        room4.isAvailable=false;
        System.out.println(room4.isAvailable);

        room4.beds =-12345;
        room4.number=123;
//     String room1str= "1bd, 1bath, 1KingBed";
//     room1str.substring(0,room1str.indexOf(",")-2);
    }

    //create a method which takes list of rooms
    //and print out info about available rooms
    //out:
    //1) 1bd, 1bath, 1 King bed.
    //2) 2bd, 2bath, 1 King bed, 1 Queen

    //create a method which will book a room
    //method will take List<Room>, int beds, int baths
    //and print out rooms that are available with for this criteria
    //Room number:100 -  1bd, 1bath, 1 King bed.
   // Room number:101 -  1bd, 1bath, 2 Queen bed.
    //which room would you like to book?
    //Give a room number
    //101

    //at the end of the method return allRooms;
    //public static void bookRoom(List<Room>allRooms, int beds, int baths) {
    //
    //}

    //print the rooms

}

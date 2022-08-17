package lists;

import java.util.ArrayList;
import java.util.List;

public class MultiDimensionalArrays {

    public static void main(String[] args) {

        List<List<String>> weeklySales = new ArrayList<>();

        List<String> mondaySales = new ArrayList<>();
        List<String> tuesdaySales = new ArrayList<>();
        List<String> wednesdaySales = new ArrayList<>();

        mondaySales.add("Potatoe");
        mondaySales.add("Cucumbers");
        mondaySales.add("Tomato");
        mondaySales.add("Cabbage");
        mondaySales.add("Carrot");
        mondaySales.add("Beef");


        tuesdaySales.add("Apple");
        tuesdaySales.add("Cucumbers");
        tuesdaySales.add("Oranges");
        tuesdaySales.add("Biscuits");
        tuesdaySales.add("Candies");


        wednesdaySales.add("Tea");
        wednesdaySales.add("Coffee");
        wednesdaySales.add("Sweetener");
        wednesdaySales.add("Milk");


        weeklySales.add(mondaySales);
        weeklySales.add(tuesdaySales);
        weeklySales.add(wednesdaySales);

        System.out.println(wednesdaySales.get(1));
        System.out.println(mondaySales.get(2));
        //weeklysales[2][1]
        System.out.println(weeklySales.get(2).get(1));
    }
}

package Set;

import java.util.Iterator;
import java.util.TreeSet;
import java.util.Set;


public class TreeSetDemo {

    public static void main(String[] args) {
        Set<String> names = new TreeSet<>();
        names.add("Elon");
        names.add("Bezos");
        names.add("Marry");
        names.add("Jane");


        Iterator<String> it = names.iterator();
        System.out.println(names);
    }
}

package DevXSchoolPractice;
import java.lang.*;

public class HierarchicalInheritance {

}


    class one {
        public void print_geek()
        {
            System.out.println("Geeks");
        }
    }

    class two extends one {
        public void print_for() { System.out.println("for"); }
    }

    class three extends two {
        public void print_geek()
        {
            System.out.println("Geeks");
        }
    }


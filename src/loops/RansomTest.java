package loops;



public class RansomTest {
    public static void main(String[] args) {

        System.out.println(OptionalLabels.ransomChars("hello","ahlloe"));
        System.out.println(OptionalLabels.ransomChars("java","ahlloe"));
        System.out.println(OptionalLabels.ransomChars("java","avja"));
        System.out.println(OptionalLabels.ransomChars("java","avjj"));
        System.out.println(OptionalLabels.ransomChars("java","avjjpna"));
    }
}

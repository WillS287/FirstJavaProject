import java.util.Arrays;

public class FirstClass {

    public static void main(String[] args) {
        System.out.println("Hello, World!");
        System.out.println("Second String\nThird String");

        int numDwarves; //instantiation
        numDwarves = 7; //initialization

        int numStooges = 3; // instantiation & initialization

        System.out.println("There are " + numDwarves + " dwarves in my cottage.");
        System.out.println("At first there were " + numStooges + " stooges");

        numStooges = numStooges + 1;

        System.out.println("Now, with Shemp, there are " + numStooges + " stooges");
//
//        int a = 0;
//        while (a < 100) {
//            System.out.print(a + " --> ");
//            a += 2;
//            if (a== 32) {
//                System.out.println("It's 32.");
//                continue;
//            }
//            System.out.println(a);
//        }

        for (int x = 1; x <30; x = x * 2) {
            System.out.print(x + "\t");
            int i;
            for (i = 0; i < 6; i++) {
                System.out.print("*");
            }
            System.out.println(i);
        }
        System.out.println("\nDone");
    }
}

import java.util.*;

public class Conditions {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);  /* Shift + Alt + A to comment multiple lines */


    /*  int age = sc.nextInt();

        if (age > 18) {
            System.out.println("Adult");
        } else {
            System.out.println("Not Adult");
        } */


    /* int x = sc.nextInt();

        if (x % 2 == 0) {
            System.out.println("even");
        } else {
            System.out.println("odd");
        } */


        // int a = sc.nextInt();      ( use Ctrl + / to comment multiple lines)
        // int b = sc.nextInt();

        // if (a == b) {
        //     System.out.println("a is equal to b");
        // } else if (a < b) {
        //     System.out.println("a is lesser than b");
        // } else {
        //     System.out.println("a is greater than b");
        // }

        int button = sc.nextInt();

        switch (button) {

            case 1 :  System.out.println("Hello");
            break;
            case 2 :  System.out.println("Namaste");
            break;
            case 3 :  System.out.println("Bonjour");
            break;
            default : System.out.println("Invalid Button");
            break;
        }

        
    }
}
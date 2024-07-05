import java.util.*;

public class Loops {

    public static void main(String args[]) {


    // for loop

        // for(int counter = 0; counter <100; counter = counter + 1 ) {
        //     System.out.println("Hello World");
        // }

            // counter++ => counter = counter + 1

        // for(int counter = 0; counter <11; counter++ ) {
        //     System.out.println(counter);
        // }

        // for(int i = 0; i <11; i++ ) {
        //     System.out.print(i+" ");
        // }
    

    // while loop

        // int i = 0;

        // while (i < 11) {
        //     System.out.println(i);
        // i = i + 1;  // i++
        // }

    
    // do while loop

        // int i = 0;

        // do {
        //     System.out.println(i);
        // i = i + 1;  // i++
        // } while (i < 11);


    // comparition of while and do while loop

        // int i = 12;

        // while (i < 11) {
        //     System.out.println("My Name");
        //     i = i++;
        // }

        // do {
        //     System.out.println("My NAMe");
        //     i = i++;
        // } while (i < 11);


    // for example : print the sum of first n natural numbers  ( n = 4 ) (1+2+3+4=10-ANS)

        // Scanner sc = new Scanner(System.in);
        // int n = sc.nextInt();

        // int sum = 0;
        // for (int i = 1; i <= n; i++) {
        //     sum = sum + i;
        // }

        // System.out.println(sum);


    
    // for example : print the table of numer input by the user

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 1; i < 11; i++) {
            System.out.println(i*n);
        }



    }

}
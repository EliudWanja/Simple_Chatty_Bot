//For its input, the program gets a sequence of non-negative integers;
//each integer is written in a separate line. The sequence ends with an integer 0;
//when the program reads 0, it should end its work and output the length of the sequence
//        (not counting the final 0).
//        Don’t read numbers following the number 0.

import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int value = scan.nextInt();
        int counter = 0;

        while (value != 0) {
            value = scan.nextInt();
            counter++;
        }
        System.out.println(counter);



        // put your code here
    }
}

//import java.util.*;
//class Main {
//    public static void main(String[] args) {
//        // put your code here
//        Scanner scanner = new Scanner(System.in);
//        int n;
//        int count = 0;
//
//        do {
//            n = scanner.nextInt();
//            count++;
//        } while (n != 0);
//        System.out.println(count - 1);
//    }
//}

//import java.util.Scanner;
//
//class Main {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//
//        int i = 0;
//
//        while (scanner.nextInt() != 0) {
//            i++;
//        }
//
//        System.out.println(i);
//    }
//}
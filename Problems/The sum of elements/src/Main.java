//Find the sum of all elements of a sequence, ending with the number 0.
//    The number 0 itself is not included into the sequence and serves as a sign of cessation.

import java.util.*;
class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        int num;
        int sum = 0;
        do {
            num = scanner.nextInt();
            sum = sum + num;
        } while (num != 0);
        System.out.println(sum);
    }
}

//import java.util.Scanner;
//
//class Main {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//
//        int n;
//        int sum = 0;
//
//        while ((n = scanner.nextInt()) != 0) {
//            sum = sum + n;
//        }
//
//        System.out.println(sum);
//    }
//}
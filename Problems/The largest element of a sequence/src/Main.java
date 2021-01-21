//Given the sequence of positive integer numbers (which ends with the number 0).
//    Find the largest element of the sequence.
//    The number 0 itself is not included in the sequence but serves only as a sign of the sequence’s end.

import java.util.*;
class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        int num;
        int largest = 0;
        do {
            num = scanner.nextInt();
            if (num > largest) {
                largest = num;
            }
        } while (num != 0);
        System.out.println(largest);
    }
}

//import java.util.Scanner;
//class Main {
//    public static void main(String[] args) {
//        int input = -1;
//        int max = -1;
//        Scanner sc = new Scanner(System.in);
//        while (input != 0) {
//            input = sc.nextInt();
//            if (input > max) {
//                max = input;
//            }
//
//        }
//
//        System.out.print(max);
//    }
//}

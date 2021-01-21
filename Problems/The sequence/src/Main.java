//You are given a sequence of natural numbers, not exceeding 30000. Find the maximum element divisible by 4.
//    As input, the program gets the number of elements in the sequence, and then the elements themselves.
//    In the sequence, there is always an element divisible by 4. The number of elements does not exceed 1000.
//    The program should print a single number: the maximum element of the sequence divisible by 4.
//    Try to solve this problem by using a while-loop.

import java.util.*;
class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int i = 0;
        int b;
        int largest = 0;

        while (i < num) {
            b = scanner.nextInt();
            if (b % 4 == 0 && b > largest) {
                largest = b;
            }
            i++;
        }
        System.out.println(largest);
    }
}

//import java.util.*;
//class Main {
//    public static void main(String[] args) {
//        // put your code here
//        Scanner scanner = new Scanner(System.in);
//        int num = scanner.nextInt();
//        int largest = 0;
//
//        while (num > largest) {
//            num = scanner.nextInt();
//            if (num % 4 == 0 && num > largest) {
//                largest = num;
//            }
//
//        }
//        System.out.println(largest);
//    }
//}
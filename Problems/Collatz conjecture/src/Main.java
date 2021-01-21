//Given natural number n. Generate a sequence of integers, described in the Collatz conjecture:
//    If n is an even number, divide it in half, if it is odd, multiply it by 3 and add 1.
//    Repeat this operation until we get the number 1 as a result.
//    For example, if the number n = 17, then the sequence looks as the following:
//    17 52 26 13 40 20 10 5 16 8 4 2 1
//    Such a sequence will stop at number 1 for any primary natural number n.
//    Output format:
//    Sequence of integers in a single line, separated by spaces.

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        int n = new Scanner(System.in).nextInt();

        System.out.print(n + " ");
        while (n != 1) {
            if (n % 2 == 1) {
                n = n * 3 + 1;
            } else {
                n /= 2;
            }
            System.out.print(n + " ");
        }
    }
}

//import java.util.Scanner;
//class Main {
//    public static void main(String[] args) {
//        // put your code here
//        Scanner sc = new Scanner(System.in);
//        int a = sc.nextInt();
//        System.out.print(a + " ");
//        while (a != 1) {
//            do {
//                if (a % 2 == 0) {
//                    a = a / 2;
//                } else if (a > 1) {
//                    a = a * 3 + 1;
//                }
//            } while (a == 0);
//            System.out.print(a + " ");
//        }
//    }
//}

//import java.util.Scanner;
//
//class Main {
//    public static void main(String[] args) {
//        Scanner s = new Scanner(System.in);
//        int start = s.nextInt();
//        System.out.print(start + " ");
//        while (start != 1) {
//            start = start % 2 == 0 ? start / 2 : start * 3 + 1;
//            System.out.print(start + " ");
//        }
//    }
//}

//import java.util.*;
//class Main {
//    public static void main(String[] args) {
//        // put your code here
//        Scanner scanner = new Scanner(System.in);
//        int numberN = scanner.nextInt();
//
//        while (numberN != 1)
//        {
//            System.out.println(numberN + " ");
//
//            // if numberN is odd
//            if ((numberN & 1) == 1)
//                numberN = 3 * numberN + 1;
//
//                // if numberN is even
//            else
//                numberN = numberN / 2;
//        }
//        System.out.println(numberN);
//    }
//}
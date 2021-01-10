//Write a program that reads three integer numbers and prints true if the first number is between the second and the third one (inclusive).
//        Otherwise, it must print false.
//        The sorting order of two last arguments can be any.
//        Sample Input:
//        3 3 3
//        Sample Output:
//        true
//        Sample Input:
//        2 7 9
//        Sample Output:
//        false
//        Sample Input:
//        40 100 20
//        Sample Output:
//        true
//        Sample Input:
//        2 1 3
//        Sample Output:
//        true

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        boolean firstInclusive = a >= b && a <= c || a <= b && a >= c;
        System.out.println(firstInclusive);
    }
}
//Write a program that reads three integer numbers and prints true if exactly one number is positive (i.e. > 0).
//    Otherwise, it should print false.
//    Sample Input:
//    1 1 1
//    Sample Output:
//    false
//
//    Sample Input:
//    1 0 -1
//    Sample Output:
//    true

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        boolean aPositive = a > 0 && b <= 0 && c <= 0;
        boolean bPositive = a <= 0 && b > 0 && c <= 0;
        boolean cPositive = a <= 0 && b <= 0 && c > 0;

        boolean positive = aPositive || bPositive || cPositive;
        System.out.println(positive);
    }
}
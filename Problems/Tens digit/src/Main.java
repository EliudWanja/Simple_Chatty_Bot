//Write a program that finds the tens digit in a non-negative integer N (0 ≤ N ≤ 1000000).
//    Take a look at the examples:
//    If N is 264, the tens digit is 6.
//    If N is 4136, the tens digit is 3.
//    If N is 101, the tens digit is 0.
//    Sample Input:
//    173
//    Sample Output:
//    7

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here
        int n = scanner.nextInt();
        int tens = n % 100 / 10;

        System.out.println(tens);
    }
}
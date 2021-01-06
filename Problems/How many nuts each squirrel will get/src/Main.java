//N squirrels found K nuts and decided to divide them equally. Determine how many nuts each squirrel will get.
//    Input data format
//
//    There are two positive numbers N and K, each of them is not greater than 10000.
//    Sample Input:
//    3
//    14
//    Sample Output:
//    4

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here
        int n = scanner.nextInt();
        int k = scanner.nextInt();

        System.out.println(k / n);
    }
}
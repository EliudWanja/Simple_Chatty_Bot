//Reversing input numbers
//        Write a program that reads two integer numbers from the standard input and outputs them in the reverse order separated by one space.
//
//Sample Input:
//        1 2
//        Sample Output:
//        2 1

import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        System.out.println(b + " " + a);
    }
}
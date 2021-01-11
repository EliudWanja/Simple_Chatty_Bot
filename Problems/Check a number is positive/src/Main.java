//Write a program that reads the number and prints YES if it is positive. Otherwise, the program should print NO.
//        Do not forget that zero is not a positive number.
//        Sample Input:
//        7
//        Sample Output:
//        YES

import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        int positiveNumber = scanner.nextInt();
        if (positiveNumber > 0) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
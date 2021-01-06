//Given a three-digit integer (i.e. an integer from 100 to 999). Find the sum of its digits.
//
//
//        Sample Input:
//        476
//
//        Sample Output:
//        17

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here
        int threeDigit = scanner.nextInt();

//        to get the first digit from the three digit number divide by 100
        int digit1 = threeDigit / 100;
//  to get the second digit from the three digit number get the remainder of it when divided by its place value(ones tens) of the entered number then divide by 10
        int digit2 =  ((threeDigit % 100) / 10);
//  to get the third digit from the three digit number get the remainder of it when you dived by 100 and 10
        int digit3 = (threeDigit % 100) % 10;
//        int digit3 = threeDigit % 10 get the remainder of dividing by 10
        System.out.println(digit1 + digit2 + digit3);
    }
}
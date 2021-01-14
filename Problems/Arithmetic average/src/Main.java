//Write a program that reads two numbers a and b from the keyboard and calculates and outputs to the console
//    the arithmetic average of all numbers from the interval [a;b], which are divisible by 3.
//    In the example below, the arithmetic average is calculated for the numbers on the interval [−5;12].
//    Total numbers divisible by 3 on this interval 6: −3,0,3,6,9,12. Their arithmetic average equals to 4.5
//    The program input contains intervals, which always contain at least one number, which is divisible by 3.
//    Remember that int type cannot contain fractions. Use double variable to store the precise result of the division.

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double a = scanner.nextInt();
        double b = scanner.nextInt();
        double total = 0; //to find the sum of all numbers divisible by 3
        double count = 0; //to count the number of values divisible by 3
        for (double i = a; i <= b; i++) {
            if (i % 3 == 0) {
                total += i;
                count++;
            }
        }

        double average = (double) total / count;
        System.out.println(average);

    }
}
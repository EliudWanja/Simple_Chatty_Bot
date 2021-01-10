//Write a program that reads an integer value and checks if it is less than 10 and greater than 0.
//        Your program should print a boolean value (true or false).
//
//        Sample Input:
//        0
//        Sample Output:
//        false

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here
        int a = scanner.nextInt();

        boolean value = a > 0 && a < 10;
        System.out.println(value);
    }
}

//import java.util.Scanner;
//
//public class Main {
//
//public static void main(String[] args) {
//
//        int number1 ,number2,n = 2;
//        Scanner inp2 = new Scanner(System.in);
//        System.out.print("Input first No.");
//        number1= inp2.nextInt();
//        System.out.print("Input second No.");
//        number2= inp2.nextInt();
//
//        makeDecision(number1,number2);
//        }
//
//public static void makeDecision(int number1, int number2){
//
//        System.out.print("Number 1 is " + number1);
//        System.out.print("\nNumber 2 is " + number2 +"\n");
//
//        if (number1 > number2){
//        System.out.print("Greater No.  is " + number1 +"\n");
//        }else{
//        System.out.print("Greater No.  is " + number2 +"\n");
//        }
//
//        }
//
//        }

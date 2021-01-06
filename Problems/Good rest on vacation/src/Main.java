//Write a program that will help people who are going on vacation. The program should calculate the total required sum (e.g. $) of money to have a good rest for a given duration.
//
//        There are four parameters which have to be considered:
//
//        duration in days
//        total food cost per day
//        one-way flight cost
//        cost of one night in a hotel (the number of nights equal duration minus one)
//        Read values of these parameters from the standard input and then print the result.

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here
        int days = scanner.nextInt();
        int foodCosts = scanner.nextInt();
        int flightCost = scanner.nextInt();
        int hotelCost = scanner.nextInt();

        System.out.println(days * foodCosts + flightCost * 2 + hotelCost * (days - 1));
    }
}

//import java.util.Scanner;
//
//class Main {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        int duration = scanner.nextInt();
//        System.out.print(
//                scanner.nextInt() * duration + //total food cost
//                        scanner.nextInt() * 2 + //two-way flight cost
//                        scanner.nextInt() * (duration - 1) //cost of nights in a hotel
//        );
//    }
//}
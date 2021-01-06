//Write a program that reads a three-digit number, calculates the new number by reversing its digits, and outputs a new number.
//
//        Sample Input:
//        320
//        Sample Output:
//        23
//
//        Sample Input:
//        976
//        Sample Output:
//        679

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here
        int num = scanner.nextInt();

        //reversing the digits
        int digit1 = num / 100;
        int digit2 = num % 100 / 10 * 10;
        int digit3 = (num % 100) % 10 * 100;

        //print in reverse
        System.out.println(digit3 + digit2 + digit1);
    }
}

//import java.util.Scanner;
//
//class Main {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//
//        StringBuilder str = new StringBuilder();
//        str.append(scanner.next());
//        str.reverse();
//        System.out.println(Integer.parseInt(str.toString()));
//    }
//}

//import java.util.Scanner;
//
//class Main {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        int i = scanner.nextInt();
//        int rev = 0;
//        while (i != 0) {
//            int digit = i % 10;
//            rev = rev * 10 + digit;
//            i /= 10;
//        }
//        System.out.println(rev);
//        // put your code here
//    }
//}
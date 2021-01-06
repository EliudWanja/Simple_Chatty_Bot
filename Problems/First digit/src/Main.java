//Given a two-digit number. Print its first digit (i.e. the number of tens).
//
//        Sample Input:
//        42
//
//        Sample Output:
//        4

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here
        int twoDigit = scanner.nextInt();
        System.out.println(twoDigit / 10);
    }
}

//import java.util.Scanner;
//
//class Main {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        String digit = scanner.next();
//        System.out.println(digit.charAt(0));
//
//
//    }
//}
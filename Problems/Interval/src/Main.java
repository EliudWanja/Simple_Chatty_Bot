//Given an integer as input. Output True if its value is within the interval (−15,12]∪(14,17)∪[19,+∞),
//        and False otherwise (case sensitive).
//    Here are two types of brackets in the intervals:
//    parenthesis () exclude the border number;
//    and square brackets [] include the border number.

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();

        if (num > 14 &&  num < 17) {
            System.out.println("True");
        } else if (num > -15 && num <= 12) {
            System.out.println("True");
        } else if (num >= 19) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }
    }
}

//if (number > -15 && 12 >= number || 17 > number && number > 14 || number >= 19) {
//        System.out.println("True");
//        } else {
//        System.out.println("False");
//        }

//import java.util.Scanner;
//
//class Main {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        int input = scanner.nextInt();
//
//        if ((input <= -15 || input > 12) && (input <= 14 || input >= 17) && input < 19) {
//            System.out.println("False");
//        } else {
//            System.out.println("True");
//        }
//    }
//}

//import java.util.Scanner;
//class Main {
//    public static void main(String[] args) {
//        // put your code here
//        Scanner obj = new Scanner(System.in);
//        int n = obj.nextInt();
//
//        boolean cond1 = n > -15 && n < 13;
//        boolean cond2 = n == 15 || n == 16;
//        boolean cond3 = n >= 19;
//
//        if (cond1 || cond2 || cond3) {
//            System.out.println("True");
//        } else {
//            System.out.println("False");
//        }
//    }
//}
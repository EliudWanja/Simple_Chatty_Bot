//Reading integer numbers
//        Write a program that reads four integer numbers from one line and prints them each in a new line. In the input line numbers are separated by one or more spaces.
//
//        Sample Input:
//        101    102 103  104
//
//        Sample Output:
//        101
//        102
//        103
//        104

import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int num3 = scanner.nextInt();

        System.out.println(num);
        System.out.println(num1);
        System.out.println(num2);
        System.out.println(num3);
//        System.out.print(a + "\n" + b + "\n" + c + "\n" + d);
    }
}

//import java.util.Scanner;
//
//class Main {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//
//        for (int i = 0; i < 4; i++) {
//            System.out.println(scanner.nextInt());
//        }
//    }
//}

//import java.util.*;
//
//class Main {
//    public static void main(String[] args) {
//
//        Scanner scanner = new Scanner(System.in);
//        Queue<Integer> queue = new LinkedList<>();
//
//        while (scanner.hasNextInt()) {
//            queue.add(scanner.nextInt());
//        }
//
//        for (Integer number : queue) {
//            System.out.println(number);
//        }
//    }
//}
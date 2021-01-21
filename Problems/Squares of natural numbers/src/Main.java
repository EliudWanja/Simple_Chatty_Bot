//Read an integer number N from the input and print all the squares of natural numbers:
//    less than or equal to N,
//    in ascending order.
//    Sample Input:
//    50

import java.util.*;
class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int i = 1;
        while (i * i <= n) {
            System.out.println(i * i);
            i++;
        }
    }
}

//import java.util.Scanner;
//class Main {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        int n = scanner.nextInt();
//        int num = 1;
//        while (num * num <= n) {
//            System.out.println(num * num);
//            num++;
//        }
//    }
//}

//import java.util.*;
//class Main {
//    public static void main(String[] args) {
//        // put your code here
//        Scanner scanner = new Scanner(System.in);
//        int n = scanner.nextInt();
//        int i = 2;
//        int q = 1;
//        while (q <= n) {
//            System.out.println(q);
//            q = i * i;
//            i++;
//        }
//    }
//}
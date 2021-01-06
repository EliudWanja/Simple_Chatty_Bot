//   A Snail creeps up the vertical pole of height H feet. It goes A feet up per day, and B feet down per night.
//    In which day will the snail reach the top of the pole?
//    Input data format
//    On the input the program receives non-negative integers H, A, B, where H > B and A > B. Every integer does not exceed 100.
//
//    Sample Input:
//    10
//    3
//    2
//    Sample Output:
//    8
//
//    Sample Input:
//    20
//    7
//    3
//    Sample Output:
//    5

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here

        //Snail creeps up the vertical pole of height H feet.
        int h = scanner.nextInt();

        //It goes A feet up per day
        int a = scanner.nextInt();

        // it goes B feet down per night.
        int b = scanner.nextInt();

        //In which day will the snail reach the top of the pole?
        int topOfPole = (h - b - 1) / (a - b) + 1;
        System.out.println(topOfPole);
    }
}

//import java.util.Scanner;
//
//class Main {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        int h = scanner.nextInt();
//        int a = scanner.nextInt();
//        int b = scanner.nextInt();
//        int c = a - b;
//        int days = (c * h - c * b - c) / (c * a - c * b) + 1;
//        System.out.println(days);
//    }
//}
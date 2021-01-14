//Find the number of D, C, B and A grades for the last test on informatics,
//    where n students from a class have successfully passed the test.
//    In this task, we use a 5-point grading system and are interested only in passing grades: from 2 to 5.
//    They correspond to the letter grades in the following way: 5 is for A, 4 is for B, 3 is for C and 2 is for D.
//    The program gets number n as input and then gets the grades themselves: one by one.
//    The program should output four numbers in a single line: the number of D, C, B, and A grades respectively.

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        int a = 0;
        int b = 0;
        int c = 0;
        int d = 0;

        for (int i = 0; i < n; i++) {
            int currentGrade = scanner.nextInt();
            if (currentGrade == 5) {
                a += 1;
            } else if (currentGrade == 4) {
                b += 1;
            } else if (currentGrade == 3) {
                c += 1;
            } else if (currentGrade == 2) {
                d += 1;
            }
        }

        System.out.println(d + " " + c + " " + b + " "  + a);
    }
}
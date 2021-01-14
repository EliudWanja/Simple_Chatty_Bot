//A detector compares the size of parts produced by a machine with the reference standard.
//
//    If the size of the part is larger, it can be sent to be fixed, and the detector prints the number 1.
//    If the size of the part is smaller, it is removed as a reject, and the detector prints the number -1.
//    If the part is perfect, it is sent to the box with products, that are ready to ship, and the detector prints 0.
//
//    Write a program, which takes the number of parts n as input, and then the sequence of detector prints. T
//    he program should output numbers in a single line containing the number of parts ready to be shipped,
//    the number of parts to be fixed, and the number of rejects.

import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int larger = 0;
        int smaller = 0;
        int perfect = 0;

        for (int i = 0; i < n; i++) {
            int num = scanner.nextInt();
            if (num == 1) {
                larger++;
            } else if (num == -1) {
                smaller++;
            } else if (num == 0) {
                perfect++;
            }
        }
        System.out.println(perfect + " " + larger + " " + smaller);
    }
}

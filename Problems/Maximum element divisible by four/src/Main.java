//Given a sequence of natural numbers, not exceeding 30000. Find the maximum element divisible by 4.
//    There is always an element divisible by 4 in the sequence and the number of elements does not exceed 1000.
//    As input, the program receives the number of elements in the sequence n (first line) and then the elements
//    themselves (next n lines). The program should print a single number:
//    the maximum element of the sequence divisible by 4.

import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int max = 0;

        for (int i = 0; i < n; i++) {
            int num = scanner.nextInt();
            if (num > max && num % 4 == 0) {
                max = num;
            }
        }
        System.out.println(max);

    }
}

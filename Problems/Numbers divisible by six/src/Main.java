//Find the sum of numbers divisible by 6 in the given sequence of natural numbers.
//        The first line of the input is the number of elements in the sequence;
//        the next lines are the elements themselves.
//        It is guaranteed, that there is always a number divisible by 6 in the sequence.

import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int sum = 0;

        for (int i = 0; i < n; i++) {
            int num = scanner.nextInt();
            if (num % 6 == 0) {
                sum += num;
            }
        }
        System.out.println(sum);
    }
}
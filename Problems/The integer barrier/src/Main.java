//Write a program that reads a sequence of integer numbers in a loop and adds up all numbers.
//    If a new number is equal to 0, the program must stop the loop and output the accumulated sum.
//    When the sum is equal or exceeded 1000 (the barrier), the program should also stop and
//    output the value equal to sum – 1000.
//    Note, the input can contain extra numbers. Just ignore them.

import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int sum = 0;

        while (scan.hasNext()) {
            int num = scan.nextInt();

            sum = sum + num;
            int over1000 = sum - 1000;
            if (sum >= 1000) {
                System.out.print(over1000);
                break;
            } else if (num == 0) {
                System.out.println(sum);
                break;
            }
        }
//        int i = 0;
//        while(i < 10) {
//            System.out.print(i);
//            if (i == 5) {
//                break;
//            }
//            i++;
//        }
    }
}

//        for (int k = 0; k < 10; k++) {
//        if (k > 5) {
//        continue;
//        }
//        System.out.print(k);
//        }
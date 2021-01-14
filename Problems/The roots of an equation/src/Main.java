//Your task is to find the roots of a cubic equation.
//    The input contains four numbers: a,b,c,d.
//    Output all the integer roots between 0 and 1000 (inclusive) for the equation ax3+bx2+cx+d=0 in ascending order.
//    If the specified interval does not contain the roots of the equation, do not output anything.
//    Remember, that cubic equation always has 3 roots, meaning it can't have more than 3 integer roots.
//    Keep this in mind in order to optimize the code.

import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int d = scanner.nextInt();
        int root = 0;

        for (int i = 0; i <= 1000; i++) {
            if (a * i * i * i + b * i * i + c * i + d == 0) {
                root = i;
                System.out.println(root);
            }
        }
    }
}
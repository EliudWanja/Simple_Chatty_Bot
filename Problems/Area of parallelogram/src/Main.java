//According to the formula, the area of a parallelogram is a result of the multiplication of
//    the base and the height of the figure. Call the method countAreaOfParallelogram
//    that calculates the area of the parallelogram with the following parameters b and h.

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // call the method here
        Scanner scanner = new Scanner(System.in);
        int b = scanner.nextInt();
        int h = scanner.nextInt();
        countAreaOfParallelogram(b, h);
    }
    // Do not change code below   
    public static void countAreaOfParallelogram(int b, int h) {
        System.out.println(b * h);
    }
}
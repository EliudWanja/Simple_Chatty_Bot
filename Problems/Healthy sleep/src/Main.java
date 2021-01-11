//Ann watched a health TV program and learned that oversleeping is as bad for your health as not getting enough sleep.
//        She decided to follow TV recommendations and keep track of how many hours she spends sleeping.
//        You are given three numbers: A, B and H. According to TV, one should sleep at least A hours per day,
//        but no more than B hours. H is how many hours Ann sleeps.
//
//        Task: If Ann sleeps less then A hours, print "Deficiency". If she sleeps more than B hours, print "Excess".
//        If her sleep fits the recommendations, print "Normal".
//        Input format: three numbers A, B, H, where A is always less than or equal to B.

import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int h = scanner.nextInt();

//        System.out.println(h < a ? "Deficiency" : h > b ? "Excess" : "Normal");
        if (h >= a && b >= h) {
            System.out.println("Normal");
        } else if (h > b && h  > a) {
            System.out.println("Excess");
        } else if (a > h && b > h) {
            System.out.println("Deficiency");
        }
    }
}
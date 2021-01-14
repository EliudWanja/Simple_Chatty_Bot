//In a computer game, each gamer has an army of units.
//    Write a program that will classify the army of your enemies corresponding to the following rules:
//    Units: Category
//    less than 1: no army
//    from 1 to 19: pack
//    from 20 to 249: throng
//    from 250 to 999: zounds
//    1000 and more: legion
//    The program should read the number of units and output the corresponding category.

import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();

        if (num < 1) {
            System.out.println("no army");
        } else if (num >= 1 && num <= 19) {
            System.out.println("pack");
        } else if (num >= 20 && num <= 249) {
            System.out.println("throng");
        } else if (num >= 250 && num <= 999) {
            System.out.println("zounds");
        } else if (num >= 1000) {
            System.out.println("legion");
        }
    }
}
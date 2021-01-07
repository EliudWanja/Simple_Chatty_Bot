//Write a program that reads the numbers a, b, c and checks if there's a pair of them that adds up to exactly 20.
//
//    The program must output true or false.
//    Sample Input:
//    1 2 3
//
//    Sample Output:
//    false
//    Sample Input:
//    4 16 7


import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        boolean sum1 = a + b == 20 || a + c == 20 || b + c == 20;
        System.out.println(sum1);
    }
}
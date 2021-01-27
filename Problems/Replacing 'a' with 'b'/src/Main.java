//Write a program that reads a string and replaces all occurrences of the letter 'a' with the letter 'b'.
//        The program should print out the resulting string.

import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        System.out.println(str.replace("a", "b"));
    }
}
//Write a program that reads four words and outputs them in the same order, each in a new line.
//Sample Input:
//        Hello
//        Java
//        Future programmer
//
//        Sample Output:
//        Hello
//        Java
//        Future
//        programmer

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);

        String line1 = scanner.nextLine(); // input hello
        String line2 = scanner.nextLine(); // input Java
        String word1 = scanner.next(); // input Future programmer reads the firs word
        String word2 = scanner.next(); // input reads the second line Future programmer

        System.out.println(line1);
        System.out.println(line2);
        System.out.println(word1);
        System.out.println(word2);
    }
}

//import java.util.Scanner;
//
//class Main {
//    public static void main(String[] args) {
//        var scanner = new Scanner(System.in);
//
//        while (scanner.hasNext()) {
//            System.out.println(scanner.next());
//        }
//    }
//}

//import java.util.Scanner;
//
//class Main {
//    public static void main(String[] args) {
//
//        Scanner scanner = new Scanner(System.in);
//
//        for (int i = 1; i <= 4; i++) {
//            System.out.println(scanner.next());
//        }
//    }
//}
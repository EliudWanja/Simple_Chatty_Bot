//Printing each word in a new line
//        Write a program that reads five words from the standard input and outputs each word in a new line.
//        The words should be in the same order.
//
//
//        Sample Input:
//        This Java platform
//        is adaptive
//
//        Sample Output:
//        This
//        Java
//        platform
//        is
//        adaptive

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);

        for (int i = 1; i <=5; i++ ) {
            System.out.println(scanner.next());
        }
    }
}

//import java.util.Scanner;
//class Main {
//    public static void main(String[] args) {
//        // put your code here
//        Scanner scanner = new Scanner(System.in);
//        String w1 = scanner.next();
//        String w2 = scanner.next();
//        String w3 = scanner.next();
//        String w4 = scanner.next();
//        String w5 = scanner.next();
//
//        System.out.println(w1);
//        System.out.println(w2);
//        System.out.println(w3);
//        System.out.println(w4);
//        System.out.println(w5);
//    }
//}

//import java.util.Scanner;
//
//class Main {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        String input = "";
//        while (scanner.hasNext()) {
//            input = input + scanner.next() + "\n";
//        }
//        System.out.print(input);
//    }
//}

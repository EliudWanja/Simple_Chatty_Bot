//Write a program that checks if a given string starts with the prefix "J" ignoring the case.
//        The program should output true or false.

import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        String str1 = str.substring(0, 1).toUpperCase();

        System.out.println(str1.startsWith("J") );
    }
}

//import java.util.Scanner;
//public class Main {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//
//        String str = sc.next();
//        System.out.print(str.startsWith("J") || str.startsWith("j"));
//    }
//}

//import java.util.Scanner;
//
//class Main {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        String str = scanner.nextLine();
//        System.out.println(
//                str.charAt(0) == 'j' || str.charAt(0) == 'J'
//        );
//    }
//}
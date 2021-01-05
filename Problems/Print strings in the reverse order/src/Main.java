//Write a program that reads three strings and outputs them in the reverse order, each in a new line.
//        Sample Input:
//        Java
//        Programming
//        Language
//
//        Sample Output:
//        Language
//        Programming
//        Java

//put imports you need here
import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        //enter inputs
        String java = scanner.nextLine();
        String programming = scanner.nextLine();
        String language = scanner.nextLine();

        //output in reverse
        System.out.println(language);
        System.out.println(programming);
        System.out.println(java);
    }
}
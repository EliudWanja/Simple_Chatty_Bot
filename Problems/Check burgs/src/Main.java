//Write a program that reads the name of a city and checks if the name ends with "burg".
//        Keep in mind, a city can have a short name.
//        The program should output true or false.

import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        String city = scanner.nextLine();
        System.out.println(city.endsWith("burg"));
    }
}
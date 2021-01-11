
import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        // separate each digit
        int x1 = num / 1000;
        int y1 = num / 100 % 10; // num % 1000 / 100
        int y2 = num / 10 % 10; // num % 100 / 10
        int x2 = num % 10;

        if (x1 == x2 && y1 == y2) {
            System.out.println("1");
        } else {
            System.out.println("34");
        }
    }
}
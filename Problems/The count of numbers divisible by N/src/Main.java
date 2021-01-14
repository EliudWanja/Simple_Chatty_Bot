import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int n = scanner.nextInt();

        System.out.print(a % n == 0 ? b / n - a / n + 1 : b / n - a / n);

        // solution 1
        // int divisibleByn = 0;

        // for (int i = a; i <= b; i++) {
        //     if (i % n == 0) {
        //         divisibleByn++;
        //     }
        // }

        // System.out.print(divisibleByn);

        // solution 2 (without loop)

//        System.out.println((b - a) / n + 1);
    }
}
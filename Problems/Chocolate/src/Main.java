import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        // put your code here k < n * m && (k % n == 0 || k % m == 0)
        Scanner scanner = new Scanner(System.in);
        int numN = scanner.nextInt();
        int numM = scanner.nextInt();
        int numK = scanner.nextInt();

//        System.out.println(k < n * m && (k % n == 0 || k % m == 0) ? "YES" : "NO");

        if(numK < numN * numM && (numK % numN == 0 || numK % numM == 0)) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}


import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here
        int even = scanner.nextInt();
        int rem = even % 2;
        System.out.println(even - rem + 2);
//        System.out.println((number / 2) * 2 + 2);
//        System.out.println(even % 2 == 0 ? even +2 : even +1);
    }
}

//import java.util.Scanner;
//
//class Main {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        // put your code here
//        int input = scanner.nextInt();
//        if (input % 2 == 0) {
//            System.out.println(input + 2);
//        } else {
//            System.out.println(input + 1);
//        }
//    }
//}

//import java.util.Scanner;
//
//class Main {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        System.out.println((scanner.nextInt() / 2 + 1) * 2);
//    }
//}

//class JavaExample {
//    public static void main(String args[]) {
//        int n = 100;
//        System.out.print("Even Numbers from 1 to "+n+" are: ");
//        for (int i = 1; i <= n; i++) {
//            //if number%2 == 0 it means its an even number
//            if (i % 2 == 0) {
//                System.out.print(i + " ");
//            }
//        }
//    }
//}
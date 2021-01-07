import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here
        int h1 = scanner.nextInt();
        int h2 = scanner.nextInt();
        int h3 = scanner.nextInt();

        boolean ascOrder = h1 <= h2 && h2 <= h3;
        boolean descOrder = h1 >= h2 && h2 >= h3;
        boolean correct = ascOrder || descOrder;
        System.out.println(correct);
    }
}

//import java.util.Scanner;
//
//class Main {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        // put your code here
//        int height1 = scanner.nextInt();
//        int height2 = scanner.nextInt();
//        int height3 = scanner.nextInt();
//        boolean sequence;
//        if (height1 >= height2 && height2 >= height3 || height1 <= height2 && height2 <= height3) {
//            sequence = true;
//        } else {
//            sequence = false;
//        }
//        System.out.println(sequence);
//    }
//}
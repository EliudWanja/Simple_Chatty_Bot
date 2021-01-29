import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        switch (num) {
            case 1:
                System.out.println("Yes!");
                break;
            case 2:
            case 3:
            case 4:
                System.out.println("No!");
                break;
            default:
                System.out.println("Unknown number");
        }
    }
}

//class Main {

//    public static void main(String[] args) {
////        double max = 0;
////        max = getX();
////        System.out.println(max);
//    }

//    public double getX(int a, int b, int c) {
//        double x;
//        double x2;
//        double x1;
//        x1 = (-b + (Math.sqrt(Math.pow(b, 2) - (4 * a * c)))/(2*a));
//        x2 = (-b - (Math.sqrt(Math.pow(b, 2) - (4 * a * c)))/(2*a));
//
////        X = 0;
//        if (x1 >= x2) {
//            x = x1;
//        } else {
//            x = x2;
//        }
//        return x;
//    }
//}


//public class ProfNandaa {
//
//    public double getX(int a, int b, int c) {
//        double x;
//        double x2;
//        double x1;
//        final double v = (Math.sqrt(Math.pow(b, 2) - (4 * a * c))) / (2 * a);
//        x1 = (-b + v);
//        x2 = (-b - v);
//
//        x = Math.max(x1, x2);
//        return x;
//    }
//}
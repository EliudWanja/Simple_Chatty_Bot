import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int busHeight = scanner.nextInt();
        int numberOfBridge = scanner.nextInt();
        int bridgeNumber = 1;

        while (bridgeNumber <= numberOfBridge) {
            int bridgeHeight = scanner.nextInt();
            if (busHeight < bridgeHeight) {
                bridgeNumber++;
                if (bridgeNumber == numberOfBridge) {
                    System.out.println("Will not crash");
                    break;
                }
                continue;
            }
            if (busHeight >= bridgeHeight) {
                System.out.println("Will crash on bridge " + bridgeNumber);
                break;
            }
        }
    }
}

//import java.util.*;
//
//public class Main {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//
//        int busHeight = scanner.nextInt();
//        int numBridges = scanner.nextInt();
//
//        int bridgeNumber = 0;
//
//        for (int i = 1; i <= numBridges; i++) {
//            int bridgeHeight = scanner.nextInt();
//            if (bridgeHeight <= busHeight) {
//                bridgeNumber = i;
//                break;
//            }
//        }
//
//        if (bridgeNumber == 0) {
//            System.out.println("Will not crash");
//        } else {
//            System.out.println("Will crash on bridge " + bridgeNumber);
//        }
//    }
//}

//import java.util.*;
//public class Main {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//
//        int busHeight = scanner.nextInt();
//        int numberOfBridges = scanner.nextInt();
//        int bridgeHeights = 0;
//
//        for (int i = 1; i < numberOfBridges; i++) {
//            bridgeHeights = scanner.nextInt();
//            if (busHeight >= bridgeHeights) {
//                System.out.println("Will crash on bridge " + i);
//                break;
//            }
//        }
//        if (busHeight < bridgeHeights) {
//            System.out.println("Will not crash");
//        }
//    }
//}


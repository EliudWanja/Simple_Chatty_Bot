//Groundhogs like to throw fun parties, and at their parties, they like to eat Reese's peanut butter cups.
//    But not too many of them, or they feel sick! A successful groundhog party will have between 10 and 20 Reese's peanut butter cups,
//    inclusive unless it is the weekend, in which case they will need 15 to 25 Reese's peanut butter cups, inclusive.
//
//    Write a Java program that reads two values:
//    the first is the number of Reese's peanut butter cups;
//    the second is a boolean representing whether it is the weekend.
//    The program must print the boolean value that indicates the party is successful or not.
//    Sample Input:
//    5 true
//    Sample Output:
//    false
//    Sample Input:
//    16 false
//    Sample Output:
//    true

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
         // put your code here
        int peanutButterCups = scanner.nextInt();
        boolean weekend = scanner.nextBoolean();

        boolean weekends = peanutButterCups >= 15 && peanutButterCups <= 25 && weekend;
        boolean weekDay = peanutButterCups >= 10 && peanutButterCups <= 20 && !weekend;
        boolean success = weekDay || weekends;
//        if(((peanutButterCups <= 25 && peanutButterCups >= 15) && (weekend == true)) || ((peanutButterCups <= 20 && peanutButterCups >= 10)
//                && (weekend == !true ))) {
//            System.out.println(true);
//
//        }else{
//            System.out.println(false);
//        }

        System.out.println(success);
    }
}

//import java.util.Scanner;
//
//class Main {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//
//        Integer cups = scanner.nextInt();
//        String weekend = scanner.next();
//
//        var yes = "true";
//        var nope = "false";
//
//        boolean successfulOnWeek = cups >= 10 && cups <= 20 && weekend.equals(nope);
//        boolean successfulOnWeekend = cups >= 15 && cups <= 25 && weekend.equals(yes);
//
//        System.out.println(successfulOnWeek || successfulOnWeekend);
//    }
//}

//import java.util.Scanner;
//
//class Main {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        // put your code here
//        int num = scanner.nextInt();
//        boolean state = scanner.nextBoolean();
//        boolean weekday = num >= 10 && num <= 20;
//        boolean weekend = num >= 15 && num <= 25;
//        if (state) {
//            System.out.println(weekend);
//        }
//        if (!state) {
//            System.out.println(weekday);
//        }
//    }
//}

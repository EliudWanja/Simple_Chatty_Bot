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

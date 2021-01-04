//Guest list of a hotel
//        You have a guest list of the people who registered their stay at the hotel.
//        There are 4 rooms in the hotel: 1 single room, 2 double rooms and 1 family room for three guests.
//        The guest list consists of 4 lines. Each line contains the name or the names of the guests registered together in one room.
//
//        Read the names of the registered guests from the list and output each name in a separate line
//        and in reverse order starting with the last registered guest.
//        Note that the order of the guests registered in each room is undefined.
//
//        Sample Input:
//        Jane Kate
//        John
//        Mary Susan Paul
//        Boris Ann
//
//        Sample Output:
//        Ann
//        Boris
//        Paul
//        Susan
//        Mary
//        John
//        Kate
//        Jane

//put imports you need here
import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);

        String a = scanner.next(); // input Jane
        String b = scanner.next(); // input kate and jump to new line
        String c = scanner.next(); // input john
        String d = scanner.next(); // input Mary
        String e = scanner.next(); // input susan
        String f = scanner.next(); // input paul
        String g = scanner.next(); //input boris
        String h = scanner.nextLine(); //input ann

        System.out.println(h);
        System.out.println(g);
        System.out.println(f);
        System.out.println(e);
        System.out.println(d);
        System.out.println(c);
        System.out.println(b);
        System.out.println(a);
    }
}

//import java.util.Scanner;
//
//class Main {
//    public static void main(String[] args) {
//        // put your code here
//        Scanner scanner = new Scanner(System.in);
//        String[] guests = new String[9];
//
//        for (int i = 0; i < 8; i++) {
//            guests[i] = scanner.next();
//
//        }
//        for (int i = 7; i > -1; i--) {
//            System.out.println(guests[i]);
//
//        }
//
//    }
//}
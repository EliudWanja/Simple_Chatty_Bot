//Difference of times
//        Find how many seconds passed between the two moments of time on the same day.
//
//        You are given the integer values representing these moments: hours, minutes and seconds for each of them.
//        It is guaranteed that the earlier moment goes first in the input.
//        Input data format
//        The program gets the input of six integers: three defining the first moment of time in hours, minutes, seconds,
//        and the other three defining the second one.
//
//        For example, six numbers 1, 2, 30, 15, 21, 1 will represent two moments of time: 1:02:30 am and 3:21:01 pm (or just 15:21:01).
//
//        Output data format
//
//        Just one number: seconds between these two moments of time. It's 51511 (14 hours, 18 minutes and 31 seconds) in our example.
//
//        Sample Input:
//        1
//        1
//        1
//        2
//        2
//        2
//
//        Sample Output:
//        3661
//
//        Sample Input:
//        1
//        2
//        30
//        1
//        3
//        20
//
//        Sample Output:
//        50


import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here
        int hour1 = scanner.nextInt();
        int min1 = scanner.nextInt();
        int sec1 = scanner.nextInt();

        int hour2 = scanner.nextInt();
        int min2 = scanner.nextInt();
        int sec2 = scanner.nextInt();

        int dif = (hour2 * 3600 - hour1 * 3600) + (min2 * 60 - min1 * 60) + (sec2 - sec1);

        System.out.println(dif);
    }
}
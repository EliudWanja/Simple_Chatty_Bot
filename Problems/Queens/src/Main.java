//You are given coordinates of two queens on a chess board. Find out whether or not they hit each other.
//        Input data format
//        Four integer numbers x1,y1,x2,y2.
//        Output data format
//        Type "YES" (uppercase) if they hit each other or "NO" if they don't.
//        You may need a method that calculates the absolute value of the number, so here it is:
//        Math.abs(n)

//There are these conditions under two queens can see each other:
//        If they are both in the same place, one picked another
//
//        If they share the same axis (either x or y), they see each other since they can move as a rook.
//        This condition is met if their x or y positions are the same.
//
//        If they share the same diagonal, they see each other since they can move as a bishop.
//        This condition is met if the differences between axes are equal. Example:
//        Black queen on position [2,5] and white queen on position [4,3].
//        The difference between the x axes is xDiff = abs(2 - 4) = 2.
//        The difference between the y axes is yDiff = abs(5 - 3) = 2.
//        Both the differences are equal - they see each other in the diagonal.

import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        int x1 = scanner.nextInt();
        int y1 = scanner.nextInt();
        int x2 = scanner.nextInt();
        int y2 = scanner.nextInt();

        if (x1 == x2 || y1 == y2) {
            System.out.println("YES");    //check if they see each other on eow and column  or in same position
        } else if (Math.abs(x1 - x2) == Math.abs(y1 - y2)) {
            System.out.println("YES");                                // Diagonal
        } else {
            System.out.println("NO");
        }
    }
}

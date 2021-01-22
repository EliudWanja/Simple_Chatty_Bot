//Here's the method callMeAwesome. Write the invocation of this method in the template below.
//    Sample Input:
//    Alice
//    Sample Output:
//    Alice, you're awesome!

import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        // call the method here
        callMeAwesome();
    }
    // Do not change code below
    public static void callMeAwesome() {
        Scanner scanner = new Scanner(System.in);
        String name = scanner.next();
        System.out.println(name + ", you're awesome!");
    }
}
//Imagine that you are an HR manager at a restaurant and you need to hire a chef.
// To do that, you need to collect some preliminary data about the candidates.
//
//  You have a special form for the candidates that includes 5 fields: first name, age, stage of education, years of experience, cuisine preference.
//
//        Your program should read all the words (or numbers) from the five lines and output "The form for first name is completed.
//        We will contact you if we need a chef that cooks cuisine preference dishes."
//
//
//        Sample Input:
//        Eugene
//        33
//        secondary
//        8
//        fusion
//
//        Sample Output:
//        The form for Eugene is completed. We will contact you if we need a chef that cooks fusion dishes.

//put imports you need here
import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);

        // get input from the chef
        String a = scanner.nextLine();
        int b = scanner.nextInt();
        String c = scanner.next();
        int d = scanner.nextInt();
        String e = scanner.next();

        // print out the output result
        System.out.println("The form for " +a+ " is completed. We will contact you if we need a chef that cooks " +e+ " dishes.");
    }
}
//
//import java.util.Scanner;
//
//class Main {
//    public static void main(String[] args) {
//        Scanner userInput = new Scanner(System.in);
//
//        String firstName = userInput.next();
//        userInput.nextInt();
//        userInput.next();
//        userInput.nextInt();
//        String cuisinePreference = userInput.next();
//
//        System.out.println("The form for " + firstName + " is completed. We will contact you if we need a chef that" +
//                " cooks " + cuisinePreference + " dishes.");
//
//    }
//}
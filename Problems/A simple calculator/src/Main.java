//Write a simple calculator that reads the three values from the line:
//    the first number, the operation, and the second number.
//    The program should apply the operation to the numbers entered
//    ("first number" "operation" "second number") and output the result to the screen.
//    Note that the numbers are long.
//    The calculator should support:
//    addition: "+"
//    subtraction: "-"
//    integer division: "/"
//    multiplication: "*"
//    If a user performs division and the second number is 0,
//    it is necessary to output the line "Division by 0!".
//    If the input operator is not one from the list, the program should output "Unknown operator".

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        long a = scanner.nextLong();
        String operator = scanner.nextLine();
        long b = scanner.nextLong();

        switch (operator) {
            case "+":
                System.out.println(a + b);
                break;
            case "-":
                System.out.println(a - b);
                break;
            case "/":
                if (b == 0) {
                    System.out.println("Division by 0!");
                    return;
                }
                System.out.println(a / b);
                break;
            case "*":
                System.out.println(a * b);
                break;
            default:
                System.out.println("Unknown operator");
                break;
        }
    }
}
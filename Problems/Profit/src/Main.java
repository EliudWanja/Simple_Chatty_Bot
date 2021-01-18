//Ann put M money in the bank. The bank increases Ann's deposit by P percent every year.
//    Ann wants to know how many years should pass until her deposit in the bank reaches K money.
//    Can you help her to answer this question?
//    The input contains three integers M,P,K. It is guaranteed that all numbers are positive and K≥M.

import java.util.*;

public class Main {
    public static void main(String[] args) {
        // write your code here

        Scanner scanner = new Scanner(System.in);

        double m = scanner.nextDouble(); // money in the bank
        double p = scanner.nextDouble(); // bank increases deposit in percent every year
        double k = scanner.nextDouble(); //time taken
        int year = 0;

        while (m < k) {
            m = m + m * p / 100;
            year++;
        }
        System.out.println(year);
    }
}
//Write a program that reads four numbers and decrements each of them.
//        The program must output the results in the same order separated by spaces.
//        Sample Input:
//        10 11 -2 -3
//        Sample Output:
//        9 10 -3 -4

import java.util.Scanner;

class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        // put your code here
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int d = scanner.nextInt();
        System.out.println(--a + " " + --b + " " + --c + " " + --d);

//        System.out.print(--num1 + " ");
//        System.out.print(--num2 + " ");
//        System.out.print(--num3 + " ");
//        System.out.print(--num4 + " ");

    }
}

//import java.util.Scanner;
//
//class Main {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//
//        while (scanner.hasNextInt()) {
//            System.out.printf("%d ", scanner.nextInt() - 1);
//        }
//    }
//}

//class LargestNumber
//{
//    public static void main(String args[])
//    {
//        int[] a = new int[] { 22, 3, 550, 4, 11, 100};
//        int max = a[0];
//        for(int i = 1; i < a.length;i++) { if(a[i] > max && max % 4 == 0)
//        {
//            max = a[i];
//        }
//        }
//
//        System.out.println("The Given Array is:");
//        for(int i = 0; i < a.length;i++)
//        {
//            System.out.println(a[i]);
//        }
//
//        System.out.println("The Largest Number is:" + max);
//    }
//}
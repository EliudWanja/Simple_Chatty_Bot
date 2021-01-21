//Write a program that reads a sequence of integer numbers and outputs true if the sequence is ordered
//    (in ascending or descending order), otherwise, false.
//    Keep in mind, if a number has the same value as the following number, it does not break the order.
//    The sequence ends with 0. Do not consider this number as a part of the sequence. The sequence always
//    has at least one number (excluding 0).

import java.util.*;
class Main {
    public static void main(String[] args) {
        // put your code here

        Scanner scanner = new Scanner(System.in);
        int oldNum = scanner.nextInt();
        int newNum;
        int asc = 0;
        int dec = 0;

        while ((newNum = scanner.nextInt()) != 0) {
            if (newNum > oldNum) {
                asc++;
            }
            if (newNum < oldNum) {
                dec++;
            }
            oldNum = newNum;
        }
        System.out.println(asc == 0 || dec == 0);
    }
}

//import java.util.Scanner;
//
//class Main {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//
//        int tmpVal = scanner.nextInt();
//        int prevVal = tmpVal;
//        boolean ascending = true;
//        boolean descending = true;
//
//        while (scanner.hasNext()) {
//            tmpVal = scanner.nextInt();
//            if (tmpVal != 0) {
//                ascending = ascending && prevVal <= tmpVal;
//                descending = descending && prevVal >= tmpVal;
//
//                prevVal = tmpVal;
//            } else {
//                break;
//            }
//        }
//
//        if (ascending || descending) {
//            System.out.println(true);
//        } else {
//            System.out.println(false);
//        }
//
//    }
//}


//import java.util.Scanner;
//
//class Main {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int previous = sc.nextInt();
//        boolean asc = false;
//        boolean des = false;
//        while (true) {
//            int value = sc.nextInt();
//            if (value == 0) {
//                break;
//            }
//            if (value < previous) {
//                des = true;
//            } else if (value > previous) {
//                asc = true;
//            }
//            previous = value;
//        }
//        System.out.println(!(asc && des));
//    }
//}

//class Main {
//    public static void main(String[] args) {
//
//        Scanner scanner = new Scanner(System.in);
//
//        //first, you do not need to declare separate variables for the number
//        //you want to enter, but you can use those (here currentNumber is the
//        //number typed in most recently, midNumber is the number before that,
//        //previousNumber is the one before that); they are initialized with 0 for
//        //reasons you will they later
//        int currentNumber = 0, midNumber = 0, previousNumber = 0;
//        boolean flag = false;
//
//        //a while loop, which asks for new numbers, as long as the user does not
//        //break it
//        while(true){
//            //the user enters a number, which is the new current number
//            System.out.print("Enter a number: ");
//            currentNumber = scanner.nextInt();
//            //if the entered number is 0 and there was one number entered before,
//            //the while loop breaks and the process ends
//            if(currentNumber == 0 && midNumber != 0){
//                break;
//            }
//            //there have to be at least three numbers in the sequence for it to be
//            //tested, otherwise the sequence is always true, so there have to be a
//            //midNumber and a previousNumber
//            if(previousNumber != 0 && midNumber != 0){
//                flag = false;
//                //the flag is only true, if the three entered numbers are either
//                //descending or ascending
//                if(
//                        (previousNumber <= midNumber && midNumber <= currentNumber)
//                                ||
//                                (previousNumber >= midNumber && midNumber >= currentNumber)
//                ){
//                    flag = true;
//                }
//            }
//            //the previous number is set to the midNumber, the midNumber is set to
//            //the currentNumber
//            previousNumber = midNumber;
//            midNumber = currentNumber;
//            //since the process has not been terminated by the user, the while-loop
//            //starts over
//        }
//        // for memory reasons, the scanner has to be closed, since it will not be
//        //used after the while-loop, it will be closed here
//        scanner.close();
//
//        //the flag is printed; true if the sequence is true, false if otherwise
//        System.out.println(flag);
//    }
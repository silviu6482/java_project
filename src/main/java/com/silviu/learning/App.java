package com.silviu.learning;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Ship ship1 = new Ship();
        Ship ship2 = new Ship();
        Ship ship3 = new Ship();
    }

// Write a program using if-else which prints “PASS” if the variable 'number' of int type is equal or higher than 50. Otherwise it should print  “FAIL”.
//
//    public static void main( String[] args )
//    {
//        int number = 50;
//        String result;
//
//        if (number >= 50) {
//            result = "PASS";
//        }
//        else {
//            result = "FAIL";
//        }
//
//        System.out.println(result);
//    }
//
// Write a program using if-else which prints true ( booleana )  if the variable 'number' of type int is odd and if it is even print false ( booleana ).
//    public static void main( String[] args )
//    {
//        int number = 50;
//        String result;
//
//        if (number % 2 != 0) {
//            result = "True";
//        }
//        else {
//            result = "False";
//        }
//
//        System.out.println(result);
//    }
//
// Write a program using  switch which prints “ONE” , “TWO” (…), “TEN”  when the variable 'number' is 1,2,3(...),10 or print 'OTHER' when it is another number.
//
//    public static void main( String[] args )
//    {
//        int number = 2;
//        String result;
//
//        switch(number) {
//            case 1: result = "ONE";
//                break;
//            case 2: result = "TWO";
//                break;
//            case 3: result = "THREE";
//                break;
//            case 4: result = "FOUR";
//                break;
//            case 5: result = "FIVE";
//                break;
//            case 6: result = "SIX";
//                break;
//            case 7: result = "SEVEN";
//                break;
//            case 8: result = "EIGHT";
//                break;
//            case 9: result = "NINE";
//                break;
//            case 10: result = "TEN";
//                break;
//            default: result = "OTHER";
//                break;
//        }
//        System.out.println(result);
//    }
//
// Do same exercise as above but using nested-if
//
//    public static void main( String[] args )
//    {
//        int number = 11;
//        String result;
//
//        if (number == 1) {
//            result = "ONE";
//        }
//        else if (number == 2) {
//            result = "TWO";
//        }
//        else if (number == 3) {
//            result = "THREE";
//        }
//        else if (number == 4) {
//            result = "FOUR";
//        }
//        else if (number == 5) {
//            result = "FIVE";
//        }
//        else if (number == 6) {
//            result = "SIX";
//        }
//        else if (number == 7) {
//            result = "SEVEN";
//        }
//        else if (number == 8) {
//            result = "EIGHT";
//        }
//        else if (number == 9) {
//            result = "NINE";
//        }
//        else if (number == 10) {
//            result = "TEN";
//        }
//        else {
//            result = "OTHER";
//        }
//        System.out.println(result);
//    }
//
//Write a program using for which calculates the sum of all the numbers from a lower bound to a higher bound (for example from 1 to 100) .
//Also calculate the average of the lower bound and the higher bound. At the end print the sum and the average.
//Ex: 1+2+3+4+...+100 = sum ; average = (100 + 1)/2
//
//    public static void main( String[] args )
//    {
//        int lower = 1;
//        int upper = 3;
//        int result  = 0;
//
//        for (int i = 0; i <= upper; i++ ) {
//            result = result + i;
//        }
//
//        System.out.println(result);
//        System.out.println("average = " + (lower + upper) / 2);
//    }
}
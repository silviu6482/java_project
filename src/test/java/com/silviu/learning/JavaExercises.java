package com.silviu.learning;

import org.testng.annotations.Test;

import java.util.Arrays;

/**
 * Created by trainingPC on 2/3/2016.
 */
public class JavaExercises {
    @Test
    public void Exercitiu1() {
        int number = 50;
        String result;

        if (number >= 50) {
            result = "PASS";
        } else {
            result = "FAIL";
        }

        System.out.println(result);
    }

    @Test
    public void Exercitiu2() {
        int number = 51;
        String result;

        if (number % 2 == 0) {
            result = "True";
        } else {
            result = "False";
        }

        System.out.println(result);
    }

    @Test
    public void Exercitiu3() {
        int number = 4;
        String result;

        switch(number) {
            case 1:
                result = "ONE";
                break;
            case 2:
                result = "TWO";
                break;
            case 3:
                result = "THREE";
                break;
            case 4:
                result = "FOUR";
                break;
            case 5:
                result = "FIVE";
                break;
            case 6:
                result = "SIX";
                break;
            case 7:
                result = "SEVEN";
                break;
            case 8:
                result = "EIGHT";
                break;
            case 9:
                result = "NINE";
                break;
            case 10:
                result = "TEN";
                break;
            default:
                result = "OTHER";
                break;
        }
        System.out.println(result);
    }

    @Test
    public void Exercitiu4() {
        int number = 11;
        String result;

        if (number == 1) {
            result = "ONE";
        } else if (number == 2) {
            result = "TWO";
        } else if (number == 3) {
            result = "THREE";
        } else if (number == 4) {
            result = "FOUR";
        } else if (number == 5) {
            result = "FIVE";
        } else if (number == 6) {
            result = "SIX";
        } else if (number == 7) {
            result = "SEVEN";
        } else if (number == 8) {
            result = "EIGHT";
        } else if (number == 9) {
            result = "NINE";
        } else if (number == 10) {
            result = "TEN";
        } else {
            result = "OTHER";
        }
        System.out.println(result);
    }

    @Test
    public void Exercitiu5() {
        int lower = 1;
        int upper = 3;
        int result  = 0;

        for (int i = 0; i <= upper; i++ ) {
            result = result + i;
        }

        System.out.println(result);
        System.out.println("average = " + (lower + upper) / 2);
    }

    @Test
    public void Exercitiu6() {
        int lower = 1;
        int upper = 3;
        int result  = 0;
        int i = 0;

        do {
            result = result +i;
            i++;
        } while (i <= upper);

        System.out.println(result);
        System.out.println("average = " + (lower + upper) / 2);
    }

    @Test
    public void Exercitiu7() {
        int lower = 1;
        int upper = 3;
        int result  = 0;
        int i = 0;

        while (i <= upper) {
            result = result +i;
            i++;
        }

        System.out.println(result);
        System.out.println("average = " + (lower + upper) / 2);
    }

    @Test
    public void Exercitiu8() {
        int lower = 111;
        int upper = 8899;
        int result  = 0;
        int count = 0;

        for (int i = lower; i <= upper; i++ ) {
            result = result + i;
            count++;
        }

        System.out.println(result);
        System.out.println(count);
        System.out.println("average = " + (lower + upper) / 2);
    }

    @Test
    public void Exercitiu9() {
        int lower = 1;
        int upper = 100;
        int result  = 0;
        int count = 0;

        for (int i = lower; i <= upper; i++ ) {
            if (i % 2 == 0) {
                result = result + i;
            }
            count++;
        }

        System.out.println(result);
        System.out.println(count);
    }

    @Test
    public void Exercitiu10() {
        int lower = 1;
        int upper = 1000;
        int result  = 0;
        int k = 0;
        int[] explodedNumbers = {};
        int subResult = 0;

        for (int i = lower; i <= upper; i++ ) {
            if (i % 7 == 0) {
                k = i;
                while (k > 0) {
                        subResult = subResult + (k % 10);
                        k = k / 10;
                    }
                if ((subResult != 3) && (subResult != 5) && (subResult != 11)) {
                    result = result + i;
                }
                }
            }
        System.out.println(result);
    }

    @Test
    public void Exercitiu11() {
        int number = 14;
        int j = 0;
        boolean isPrime = true;

        for (int i = 2; i < number; i++) {
            j = number % i;
            if (j == 0) {
                isPrime = false;
            }
        }
        System.out.println(isPrime);
    }

    @Test
    public void Exercitiu12() {
        String word = "alaalac";
        boolean result = true;

        for (int i = 0, j = (word.length()-1); i <= j; i++, j--) {
            if (word.charAt(i) != word.charAt(j)) {
                result = false;
            }
        }

        System.out.println(result);
    }

    @Test
    public void Exercitiu13() {
        int number = 1221;
        boolean result = true;
        String tempString = String.valueOf(number);


        for (int i = 0, j = (tempString.length()-1); i <= j; i++, j--) {
            if (tempString.charAt(i) != tempString.charAt(j)) {
                result = false;
            }
        }

        System.out.println(result);
    }
    //The simple method:
    // string.replaceAll("[aeiou]", "")
    @Test
    public void Exercitiu14() {

        String[] instruments = new String[6];
        instruments[0] = "cello";
        instruments[1] = "piano";
        instruments[2] = "clapsticks";
        instruments[3] = "steelpan";
        instruments[4] = "triangle";
        instruments[5] = "xylophone";

        String[] instrumentsNew = new String[6];

        String[] vowels = new String[5];
        vowels[0] = "a";
        vowels[1] = "e";
        vowels[2] = "i";
        vowels[3] = "o";
        vowels[4] = "u";

        String temp = "";
        String temporary = "";
        boolean status = true;

        for (int i = 0; i <= instruments.length-1; i++) {
            temp = instruments[i];
            for (int j = 0; j <= (temp.length()-1); j++) {
                status = true;
                for (int k = 0; k <= (vowels.length-1); k++) {
                    if (temp.charAt(j) == vowels[k].charAt(0)) {
                        status = false;
                    }
                }
                if (status) {
                    temporary += temp.charAt(j);
                }
            }
            instruments[i] = temporary;
            temporary = "";
        }
        System.out.println(Arrays.toString(instruments));
    }
}

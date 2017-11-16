package test;

import java.util.Date;

import static test.FizzBuzzArray.fizzBuzzArray;
import static test.FizzBuzzBackString.fizzBuzzBackString;
import static test.FizzBuzzClassic.fizzBuzzClassic;
import static test.FizzBuzzString.fizzBuzzString;

/*Напишите программу, которая выводит на экран числа от 1 до 100.
При этом вместо чисел, кратных трем, программа должна выводить слово «Fizz»,
а вместо чисел, кратных пяти — слово «Buzz». Если число кратно и 3, и 5,
то программа должна выводить слово «FizzBuzz»*/

public class Testing {
    public static void main(String[] args){
        long start1 = new Date().getTime();              //mesure time work code
        fizzBuzzClassic();
        long end1 = new Date().getTime();                //mesure time work code

        long start2 = new Date().getTime();              //mesure time work code
        fizzBuzzString();
        long end2 = new Date().getTime();                //mesure time work code

        long start3 = new Date().getTime();              //mesure time work code
        fizzBuzzBackString();
        long end3 = new Date().getTime();                //mesure time work code

        long start4 = new Date().getTime();              //mesure time work code
        fizzBuzzArray();
        long end4 = new Date().getTime();                //mesure time work code

        System.out.print("the time work fizzBuzzClassic = ");
        System.out.print(end1-start1);
        System.out.println(" ms");
        System.out.print("the time work fizzBuzzString = ");
        System.out.print(end2-start2);
        System.out.println(" ms");
        System.out.print("the time work fizzBuzzBackString = ");
        System.out.print(end3-start3);
        System.out.println(" ms");
        System.out.print("the time work fizzBuzzArray = ");
        System.out.print(end4-start4);
        System.out.println(" ms");
    }
}

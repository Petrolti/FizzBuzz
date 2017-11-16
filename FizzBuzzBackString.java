package test;

public class FizzBuzzBackString {
    public static void fizzBuzzBackString(){
        for(int i=1;i<101;i++)
        {
            String n = String.valueOf(i), f = "Fizz", b="Buzz";
            if(i%3!=0) f=""; else n="";
            if(i%5!=0) b=""; else n="";
            System.out.println(n+f+b);
        }
    }
}

package test;

public class FizzBuzzString {
    public static void fizzBuzzString(){
        for( int i = 1; i < 101; i++){
            String str = "";
            if(i%3==0) str = "Fizz";
            if(i%5==0) str += "Buzz";
            if(str=="") str = String.valueOf(i);
            System.out.println(str);
        }
    }
}

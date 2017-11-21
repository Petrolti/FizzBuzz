package test;

public class FizzBuzzArray {
    public static void fizzBuzzArray(){
        String[] map = new String[100];                 //Initialise array for 100 values
        for(int i = 0; i < 100; i++){                   //Write all number at 1 do 100
            map[i] = String.valueOf(i + 1);
        }
        for (int i = 1; i < 34; i++){                   //Write all ... 3 ... "Fizz", overwrite number
            map[i*3-1] = "Fizz";
        }
        for (int i = 1; i < 21; i++){                   //Write all ... 5 ... "Buzz", overwrite number
            map[i*5-1] = "Buzz";
        }
        for (int i = 1; i < 7; i++){                    //Write all ... 3 and 5 ... "FizzBuzz", overwrite number
            map[i*15-1] = "FizzBuzz";
        }
        for (int i = 0; i < map.length; i++){           //Print to console
            System.out.println(map[i]);
        }
    }
}

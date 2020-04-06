package com.kodilla.stash;

public class LambdaTest {
    public static void main(String[] args) {

        NumericTest2 isFactor = (n, d) -> (n % d) == 0;
        isFactor.test2(21, 7);
        if (isFactor.test2(10, 2)) System.out.println("2 nie jest czynnikiem liczby 10");
        if (isFactor.test2(9, 3)) System.out.println("3 jest czynnikiem liczby 9");

        NumericTest2 numericTest2 = (a, b) -> a > b;

        if (numericTest2.test2(12, 5)) System.out.println("12 is bigger then 5");

        NumericTest factorial = (n) -> {
            int result = 1;

            for (int i = 1; i <= n; i++) {
                result = i * result;
            }
            return result;
        };

        System.out.println("Silnia liczby 8 wynosi: " + factorial.func(8));
        System.out.println("Silnia liczby 7 wynosi: " + factorial.func(7));
        System.out.println("Silnia liczby 9 wynosi: " + factorial.func(9));

        StringFunc reverse = (str) -> {
            String result = "";

            for(int i = str.length() -1 ; i >= 0; i --){
                result += str.charAt(i);
            }
            return result;
        };

        System.out.println("Reversed string: " + reverse.func("this is going to be reversed"));
    }
}
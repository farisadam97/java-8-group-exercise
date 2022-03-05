package main;

import java.util.function.Function;

public class main {
    @FunctionalInterface
    interface booleanOddOrEven{
        boolean oddOrEven(int a);
    }

    public boolean OddOrEvenNumber(int a, booleanOddOrEven booleanOddOrEven){
        return booleanOddOrEven.oddOrEven(a);
    }

    public boolean testingOddOrEven(int x){
        return OddOrEvenNumber(x,(a) ->a % 2==0 ? true : false);
    }

    public static void main(String[] args) {

//        Create Interface and using lambda
        main mainA = new main();
        System.out.println(mainA.testingOddOrEven(5));

//        Using Method reference
        Function<String,String> toLowerCase = String::toLowerCase;
        String testText = toLowerCase.apply("TesTLowErCaSEtHisText");
        System.out.println(testText);



    }
}

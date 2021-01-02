package ua.mainaacademy.services;

public class NumericServices {

    public static int getSumByType(int numbers){
        int result=0;
        String numberText=String.valueOf(numbers);
        char[]symbols=numberText.toCharArray();
        /*for (int i=0;i<symbols.length;i++){
            result=result+Character.getNumericValue(symbols[i]);
            result+=Character.getNumericValue(symbols[i]);
        }*/
        for (char symbol: symbols){
            result+=Character.getNumericValue(symbol);
        }

        return result;
    }
    public static int getSumByMath(int numbers) {
        int result = 0;
    while (numbers!=0){//0-counsel
    result +=numbers%10;//5, next iteration 4 ...
    numbers=numbers/10;//1234.5 if int =1234, 123,12,1.1,0

}
        return result;

    }

}

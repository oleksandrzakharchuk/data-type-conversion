package ua.mainaacademy;

import ua.mainaacademy.services.NumericServices;

public class FirstApplication {
    public static void main(String[] args) {
        if (args.length<1){
            System.out.println("There is no args");
            return;
        }
        // check in future
        int numbers =Integer.valueOf(args[0]);
        //int numbers=12345;

        int result1= NumericServices.getSumByType(numbers);
        int result2= NumericServices.getSumByMath(numbers);

        System.out.println("Number is "+numbers);
        System.out.println("Result1 is "+result1);
        System.out.println("Result2 is "+result2);
    }

}

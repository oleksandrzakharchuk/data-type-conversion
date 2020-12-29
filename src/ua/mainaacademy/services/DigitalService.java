package ua.mainaacademy.services;

public class DigitalService {


    private static String str;
    private static Object number2;
    private static int sum;
    private static int number4;


    public static int GetNumberToString(int number) {
        int number1 = number;
        String str = Integer.toString(number);
        System.out.println("Number->String " + str);

        return number1;
    }


    public static String GetCharArrayFromString(String number) {
        String number3 = number;
        char[] result = number3.toCharArray();

        System.out.println("Char array:");
        for (int i = 0; i < result.length; i++)
            System.out.println("Element [" + i + "]: " + result[i]);

        return number3;
    }

    public static char GetCharToInt(char c, char c1, char c2, char c3, char c4, char c5) {

        int a = c;
        int b = c1;
        int o = c2;
        int d = c3;
        int e = c4;
        int f = c5;

        System.out.println("Char->Int of number 1 = "+(a));
        System.out.println("Char->Int of number 2 = "+(b));
        System.out.println("Char->Int of number 3 = "+(o));
        System.out.println("Char->Int of number 4 = "+(d));
        System.out.println("Char->Int of number 5 = "+(e));
        System.out.println("Char->Int of number 6 = "+(f));

        return (char) c;
    }

    public static int GetSumOfNumber(int number) {
        while (number != 0) {
            //Суммирование цифр числа
            sum += (number % 10);
            number /= 10;
        }
        System.out.println("Sum of digits of a number 123456 " + " = "+sum + " ");
        return number4;
    }
}


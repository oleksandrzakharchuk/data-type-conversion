package ua.mainaacademy;

import ua.mainaacademy.services.DigitalService;

public class LogicApp{

        public static void main(String[] args) {
            int result1 = DigitalService.GetNumberToString(123456);
            String result3 = DigitalService.GetCharArrayFromString("123456");
            char result2 = DigitalService.GetCharToInt('1', '2', '3', '4', '5', '6');
            int result4 = DigitalService.GetSumOfNumber(123456);
        }
}


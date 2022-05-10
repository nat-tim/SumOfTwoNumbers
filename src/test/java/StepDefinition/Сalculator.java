package StepDefinition;

import static java.lang.Math.*;

public class Сalculator {
    public static int summ(int firstNumb, int secondNum){
        int a = max(abs(firstNumb), abs(secondNum));
        int b = min(abs(firstNumb), abs(secondNum));
        int digitOfNumber = 1;
        int valueDigit = 0;
        if ((firstNumb>=0 && secondNum>=0) || (firstNumb<0 && secondNum<0)) {
            //складываем поразрядно и собираем общий результат
            while (!(a == 0) && !(b == 0)) {
                valueDigit = (a % 10 + b % 10) * digitOfNumber + valueDigit;
                a = a / 10;
                b = b / 10;
                digitOfNumber *= 10;
            }
            if (firstNumb<0 && secondNum<0){
                return (-1)*(a*digitOfNumber + b*digitOfNumber + valueDigit);
            }else {
                return a*digitOfNumber + b*digitOfNumber + valueDigit;
            }
        } else {
            //вычитаем поразрядно и собираем общий результат
            while (!(a == 0) && !(b == 0)) {
                valueDigit = (a % 10 - b % 10) * digitOfNumber + valueDigit;
                a = a / 10;
                b = b / 10;
                digitOfNumber *= 10;
            }
            if ((firstNumb<0 && abs(firstNumb)>secondNum) || (secondNum<0 && abs(secondNum)>firstNumb)){
                return (-1)*(a*digitOfNumber + b*digitOfNumber + valueDigit);
            }else {
                return a*digitOfNumber + b*digitOfNumber + valueDigit;
            }
        }


    }
}

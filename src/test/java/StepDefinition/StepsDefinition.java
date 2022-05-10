package StepDefinition;

import io.cucumber.java.ru.И;
import io.cucumber.java.ru.Когда;
import io.cucumber.java.ru.Тогда;

import java.util.List;


import static java.lang.Integer.parseInt;

public class StepsDefinition {
    int a;

    int b;
    int sum=0;
    @Когда("^получаем два целых числа$")
    public void initNumbers( List<String> arg){
        a = parseInt(arg.get(0));
        b = parseInt(arg.get(1));
    }
    @Тогда("^складываем их$")
    public void sumOfNum(){
        sum = a + b;
    }
    @И("^выводим результат$")
    public void printResult(){
        System.out.println("сумма чисел " + a + " и " + b + " равна " + sum);
    }

}

package pro.sky.calculator;

import org.springframework.stereotype.Service;

@Service
public class CalculatorService implements CalculatorServiceInterface {
    public String first() {
        return "<b> Лицевая страница сайта </b>";
    }

    public String calculator() {
        return "<b> Добро пожаловать в калькулятор </b>";
    }

    int num1 = 5;
    int num2 = 5;

    public int plus() {

        return num1 + num2;
    }

    public int minus() {
        return num1 - num2;
    }

    public int multiply() {
        return num1 * num2;
    }

    public int divide() {
        return num1 / num2;
    }

}
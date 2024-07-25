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

    public String plus(int num1, int num2) {
        int result = num1 + num2;
        return num1 + "+" + num2 + "=" + result;
    }


    public String minus(int num1, int num2) {
        int result = num1 - num2;
        return num1 + "-" + num2 + "=" + result;
    }

    public String multiply(int num1, int num2) {
        int result = num1 * num2;
        return num1 + "*" + num2 + "=" + result;
    }

    public String divide(int num1, int num2) {
        int result = num1 / num2;
        return num1 + "/" + num2 + "=" + result;
    }

}


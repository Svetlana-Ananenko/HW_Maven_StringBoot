    package pro.sky.calculator;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

    @RestController
    public class CalculatorController {
        private final CalculatorServiceInterface calculatorService;

        public CalculatorController (CalculatorServiceInterface calculatorService) {
            this.calculatorService = calculatorService;
        }
        @GetMapping
        public String first() {
            return calculatorService.first();
        }

        @GetMapping(path = "/calculator")
        public String calculator() {
            return calculatorService.calculator();
        }

        @GetMapping(path = "/calculator/plus")
        public String plus (@RequestParam("num1") String number1,@RequestParam("num2") String number2) {
            return number1 + " + " + number2 + " = " + calculatorService.plus();
        }

        @GetMapping(path = "/calculator/minus")
        public String minus (@RequestParam("num1") String number1,@RequestParam("num2") String number2) {
            return number1 + " - " + number2 + " = " + calculatorService.minus();
        }

        @GetMapping(path = "/calculator/multiply")
        public String multiply (@RequestParam("num1") String number1,@RequestParam("num2") String number2) {
            return number1 + " * " + number2 + " = " + calculatorService.multiply();
        }

        @GetMapping(path = "/calculator/divide")
        public String divide (@RequestParam("num1") String number1, @RequestParam("num2") String number2) {
            return number1 + " / " + number2 + " = " + calculatorService.divide();
        }

    }


    package pro.sky.calculator;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

    @RestController
    public class CalculatorController {
        private final CalculatorService calculatorService;
        public CalculatorController (CalculatorService calculatorService) {
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
        public String plus(@RequestParam(value = "num1", required = false) Integer num1, @RequestParam(value = "num2", required = false) Integer num2) {
            if (num1 == null || num2 == null) {
                return "один (оба) из параметров не определён(ы)";
            }
            return calculatorService.plus(num1, num2);
        }

        @GetMapping(path = "/calculator/minus")
        public String minus (@RequestParam(value = "num1", required = false) Integer num1, @RequestParam(value = "num2", required = false) Integer num2) {
            if (num1 == null || num2 == null) {
                return "один (оба) из параметров не определён(ы)";
            }
            return calculatorService.minus(num1, num2);
        }

        @GetMapping(path = "/calculator/multiply")
        public String multiply (@RequestParam(value = "num1", required = false) Integer num1, @RequestParam(value = "num2", required = false) Integer num2) {
            if (num1 == null || num2 == null) {
                return "один (оба) из параметров не определён(ы)";
            }
            return calculatorService.multiply(num1, num2);
        }

        @GetMapping(path = "/calculator/divide")
        public String divide (@RequestParam(value = "num1", required = false) Integer num1, @RequestParam(value = "num2", required = false) Integer num2) {
            if (num1 == null || num2 == null) {
                return "один (оба) из параметров не определён(ы)";
            }
            if (num2 == 0) {
                return "Делить на 0 - нельзя!!!";
            }
            return calculatorService.divide(num1, num2);
        }
    }


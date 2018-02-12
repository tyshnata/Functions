package BasicProgram;

import UiUtils.ScannerClass;

public class ElementFibonacci implements Decision{
    private static Integer number, itemFibonacci;
    private final Long[] fibonacciNumbers = new Long[93];

    private Long fibonacci(Integer number){
        Long fibElement;
        fibonacciNumbers[0] = new Long(0);
        fibonacciNumbers[1] = new Long(1);

        for (int i = 2; i < fibonacciNumbers.length; i++){
            fibonacciNumbers[i] = fibonacciNumbers[i-1] + fibonacciNumbers[i - 2];
        }

        fibElement = fibonacciNumbers[number];
        return fibElement;
    }

    @Override
    public void answer() {
        System.out.println("Элемент под номером " + itemFibonacci + " последовательности Фибоначчи равен " + fibonacci(itemFibonacci) );
    }

    @Override
    public void solutionTask() {
        System.out.println("Какой элемент последовательности Фибоначчи найти?(от 0 до 92)");

        ScannerClass number = new ScannerClass();
        itemFibonacci = number.inputValidationNumber();

        if (itemFibonacci > -1 & itemFibonacci <93){
            answer();
        }
        else {
            System.out.println("Число должно быть от 0 до 92.");
            solutionTask();
        }

    }
}

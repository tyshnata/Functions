package BasicProgram;

import TestScanner.ScannerClass;

public class FactorialOfANumber implements Decision {
    private static Integer index;
    private final Long[] factorials = new Long[20];

    private Long factorial(Integer index){

        Long result;
        factorials[0] = new Long(1);
        for (int i = 1; i < factorials.length; i++){
            factorials[i] = factorials[i-1] * (i + 1);
        }
        result = factorials[index - 1];
        return result;
    }

    @Override
    public void answer() {
        System.out.println( "Факториал числа " + index + " равен " + factorial(index) );

    }

    @Override
    public void solutionTask() {
        System.out.println("Факториал какого числа вы хотите найти?(от 1 до 20)");

        ScannerClass number = new ScannerClass();

        index = number.inputValidationNumber();
        if(index >-1 & index < 21){
            answer();
        }
        else {
            System.out.println("Ввести нужно число от 1 до 20.");
            solutionTask();
        }
    }
}

package BasicProgram;

import TestScanner.ScannerClass;

public class SumOfTwoNumbers implements Decision {

    private static Integer firstNumber,  secondNumber;

    private Integer sum ( Integer firstNumber, Integer secondNumber){
        Integer amount;
        amount = firstNumber + secondNumber;
        return amount;

    }

    @Override
    public  void answer() {
        System.out.println( firstNumber + " + " + secondNumber + " = " + sum(firstNumber, secondNumber));
    }

    @Override
    public void solutionTask() {

        System.out.println("Ведите первое число: ");
        ScannerClass number = new ScannerClass();
        firstNumber = number.inputValidationNumber();

        System.out.println("Ведите второе число: ");
        secondNumber = number.inputValidationNumber();
        answer();

    }
}



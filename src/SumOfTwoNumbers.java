public class SumOfTwoNumbers implements Decition {
    static Integer amount = 0;
    static Integer firstNumber,  secondNumber;

    public SumOfTwoNumbers (Integer firstNumber, Integer secondNumber){
        this.firstNumber = firstNumber;
        this.secondNumber = secondNumber;
    }

    public  Integer sum ( Integer firstNumber, Integer secondNumber){ // метод, суммирующий два числа
        amount = firstNumber + secondNumber;
        return amount;

    }

    @Override
    public  void answer() {
        System.out.println( firstNumber + " + " + secondNumber + " = " + sum(firstNumber, secondNumber));
    }
}



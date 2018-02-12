import BasicProgram.*;
import UiUtils.ScannerClass;
import static UiUtils.Text.*;

public class Functions {

    private static Integer taskNumber;
    private static ScannerClass scanData = new ScannerClass();
    private static Integer startNumber;

    public static void main(String[] args) {

        System.out.println("Привет!");
        System.out.println("Если хочешь найти ответы на некоторые вопросы, напиши *1*, если нет напиши *2*");

        startNumber = scanData.inputValidationNumber();
        start(startNumber);
    }

     private static void start(Integer word){
       switch (word){
           case 1:
               choiceMenu();
           break;
           case 2:
               choiceExit();
           break;
           case 0:
               choiceAgain();
           break;
           default:
               choiceDefault();
           break;

       }
    }

    private static void  choiceMenu(){
        functionMenu();
        taskNumber = scanData.inputValidationNumber();

        if (taskNumber>0 & taskNumber<9){
            solvingProblems (taskNumber);// the solutionTask of the problem
            menuOrExitOrAgain();
            startNumber = scanData.inputValidationNumber();
            start(startNumber);
        }
        else{
            System.out.println("Ведите число от 1 до 8: ");
            choiceMenu();
        }
    }

    private static void  choiceAgain(){
        solvingProblems (taskNumber);
        menuOrExitOrAgain();
        startNumber = scanData.inputValidationNumber();
        start(startNumber);
    }

    private static void choiceExit(){

        goodBye();
    }

    private static void choiceDefault(){
        erroneousData();
        startNumber = scanData.inputValidationNumber();
        start(startNumber);
    }

    private static void solvingProblems (int i) {

        switch (i) {
            case 1:   // maximum list
                MaxNumber maxNumber = new MaxNumber();
                maxNumber.solutionTask();
                break;
            case 2:  // get element by index
                GetElementByIndex getElementByIndex = new GetElementByIndex();
                getElementByIndex.solutionTask();
                break;
            case 3:  // find the element of the Fibonacci sequence
                ElementFibonacci elementFibonacci = new ElementFibonacci();
                elementFibonacci.solutionTask();
                break;
            case 4:  // check palindrom
                StringPalindrom stringPalindrom = new StringPalindrom();
                stringPalindrom.solutionTask();
                break;
            case 5:  // sum of two numbers
                SumOfTwoNumbers sumOfTwoNumbers = new SumOfTwoNumbers();
                sumOfTwoNumbers.solutionTask();
                break;
            case 6:  //  factorial of a number
                FactorialOfANumber factorialOfANumber = new FactorialOfANumber();
                factorialOfANumber.solutionTask();
                break;
            case 7:   // the index of the first occurrence of a number in the list
                IndexOfANumber indexOfANumber = new IndexOfANumber();
                indexOfANumber.solutionTask();
                break;
            case 8:  // revers line
                ReversLine reversLine = new ReversLine();
                reversLine.solutionTask();
                break;
            default:
                System.out.println("Неправильно. Введите номер задачи от 1 до 8: ");
                break;
        }
    }


}



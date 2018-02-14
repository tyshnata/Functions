import BasicProgram.*;

import UiUtils.ScannerClass;
import static UiUtils.Text.*;

public class Functions extends Constants{
    private static Integer taskNumber;
    private static ScannerClass scanData = new ScannerClass();
    private static Integer startNumber;

    public static void main(String[] args) {
        System.out.println("Привет!");
        System.out.println("Если хочешь найти ответы на некоторые вопросы, напиши *1*, если нет напиши *2*");

        startNumber = scanData.inputValidationNumber();
        choice(startNumber);
    }

    private static void choice(Integer numberOfChoices){
        switch (numberOfChoices){
            case 1: 
                choiceMenu();
                
                break;
            case 2: 
                choiceExit();
                
                break;
            case 0:
                choiceSolveTheProblemAgain();
                   
                break;
            default: 
                choiceDefault();
                
                break;
        }
    }

    private static void  choiceMenu(){
        renderFunctionMenu();
        taskNumber = scanData.inputValidationNumber();

        if (taskNumber > 0 & taskNumber < 9){ // TODO: 2/14/18 what the difference between && and & ? remember and provide refactor here :)
            // &&  checks only the first condition; It is necessary that both conditions are checked, therefore I use "&"
            taskChoice(taskNumber);
            menuOrExitOrAgain();
            startNumber = scanData.inputValidationNumber();
            choice(startNumber);
        }
        else{
            ifErrorneousTaskNumber();
            choiceMenu();
        }
    }

    private static void choiceSolveTheProblemAgain(){
        taskChoice(taskNumber);
        menuOrExitOrAgain();
        startNumber = scanData.inputValidationNumber();
        choice(startNumber);
    }

    private static void choiceExit(){
        goodBye();
    }

    private static void choiceDefault(){
        erroneousData();
        startNumber = scanData.inputValidationNumber();
        choice(startNumber);
    }

    private static void taskChoice(int i) {
        switch (i) {
            case MAXIMUM_LIST_PROGRAM:
                MaxNumber maxNumber = new MaxNumber();
                maxNumber.solutionTask();
                break;
            case  GET_ELEMENT_BY_INDEX_PROGRAM:
                GetElementByIndex getElementByIndex = new GetElementByIndex();
                getElementByIndex.solutionTask();
                break;
            case FIND_FIBONACCI_ELEMENT_PROGRAM:
                ElementFibonacci elementFibonacci = new ElementFibonacci();
                elementFibonacci.solutionTask();
                break;
            case CHECK_PALINDROM_PROGRAM:
                StringPalindrom stringPalindrom = new StringPalindrom();
                stringPalindrom.solutionTask();
                break;
            case SUM_OF_TWO_NUMBERS_PROGRAM:
                SumOfTwoNumbers sumOfTwoNumbers = new SumOfTwoNumbers();
                sumOfTwoNumbers.solutionTask();
                break;
            case FACTORIAL_PROGRAM:
                FactorialOfANumber factorialOfANumber = new FactorialOfANumber();
                factorialOfANumber.solutionTask();
                break;
            case NUMBER_INDEX_IN_THE_LIST_PROGRAM:
                IndexOfANumber indexOfANumber = new IndexOfANumber();
                indexOfANumber.solutionTask();
                break;
            case REVERS_LINE_PROGRAM:
                ReversLine reversLine = new ReversLine();
                reversLine.solutionTask();
                break;
            default:
                ifErrorneousTaskNumber();
                break;
        }
    }
}



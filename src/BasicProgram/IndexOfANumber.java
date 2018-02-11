package BasicProgram;

import TestScanner.ScannerClass;
import static TestScanner.Text.*;

public class IndexOfANumber  implements Decision {

    private static Integer[] list;
    private static Integer specifiedNumber ;

       private int search( int number, Integer[] list){
        int index = 0;

        for (int i = 0; i < list.length; i++){
            if (list[i] == number){
                index = i;
                break;
            }
            else
                index = -1;
        }
        return index;
    }

    @Override
    public void answer() {
        System.out.println();
        System.out.println( "Индекс первого вхождения числа " + specifiedNumber + " в список: " + search( specifiedNumber,  list) );
    }

    @Override
    public void solutionTask() {
        Integer sizeOfSequence;

        ScannerClass number = new ScannerClass();
        questionSizeOfSequence();
        sizeOfSequence = number.inputValidationNumber();

        ScannerClass listScan = new  ScannerClass();
        inputSequence();
        list = listScan.inputValidationSequence(sizeOfSequence);

        inputNumber();
        specifiedNumber  = number.inputValidationNumber() ;

        answer();
    }
}

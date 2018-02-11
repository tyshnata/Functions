package BasicProgram;

import TestScanner.ScannerClass;
import static TestScanner.Text.*;

public class GetElementByIndex implements Decision {

    private static Integer[] list;
    private Integer index;

    private Integer getElement(Integer[] list, Integer index){
        Integer numberByIndex;

        if ( index < list.length){
            numberByIndex = list[index];
        }
        else {
            numberByIndex = -1;
        }
        return numberByIndex;
    }

    @Override
    public void answer() {
        System.out.println("Элемент с индексом " + index + " равен  " + getElement( list, index) );
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

        inputIndex();
        index = number.inputValidationNumber();

        answer();
    }
}

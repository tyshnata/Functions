package BasicProgram;
import UiUtils.ScannerClass;
import static UiUtils.Text.*;


public class MaxNumber implements Decision {
    private static Integer[] list;

    private  Integer maximum(Integer[] list){

        Integer maxNumber = list[0];

        for(int i = 0; i < list.length ; i++){
            if ( maxNumber >= list[i] ){}
            else maxNumber = list[i];
        }
        return maxNumber;
    }

    @Override
    public void answer() {
        System.out.println("Самое большое число в данном списке: " + maximum(list) );
    }

    public void solutionTask(){

        Integer sizeOfSequence;
        ScannerClass  number = new ScannerClass();
        questionSizeOfSequence();

        sizeOfSequence = number.inputValidationNumber();

        ScannerClass listScan = new  ScannerClass();
        inputSequence();

        list = listScan.inputValidationSequence(sizeOfSequence);

        answer();
    }
}

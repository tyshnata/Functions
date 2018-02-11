package TestScanner;

import java.util.Scanner;

public class ScannerClass extends Text {

    private Scanner scan = new Scanner(System.in);

    public Integer inputValidationNumber(){
        Integer number;
        while (!scan.hasNextInt()) {
            erroneousData();
            scan.next();
        }
        number = scan.nextInt();
        return number;
    }

    public Integer[] inputValidationSequence(Integer sizeOfSequence){
        Integer[] list;
        list = new Integer[sizeOfSequence];
        while (!scan.hasNextInt()) {
            erroneousData();
            scan.next();
        }

        for (int j = 0; j < sizeOfSequence; j++) {
            list[j] = scan.nextInt();
        }

        return (list);
    }

    public String inputLine(){
        String line;
        line = scan.nextLine();
        return line;
    }
}

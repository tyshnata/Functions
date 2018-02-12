package UiUtils;

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
        Integer[] list = new Integer[sizeOfSequence];

        for (int j = 0; j < sizeOfSequence; j++) {

            if (scan.hasNextInt()){
            list[j] = scan.nextInt();
            }

            else {
                System.out.println("Введите только числа: ");
                scan.next();
                inputValidationSequence(sizeOfSequence);
            }
         }
        return (list);
    }

    public String inputLine(){
        String line;
        line = scan.nextLine();
        return line;
    }
}

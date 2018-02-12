package BasicProgram;

import UiUtils.ScannerClass;

public class ReversLine implements Decision {
    private static String  reverseString;
    private static String line;

    private String reverse(String line){

        for (int i = (line.length()-1); i >= 0 ; i--){
            reverseString += line.charAt(i);
        }
        return reverseString;
    }

    @Override
    public void answer() {

        System.out.println( "Измененная строка: " + reverse(line) );
    }

    @Override
    public void solutionTask() {

        System.out.println("Введите строку.");
        ScannerClass scanLine = new ScannerClass();
        line = scanLine.inputLine();

        answer();
    }
}

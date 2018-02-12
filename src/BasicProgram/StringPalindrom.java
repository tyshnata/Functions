package BasicProgram;

import UiUtils.ScannerClass;

public class StringPalindrom implements Decision {
    private static boolean palindrom;
    private static String line;

    private boolean isPalindrom (String words) {
        for (int i = 0; i < words.length(); i++) {
            if (words.charAt(i) == words.charAt(words.length() -1 - i)) {
                palindrom = true;
            }
            else {
                palindrom = false;
                break;
            }
        }
        return palindrom;
    }

    @Override
    public void answer() {
        palindrom = isPalindrom (line);
        if (palindrom) {
            System.out.println("Это палиндром.");
        }
        else
        System.out.println( "Это не палиндром."  );

    }

    @Override
    public void solutionTask() {

        System.out.println("Ведите строку и узнаете, палиндром ли это.");
        ScannerClass scanLine = new ScannerClass();
        line = scanLine.inputLine();
        answer();

    }
}

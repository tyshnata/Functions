public class StringPalindrom implements Decition{
    static boolean palindrom;
    static String word;

    public StringPalindrom (String word){

        this.word = word;
    }

    public  boolean isPalindrom (String word) {  // метод, проверяющий является ли строка палиндромом

        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) == word.charAt(word.length() -1 - i)) {
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
        palindrom = isPalindrom (word);
        if (palindrom == true) {
            System.out.println("Это слово палиндром.");
        }
        else
        System.out.println( "Это слово не палиндром."  );

    }
}

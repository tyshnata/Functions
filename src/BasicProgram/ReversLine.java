public class ReversLine implements Decition{
    static String  reverseString = "";
    String line;

    public ReversLine (String line){

        this.line = line;
    }

    private String reverse (String line){ // метод, меняющий строку


        for (int i = (line.length()-1); i >= 0 ; i--){
            reverseString += line.charAt(i);   // "читаем" строку в обратном порядке
        }
        return reverseString;
    }

    @Override
    public void answer() {
        System.out.println( "Измененная строка: " + reverse(line) );

    }
}

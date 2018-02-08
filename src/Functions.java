import java.util.Scanner;

public class Functions extends Solutions{

    static Scanner scan = new Scanner(System.in);
    static int taskNumber; //номер задачи
    static String startWord;

    public static void main(String[] args) {

        System.out.println("Привет!");
        System.out.println("Если хочешь найти ответы на некоторые вопросы, напиши *menu*, если нет напиши *exit*");
        startWord = scan.next();
        start(startWord);
    }

    public static void start(String word){
       switch (word){
           case "menu":
               choiceMenu();
           break;
           case "exit":
               choiceExit();
           break;
           case "again":
               choiceAgain();
           break;
           default:
               choiceDefault();
           break;

       }
    }

    private static void  choiceMenu(){
        functionMenu();
        taskNumber =  scan.nextInt();
        if (taskNumber>0 & taskNumber<9){
            solvingProblems (taskNumber);// решаем задачу
            menuOrExitOrAgain();// выбор - меню или выход - или решить эту задачу снова
            startWord = scan.next();
            start(startWord);
        }
        else{
            erroneousData();
            choiceMenu();
        }
    }

    private static void  choiceAgain(){
        solvingProblems (taskNumber);
        menuOrExitOrAgain();
        startWord = scan.next();
        start(startWord);
    }

    private static void choiceExit(){
        goodBye();
    }

    private static void choiceDefault(){
        erroneousData();
        startWord = scan.next();
        start(startWord);
    }

}



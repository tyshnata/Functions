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

    public static void functionMenu(){
        System.out.println("Задачи:");
        System.out.println("1. Найти наибольшее число в списке.");
        System.out.println("2. Найти n-й элемент списка .");
        System.out.println("3. Найти n-й элемент последовательности Фибоначчи ");
        System.out.println("4. Определить, является ли строка палиндромом.");
        System.out.println("5. Найти сумму двух чисел.");
        System.out.println("6. Найти факториал заданного числа.");
        System.out.println("7. Найти индекс первого вхождения заданного числа в список.");
        System.out.println("8. Переписать строку в обратном порядке");
        System.out.println();
        System.out.println("Напишите номер задачи, которую Вы хотите решить");

        while (!scan.hasNextInt()){
            erroneousData();
            scan.next();
        }



    }

}



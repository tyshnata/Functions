import java.util.Scanner;

public class Functions extends Solutions{

    static Scanner scan = new Scanner(System.in);
    static int taskNumber; //номер задачи

    public static void main(String[] args) {

        System.out.println("Привет!");
        System.out.println("Если хочешь найти ответы на некоторые вопросы, напиши *menu*, если нет напиши *exit*");

        start();

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
    }

    public static void menuOrExitOrAgain(){
        System.out.println();
        System.out.println("Если хочешь решить такую задачу еще раз, напиши *again*.");
        System.out.println("Если хочешь зайти в меню, напиши *menu*.");
        System.out.println("Если хочешь выйти из программы, напиши *exit*.");

    }

    public static void start(){
        if (scan.hasNext("menu")) { //выбор - меню
            functionMenu();                 // показать меню
            scan.next();
            taskNumber =  scan.nextInt(); //номер задачи, которую нужно решить
            solvingProblems (taskNumber);// решаем задачу
            menuOrExitOrAgain();        // выбор - меню или выход - или решить эту задачу снова
            start();
        }
        else {
            if (scan.hasNext("exit")) {
                goodBye();
            } else {
                if (scan.hasNext("again")){
                    solvingProblems (taskNumber);
                    menuOrExitOrAgain();
                    scan.next();
                    start();
                }
                else {
                    erroneousData();
                    scan.next();
                    start();

                }
            }
        }
    }


}



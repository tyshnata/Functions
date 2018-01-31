import java.util.Scanner;

public abstract class Mistakes {
    static Scanner scan = new Scanner(System.in);

    public static void erroneousData(){
        System.out.println("Вы неправильно ввели данные. Попробуйте еще раз.");

    }


    public static void goodBye(){

        System.out.println("Пока!");
    }


    public static void menuOrExitOrAgain(){
        System.out.println();
        System.out.println("Если хочешь решить такую задачу еще раз, напиши *again*.");
        System.out.println("Если хочешь зайти в меню, напиши *menu*.");
        System.out.println("Если хочешь выйти из программы, напиши *exit*.");

    }
}

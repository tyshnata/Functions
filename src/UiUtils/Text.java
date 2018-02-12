package TestScanner;

public class Text {

    public static void erroneousData() {
        System.out.println("Вы неправильно ввели данные. Попробуйте еще раз.");
    }

    public static void goodBye() {
        System.out.println("Пока!");
    }

    public static void menuOrExitOrAgain() {
        System.out.println();
        System.out.println("Если хочешь решить такую задачу еще раз, напиши *0*.");
        System.out.println("Если хочешь зайти в меню, напиши *1*.");
        System.out.println("Если хочешь выйти из программы, напиши *2*.");

    }

    public static void functionMenu() {
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

    public static void questionSizeOfSequence(){
        System.out.println("Сколько чисел в вашей последовательности?");
    }

    public static void inputSequence(){
        System.out.println("Введите последовательность чисел через пробел:");
    }

    public static void inputIndex(){
        System.out.println("Введите индекс искомого числа:");
    }

    public static void inputNumber(){
        System.out.println("Введите число, индекс которого надо найти:");
    }


}

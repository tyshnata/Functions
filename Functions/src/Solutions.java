import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;
import java.util.Arrays;

public class Solutions extends Mistakes{
    static Scanner scan = new Scanner(System.in);



    public static void solvingProblems (int i){

        switch (i){
            case 1:  // найдем наибольшее число в списке
                int size1 = 0;
                System.out.println("Сколько чисел в вашей последовательности?");
                size1 = scan.nextInt();
                Integer[] listTask1 = new Integer[size1]; //определяем, какой будет массив
                System.out.println("Введите последовательность чисел через пробел:");

                while (!scan.hasNextInt()){ // если элементы массива введены некорректно
                    erroneousData();
                    scan.next();
                }
                for(int j = 0; j < size1; j++){
                    listTask1[j] = scan.nextInt(); // заполняем массив числами с консоли
                }
               MaxNumber list1 = new MaxNumber(listTask1);
               list1.answer();
            break;

            /*case 2:  // найдем число по индексу

                ArrayList<Integer> listTask2 = new ArrayList<Integer> ();

                System.out.println("Введите последовательность чисел через пробел:");

                while (!scan.hasNextInt()){ // если элементы массива введены некорректно
                    erroneousData();
                    scan.next();
                }
                while (scan.hasNextInt()) {
                    listTask2.add(scan.nextInt());  // заполняем массив числами с консоли
                    scan.next();
                }

                System.out.println("Введите индекс искомого числа:");
                Integer ind = scan.nextInt();
                GetElementByIndex list2 = new GetElementByIndex(listTask2,ind);
                list2.answer();

            break;*/
            case 3:
                Integer  num;
                System.out.println("Какой элемент последовательности Фибоначчи найти?(от 0 до 46)");

                while (!scan.hasNextInt()){ // если число введено некорректно
                    erroneousData();
                    scan.next();
                }

                num = scan.nextInt();
                ElementFibonacci number = new ElementFibonacci(num);
                number.answer();

            break;

            case 4:  // является ли строка палиндромом

                String word4;
                System.out.println("Ведите слово и узнаете, палиндром ли это.");

                while (!scan.hasNextLine()){ // если это не слово
                    erroneousData();
                    scan.next();
                }
                word4 = scan.nextLine();
                StringPalindrom word = new StringPalindrom(word4);
                word.answer();

            break;

            case 5:  //
                Integer num1, num2;
                System.out.println("Ведите первое число: ");
                while (!scan.hasNextInt()){ // если это не число
                    erroneousData();
                    scan.next();
                }
                num1 = scan.nextInt();

                System.out.println("Ведите второе число: ");
                while (!scan.hasNextInt()){ // если это не число
                    erroneousData();
                    scan.next();
                }
                num2 = scan.nextInt();

                SumOfTwoNumbers sumNumber = new SumOfTwoNumbers(num1,num2);
                sumNumber.answer();

            break;

            case 6:  //  факториал числа
                Integer  num6;
                System.out.println("Факториал какого числа вы хотите найти?(от 1 до 12)");

                while (!scan.hasNextInt()){ // если число введено некорректно
                    erroneousData();
                    scan.next();
                }

                //if ((scan.nextInt()< 1) || (scan.nextInt()> 12));

                num6 = scan.nextInt();
                FactorialOfANumber number6 = new FactorialOfANumber(num6);
                number6.answer();

            break;

            case 7:   // найти индекс первого вхождения числа
                int size7 = 0;
                Integer number7;

                System.out.println("Сколько чисел в вашей последовательности?");
                size7 = scan.nextInt();

                Integer[] listTask7 = new Integer[size7]; //определяем, какой будет массив
                System.out.println("Введите последовательность чисел через пробел:");

                while (!scan.hasNextInt()){ // если элементы массива введены некорректно
                    erroneousData();
                    scan.next();
                }
                for(int j = 0; j < size7; j++){
                    listTask7[j] = scan.nextInt(); // заполняем массив числами с консоли
                }
                System.out.println("Введите число, индекс которого надо найти:");
                while (!scan.hasNextInt()){
                    erroneousData();
                    scan.next();
                }
                number7 = scan.nextInt();

                IndexOfANumber list7 = new IndexOfANumber(number7, listTask7);
                list7.answer();

            break;

            case 8:
                String line;
                System.out.println("Ведите строку:");
                line = scan.nextLine();
                ReversLine line8 = new ReversLine(line);
                line8.answer();
            break;

            default:
            erroneousData();

        }
    }



}
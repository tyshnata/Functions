import java.util.Scanner;
import java.util.List;
import java.util.Arrays;

public class Solutions extends Text {
    static Scanner scan = new Scanner(System.in);

    public static void solvingProblems (int i) {

        switch (i) {
            case 1:  // maximum list
                solutionTask1();
                break;
            case 2:  // get element by index
                 solutionTask2();
            break;
            case 3:
               solutionTask3();
            break;
            case 4:  // check palindrom
                solutionTask4();
            break;
            case 5:  // sum of two numbers
               solutionTask5();
            break;
            case 6:  //  factorial of a number
                solutionTask6();
            break;
            case 7:   // the index of the first occurrence of a number in the list
               solutionTask7();
            break;
            case 8:  // revers line
               solutionTask8();
            break;
            default:
            erroneousData();
        }
    }

    private static void solutionTask1(){
        Integer[] listTask1;
        int size1;

        System.out.println("Сколько чисел в вашей последовательности?");
        while (!scan.hasNextInt()) {
            erroneousData();
            scan.next();
        }
        size1 = scan.nextInt();
        listTask1 = new Integer[size1];
        System.out.println("Введите последовательность чисел через пробел:");

        while (!scan.hasNextInt()) {
            erroneousData();
            scan.next();
        }
        for (int j = 0; j < size1; j++) {
            listTask1[j] = scan.nextInt();
        }

        MaxNumber list1 = new MaxNumber(listTask1);
        list1.answer();
    }

  private static void solutionTask2(){
        List<Integer> list =  Arrays.asList(1, 5, 9, 7, 48, -14, 97);


       /* System.out.println("Введите последовательность чисел через пробел:");

        while (scan.hasNext()) {
            if (scan.hasNextInt()){
                listTask2.add(k,scan.nextInt());
                k++;
            }
            else {
                erroneousData();
                solutionTask2();
            }

        }*/

       System.out.println("Ваша последовательность: " + list);
       System.out.println("Введите индекс искомого числа:");
       while (!scan.hasNextInt()) {
           erroneousData();
           scan.next();
       }
       Integer ind = scan.nextInt();

        GetElementByIndex list2 = new GetElementByIndex(list,ind);
        list2.answer();
    }

    private static void solutionTask3(){

        Integer  num;
        System.out.println("Какой элемент последовательности Фибоначчи найти?(от 0 до 46)");

        while (!scan.hasNextInt()){
            erroneousData();
            scan.next();
        }
        if ((scan.nextInt()>0 ) & (scan.nextInt()<47)) {
            num = scan.nextInt();
            ElementFibonacci number = new ElementFibonacci(num);
            number.answer();
        }

        else {
            erroneousData();
            solutionTask3();
        }
    }

    private static void solutionTask4(){

        String word4;
        System.out.println("Ведите слово и узнаете, палиндром ли это.");

        while (!scan.hasNextLine()){
            erroneousData();
            scan.next();
        }
        word4 = scan.nextLine();
        StringPalindrom word = new StringPalindrom(word4);
        word.answer();
    }

    private static void solutionTask5(){

        Integer num1, num2;
        System.out.println("Ведите первое число: ");
        while (!scan.hasNextInt()){
            erroneousData();
            scan.next();
        }
        num1 = scan.nextInt();

        System.out.println("Ведите второе число: ");
        while (!scan.hasNextInt()){
            erroneousData();
            scan.next();
        }
        num2 = scan.nextInt();

        SumOfTwoNumbers sumNumber = new SumOfTwoNumbers(num1,num2);
        sumNumber.answer();
    }

    private static void solutionTask6(){

        Integer  num6;
        System.out.println("Факториал какого числа вы хотите найти?(от 1 до 12)");

        while (!scan.hasNextInt()){
            erroneousData();
            scan.next();
        }

        if ((scan.nextInt()>0 ) & (scan.nextInt()<12)){

        num6 = scan.nextInt();
        FactorialOfANumber number6 = new FactorialOfANumber(num6);
        number6.answer();
        }
        else {
            erroneousData();
            solutionTask6();
        }

    }

    private static void solutionTask7(){

        int size7 = 0;
        Integer number7;

        System.out.println("Сколько чисел в вашей последовательности?");
        while (!scan.hasNextInt()){
            erroneousData();
            scan.next();
        }
        size7 = scan.nextInt();

        Integer[] listTask7 = new Integer[size7];
        System.out.println("Введите последовательность чисел через пробел:");

        while (!scan.hasNextInt()){ // если элементы массива введены некорректно
            erroneousData();
            scan.next();
        }
        for(int j = 0; j < size7; j++){
            listTask7[j] = scan.nextInt();
        }
        System.out.println("Введите число, индекс которого надо найти:");
        while (!scan.hasNextInt()){
            erroneousData();
            scan.next();
        }
        number7 = scan.nextInt();
        IndexOfANumber list7 = new IndexOfANumber(number7, listTask7);
        list7.answer();
    }

    private static void solutionTask8(){

        String line;
        System.out.println("Ведите строку:");
        line = scan.nextLine();
        ReversLine line8 = new ReversLine(line);
        line8.answer();
    }

}

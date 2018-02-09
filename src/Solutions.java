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
        Integer[] list;
        int size1;

        System.out.println("Сколько чисел в вашей последовательности?");
        while (!scan.hasNextInt()) {
            erroneousData();
            scan.next();
        }
        size1 = scan.nextInt();
        list = new Integer[size1];
        System.out.println("Введите последовательность чисел через пробел:");

        while (!scan.hasNextInt()) {
            erroneousData();
            scan.next();
        }
        for (int j = 0; j < size1; j++) {
            list[j] = scan.nextInt();
        }

        MaxNumber list1 = new MaxNumber(list);
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

        Integer  number;
        System.out.println("Какой элемент последовательности Фибоначчи найти?(от 0 до 46)");

        while (!scan.hasNextInt()){
            erroneousData();
            scan.next();
        }
        if ((scan.nextInt()>0 ) & (scan.nextInt()<47)) {
            number = scan.nextInt();
            ElementFibonacci numberFib = new ElementFibonacci(number);
            numberFib.answer();
        }

        else {
            erroneousData();
            solutionTask3();
        }
    }

    private static void solutionTask4(){

        String wordScan;
        System.out.println("Ведите слово и узнаете, палиндром ли это.");

        while (!scan.hasNextLine()){
            erroneousData();
            scan.next();
        }
        wordScan = scan.nextLine();
        StringPalindrom word = new StringPalindrom(wordScan);
        word.answer();
    }

    private static void solutionTask5(){

        Integer numberScan1, numberScan2;
        System.out.println("Ведите первое число: ");
        while (!scan.hasNextInt()){
            erroneousData();
            scan.next();
        }
        numberScan1 = scan.nextInt();

        System.out.println("Ведите второе число: ");
        while (!scan.hasNextInt()){
            erroneousData();
            scan.next();
        }
        numberScan2 = scan.nextInt();

        SumOfTwoNumbers sumNumber = new SumOfTwoNumbers(numberScan1,numberScan2);
        sumNumber.answer();
    }

    private static void solutionTask6(){

        Integer  number;
        System.out.println("Факториал какого числа вы хотите найти?(от 1 до 12)");

        while (!scan.hasNextInt()){
            erroneousData();
            scan.next();
        }

        if ((scan.nextInt()>0 ) & (scan.nextInt()<12)){

        number = scan.nextInt();
        FactorialOfANumber Factorial = new FactorialOfANumber(number);
        Factorial.answer();
        }
        else {
            erroneousData();
            solutionTask6();
        }

    }

    private static void solutionTask7(){

        int sizeSequence;
        Integer number7;

        System.out.println("Сколько чисел в вашей последовательности?");
        while (!scan.hasNextInt()){
            erroneousData();
            scan.next();
        }
        sizeSequence = scan.nextInt();

        Integer[] list = new Integer[sizeSequence];
        System.out.println("Введите последовательность чисел через пробел:");

        while (!scan.hasNextInt()){ // если элементы массива введены некорректно
            erroneousData();
            scan.next();
        }
        for(int j = 0; j < sizeSequence; j++){
            list[j] = scan.nextInt();
        }
        System.out.println("Введите число, индекс которого надо найти:");
        while (!scan.hasNextInt()){
            erroneousData();
            scan.next();
        }
        number7 = scan.nextInt();
        IndexOfANumber list7 = new IndexOfANumber(number7, list);
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

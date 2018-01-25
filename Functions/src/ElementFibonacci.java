public class ElementFibonacci implements Decition{
    static Integer fibElement;
    static Integer number;


    public ElementFibonacci (Integer number){
        this.number = number;
    }
    final Integer[] fibonacciNumbers = new Integer[47]; // больше не позволяет Integer

    public  Integer fibonacci(Integer number){ // метод, воввращающий n-й элемент последовательности Фибоначчи
        fibonacciNumbers[0] = 0;
        fibonacciNumbers[1] = 1;

        for (int i = 2; i < fibonacciNumbers.length; i++){
           fibonacciNumbers[i] = fibonacciNumbers[i-1] + fibonacciNumbers[i - 2];
       }

       fibElement = fibonacciNumbers[number];
       return fibElement; //элемент посл-ти Фибоначчи с индексом "n"
    }

    @Override
    public void answer() {
        System.out.println("Элемент под номером " + number + " последовательности Фибоначчи равен " + fibonacci(number) );
    }
}



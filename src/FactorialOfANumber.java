public class FactorialOfANumber implements Decition{
    static Integer result , number;
    final Integer[] factorials = new Integer[12];

    public FactorialOfANumber(Integer number)
    {

        this.number = number;
    }

    public  Integer factorial(Integer number){

        factorials[0] = 1;
        for (int i = 1; i < 12; i++){
            factorials[i] = factorials[i-1] * (i + 1);
        }
        result = factorials[number - 1];
        return result;
    }


    @Override
    public void answer() {
        System.out.println( "Факториал числа " + number + " равен " + factorial(number) );

    }
}

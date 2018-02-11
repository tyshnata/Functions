public class IndexOfANumber  implements Decition{
    static int ind = 0;
    static Integer[] list;  //строка
    static Integer number; // число, первое вхождение которого надо найти в строке

    public IndexOfANumber(Integer number,Integer[] list){
        this.list = list ;
        this.number = number;
    }

    private int search( int number, Integer[] list){  // метод нахождения первого вхождения заданного
        //целого числа в список

        for (int i = 0; i < list.length; i++){
            if (list[i] == number){    // находим индекс первого вхождения числа в список
                ind = i;
                break;
            }
            else
                ind = -1; // если такого числа в списке нет
        }
        return ind;
    }

    @Override
    public void answer() {
        System.out.println();
        System.out.println( "Индекс первого вхождения числа " + number + " в список " + search( number,  list) );

    }
}

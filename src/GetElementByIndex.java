import java.util.List;

public class GetElementByIndex implements Decition{
    Integer numberByIndex;
    List<Integer> list;
    Integer index;

    public GetElementByIndex(List<Integer> list, Integer index){
        this.list = list;
        this.index = index;
    }

    public Integer getElement(List<Integer> list, Integer index){ //метод, возвращающий n-й элемент списка

        if ( index < list.size()){  // если индекс не превышает размера списка
            numberByIndex = list.get(index); // получаем значение элемента по индексу
        }
        else {
            numberByIndex = -1; // иначе получаем  значение -1
        }
        return numberByIndex; // возвращаем элемент с заданным индексом
    }

    @Override
    public void answer() {
        System.out.println("Элемент с индексом " + index + " равен  " + getElement( list, index) );

    }
}

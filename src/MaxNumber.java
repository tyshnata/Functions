public class MaxNumber implements Decition { //найти наибольшее число в списке
    static Integer maxNumber;
    static Integer[] list;

    public MaxNumber (Integer[] list){

        this.list = list;
    }

    private  Integer maximum(Integer[] list){ //метод поиска наибольшего числа в списке
        Integer maxNumber = list[0];

        for(int i = 0; i < list.length ; i++){ // перебираем элементы массива, ищем Мах
            if ( maxNumber >= list[i] ){}
            else maxNumber = list[i];
        }
        return maxNumber; // возвращаем Мах элемент
    }

    @Override
    public void answer() {
        System.out.println("Самое большое число в данном списке: " + maximum(list) );
    }


}

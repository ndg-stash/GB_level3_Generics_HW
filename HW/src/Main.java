
import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        //  1. Написать метод, который меняет два элемента массива местами.(массив может быть любого ссылочного типа);
        String[] strArr = {"sdfs", "wrew", "23223"};
        Util.swapElements(strArr,0,2);
        System.out.println(Arrays.toString(strArr));

        //  2. Написать метод, который преобразует массив в ArrayList;
        //toString уже писать не надо, т.к. получаем коллекцию
        System.out.println(Util.arrayToList(strArr));

        // a. Есть классы Fruit -> Apple, Orange;(больше фруктов не надо)
        // b. Класс Box в который можно складывать фрукты, коробки условно сортируются по типу фрукта, поэтому в одну коробку нельзя сложить и яблоки, и апельсины;
        // c. Для хранения фруктов внутри коробки можете использовать ArrayList;
        // d. Сделать метод getWeight() который высчитывает вес коробки, зная количество фруктов и вес одного фрукта(вес яблока - 1.0f, апельсина - 1.5f, не важно в каких это единицах);
        // e. Внутри класса коробка сделать метод compare, который позволяет сравнить текущую коробку с той, которую подадут в compare в качестве параметра, true - если их веса равны, false в противном случае(коробки с яблоками мы можем сравнивать с коробками с апельсинами);
        // f. Написать метод, который позволяет пересыпать фрукты из текущей коробки в другую коробку(помним про сортировку фруктов, нельзя яблоки высыпать в коробку с апельсинами), соответственно в текущей коробке фруктов не остается, а в другую перекидываются объекты, которые были в этой коробке;
        // g. Не забываем про метод добавления фрукта в коробку.


        Box <Apple> box1 = new Box(new ArrayList<>());
        box1.addFruits(new Apple(), 10);

        //box1.addFruits(new Orange(), 1);
        Box <Apple> box2 = new Box(new ArrayList<>());
        box2.addFruits(new Apple(), 3);

        Box <Orange> box3 = new Box(new ArrayList<>());
        box3.addFruits(new Orange(), 7);

        System.out.println(box1.getBoxWeight());
        System.out.println(box2.getBoxWeight());
        System.out.println(box3.getBoxWeight());

        box1.pourFrom(box2);

        System.out.println(box1.getBoxWeight());
        System.out.println(box2.getBoxWeight());
        System.out.println(box3.getBoxWeight());

    }
}

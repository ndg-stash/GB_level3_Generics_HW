import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Box<T extends Fruit> {

    private List<T> volume;

    public Box(List<T> volume) {
        this.volume = new ArrayList<>();
    }

    public void addFruitsV1(T fruit){
        volume.add(fruit);
    }

    public void addFruits(T fruit, int quantity){
        if (quantity > 0) {
            for (int i = 0; i < quantity; i++) {
                this.volume.add(fruit);
            }
        } else {
            System.out.println("Добавить можно только целое положительное число!");
        }
    }

    public float getBoxWeight(){
        float boxWeight = 0;
        for (T t : this.volume) {
            boxWeight = t.getWeight() + boxWeight;
            //System.out.println(t.getWeight());
        }
        return boxWeight;
    }

    public boolean compareWeight(Box<?> inBox){
        return (this.getBoxWeight() == inBox.getBoxWeight());
    }

    public String getBoxFruitType(){
        if (this.getBoxWeight() == 0) return "empty Box";
        return this.volume.get(0).getClass().toString();
    }

    public void pourFrom(Box<T> fromBox){
        int fromBoxFruitsCount = fromBox.volume.size();
        if (fromBoxFruitsCount == 0) {
            System.out.println("Коробка пустая! что высыпать то?");
            return;
        }

        this.volume.addAll(fromBox.volume);

//        for (int i = 0; i < fromBoxFruitsCount; i++) {
//            this.volume.add((T) fromBox.volume.get(i));
////            System.out.println(fromBox.volume.get(i));
//        }

        fromBox.volume.clear();

    }

}

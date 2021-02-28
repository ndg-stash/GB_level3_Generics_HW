import java.util.ArrayList;
import java.util.List;

public class Box<T extends Fruit> {

    private List<T> volume;

    public Box(List<T> volume) {
        this.volume = new ArrayList<>();
    }

    public void addFruits(T fruit, int quantity){

        if (this.getBoxWeight() == 0 || this.volume.get(0).getClass().equals(fruit.getClass())) {

            if (quantity > 0) {
                for (int i = 0; i < quantity; i++) {
                    this.volume.add(fruit);
                }
            } else {
                System.out.println("Добавить можно только целое положительное число!");
            }
        } else {
            System.out.println("Фрукты смешивать нельзя!");
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

    public boolean compareWeight(Box inBox){
        return (this.getBoxWeight() == inBox.getBoxWeight());
    }

    public String getBoxFruitType(){
        if (this.getBoxWeight() == 0) return "empty Box";
        return this.volume.get(0).getClass().toString();
    }

    public void pourFrom(Box fromBox){
        int fromBoxFruitsCount = fromBox.volume.size();
        if (fromBoxFruitsCount == 0) {
            System.out.println("Коробка пустая! что высыпать то?");
            return;
        }

        if (this.getBoxWeight() == 0 || this.volume.get(0).getClass().equals(fromBox.volume.get(0).getClass())) {

            for (int i = 0; i < fromBoxFruitsCount; i++) {
                this.volume.add(this.volume.get(i));
            }

            fromBox.volume.clear();

        } else {
            System.out.println("Фрукты смешивать нельзя!");
        }


    }

}

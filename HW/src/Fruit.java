public class Fruit {
    private float weight;

    public Fruit(float w) {
        this.weight = w;
    }

    public float getWeight() {
        return this.weight;
    }

    public String getFruitType(){
        return this.getClass().toString();
    }

}

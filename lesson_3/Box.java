package lesson_3;

import java.util.ArrayList;

public class Box<T extends Fruit> {
    public ArrayList<T> listFruit;
    private int count;

    public Box() {
        this.count = 0;
        this.listFruit = new ArrayList<>();
    }

    public int getCount() {
        return count;
    }

    public void addFruit(T myFruit){
        listFruit.add(myFruit);
        this.count += 1;
    }

    public float getWeight(){
        if (listFruit.size() == 0){
            return 0;
        }
        return listFruit.size()* listFruit.get(0).getWeightFruit();
    }

    public boolean compare(Object obj){
        if (!(obj instanceof Box)){
            return false;
        }

        if (this.getWeight() == ((Box) obj).getWeight()){
            return true;
        }
        return false;
    }

    public void moveToAnotherBox(Box<T> newBox){
        newBox.listFruit.addAll(this.listFruit);
        this.listFruit.clear();
    }
}

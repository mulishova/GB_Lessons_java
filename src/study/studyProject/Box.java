package study.studyProject;

import java.util.ArrayList;
import java.util.Collection;

public class Box<T extends Fruit> {
    private ArrayList<T> fruits;

    public Box () {
        this.fruits = new ArrayList<T>();
    }

    public void add (T fruit) {
        this.fruits.add(fruit);
    }

    public float getWeight() {
        float buf = 0;

        for (T fruit : fruits) {
            buf += fruit.getWeight();
        }

        return buf;
    }

    public boolean compare (Box<T> box) {
        return this.getWeight() == box.getWeight();
    }

    public void move (Box<?> box) {
            this.fruits.addAll((Collection<? extends T>) box.fruits);
            box.fruits.clear();
    }
}

package study.studyProject;

import java.util.ArrayList;
import java.util.Collection;

public class Box<T extends Fruit> implements Comparable<Box> {
    private ArrayList<T> fruits;
    private float buf; // вес коробки

    public Box () {
        this.fruits = new ArrayList<T>();
        this.buf = 0;
    }

    public void add (T fruit) {
        this.fruits.add(fruit);
    }

    public float getWeight() {
        buf = 0;

        for (T fruit : fruits) {
            buf += fruit.getWeight();
        }

        return buf;
    }

    public void move (Box<T> box) {
            this.fruits.addAll(box.fruits);
            box.fruits.clear();
    }

    @Override
    public int compareTo(Box box) {
        float diff = this.getWeight() - box.getWeight();

        if (diff == 0)
            return 0;
        else
            return 1;
    }

    public boolean compare (Box box) {
        if (this.compareTo(box) == 0)
            return true;
        else
            return false;
    }
}

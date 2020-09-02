package study.studyProject;

import com.sun.org.apache.xpath.internal.operations.Or;

public class Task3 {
    public static void main(String[] args) {
        Apple apple1 = new Apple();
        Apple apple2 = new Apple();
        Apple apple3 = new Apple();
        Apple apple4 = new Apple();

        Orange orange1 = new Orange();
        Orange orange2 = new Orange();
        Orange orange3 = new Orange();

        Box<Apple> appleBox1 = new Box<>();
        Box<Apple> appleBox2 = new Box<>();
        Box<Orange> orangeBox = new Box<>();

        appleBox1.add(apple1);
        appleBox1.add(apple2);

        appleBox2.add(apple3);
        appleBox2.add(apple4);

        orangeBox.add(orange1);
        orangeBox.add(orange2);
        orangeBox.add(orange3);

        System.out.println(appleBox1.getWeight());
        System.out.println(appleBox2.getWeight());
        System.out.println(orangeBox.getWeight());

        System.out.println(appleBox1.compare(appleBox2));
        System.out.println(appleBox1.compare(orangeBox));
        System.out.println(orangeBox.compare(appleBox2));

        appleBox1.move(appleBox2);

        System.out.println(appleBox1.getWeight());
        System.out.println(orangeBox.getWeight());
    }
}

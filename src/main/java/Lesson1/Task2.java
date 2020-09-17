package Lesson1;

// метод, который преобразует массив в ArrayList

import java.util.ArrayList;

public class Task2 {
    public static void main(String[] args) {
        Convert convert = new Convert();

        Integer[] integerArr = {1, 2, 3, 4, 5};
        String[] stringArr = {"A", "B", "C", "D", "E"};

        ArrayList<Integer> integerList = new ArrayList<Integer>();
        ArrayList<String> stringList = new ArrayList<String>();

        convert.<Integer>convertElements(integerArr, integerList);
        System.out.println();
        convert.<String>convertElements(stringArr, stringList);
    }
}

class Convert {
    public <T> void convertElements (T[] elements, ArrayList<T> list) {
        for (T element : elements) {
            System.out.print(element);
        }
        System.out.println();

        for (T element : elements) {
            list.add(element);
        }

        for (T element : list) {
            System.out.print(element);
        }
        System.out.println();
    }
}

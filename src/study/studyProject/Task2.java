package study.studyProject;

// метод, который преобразует массив в ArrayList

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Task2 {
    public static void main(String[] args) {
        String[] arr = new String[5];

        for (int i = 0; i < arr.length; i++)
            arr[i] = "someText";

        for (int i = 0; i < arr.length; i++)
            System.out.print(arr[i] + " ");
        System.out.println();

        Collection<String> collection = new ArrayList<>();

        convert(arr, collection);

        for (String str : collection)
            System.out.print(str + " ");
    }

    public static void convert (String[] arr, Collection<String> collection) {
        Collections.addAll(collection, arr);
    }
}

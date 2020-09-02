package study.studyProject;

// метод, который меняет два элемента массива местами.(массив может быть любого ссылочного типа)

public class Task1 {
    public static void main(String[] args) {
        Change change = new Change();

        Integer[] integerArr = {1, 2, 3, 4, 5};
        String[] stringArr = {"A", "B", "C", "D", "E"};

        change.<Integer>changeElements(integerArr, 1,2);
        System.out.println();
        change.<String>changeElements(stringArr, 2,4);
    }
}

class Change {
    public <T> void changeElements (T[] elements, int a, int b)
    {
        for (T element : elements) {
            System.out.print(element);
        }

        T buf = elements[a];
        elements[a] = elements[b];
        elements[b] = buf;

        System.out.println();

        for (T element : elements) {
            System.out.print(element);
        }
    }
}
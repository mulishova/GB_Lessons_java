package study.studyProject;

// метод, который меняет два элемента массива местами.(массив может быть любого ссылочного типа)

public class Task1 {
    public static void main(String[] args) {
        int[] arr = new int[10];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = i;
        }

        for (int j : arr)
            System.out.print(j);

        changeElements(arr, 2, 7);
        System.out.println();

        for (int j : arr)
            System.out.print(j);
    }

    public static void changeElements (int[] arr, int a, int b) {
        int buf = arr[a];
        arr[a] = arr[b];
        arr[b] = buf;
    }
}
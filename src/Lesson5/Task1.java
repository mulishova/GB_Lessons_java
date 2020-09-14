package Lesson5;

// Создать три потока, каждый из которых выводит определенную букву (A, B и C) 5 раз
// (порядок – ABСABСABС). Используйте wait/notify/notifyAll

import static Lesson5.Task1.flag;

public class Task1 {

    static int flag = 0;

    public static void main(String[] args) {
        Task1 monitor = new Task1();

        new Thread(new MyClass("A", 1, monitor)).start();
        new Thread(new MyClass("B", 2, monitor)).start();
        new Thread(new MyClass("C", 3, monitor)).start();
    }
}

class MyClass implements Runnable {
    private String value;
    private int position;
    private Task1 monitor;

    public MyClass(String value, int position, Task1 monitor) {
        this.value = value;
        this.position = position;
        this.monitor = monitor;
    }

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            synchronized (monitor) {

                while (position == 1 && flag % 3 != 0) {
                    try {
                        monitor.wait();
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }

                while (position == 2 && flag % 3 != 1) {
                    try {
                        monitor.wait();
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }

                while (position == 3 && flag % 3 != 2) {
                    try {
                        monitor.wait();
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }

                monitor.notifyAll();
                System.out.print(value);

                if (flag % 3 == 2)
                    System.out.print(" ");

                flag++;
            }
        }
    }
}
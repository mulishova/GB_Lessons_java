package Lesson4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class HW4 {

    public static void main(String[] args) {

        List<Integer> mainList = Arrays.asList(1, 3, 5, 7, 9, 11, 9, 7);
        mainList.forEach(System.out::print);

        System.out.println();

        List<String> strList = Arrays.asList("first", "second", "abc", "third", "aaa");
        strList.forEach(System.out::println);

        System.out.println();

        System.out.println("task 1: " + searchLambda.calculate(7, mainList));
        System.out.println("task 2: " + reverseLambda.calculate("Hello"));
        System.out.println("task 3: " + maximumLambda.calculate(mainList));
        System.out.println("task 4: " + avarageLambda.calculate(mainList));
        System.out.println("task 5: " + searchStringLambda.calculate(strList));
    }

    // Метод, который возвращает индекс первого вхождения данного целого числа в списке
    static LambdaInter<Integer> searchLambda = (n, list) -> {
        if (list != null) {
            for (int i = 0; i < list.size(); i++) {
                if (list.get(i).equals(n)) {
                    return i;
                }
            }
        }
        return -1;
    };

    // Метод, переворачивающий строку
    static LambdaSingleInter<String> reverseLambda = s -> {
        String resultString = "";
        for (int i = s.length() - 1; i >= 0; i--) {
            resultString += s.charAt(i);
        }
        return resultString;
    };

    // Метод, который возвращает наибольшее целое число в списке
    static LambdaListInter<Integer> maximumLambda = list -> {
        int buf = list.get(0);
        if (list != null && list.size() > 0) {
            for (int i = 1; i < list.size(); i++) {
                if (list.get(i) > buf) {
                    buf = list.get(i);
                }
            }
        }
        return buf;
    };

    // Метод, который возвращает среднее значение из списка целых чисел
    static LambdaListDoubleInter<Integer, Double> avarageLambda = list -> {
        double buf = 0;
        int count = 0;
        if (list != null) {
            for (int i = 0; i < list.size(); i++) {
                buf += list.get(i);
                count++;
            }

            buf /= count;
        }
        return buf;
    };


    // Имея список строк, напишите метод, который возвращает список всех строк,
    // которые начинаются с буквы «а» (нижний регистр) и имеют ровно 3 буквы
    static  LambdaReturnListInter<String> searchStringLambda = list -> {
        List<String> resultList = new ArrayList<>();
        if (list != null) {
            for (int i = 0; i < list.size(); i++) {
                if (list.get(i).startsWith("a") && list.get(i).length() == 3) {
                    resultList.add(list.get(i));
                }
            }
        }
        return resultList;
    };
}
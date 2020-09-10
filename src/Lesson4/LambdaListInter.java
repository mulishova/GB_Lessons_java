package Lesson4;

import java.util.List;

@FunctionalInterface
public interface LambdaListInter<T> {
    T calculate (List<T> list);
}

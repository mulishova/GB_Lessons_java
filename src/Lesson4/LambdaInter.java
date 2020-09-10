package Lesson4;

import java.util.List;

@FunctionalInterface
public interface LambdaInter<T> {
    T calculate (List<T> list);
}

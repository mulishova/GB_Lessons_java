package Lesson4;

import java.util.List;

@FunctionalInterface
public interface LambdaReturnListInter<T> {
    List<T> calculate (List<T> list);
}

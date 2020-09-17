package Lesson4;

import java.util.List;

@FunctionalInterface
public interface LambdaListDoubleInter<T, K> {
    K calculate (List<T> list);
}

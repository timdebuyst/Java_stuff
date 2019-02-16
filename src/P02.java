import java.util.LinkedList;
import java.util.List;
import java.util.NoSuchElementException;

/**
 * (*) Find the last but one element of a list.
 * <p>
 */

public class P02 {
    // 1
    public static <T> T secondLast(List<T> list) {
        if (list.size() < 2) {
            throw new NoSuchElementException("Can't find secondLast element from a list with less than 2 elements.");
        }
        return list.get(list.size() - 2);
    }

    // 2 : Recursion
    public static <T> T secondLastRecursion(LinkedList<T> list) {
        if (list.size() < 2) {
            throw new NoSuchElementException("Can't find secondLast element from a list with less than 2 elements.");
        }
        if (list.size() == 2) {
            return list.getFirst();
        }
        return secondLastRecursion(new LinkedList<>(list.subList(1, list.size())));
    }
}

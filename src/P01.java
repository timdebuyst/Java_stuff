import java.util.LinkedList;
import java.util.List;
import java.util.NoSuchElementException;

/**
 * (*) Find the last element of a list.
 * <p>
 */

public class P01 {
    // 1
    public static <T> T last(List<T> elements) {
        int numberOfElements = elements.size();
        return elements.get(numberOfElements - 1);
    }

    // 2 : Linked List
    public static <T> T last(LinkedList<T> elements) {
        return elements.getLast();
    }

    // 3 : recursion
    public static <T> T lastRecursive(List<T> elements) {
        if (elements == null || elements.isEmpty()) {
            throw new NoSuchElementException();
        }
        if (elements.size() == 1) {
            return elements.get(0);
        }
        return lastRecursive(elements.subList(1, elements.size()));
    }

    // test (doesn't work)
//    @Test
//    public void shouldFindLastElementFromAListOfAlphabets() throws Exception {
//        assertThat(P01.last(asList("a", "b", "c", "d")), is(equalTo("d")));
//    }
}

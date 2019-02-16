import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.NoSuchElementException;

public class Main {

    // Hello World in Java

    public static void main(String[] args) {
        System.out.println("Hello World!");
    }


    // tail method for a linked list in Java

    public static <T> List<T> tail(LinkedList<T> elements) {
        if (elements == null || elements.isEmpty()) {
            throw new NoSuchElementException();
        }
        if (elements.size() == 1) {
            return Collections.emptyList();
        }
        return elements.subList(1, elements.size());
    }
}



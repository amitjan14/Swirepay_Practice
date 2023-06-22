import java.util.*;
public class DequeT{
    public static void main(String[] args) {

        Deque<String> deque = new ArrayDeque<String>();
        deque.add("Gautam");
        deque.add("Karan");
        deque.add("Ajay");
        deque.remove("Karan");

        for (String str : deque) {
            System.out.println(str);
        }
    }
}

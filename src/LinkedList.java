import java.util.*;
public class LinkedList {
    public static void main(String[] args) {
        java.util.LinkedList<String> list = new java.util.LinkedList<>();
        list.add("Ravi");
        list.add("Vijay");
        list.add("Arjun");
        list.add("Vishnu");

        Iterator<String> iterator = list.iterator();

        while(iterator.hasNext()) {

            System.out.println(iterator.next());
        }
    }
}
import java.util.*;
public class Vector {
    public static void main(String[] args) {
        java.util.Vector<String> list = new java.util.Vector<String>();
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
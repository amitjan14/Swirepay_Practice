import java.util.*;
import java.util.stream.Stream;

public class ArrayList {
    public static void main(String[] args) {
        java.util.ArrayList<String> list = new java.util.ArrayList<>();
        list.add("Ravi");
        list.add("Vijay");
        list.add("Arjun");
        list.add("Vishnu");

        Map<Integer,String> map=new HashMap<Integer,String>();//Creating HashMap
        map.put(1,"Ravi");  //Put elements in Map
        map.put(2,"Vijay");
        map.put(3,"Arjun");
        map.put(4,"Vishnu");
        for(int i=0; i< list.size();i++)
        {

            System.out.println(list.get(i));
        }
        map.entrySet()
        .stream()
        .sorted(Map.Entry.comparingByKey());
    }
}
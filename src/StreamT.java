import java.util.*;
import java.util.function.Consumer;
import java.util.stream.*;

import static java.awt.Color.red;

class StreamT {

    public static void main(String args[]) {
        List<String> names = Arrays.asList("Reflection", "Collection", "Stream", "Startup");// create a list of String
        List<String> result = names.stream().filter(s -> s.startsWith("S")).collect(Collectors.toList()); // demonstration of filter method
        System.out.println(result);
        List<String> show = names.stream().sorted().collect(Collectors.toList());
        System.out.println(show);

        List<Integer> number = Arrays.asList(2, 3, 4, 5, 6);// create a list of integer
        List<Integer> square = number.stream().map(x -> x + x).collect(Collectors.toList());// demonstration of map method
        System.out.println(square);
        Set<Integer> squareSet = number.stream().map(x -> x * x).collect(Collectors.toSet());
        System.out.println(squareSet);
        System.out.println(number.stream().map(x -> x * x).collect(Collectors.toSet()));
        int even = number.stream().filter(x -> x % 2 == 0).reduce(0, (ans, i) -> ans + i);
        System.out.println(even);

        List<Integer> num = Arrays.asList(2, 3, 4, 5, 6, 8, 9, 20, 23, 34, 32);// create a list of integer
        System.out.println(num.stream().limit(5).skip(3).collect(Collectors.toSet()));
        Stream<Integer> evenNumStream = Stream.iterate(1, i -> i * 2);
        List<Integer> collect = evenNumStream.limit(5).collect(Collectors.toList());
        System.out.println(collect);
        List<Integer> div = num.stream().filter(i -> i % 2 == 0).map(i -> i / 2).collect(Collectors.toList());
        System.out.println(div);
        List<Integer> integers = Arrays.asList(1, 2, 3, 4, 5);
        double percentage = .01;
        List<Double> evenDoubles = integers.stream().<Double>mapMulti((i, c) -> {
            if (i % 2 == 0) {
                c.accept((double) i * (1 + percentage));
            }
        }).collect(Collectors.toList());
        System.out.println(evenDoubles);

        System.out.println("The stream after applying " + "the function is : ");
        List<String> list = Arrays.asList("geeks", "gfg", "g", "e", "e", "k", "s", "");
        List<String> answer = list.stream().map(String::toUpperCase).collect(Collectors.toList());
        System.out.println(answer);
        System.out.println("-> "+list.stream().map(str -> str.length()).collect(Collectors.toSet()));
        String list1 = list.stream().filter(s -> s.startsWith("g")).map(e->e.replaceFirst("g","G")).collect(Collectors.joining(","));
        System.out.println("[ "+list1+" ]");
        List<String> lis = list.stream().dropWhile(e->e.length()==1).filter(s -> s.isEmpty()==false).map(e->e).collect(Collectors.toList());
        System.out.println("-> "+lis+";");
        Set<Integer> lis1 = list.stream().dropWhile(e->e.length()==1).filter(s -> s.isEmpty()==false).map(e->e.length()).collect(Collectors.toSet());
        System.out.println("-> "+lis1+";");
        List<Object> n = num.stream().mapMulti((integer, consumer) ->{if(integer%2==0){consumer.accept((Integer) integer*integer);}}).collect(Collectors.toList());
        System.out.println(n);
    }
}

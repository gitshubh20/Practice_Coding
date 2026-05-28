package string;

import java.util.*;
import java.util.stream.Collectors;

public class BalancedParentheses {

    public static void main(String[] args) {

        List<String> names = Arrays.asList("Alice", "Bob", "Charlie" ,"Ajay" , "Ray");

        names.sort((s1, s2) -> s1.compareTo(s2));
        System.out.println(names);

        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6);

        List<Integer> collect = numbers.stream().filter(x -> x% 2 == 0).collect(Collectors.toList());
        System.out.println(collect);

        numbers.stream().filter(n -> n%2 == 0).forEach(System.out::println);

        //grouping by

        List<String> words = List.of("a", "bb", "ccc", "dd", "eee");

        Map<Integer, List<String>> byLengthWords = words.stream().collect(Collectors.groupingBy(String::length));
        System.out.println(byLengthWords);

        List<String> fruits = List.of("apple", "banana", "cherry");

        HashMap<Character, Integer> countMap = new HashMap<>();

        for(String fruit : fruits){

            for(char c : fruit.toCharArray()){
                countMap.put(c, countMap.getOrDefault(c,0) +1);
            }
        }


        for(Map.Entry<Character, Integer> entry : countMap.entrySet()){
            System.out.println(entry.getKey() + " = " + entry.getValue() );
        }

        List<Integer> numbersList = List.of(5, 3, 8, 1, 2,8,3,4,7,23,56);

        Integer i = numbersList.stream().sorted().distinct().skip(1).findFirst().orElseThrow();
        System.out.println(i);

       Integer thirdHigh = numbersList.stream().distinct().sorted((a, b) -> b - a).skip(2).findFirst().orElseThrow();
        System.out.println(thirdHigh);

        Map<Boolean, List<Integer>> collect1 = numbersList.stream().collect(Collectors.partitioningBy(n -> n % 2 == 0));
        System.out.println(collect1);
    }
}

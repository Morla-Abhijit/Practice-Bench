package org.example;
import java.util.*;
import java.util.function.Consumer;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Demo {
    public static void main(String[] args) {
//        List<Integer> list = new ArrayList<>();
        //Sorting
        List<Integer> list = Arrays.asList(10,2,4,1,6,9,3,5);
        Stream<Integer> data = list.stream().sorted();
        data.forEach(System.out::println);

        //Converting all the strings to UpperCase
        List<String> words = Arrays.asList("apple", "banana", "cherry");
        List<String> upperCaseWords = words.stream().map(String::toUpperCase).toList();
        upperCaseWords.forEach(System.out::println);

        // Use filter() to extract even numbers from a list of integers.
        List<Integer> list2 = Arrays.asList(10,2,4,1,6,9,3,5);
        Stream<Integer> data2 = list2.stream().filter(x -> x%2==0);
        data2.forEach(System.out::println);

//      Find the first string in the list with length greater than 5 using filter() and findFirst().
        List<String> names = Arrays.asList("John", "Alexander", "Eva", "Bob");
        List<String> firstName = names.stream().filter(x->x.length()>=5).findFirst().stream().toList();
        firstName.forEach(System.out::println);
        // Problem 4: Count how many strings in the list have more than 3 characters.
        List<String> list1 = Arrays.asList("a", "bb", "ccc", "dddd", "eeeee");
        Long count = list1.stream().filter(x->x.length()>3).count();
        System.out.println(count);

        // Problem 5: Sort a list of integers in ascending and descending order.
        List<Integer> numbers = Arrays.asList(5, 3, 8, 1);
        List<Integer> ascendingOrder = numbers.stream().sorted().toList();
        System.out.println("AscendingOrder");
        ascendingOrder.forEach(System.out::println);
        List<Integer> numbers2 = Arrays.asList(5, 3, 8, 1);
        List<Integer> descendingOrder = numbers2.stream().sorted(Comparator.reverseOrder()).toList();
        System.out.println("Descending Order");
        descendingOrder.forEach(System.out::println);

        // Problem 6: Remove duplicate values from a list.
        List<String> list3 = Arrays.asList("apple", "banana", "apple", "cherry");
        List<String> noDuplicates = list3.stream().distinct().toList();
        noDuplicates.forEach(System.out::println);

        // Problem 7: Check if any string in the list starts with the letter "A".
        List<String> list4 = Arrays.asList("Banana", "Apple", "Cherry");
        List<String> startsWithA = list4.stream().filter(x->x.startsWith("A")).toList();
        startsWithA.forEach(System.out::println);

        // Problem 8: Check if all strings in the list are non-empty.
        List<String> list5 = Arrays.asList("Hello", "World", "");
        boolean nonEmpty = list5.stream().allMatch(String::isEmpty);
        System.out.println(nonEmpty);

        // Problem 9: Convert a list of integers to their squares.
        List<Integer> list6 = Arrays.asList(1, 2, 3, 4);
        List<Integer> squares = list6.stream().map(num->num*num).toList();
        squares.forEach(System.out::println);

        // Problem 10: Convert a list to a set.
        List<String> list7 = Arrays.asList("apple", "banana", "apple", "grape");
        Set<String> set1 = list7.stream().collect(Collectors.toSet());
        set1.forEach(System.out::println);
    }

}

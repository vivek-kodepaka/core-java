package kode.core.java.streams;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class flatMapp {
    public static void main(String[] args) {
        List<List<Integer>> ls = List.of(List.of(1,2,3,4,5,6,7,8,9),List.of(1,2,3,4,5,6,7,8,9),List.of(1,2,3,4,5,6,7,8,9));
        List<Integer> ls1 = Arrays.asList(1,2,3,4,5,6,7,8,9);

        Map<Boolean, List<Integer>> collect1 = ls.stream()
                .flatMap(x -> x.stream())
                .map(x -> x * 2)
                .collect(Collectors.partitioningBy(x -> x%2==0));//.forEach(System.out::print);
        System.out.println(collect1);
        System.out.println(ls);

        List<String> str = List.of("kodepaka","vivek");
        String collect = str.stream().flatMap(word -> Stream.of(word.split(""))).collect(Collectors.joining("-"));
        System.out.println(collect);
        //.forEach(System.out::print);

    }
}

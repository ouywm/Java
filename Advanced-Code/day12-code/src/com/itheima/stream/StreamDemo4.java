package com.itheima.stream;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamDemo4 {
    /*
        Stream流的收集操作

            public R collect (Collector c) : 将流中的数据收集到集合

                Collectors
                    public static <T> Collector toList()
                    public static <T> Collector toSet()
                    public static  Collector toMap(Function keyMapper , Function valueMapper)
     */
    public static void main(String[] args) {

        List<Integer> list1 = Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10).filter(s -> s % 2 == 0).collect(Collectors.toList());

        System.out.println(list1);


        Set<Integer> list2 = Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 10, 10).filter(s -> s % 2 == 0).collect(Collectors.toSet());
        System.out.println(list2);

    }
}

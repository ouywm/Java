package com.itheima.stream;

import java.util.stream.Stream;

public class StreamDemo3 {
    /*
        Stream流的终结操作方法
            - 流水线中的最后一道工序

            public void forEach (Consumer action) 对此流的每个元素执行遍历操作
            public long count () 返回此流中的元素数
     */
    public static void main(String[] args) {
        long count = Stream.of(1, 2, 3, 4, 5, 6).filter(s -> s % 2 == 0).count();
        System.out.println(count);
    }
}

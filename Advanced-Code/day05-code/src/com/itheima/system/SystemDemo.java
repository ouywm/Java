package com.itheima.system;

public class SystemDemo {

    /*
        public static void arrayCopy(Object src,int srcPos,Object dast,int destPos,int length) : 数组拷贝
                                                  1.数据源
                                                  2.起始索引
                                                  3.数据目的地
                                                  4.起始索引
                                                  5.拷贝的个数
     */
    public static void main(String[] args) {

        int[] arr = {11,22,33,44,55};

        int[] destArr = new int[3];

        System.arraycopy(arr,2,destArr,0,3);

        for (int i = 0; i < destArr.length; i++) {
            System.out.println(destArr[i]);
        }

    }

    private static void method() {
        long start = System.currentTimeMillis();


        String a = "";

        for (int i = 0; i <= 10000; i++) {
            a += i;
            System.out.println(a);
        }
        long end = System.currentTimeMillis();

        System.out.println(end - start);
    }
}

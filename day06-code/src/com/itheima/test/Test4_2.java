package com.itheima.test;

public class Test4_2 {
    public static void main(String[] args) {
        int[] arr = {19, 28, 37, 46, 50, 19, 19};
        //  0  1   2   3   4   5   6

        int[] result = getIndex(19, arr);

        if (result.length == 0) {
            System.out.println("您要查找的元素不存在");
        } else {
            for (int i = 0; i < result.length; i++) {
                System.out.print(result[i] + " ");
            }
        }
    }

    /*
        需求: 设计一个方法,查找元素在数组中的索引位置(考虑重复元素问题)
        注意: return 只能返回一个结果

        问题: 当一个方法,运行结束后,有多个结果怎么返回,怎么处理?
        回答: 可以将多个结果,存入一个数组容器将数组返回
     */
    public static int[] getIndex(int num, int[] arr) {
        //1.统计一下要查找的元素,在数组中出现的个数

        int count = 0;

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] == num) {
                count++;
            }

        }
        //2.根据统计出来的个数,来去创建容器
        int[] result = new int[count];

        //3.查找元素在在数组中的索引,然后将找到的索引,存入索引容器

        int index = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == num) {
                result[index] = i;
                index++;
            }
        }
        //4.将装满了索引的数组返回
        return result;
    }
}

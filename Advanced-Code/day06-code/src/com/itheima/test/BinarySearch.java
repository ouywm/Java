package com.itheima.test;

public class BinarySearch {
    /*
            二分查找(折半查找) :

                前提 ： 数组元素必须是排好序的


                思路 ：

                        1.定义两个变量记录最小的索引，和最大的索引

                        2.折半的动作不止一次，应该用循环
                                    条件 while(min <= max)

                        3.循环中计算出中间索引

                        4.加入判读
                            元素如果大于中间元素 ： min = mid + 1
                            元素如果小于中间元素 ： max = mid - 1;
                            元素如果等于中间元素 ： 将索引返回(mid)
     */

    public static void main(String[] args) {

        int[] arr = {11, 22, 33, 44, 55, 66, 77, 88, 99};

        int index = binarySearch(arr, 66);

        System.out.println(index);
    }

    private static int binarySearch(int[] arr, int num) {
        //1.定义两个变量记录最小索引，和最大索引
        int min = 0;
        int max = arr.length - 1;
        int mid;
        //2.折半的动作不止一次，应该使用循环
        while (min <= max) {
            //3.计算中间索引
            mid = (min + max) / 2;
            //4.比对
            if (num > arr[mid]) {
                min = mid + 1;
            } else if (num < arr[mid]) {
                max = mid - 1;
            } else {
                return mid;
            }
        }
        //没找到，返回-1
        return -1;
    }
}

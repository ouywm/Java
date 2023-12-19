package com.itheima.test;

public class Test2 {
    public static void main(String[] args) {
        int[] arr = {68, 27, 95, 88, 171, 996, 51, 210};

        int evenNumberSum = getEvenNumberSum(arr);
        System.out.println(evenNumberSum);
    }
    /*
        需求:
                有这样的一个数组,元素是{68,27,95,88,171,996,51,210};
                求出该数组中满足要求的元素和
                要求是 : 求和的原色个位和十位都不能是7,并且只能是偶数
     */
    public static int getEvenNumberSum(int[] arr) {

        //求和变量
        int sum = 0;
        //2.遍历数组,获取到内部的每一个元素
        for (int i = 0; i < arr.length; i++) {
            //arr[i] : 数组中的每一个元素
            //3.将每一个元素,拆分出个位十位
            int ge = arr[i] % 10;
            int shi = arr[i] / 10 % 10;
            if (ge != 7 && shi != 7 && arr[i] % 2 == 0) {
                //5.求和
                sum += arr[i];
            }
        }
        return sum;
    }
}

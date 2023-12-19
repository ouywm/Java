package com.itheima.test;

public class ForTest {
    public static void main(String[] args) {

/*        print(10);
        System.out.println("--------------------------------");
        print(20);
        System.out.println("--------------------------------");
        print(-1);*/
//        printNumber();

        // 生成方法返回值快捷键   :方法名().var + 回车
        int result = getSum();
        getSum();
        System.out.println("--------------------------------");
        System.out.println("1~100之间的偶数和为:" + result);

        daffodilNumber();
        System.out.println("--------------------------------");

        int count = daffodilCount();
        System.out.println("水仙花的个数:" + count);
        System.out.println("--------------------------------");

        printRectangle();
        System.out.println("--------------------------------");

        printTriangle();
        System.out.println("--------------------------------");

        print99();
    }
    /*
        需求: 在控制台打印出99乘法表
        1*1=1
        1*2=2 2*2=4
        1*3=3 2*3=6 3*3=9
        1*4=4 2*4=8 3*4=12 4*4=16

        1.9行九列的矩形
        2.9行的直角三角形
        3.99乘法表

            规律:

                    乘号左侧的数据:每一行都是从1开始,逐个+1增长        --> j
                    乘号右侧的数据:在每行当中,数据都是固定不变的        --> i
     */

    public static void print99() {

        for (int i = 1; i <= 9; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + "*" + i + "=" + i * j + "\t");
            }
            System.out.println();
        }
    }

    /*
        需求:在控制台随时用 * 打印出一个4行五列的矩形

                    *****
                    *****
                    *****
                    *****
                    *****
                            System.out.println("*");      打印数据后有换行效果

                            System.out.print("*");          打印数据后没有换行效果
     */

    public static void printRectangle() {
        //外部循环:控制的是行数
        for (int i = 1; i <= 4; i++) {
            //内循环:控制的是列数
            for (int j = 1; j <= 5; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println("--------------------------------");


        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {

                for (int k = 0; k < i - j; k++) {
                    System.out.print("*");
                }
            }
            System.out.println();

        }
    }


    /*
        需求:在控制台使用 * 打印5行的直角三角形

                    *
                    **
                    ***
                    ****
                    *****

     */
    public static void printTriangle() {
        //外循环控制行数
        for (int i = 1; i <= 5; i++) {
            //内部循环:控制列数
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println("--------------------------------");
        for (int i = 5; i >= 1; i--) {
            //内部循环:控制列数
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }

    /*
        需求:使用循环在控制台打印十次黑马程序员
     */
    public static void print(int n) {

        if (n < 1) {

            System.out.println("您传入的参数有误,请检查!");

        } else {
            for (int i = 0; i < n; i++) {
                System.out.println("黑马程序员");
            }
        }
    }

    /*
        需求:使用循环模拟计时器
                在控制台打印数字 1~3
                        积累思路: 循环中控制循环那个变量,可以在循环体中,继续使用

                在控制台打印数字 3~1
                        积累思路:循环的条件控制语句,不要局限的认为只能是++

     */
    public static void printNumber() {
        for (int i = 1; i <= 3; i++) {
            System.out.println(i);
        }
        System.out.println("--------------------------------");
        for (int i = 3; i >= 1; i--) {
            System.out.println(i);
        }
    }

    /*
        需求: 求0-100 之间的偶数和,并把结果打印在控制台

     */
    public static int getSum() {

        //1.定义一个求和变量,准备记录累加的结果

        int sum = 0;

        //2.通过for循环,获取1~100之间的每一个数据

        for (int i = 1; i <= 100; i++) {

            // i : 1 ~ 100 之间的每一个数据

            //3.在循环中加入if判断,筛选出偶数

            if (i % 2 == 0) {
                //4.累加求和
                sum += i;
            }
        }
        return sum;
    }

    /*
        需求:在控制台输出所以得水仙花数
        规则:
                1.水仙花数是一个三位数
                2.水仙花数的个位,十位,百位的数字立方和等于原数
     */
    public static void daffodilNumber() {

        //次数变量
        int count = 0;

        //1.拿到所有的三位数
        for (int i = 100; i <= 999; i++) {

            //将每一个三位数,拆分出个位,十位,百位
            int ge = i % 10;
            int shi = i / 10 % 10;
            int bai = i / 100;

            //3. if判断
            if (ge * ge * ge + shi * shi * shi + bai * bai * bai == i) {
                //4. 打印水仙花数
                System.out.println(i);
            }
        }
    }

    /*
        需求:统计水仙花的个数
     */
    public static int daffodilCount() {
        //1.定义一个计数器变量,准备统计水仙花数的个数
        int count = 0;
        for (int i = 100; i <= 999; i++) {
            int ge = i % 10;
            int shi = i / 10 % 10;
            int bai = i / 100;
            if (ge * ge * ge + shi * shi * shi + bai * bai * bai == i) {
                System.out.println(i);
                count++;
            }
        }
        System.out.println(count);
        return count;
    }
}


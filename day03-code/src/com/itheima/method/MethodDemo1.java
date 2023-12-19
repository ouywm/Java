package com.itheima.method;

public class MethodDemo1 {
    /*
        方法(函数):一段具有独立功能的代码块,不调佣就不执行

        好处::
                1.可以将原本挤在一起臃肿的代码,按照功能分类管理

                2.提高了代码的复用性

                3.方法的定义顺序跟执行顺序无关,要想梳理执行顺序,就看调用顺序

        定义格式:
                public static void 方法名(){
                    方法体(逻辑代码);
                }

         方法的调用格式:
                方法名();

         注意事项:
                方法与方法之间,是 平级关系不允许嵌套定义
                方法不调用就不执行
     */
    public static void main(String[] args) {
        farmer();
        cook();
        me();
    }

    public static void farmer() {
        System.out.println("除草");
        System.out.println("耕地");
        System.out.println("播种");
        System.out.println("浇水");
        System.out.println("收割");
    }

    public static void cook() {
        System.out.println("买菜");
        System.out.println("洗菜");
        System.out.println("炒菜");
    }

    public static void me() {
        System.out.println("点菜");
        System.out.println("吃菜");
    }
}

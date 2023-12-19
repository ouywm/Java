package com.itheima.scale;

public class ScaleDemo {
    /*
        计算机中进制的分类:
             十进制:    默认
             二进制:    0b
             八进制:    0 开头
                  - 今后编写数据,尽量不要 0 开头
              十六进制:   0x开头
                  -今后看到一组数据是0~9,字母a~f排列的,这是十六进制的数据
     */
    public static void main(String[] args) {
        System.out.println(110);
        System.out.println(0b110);
        System.out.println(0110);
        System.out.println(0x110);
    }
}

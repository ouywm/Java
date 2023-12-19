package com.itheima.frame.label;

import javax.swing.*;

public class JLabelTest {
    /*
            案例 ：使用JLabel展示文本和图片


                    JLabel构造方法 ：

                        JLabel（String text） 使用指定的文本创建一 JLabel 对象
                        JBabel (Icon image) 创建一个具有指定图像的JLabel 对象
     */
    public static void main(String[] args) {

        JFrame frame = new JFrame();
        frame.setSize(500, 500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);

        //JLabel展示文本
        JLabel jl1 = new JLabel("听君一席话");
        jl1.setBounds(50, 50, 100, 100);
        frame.getContentPane().add(jl1);

        JLabel jb2 = new JLabel("如听一席话");
        jb2.setBounds(150, 50, 100, 100);
        frame.getContentPane().add(jb2);

        //JLabel展示图片
        JLabel imageLabel_2png = new JLabel(new ImageIcon("D:\\Codes\\Codes\\Advanced-Code\\day03-code\\src\\com\\itheima\\frame\\image\\2.png"));
        imageLabel_2png.setBounds(50, 150, 100, 100);
        frame.getContentPane().add(imageLabel_2png);

        JLabel ImageLabel_3png = new JLabel(new ImageIcon("D:\\Codes\\Codes\\Advanced-Code\\day03-code\\src\\com\\itheima\\frame\\image\\3.png"));
        ImageLabel_3png.setBounds(150, 150, 100, 100);
        frame.getContentPane().add(ImageLabel_3png);



        // 给窗体设置图标方法
        frame.setIconImage(new ImageIcon("D:\\Codes\\Codes\\Advanced-Code\\day03-code\\src\\com\\itheima\\frame\\image\\win.png").getImage());



        frame.setVisible(true);

    }
}

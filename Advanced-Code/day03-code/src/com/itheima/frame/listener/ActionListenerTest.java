package com.itheima.frame.listener;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class ActionListenerTest {
    /*
            动作事件： ActionListener

            1.鼠标的点击 2.空格按钮
     */
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setSize(500, 500);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setLayout(null);

        JButton btu = new JButton("按钮");
        btu.setBounds(0, 0, 100, 100);
        frame.add(btu);

        btu.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("按钮被点击了");
            }
        });


        frame.setVisible(true);
    }

}

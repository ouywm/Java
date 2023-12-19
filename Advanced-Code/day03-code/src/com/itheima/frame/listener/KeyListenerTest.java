package com.itheima.frame.listener;

import javax.swing.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class KeyListenerTest {
    /*
            键盘事件 : keyListener
     */
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setSize(500, 500);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setLayout(null);

        frame.addKeyListener(new KeyListener() {

            @Override
            public void keyTyped(KeyEvent e) {
                //fn esc delete crtl shift alt 上下左右
            }

            @Override
            public void keyPressed(KeyEvent e) {
                int keyCode = e.getKeyCode();
                if (keyCode == 37) {

                    System.out.println("左键");

                } else if (keyCode == 38) {

                    System.out.println("上键");

                } else if (keyCode == 39) {

                    System.out.println("右键");

                } else if (keyCode == 40) {

                    System.out.println("下键");

                }
            }

            @Override
            public void keyReleased(KeyEvent e) {
                System.out.println("键盘松开了...");
            }
        });

        frame.setVisible(true);
    }
}

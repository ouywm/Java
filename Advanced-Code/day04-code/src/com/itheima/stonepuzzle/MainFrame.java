package com.itheima.stonepuzzle;

import javax.swing.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Random;

public class MainFrame extends JFrame implements KeyListener {

    /**
     * 用二维数组来储存图片的索引，
     * 简单来说就是图片的名字， 就是 1 2 3 4 5 6 7 8 9
     * 10 11 12 13 14 15 0 这些数字  然后遍历数组就好了
     */
    public int[][] data = {
            {1, 2, 3, 4},
            {5, 6, 7, 8},
            {9, 10, 11, 12},
            {13, 14, 15, 0}
    };

    //游戏胜利二维数组，跟打乱后的数组比较
    int[][] win = {
            {1, 2, 3, 4},
            {5, 6, 7, 8},
            {9, 10, 11, 12},
            {13, 14, 15, 0}
    };
    int row;    // 0号元素行坐标位置
    int column; // 0号元素列坐标位置

    //计数器变量
    int count;


    /**
     * 利用构造方法去初始化
     */
    public MainFrame() {

        //窗体对象.addKeyListener(KeyListener实现类对象);
        //this : 当前类的对象
        this.addKeyListener(this);
        //1) 窗体对象
        //2) KeyListener实现类对象


        //初始化窗体
        initFrame();

        //初始化数据
        initData();

        //绘制游戏界面
        paintView();

        //窗口在准备好之后再显示到屏幕上
        setVisible(true);
    }


    /**
     * 初始化数据(打乱二维数组)
     */
    public void initData() {
        //准备Random对象
        Random r = new Random();
        //遍历二维数组
        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data[i].length; j++) {
                int randomX = r.nextInt(4);
                int randomY = r.nextInt(4);
                //data[i][j] 和 随机索引所指向的元素进行交换
                //data[randomX][randomY]
                int temp = data[i][j];
                data[i][j] = data[randomX][randomY];
                data[randomX][randomY] = temp;
            }
        }

        //获取0号元素的行坐标跟列坐标，通过遍历二维数组来获取
        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data[i].length; j++) {
                //判断是否维数组中的元素是否为0，0代表着二维数组中的空白图片索引
                if (data[i][j] == 0) {
                    row = i;
                    column = j;
                    //break;
                }
            }
        }
    }


    /**
     * 此方法用于初始化窗体
     */
    public void initFrame() {


        //设置窗体对象大小
        setSize(514, 595);

        //设置船体默认关闭模式
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        //窗体标题
        setTitle("石头迷阵单机版V1.0");

        //设置窗口在页面最前面
        setAlwaysOnTop(true);

        //设置窗体居中
        setLocationRelativeTo(null);

        //设置窗体的图标
        setIconImage(new ImageIcon("D:\\image\\小游戏.png\\").getImage());

        //取消默认窗体的布局
        setLayout(null);


    }


    /**
     * 此方法用于绘制游戏界面
     */
    public void paintView() {
        //获取窗体，删除里面所有
        getContentPane().removeAll();

        if (victory()) {
            //加载胜利图片资源，添加到窗体当中
            JLabel winLabel = new JLabel(new ImageIcon("D:\\image\\win.png"));
            winLabel.setBounds(124, 230, 266, 90);
            getContentPane().add(winLabel);
        }

        JButton btn = new JButton("重新游戏");
        btn.setBounds(350, 20, 100, 20);
        btn.setFocusable(false);
        btn.addActionListener(e -> {
            count = 0;
            initData();
            paintView();
        });
        getContentPane().add(btn);


        JLabel scoreLabel = new JLabel("步数为:" + count);
        scoreLabel.setBounds(50, 20, 100, 20);
        getContentPane().add(scoreLabel);

        for (int i = 0; i < 4; i++) {
            // i = 0 1 2 3
            for (int j = 0; j < 4; j++) {
                //j = 0 1 2 3
                JLabel imageLabel = new JLabel(new ImageIcon("D:\\image\\" + data[i][j] + ".png"));
                imageLabel.setBounds(50 + 100 * j, 90 + 100 * i, 100, 100);
                getContentPane().add(imageLabel);
            }
        }
        //背景
        JLabel background = new JLabel(new ImageIcon("D:\\image\\background.png"));
        background.setBounds(26, 30, 450, 484);
        getContentPane().add(background);
        //获取窗体，重新
        getContentPane().repaint();
    }

    /**
     * 此方法为判断游戏是否胜利
     * 返回布尔类型
     */
    public boolean victory() {

        //遍历打乱的二维数组跟胜利二维数组比较，有一个不一样就return false;
        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data[i].length; j++) {
                //
                if (data[i][j] != win[i][j]) {
                    return false;
                }
            }
        }
        //走到这里，都相同返回true
        return true;
    }

    @Override
    public void keyPressed(KeyEvent e) {

        int keyCode = e.getKeyCode();
        move(keyCode);
        //每一次移动之后，都重新绘制游戏界面
        paintView();

    }

    /**
     * 此方法用于处理移动业务
     */
    private void move(int keyCode) {
        //调用游戏胜利方法，每移动一步就判断
        if (victory()) {
            return;
        }
        //左
        if (keyCode == 37) {
            //判断是不是在边上
            if (column == 3) {
                //如果是就直接不允许动
                return;
            }
            //空白快跟右侧数据做交换
            //data[row][column] data[row][column+1]
            int temp = data[row][column];
            data[row][column] = data[row][column + 1];
            data[row][column + 1] = temp;
            column++;
            count++;
        } else if (keyCode == 38) {
            //判断是不是在边上
            if (row == 3) {
                //如果是就直接不允许动
                return;
            }
            //上移动是空白块更下面的数据做交换
            //data[row][column] data[row+1][column]
            int temp = data[row][column];
            data[row][column] = data[row + 1][column];
            data[row + 1][column] = temp;
            row++;
            count++;
        } else if (keyCode == 39) {
            //判断是不是在边上
            if (column == 0) {
                //如果是就直接不允许动
                return;
            }
            //空白块跟左边的数据做交换
            //data[row][column] data[row][column-1]
            int temp = data[row][column];
            data[row][column] = data[row][column - 1];
            data[row][column - 1] = temp;
            column--;
            count++;
            //下移动
        } else if (keyCode == 40) {
            if (row == 0) {
                //如果是就直接不允许动
                return;
            }
            //空白块跟上面的数据做交换
            // data[row][column] data[row -1 ][column]
            int temp = data[row][column];
            data[row][column] = data[row - 1][column];
            data[row - 1][column] = temp;
            row--;
            count++;
        } else if (keyCode == 90) {
            //触发作弊器
            data = new int[][]{
                    {1, 2, 3, 4},
                    {5, 6, 7, 8},
                    {9, 10, 11, 12},
                    {13, 14, 15, 0}
            };

        }
    }

    //------------------------------------------------------------
    @Override
    public void keyReleased(KeyEvent e) {

    }


    @Override
    public void keyTyped(KeyEvent e) {

    }
    //------------------------------------------------------------
}
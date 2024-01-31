import cn.hutool.core.io.IoUtil;
import domain.GameInfo;

import javax.swing.*;
import javax.swing.border.BevelBorder;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.io.*;
import java.util.*;

/**
 * 游戏界面
 */
public class GameJFrame extends JFrame implements KeyListener, ActionListener {

	// 加载图片是，根据二维数组中的数据决定图片怎么加载
	int[][] data = new int[4][4];

	// 空白方块二维数组位置
	int X = 0;
	int Y = 0;

	// 记录当前展示图片的路径
	String path = "D:\\Codes\\Codes\\Advanced-Code\\puzzlegame\\image\\animal\\animal3\\";

	// 正确数据
	int[][] win = new int[][]{
			{1, 2, 3, 4},
			{5, 6, 7, 8},
			{9, 10, 11, 12},
			{13, 14, 15, 0},
	};

	// 统计步数
	int step = 0;

	// 创建子选项对象
	JMenuItem replayItem = new JMenuItem("重新游戏");
	JMenuItem reLoginItem = new JMenuItem("重新登陆");
	JMenuItem closeItem = new JMenuItem("关闭游戏");
	JMenu ChangePicture = new JMenu("更换图片");
	JMenuItem accountItem = new JMenuItem("关于我们");
	JMenuItem BeautifulWoman = new JMenuItem("美女");
	JMenuItem zoon = new JMenuItem("动物");
	JMenuItem movement = new JMenuItem("运动");

	JMenu saveJMenu = new JMenu("存档");
	JMenu loadJMenu = new JMenu("读档");

	JMenuItem saveItem0 = new JMenuItem("存档0(空)");
	JMenuItem saveItem1 = new JMenuItem("存档1(空)");
	JMenuItem saveItem2 = new JMenuItem("存档2(空)");
	JMenuItem saveItem3 = new JMenuItem("存档3(空)");
	JMenuItem saveItem4 = new JMenuItem("存档4(空)");

	JMenuItem loadItem0 = new JMenuItem("读档0(空)");
	JMenuItem loadItem1 = new JMenuItem("读档1(空)");
	JMenuItem loadItem2 = new JMenuItem("读档2(空)");
	JMenuItem loadItem3 = new JMenuItem("读档3(空)");
	JMenuItem loadItem4 = new JMenuItem("读档4(空)");


	// 随机数
	Random r = new Random();


	public GameJFrame() {

		// 初始化界面方法
		initJFrame();

		// 初始化菜单方法
		JMenuBar();

		// 初始化数据
		initData();

		// 初始化图片方法
		initImage();

		// 设置界面可见
		setVisible(true);
	}

	/**
	 * 此方法用于初始化数据(打乱)
	 */
	private void initData() {

		int[] tempArr = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15};

		// 随机数，用于打乱数组
		Random r = new Random();
		// 遍历跟随机数做交换
		for (int i = 0; i < tempArr.length; i++) {
			// 获得一个数组长度的随机数
			int index = r.nextInt(tempArr.length);
			// 定义临时变量
			int temp = tempArr[i];
			// 跟随机数做交换
			tempArr[i] = tempArr[index];
			// 随机数跟临时变量做交换
			tempArr[index] = temp;
		}
		// 一维数组添加二维数组
		for (int i = 0; i < tempArr.length; i++) {
			if (tempArr[i] == 0) {
				X = i / 4;
				Y = i % 4;
			}
			data[i / 4][i % 4] = tempArr[i];
		}
	}

	/**
	 * 此方法用于初始化图片
	 */
	private void initImage() {

		// 清空已存在所有图片
		getContentPane().removeAll();

		//
		if (victory()) {
			// 显示胜利
			JLabel winJLabel = new JLabel(new ImageIcon("D:\\Codes\\Codes\\Advanced-Code\\puzzlegame\\image\\win.png"));
			winJLabel.setBounds(203, 283, 197, 73);
			getContentPane().add(winJLabel);
		}

		// 步数
		JLabel stepCount = new JLabel("步数" + step);
		// 设置位置与大小
		stepCount.setBounds(50, 30, 100, 20);
		// 添加到界面中
		getContentPane().add(stepCount);

		// 外循环 -- 内循环重复四次
		for (int i = 0; i < 4; i++) {
			// 内循环 -- 行
			for (int j = 0; j < 4; j++) {
				// 获取当前要加载的图片序号
				int num = data[i][j];
				// 创建JLabel对象(容器)
				JLabel jLabel = new JLabel(new ImageIcon(path + num + ".jpg"));
				// 指定图片位置
				jLabel.setBounds(105 * j + 83, i * 105 + 134, 105, 105);
				// 给图片添加边框 1 凸 0 凹
				jLabel.setBorder(new BevelBorder(BevelBorder.RAISED));
				// 把容器添加到界面当中
				getContentPane().add(jLabel);
			}
		}
		// 背景图片
		JLabel background = new JLabel(new ImageIcon("D:\\Codes\\Codes\\Advanced-Code\\puzzlegame\\image\\background.png"));
		// 设置位置与大小
		background.setBounds(40, 40, 508, 560);
		getContentPane().add(background);

		// 刷新界面
		getContentPane().repaint();

	}

	/**
	 * 此方法用于初始化菜单
	 */
	private void JMenuBar() {
		//创建整个的菜单对象
		JMenuBar jMenuBar = new JMenuBar();
		//创建菜单上面的两个选项的对象 （功能  关于我们）
		JMenu functionJMenu = new JMenu("功能");
		JMenu aboutJMenu = new JMenu("关于我们");


		//将每一个选项下面的条目天极爱到选项当中
		// 更换图片
		functionJMenu.add(ChangePicture);
		// 美女
		ChangePicture.add(BeautifulWoman);
		// 动物
		ChangePicture.add(zoon);
		// 运动
		ChangePicture.add(movement);

		// 重新游戏
		functionJMenu.add(replayItem);
		// 重新登陆
		functionJMenu.add(reLoginItem);
		// 关闭游戏
		functionJMenu.add(closeItem);
		// 关于我们
		aboutJMenu.add(accountItem);

		functionJMenu.add(saveJMenu);

		functionJMenu.add(loadJMenu);


		//把5个存档，添加到saveJMenu中
		saveJMenu.add(saveItem0);
		saveJMenu.add(saveItem1);
		saveJMenu.add(saveItem2);
		saveJMenu.add(saveItem3);
		saveJMenu.add(saveItem4);

		//把5个读档，添加到loadJMenu中
		loadJMenu.add(loadItem0);
		loadJMenu.add(loadItem1);
		loadJMenu.add(loadItem2);
		loadJMenu.add(loadItem3);
		loadJMenu.add(loadItem4);


		//给条目绑定事件
		// 重新游戏
		replayItem.addActionListener(this);
		// 重新登录
		reLoginItem.addActionListener(this);
		// 关闭游戏
		closeItem.addActionListener(this);
		// 美女
		BeautifulWoman.addActionListener(this);
		// 动物
		zoon.addActionListener(this);
		// 运动
		movement.addActionListener(this);
		// 关于我们
		accountItem.addActionListener(this);

		saveItem0.addActionListener(this);
		saveItem1.addActionListener(this);
		saveItem2.addActionListener(this);
		saveItem3.addActionListener(this);
		saveItem4.addActionListener(this);

		loadItem0.addActionListener(this);
		loadItem1.addActionListener(this);
		loadItem2.addActionListener(this);
		loadItem3.addActionListener(this);
		loadItem4.addActionListener(this);

		//将菜单里面的两个选项添加到菜单当中
		jMenuBar.add(functionJMenu);
		jMenuBar.add(aboutJMenu);

		getGameInfo();

		//给整个界面设置菜单
		this.setJMenuBar(jMenuBar);
	}

	public void getGameInfo() {
		// 创建file对象获取里面的文件
		File fr = new File("D:\\Codes\\Codes\\Advanced-Code\\puzzlegame\\save");
		// 得到File文件数组
		File[] files = fr.listFiles();
		// 如果等于空之间停止方法
		if (files == null) {
			return;
		}
		// 遍历数组
		for (File file : files) {
			// 提升作用域
			GameInfo gi = null;

			// 创建反序列化流，读取
			try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file))) {
				// 读取对象，强制转换成GameInfo类型
				gi = (GameInfo) ois.readObject();
			} catch (IOException | ClassNotFoundException e) {
				throw new RuntimeException(e);
			}
			// 根据读取出来的对象，获取存档的步数
			int step = gi.getStep();
			// 获取文件名，根据第四索引，变成字符，给int变量赋值
			int index = file.getName().charAt(4) - '0';

			// 读档,菜单对象根据index索引来决定是改变哪里个子项显示内容
			loadJMenu.getItem(index).setText("读档" + index + "(" + step + ")步");
			// 存档
			saveJMenu.getItem(index).setText("存档" + index + "(" + step + ")步");
		}
	}

	/**
	 * 此方法用于初始化界面
	 */
	private void initJFrame() {
		// 设置界面宽高
		setSize(603, 680);
		// 设置界面标题
		setTitle("拼图 小游戏");
		// 设置页面置顶
		setAlwaysOnTop(true);
		// 设置页面居中
		setLocationRelativeTo(null);
		// 设置关闭模式
		setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		// 取消默认的布局方式
		setLayout(null);
		// 给整个界面做监听事件
		addKeyListener(this);
	}

	@Override
	public void keyTyped(KeyEvent e) {

	}

	// 按下不松
	@Override
	public void keyPressed(KeyEvent e) {
		int code = e.getKeyCode();
		if (code == 65) {
			//把界面中所有的图片全部删除
			this.getContentPane().removeAll();
			//加载第一张完整的图片
			JLabel all = new JLabel(new ImageIcon(path + "\\all.jpg"));
			all.setBounds(83, 134, 420, 420);
			this.getContentPane().add(all);
			//添加背景图片
			JLabel background = new JLabel(new ImageIcon("puzzlegame\\image\\background.png"));
			background.setBounds(40, 40, 508, 560);
			//把背景图片添加到界面当中
			this.getContentPane().add(background);
			//刷新界面
			this.getContentPane().repaint();
		}
	}


	@Override
	public void keyReleased(KeyEvent e) {
		// 游戏是否胜利，如果胜利，此方法需要直接结束，不能执行下面的代码
		if (victory()) {
			return;
		}
		// 上下左右
		int code = e.getKeyCode();
		if (code == 37) {
			System.out.println("左");
			if (Y == 3) {
				return;
			}
			data[X][Y] = data[X][Y + 1];
			data[X][Y + 1] = 0;
			Y++;
			// 每次移动++
			step++;
			initImage();
		} else if (code == 38) {
			if (X == 3) {
				return;
			}
			data[X][Y] = data[X + 1][Y];
			data[X + 1][Y] = 0;
			X++;
			// 每次移动++
			step++;
			initImage();
		} else if (code == 39) {
			System.out.println("右");
			if (Y == 0) {
				return;
			}
			data[X][Y] = data[X][Y - 1];
			data[X][Y - 1] = 0;
			Y--;
			// 每次移动++
			step++;
			initImage();
		} else if (code == 40) {
			System.out.println("下");
			if (X == 0) {
				return;
			}
			data[X][Y] = data[X - 1][Y];
			data[X - 1][Y] = 0;
			X--;
			// 每次移动++
			step++;
			initImage();
		} else if (code == 65) {
			initImage();
		} else if (code == 87) {
			// 暂时显示拼好图片
			data = new int[][]{
					{1, 2, 3, 4},
					{5, 6, 7, 8},
					{9, 10, 11, 12},
					{13, 14, 15, 0}
			};
			initImage();
		}
	}

	/**
	 * 此方法是用于判断游戏是否胜利
	 * 判断data数组中的数据是否跟win中的数据相同
	 */
	public boolean victory() {
		for (int i = 0; i < data.length; i++) {
			for (int j = 0; j < data[i].length; j++) {
				if (data[i][j] != win[i][j]) {
					// 只要有一个数据不一样，之间返回false
					return false;
				}
			}
		}
		// 遍历完毕，全都一样，返回false
		return true;
	}


	/**
	 * 动作监听点击
	 */
	@Override
	public void actionPerformed(ActionEvent e) {
		//获取当前被点击的条目对象
		Object source = e.getSource();
		//判断
		if (source == replayItem) {
			System.out.println("重新游戏");
			//计步器清零
			step = 0;
			//再次打乱二维数组中的数据
			initData();
			//重新加载图片
			initImage();
		} else if (source == reLoginItem) {
			System.out.println("重新登录");
			//关闭当前的游戏界面
			this.setVisible(false);
			//打开登录界面
			new LoginJFrame();
		} else if (source == closeItem) {
			System.out.println("关闭游戏");
			//直接关闭虚拟机即可
			System.exit(0);
		} else if (source == accountItem) {
			System.out.println("公众号");
			// 创建集合
			Properties prop = new Properties();

			// 创建字节输入流读取配置文件
			try(FileInputStream fis = new FileInputStream("D:\\Codes\\Codes\\Advanced-Code\\puzzlegame\\game.properties;");){
				// 读取到集合中
				prop.load(fis);
			}
			 catch (IOException ex) {
				throw new RuntimeException(ex);
			}


			// 根据键找值，转换成String字符串类型
			String path = (String) prop.get("account");
			// 调用显示弹窗方法
			showJDialog(path);
		} else if (source == BeautifulWoman) {
			System.out.println("美女");
			// 创建File对象，关联路径
			File fr = new File("D:\\Codes\\Codes\\Advanced-Code\\puzzlegame\\image\\girl\\");        // 获取到File集合，每一个对象
			// 获取文件夹路径给成员变量赋值
			path = getPath(fr);
			// 初始化图片
			initData();
			// 重新加载图片位置，打乱图片
			initImage();
		} else if (source == zoon) {
			System.out.println("动物");
			// 创建File对象，关联路径
			File fr = new File("D:\\Codes\\Codes\\Advanced-Code\\puzzlegame\\image\\animal\\");        // 获取到File集合，每一个对象
			// 获取文件夹路径给成员变量赋值
			path = getPath(fr);
			// 初始化图片
			initData();
			// 重新加载图片位置，打乱图片
			initImage();
		} else if (source == movement) {
			System.out.println("运动");
			// 创建File对象，关联路径
			File fr = new File("D:\\Codes\\Codes\\Advanced-Code\\puzzlegame\\image\\sport\\");        // 获取到File集合，每一个对象
			// 获取文件夹路径给成员变量赋值
			path = getPath(fr);
			// 初始化图片
			initData();
			// 重新加载图片位置，打乱图片
			initImage();
		} else if (source == saveItem0 || source == saveItem1 || source == saveItem2 || source == saveItem3 || source == saveItem4) {
			System.out.println("存档");
			// 获取当前是哪个存档被点击了，将其中的序号获取出来
			JMenuItem item = (JMenuItem) source;
			String str = item.getText();
			int index = str.charAt(2) - '0';
			try {
				// 创建序列化流
				//D:\Codes\Codes\Advanced-Code\puzzlegame\save
				ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("D:\\Codes\\Codes\\Advanced-Code\\puzzlegame\\save\\save" + index + ".data"));
				// 创建数据对象
				GameInfo gi = new GameInfo(data, X, Y, path, step);
				// 写入本地文件中
				IoUtil.writeObj(oos, true, gi);
			} catch (IOException ex) {
				throw new RuntimeException(ex);
			}
			// 修该存档展示信息，因为已经存档，不再是空
			//存档0(步数)
			item.setText("存档" + index + "(" + step + ")步");
			// 修该读档展示信息，因为已经存档，不再是空
			loadJMenu.getItem(index).setText("读档" + index + "(" + step + ")步");

		} else if (source == loadItem0 || source == loadItem1 || source == loadItem2 || source == loadItem3 || source == loadItem4) {
			System.out.println("读档");
			// 获取当前是哪个存档被点击了，将其中的序号获取出来
			JMenuItem item = (JMenuItem) source;
			// 获取文本
			String str = item.getText();
			// 获取二号索引的元素减去0字符，变成字符，转成int
			int index = str.charAt(2) - '0';
			// 提高作用域
			GameInfo gi = null;
			try {
				// 创建反序列化流对象读取文件
				ObjectInputStream ois = new ObjectInputStream(new FileInputStream("D:\\Codes\\Codes\\Advanced-Code\\puzzlegame\\save\\save" + index + ".data"));
				// 读取对象
				gi = (GameInfo) ois.readObject();
				// 如果读取出来的对象是空之间return
				if (gi == null) {
					return;
				}
			} catch (IOException | ClassNotFoundException ex) {
				throw new RuntimeException(ex);
			}
			// 获取读出来对象的数据给当前类成员变量赋值
			data = gi.getData();
			X = gi.getX();
			Y = gi.getY();
			step = gi.getStep();
			path = gi.getPath();

			// 重新刷新界面加载游戏
			initImage();
		}
	}

	private static void showJDialog(String filepath) {
		//创建一个弹框对象
		JDialog jDialog = new JDialog();
		//创建一个管理图片的容器对象JLabel
		JLabel jLabel = new JLabel(new ImageIcon(filepath));
		//设置位置和宽高
		jLabel.setBounds(0, 0, 258, 258);
		//把图片添加到弹框当中
		jDialog.getContentPane().add(jLabel);
		//给弹框设置大小
		jDialog.setSize(344, 344);
		//让弹框置顶
		jDialog.setAlwaysOnTop(true);
		//让弹框居中
		jDialog.setLocationRelativeTo(null);
		//弹框不关闭则无法操作下面的界面
		jDialog.setModal(true);
		//让弹框显示出来
		jDialog.setVisible(true);
	}

	/**
	 * 获取文件夹路径
	 */
	private String getPath(File fr) {
		// 创建集合，装路径
		ArrayList<String> list = new ArrayList<String>();

		// 获取里面的每一个
		File[] files = fr.listFiles();
		// 遍历添加
		for (File file : files) {
			// 判断是否为文件
			if (!file.isFile()) {
				// 我只往集合里面添加文件夹路径
				// 字符串拼接，隐试转换
				list.add(file + "\\");
			}
		}
		// 随机图片文件夹索引
		int index = r.nextInt(list.size());
		// 遍历每一个
		for (int i = 0; i <= list.size(); i++) {
			// 给文件路径赋值
			path = list.get(index);
		}
		// 步数清零
		step = 0;
		// 返回路径
		return path;
	}
}

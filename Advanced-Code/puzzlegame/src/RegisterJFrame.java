import cn.hutool.core.io.FileUtil;
import domain.User;

import javax.swing.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;

public class RegisterJFrame extends JFrame implements MouseListener {

	// 用户集合
	ArrayList<User> allUsers;

	//跟注册相关的代码，都写在这个界面中
	//提升三个输入框的变量的作用范围，让这三个变量可以在本类中所有方法里面可以使用。
	JTextField username = new JTextField();
	JTextField password = new JTextField();
	JTextField rePassword = new JTextField();

	//提升两个按钮变量的作用范围，让这两个变量可以在本类中所有方法里面可以使用。
	JButton submit = new JButton();
	JButton reset = new JButton();


	public RegisterJFrame(ArrayList<User> allUsers) {
		// 指向本类成员变量
		this.allUsers = allUsers;
		initFrame();
		initView();
		setVisible(true);
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		if (e.getSource() == submit) {
			System.out.println("注册");
			// 用户名，密码不能为空
			if (username.getText().length() == 0 || password.getText().length() == 0 || rePassword.getText().length() == 0) {
				showDialog("用户名，密码不能为空");
				// 如果都为空，下面的判断就不需要执行了
				return;
			}
			// 判断两次密码输入是否一致
			if (!password.getText().equals(rePassword.getText())) {
				showDialog("两次密码输入不一致");
				return;
			}
			// 判断用户名密码输入格式是否正确
			if (!username.getText().matches("[a-zA-Z0-9]{4,16}")) {
				showDialog("用户名不符合规则");
				return;
			}
			if (!password.getText().matches("\\S*(?=\\S{6,})(?=\\S*\\d)(?=\\S*[a-z])\\S*")) {
				showDialog("密码不符合规则，至少一个小写字母，1个数字，长度至少六位");
				return;
			}

			// 判断用户名是否已经存在
			if (containsUsername(username.getText())) {
				showDialog("用户已经存在，请重新输入！");
				return;
			}

			// 添加到集合中
			allUsers.add(new User(username.getText(), password.getText()));

			// 将集合写到本地文件
			// 需要重写toString()方法，按照自己的格式
			FileUtil.writeLines(allUsers, "D:\\userinfo.txt", "UTF-8");
			// 提示注册成功
			showDialog("注册成功，可以开始登录啦！");
			// 关闭当前注册页面，打开登录页面
			setVisible(false);
			// 显示登录页面
			new LoginJFrame();
		} else if (e.getSource() == reset) {
			System.out.println("重置");
			// 将输入框的内容清空
			username.setText("");
			password.setText("");
			rePassword.setText("");
		}
	}

	/**
	 * 作用：判断用户名是否在集合中已经存在
	 * 参数：用户名
	 * 返回值：true：存在    false：不存在
	 */
	public boolean containsUsername(String username) {
		// 遍历集合，获取每一个用户对象
		for (User u : allUsers) {
			// 判断用户对象的用户名跟username一样吗
			if (u.getUsername().equals(username)) {
				// 只要有一个一样的之间返回true
				return true;
			}
		}
		// 代码走到这说明没有一样的，返回false
		return false;
	}

	/**
	 * 鼠标按下不松
	 */
	@Override
	public void mousePressed(MouseEvent e) {
		if (e.getSource() == submit) {
			submit.setIcon(new ImageIcon("puzzlegame\\image\\register\\注册按下.png"));
		} else if (e.getSource() == reset) {
			reset.setIcon(new ImageIcon("puzzlegame\\image\\register\\重置按下.png"));
		}
	}

	/**
	 * 鼠标松开
	 */
	@Override
	public void mouseReleased(MouseEvent e) {
		if (e.getSource() == submit) {
			submit.setIcon(new ImageIcon("puzzlegame\\image\\register\\注册按钮.png"));
		} else if (e.getSource() == reset) {
			reset.setIcon(new ImageIcon("puzzlegame\\image\\register\\重置按钮.png"));
		}
	}

	/**
	 * 鼠标移入
	 */
	@Override
	public void mouseEntered(MouseEvent e) {

	}

	/**
	 * 鼠标移出
	 */
	@Override
	public void mouseExited(MouseEvent e) {

	}

	/**
	 * 初始化窗体内容
	 */
	private void initView() {
		//添加注册用户名的文本
		JLabel usernameText = new JLabel(new ImageIcon("puzzlegame\\image\\register\\注册用户名.png"));
		usernameText.setBounds(85, 135, 80, 20);

		//添加注册用户名的输入框
		username.setBounds(195, 134, 200, 30);

		//添加注册密码的文本
		JLabel passwordText = new JLabel(new ImageIcon("puzzlegame\\image\\register\\注册密码.png"));
		passwordText.setBounds(97, 193, 70, 20);

		//添加密码输入框
		password.setBounds(195, 195, 200, 30);

		//添加再次输入密码的文本
		JLabel rePasswordText = new JLabel(new ImageIcon("puzzlegame\\image\\register\\再次输入密码.png"));
		rePasswordText.setBounds(64, 255, 95, 20);

		//添加再次输入密码的输入框
		rePassword.setBounds(195, 255, 200, 30);

		//注册的按钮
		submit.setIcon(new ImageIcon("puzzlegame\\image\\register\\注册按钮.png"));
		submit.setBounds(123, 310, 128, 47);
		submit.setBorderPainted(false);
		submit.setContentAreaFilled(false);
		submit.addMouseListener(this);

		//重置的按钮
		reset.setIcon(new ImageIcon("puzzlegame\\image\\register\\重置按钮.png"));
		reset.setBounds(256, 310, 128, 47);
		reset.setBorderPainted(false);
		reset.setContentAreaFilled(false);
		reset.addMouseListener(this);

		//背景图片
		JLabel background = new JLabel(new ImageIcon("puzzlegame\\image\\register\\background.png"));
		background.setBounds(0, 0, 470, 390);

		this.getContentPane().add(usernameText);
		this.getContentPane().add(passwordText);
		this.getContentPane().add(rePasswordText);
		this.getContentPane().add(username);
		this.getContentPane().add(password);
		this.getContentPane().add(rePassword);
		this.getContentPane().add(submit);
		this.getContentPane().add(reset);
		this.getContentPane().add(background);
	}

	/**
	 * 初始化窗体
	 */
	private void initFrame() {
		//对自己的界面做一些设置。
		//设置宽高
		setSize(488, 430);
		//设置标题
		setTitle("拼图游戏 V1.0注册");
		//取消内部默认布局
		setLayout(null);
		//设置关闭模式
		setDefaultCloseOperation(3);
		//设置居中
		setLocationRelativeTo(null);
		//设置置顶
		setAlwaysOnTop(true);
	}

	//只创建一个弹框对象
	JDialog jDialog = new JDialog();

	//因为展示弹框的代码，会被运行多次
	//所以，我们把展示弹框的代码，抽取到一个方法中。以后用到的时候，就不需要写了
	//直接调用就可以了。
	public void showDialog(String content) {
		if (!jDialog.isVisible()) {
			//把弹框中原来的文字给清空掉。
			jDialog.getContentPane().removeAll();
			JLabel jLabel = new JLabel(content);
			jLabel.setBounds(0, 0, 200, 150);
			jDialog.add(jLabel);
			//给弹框设置大小
			jDialog.setSize(250, 150);
			//要把弹框在设置为顶层 -- 置顶效果
			jDialog.setAlwaysOnTop(true);
			//要让jDialog居中
			jDialog.setLocationRelativeTo(null);
			//让弹框
			jDialog.setModal(true);
			//让jDialog显示出来
			jDialog.setVisible(true);
		}
	}
}
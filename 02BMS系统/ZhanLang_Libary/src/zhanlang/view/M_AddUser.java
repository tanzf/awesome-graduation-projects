package zhanlang.view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import zhanlang.DAO.ManagerDAO;
import zhanlang.DAO.UserDAO;
import zhanlang.DAO.Imple.DataExchange;
import zhanlang.DAO.Imple.ManagerDAOImple;
import zhanlang.DAO.Imple.UserDAOImple;
import zhanlang.entity.User;

import javax.swing.JButton;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JTable;
import java.awt.Font;
import javax.swing.ImageIcon;
import java.awt.Color;
import javax.swing.JRadioButton;
import javax.swing.JComboBox;
import javax.swing.JPasswordField;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;

public class M_AddUser extends JFrame {

	private JPanel contentPane;
	private JTextField username;
	private JTextField name;
	private JTextField age;
	private JPasswordField pass;
	private JPasswordField repeatpass;
	private JTextField tel;
	/**
	 * Create the frame.
	 */
	public M_AddUser(){
		setTitle("添加用户");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 444, 296);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		username = new JTextField();
		username.setFont(new Font("楷体", Font.BOLD, 13));
		username.setColumns(10);
		username.setBounds(119, 21, 108, 21);
		contentPane.add(username);
		
		JLabel label = new JLabel("用户名：");
		label.setFont(new Font("楷体", Font.BOLD, 15));
		label.setBounds(43, 21, 80, 18);
		contentPane.add(label);
		
		name = new JTextField();
		name.setFont(new Font("楷体", Font.BOLD, 13));
		name.setColumns(10);
		name.setBounds(300, 21, 108, 21);
		contentPane.add(name);
		
		JLabel label_1 = new JLabel("姓名：");
		label_1.setFont(new Font("楷体", Font.BOLD, 15));
		label_1.setBounds(253, 21, 60, 18);
		contentPane.add(label_1);
		
		JLabel label_2 = new JLabel("性别：");
		label_2.setFont(new Font("楷体", Font.BOLD, 15));
		label_2.setBounds(253, 100, 60, 18);
		contentPane.add(label_2);
		
		JRadioButton boy = new JRadioButton("男");
		boy.setFont(new Font("楷体", Font.BOLD, 14));
		boy.setBounds(319, 100, 45, 23);
		contentPane.add(boy);
		
		JRadioButton girl = new JRadioButton("女");
		girl.setFont(new Font("楷体", Font.BOLD, 14));
		girl.setBounds(370, 100, 52, 23);
		contentPane.add(girl);
		
		JLabel label_3 = new JLabel("年龄：");
		label_3.setFont(new Font("楷体", Font.BOLD, 15));
		label_3.setBounds(253, 60, 60, 18);
		contentPane.add(label_3);
		
		age = new JTextField();
		age.setFont(new Font("楷体", Font.BOLD, 13));
		age.setColumns(10);
		age.setBounds(300, 60, 108, 21);
		contentPane.add(age);
		
		JComboBox city = new JComboBox();
		city.setFont(new Font("楷体", Font.BOLD, 12));
		city.setModel(new DefaultComboBoxModel(new String[] {"北京市 ", "天津市", "上海市", "重庆市", "河北省", "山西省", "辽宁省", "吉林省", "黑龙江省", "江苏省", "浙江省", "安徽省", "福建省", "江西省", "山东省", "河南省", "湖北省", "湖南省", "广东省", "海南省", "四川省", "贵州省", "云南省", "陕西省", "甘肃省", "青海省", "台湾省", "内蒙古自治区", "广西壮族自治区", "西藏自治区", "宁夏回族自治区", "新疆维吾尔自治区", "香港特别行政区", "澳门特别行政区"}));
		city.setBounds(119, 100, 108, 21);
		contentPane.add(city);
		
		JLabel label_4 = new JLabel("城市：");
		label_4.setFont(new Font("楷体", Font.BOLD, 15));
		label_4.setBounds(43, 100, 60, 18);
		contentPane.add(label_4);
		
		JLabel label_6 = new JLabel("联系方式：");
		label_6.setFont(new Font("楷体", Font.BOLD, 15));
		label_6.setBounds(43, 60, 80, 18);
		contentPane.add(label_6);
		
		JLabel label_7 = new JLabel("输入密码：");
		label_7.setFont(new Font("楷体", Font.BOLD, 15));
		label_7.setBounds(43, 138, 80, 18);
		contentPane.add(label_7);
		
		pass = new JPasswordField();
		pass.setFont(new Font("楷体", Font.BOLD, 13));
		pass.setBounds(123, 138, 108, 21);
		contentPane.add(pass);
		
		JLabel label_8 = new JLabel("重复密码：");
		label_8.setFont(new Font("楷体", Font.BOLD, 15));
		label_8.setBounds(43, 167, 80, 18);
		contentPane.add(label_8);
		
		repeatpass = new JPasswordField();
		repeatpass.setFont(new Font("楷体", Font.BOLD, 13));
		repeatpass.setBounds(123, 167, 108, 21);
		contentPane.add(repeatpass);
		
		JButton button = new JButton("");
		button.setIcon(new ImageIcon(M_AddUser.class.getResource("/picture/text/提交.jpg")));
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				String userName=username.getText();
				String uname=name.getText();
				String sex;
				if(boy.isSelected()){
					sex="男";
				}else{
					sex="女";
				}
				String uage=age.getText();
				String ucity=(String) city.getSelectedItem();
				String utel=tel.getText();
				String password=pass.getText();
				String urepeatpass=repeatpass.getText();
				//判断密码两次提交是否相同
				if(!password.equals(urepeatpass)){
					JOptionPane.showMessageDialog(null, "两次密码输入不一致！");
					return;
				}
				String command=new String("addUser");
				User user=new User(uname, sex, utel, uage, ucity, userName, password);				
				ManagerDAO manager=new ManagerDAOImple();
				Object object=manager.addUser("addUser", user);
				
				if((boolean)object==true){
					JOptionPane.showMessageDialog(null, "用户添加成功！");
				}else{
					JOptionPane.showMessageDialog(null, "用户添加失败，请重试！");
				}
				//处理完上一次提交的操作申请，应当将所有输入框置空
				username.setText("");
				name.setText("");
				age.setText("");
				tel.setText("");
				pass.setText("");
				repeatpass.setText("");
			}		
		});
		button.setFont(new Font("微软雅黑", Font.PLAIN, 12));
		button.setBackground(new Color(211, 211, 211));
		button.setBounds(140, 214, 60, 23);
		contentPane.add(button);
		
		JButton button_2 = new JButton("");
		button_2.setIcon(new ImageIcon(M_AddUser.class.getResource("/picture/text/返回.jpg")));
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Client.mAddUserFrame.dispose();
			}
		});
		button_2.setFont(new Font("微软雅黑", Font.PLAIN, 12));
		button_2.setBackground(new Color(211, 211, 211));
		button_2.setBounds(262, 214, 66, 23);
		contentPane.add(button_2);
		
		tel = new JTextField();
		tel.setFont(new Font("楷体", Font.BOLD, 13));
		tel.setColumns(10);
		tel.setBounds(119, 60, 108, 21);
		contentPane.add(tel);
		
		JLabel label_5 = new JLabel("");
		label_5.setIcon(new ImageIcon(M_AddUser.class.getResource("/picture/text/添加图书背景.jpg")));
		label_5.setBounds(0, 0, 428, 262);
		contentPane.add(label_5);
	}
}

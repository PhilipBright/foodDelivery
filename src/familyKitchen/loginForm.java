package familyKitchen;

import java.awt.EventQueue;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Image;

import javax.swing.SwingConstants;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import javax.swing.JLayeredPane;
import javax.swing.JSplitPane;
import javax.swing.JTabbedPane;
import java.awt.Panel;

public class loginForm extends JFrame {
	
	private Image img_login = new ImageIcon(loginForm.class.getResource("/res/login.png")).getImage().getScaledInstance(57, 44, Image.SCALE_SMOOTH);
	private Image img_profile = new ImageIcon(loginForm.class.getResource("/res/user1.jpg")).getImage().getScaledInstance(57, 44, Image.SCALE_SMOOTH);
	private Image familykit = new ImageIcon(loginForm.class.getResource("/res/familykit.png")).getImage().getScaledInstance(269, 74, Image.SCALE_SMOOTH);

	
	private JPanel contentPane;
	private JTextField txtUsername;
	private JPasswordField txtPassword;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					loginForm frame = new loginForm();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public loginForm() {
		setUndecorated(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(200, 300, 550, 400);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(173, 216, 230));
		contentPane.setBorder(null);
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JPanel panel = new JPanel();
		panel.setBackground(new Color(255, 255, 255));
		panel.setBounds(255, 163, 253, 44);
		contentPane.add(panel);
		panel.setLayout(null);

		txtUsername = new JTextField();
		txtUsername.setDisabledTextColor(new Color(0, 0, 0));
		txtUsername.setForeground(new Color(128, 128, 128));
		txtUsername.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				if (txtUsername.getText().equals("Username")) {
					txtUsername.setText("");
				} else {
					txtUsername.selectAll();
				}
			}

			@Override
			public void focusLost(FocusEvent e) {
				if (txtUsername.getText().equals(""))
					txtUsername.setText("Username");
			}
		});
		txtUsername.setBorder(null);
		txtUsername.setFont(new Font("Arial", Font.BOLD, 14));
		txtUsername.setText("Username");
		txtUsername.setBounds(10, 11, 165, 20);
		panel.add(txtUsername);
		txtUsername.setColumns(10);
		
		JLabel lblIconUsername = new JLabel("");
		lblIconUsername.setIcon(new ImageIcon(img_profile));
		lblIconUsername.setBounds(196, 0, 57, 44);
		panel.add(lblIconUsername);

		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(255, 255, 255));
		panel_1.setBounds(255, 232, 253, 44);
		contentPane.add(panel_1);
		panel_1.setLayout(null);

		txtPassword = new JPasswordField();
		txtPassword.setForeground(new Color(128, 128, 128));
		txtPassword.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				if (txtPassword.getText().equals("Password")) {
					txtPassword.setEchoChar('●');
					txtPassword.setText("");
				} else {
					txtPassword.selectAll();
				}
			}

			@Override
			public void focusLost(FocusEvent e) {

				if (txtPassword.getText().equals(""))
					;
				{
					txtPassword.setText("Password");
					txtPassword.setEchoChar((char) 0);
				}
			}
		});
		txtPassword.setBorder(null);
		txtPassword.setEchoChar((char) 0);
		txtPassword.setFont(new Font("Arial", Font.BOLD, 14));
		txtPassword.setText("Password");
		txtPassword.setBounds(10, 11, 165, 20);
		panel_1.add(txtPassword);
		
		JLabel lblIconPwd = new JLabel("");
		lblIconPwd.setIcon(new ImageIcon(img_login));
		lblIconPwd.setBounds(194, 0, 59, 44);
		panel_1.add(lblIconPwd);

		JPanel pnlBtnLogin = new JPanel();
		pnlBtnLogin.setBackground(new Color(128, 128, 128));
		pnlBtnLogin.setBounds(255, 319, 253, 37);
		contentPane.add(pnlBtnLogin);
		pnlBtnLogin.setLayout(null);
		
				JLabel lblLogin = new JLabel("Login");
				lblLogin.setBounds(0, 0, 253, 37);
				pnlBtnLogin.add(lblLogin);
				lblLogin.addMouseListener(new MouseAdapter() {
					@Override
					public void mouseClicked(MouseEvent e) {
						if(txtUsername.getText().equals("Customer") && txtPassword.getText().equals("Customer123")) {
							JOptionPane.showMessageDialog(null, "Login Successful! Welcome to our Family Kitchen!");
							MainForm main = new MainForm();
							main.setVisible(true);
							dispose();
							
						}
						else if(txtUsername.getText().equals("Admin") && txtPassword.getText().equals("Admin123")) {
							JOptionPane.showMessageDialog(null, "Login Successful! Welcome to our Family Kitchen, Sir");
							AdminMainForm main = new AdminMainForm();
							main.setVisible(true);
							dispose();
							}
						else {JOptionPane.showMessageDialog(null, "Invaild username or passsword! Please try again!!");}
					}
					@Override
					public void mouseEntered(MouseEvent e) {
						lblLogin.setForeground(Color.RED);
					}
					@Override
					public void mouseExited(MouseEvent e) {
						lblLogin.setForeground(Color.WHITE);
					}
					
				});
				lblLogin.setHorizontalAlignment(SwingConstants.CENTER);
				lblLogin.setForeground(new Color(240, 255, 255));
				lblLogin.setBackground(new Color(240, 248, 255));
				lblLogin.setFont(new Font("Arial", Font.BOLD, 14));
		
		JLabel lblNewLabel_1 = new JLabel("Username:");
		lblNewLabel_1.setForeground(new Color(0, 0, 0));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setFont(new Font("Arial", Font.PLAIN, 23));
		lblNewLabel_1.setBounds(57, 163, 173, 44);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Password:");
		lblNewLabel_1_1.setForeground(new Color(0, 0, 0));
		lblNewLabel_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1.setFont(new Font("Arial", Font.PLAIN, 23));
		lblNewLabel_1_1.setBounds(57, 232, 173, 44);
		contentPane.add(lblNewLabel_1_1);
		
		Panel panel_3 = new Panel();
		panel_3.setBackground(new Color(47, 79, 79));
		panel_3.setBounds(0, 0, 550, 31);
		contentPane.add(panel_3);
		panel_3.setLayout(null);
		
		JLabel lblX = new JLabel("X");
		lblX.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (JOptionPane.showConfirmDialog(null, "Are you sure you want to close this?", "Confirmation",
						JOptionPane.YES_NO_OPTION) == 0) {
					loginForm.this.dispose();
				}
			}

			@Override
			public void mouseEntered(MouseEvent e) {
				lblX.setForeground(Color.RED);
			}

			@Override
			public void mouseExited(MouseEvent e) {
				lblX.setForeground(Color.black);
			}
		});
		lblX.setHorizontalAlignment(SwingConstants.CENTER);
		lblX.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
		lblX.setBounds(518, 0, 32, 27);
		panel_3.add(lblX);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBounds(154, 54, 269, 74);
		contentPane.add(panel_2);
		panel_2.setBackground(new Color(128, 0, 0));
		panel_2.setLayout(null);
		
		JLabel lblfamilykit = new JLabel("");
		
		lblfamilykit.setBounds(0, 0, 269, 74);
		panel_2.add(lblfamilykit);
		lblfamilykit.setIcon(new ImageIcon(familykit));
		
		JPanel panel_4 = new JPanel();
		panel_4.setBackground(new Color(47, 79, 79));
		panel_4.setBounds(0, 31, 24, 369);
		contentPane.add(panel_4);
		
		JPanel panel_4_1 = new JPanel();
		panel_4_1.setBackground(new Color(47, 79, 79));
		panel_4_1.setBounds(526, 31, 24, 369);
		contentPane.add(panel_4_1);
		
		JPanel panel_5 = new JPanel();
		panel_5.setBackground(new Color(47, 79, 79));
		panel_5.setBounds(24, 367, 504, 33);
		contentPane.add(panel_5);
		setLocationRelativeTo(null);
	}
}

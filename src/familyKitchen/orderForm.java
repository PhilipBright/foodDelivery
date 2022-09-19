package familyKitchen;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.SwingConstants;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;



import javax.swing.JScrollPane;
import javax.swing.border.LineBorder;
import java.awt.event.MouseMotionAdapter;
import java.awt.Component;
import java.awt.Cursor;
import javax.swing.JTextField;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.awt.SystemColor;
import javax.swing.JRadioButton;
import javax.swing.JComboBox;
import javax.swing.AbstractButton;
import javax.swing.ButtonGroup;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;

public class orderForm extends JFrame {
	private Image familykit = new ImageIcon(loginForm.class.getResource("/res/familykit.png")).getImage().getScaledInstance(166, 72, Image.SCALE_SMOOTH);

	private JPanel contentPane;

	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainForm frame = new MainForm();
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
	
	
	public orderForm() {
		
		setUndecorated(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 903, 518);
		contentPane = new JPanel();
		contentPane.setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
		contentPane.setBackground(new Color(176, 224, 230));
		contentPane.setBorder(new LineBorder(new Color(0, 0, 128), 2, true));
		setContentPane(contentPane);
		this.setLocationRelativeTo(contentPane);
		contentPane.setLayout(null);
		
		
		
		
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 903, 94);
		panel.setBackground(new Color(47, 79, 79));
		contentPane.add(panel);
		panel.setLayout(null);
		
		
		JLabel lblNewLabel = new JLabel("Welcome to The Family Kitchen Restaurant");
		lblNewLabel.setBounds(176, 24, 681, 48);
		panel.add(lblNewLabel);
		lblNewLabel.setBackground(new Color(255, 255, 255));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Comic Sans MS", Font.BOLD, 30));
		
		JLabel lblX = new JLabel("X");
		lblX.setBounds(885, 0, 18, 21);
		panel.add(lblX);
		lblX.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (JOptionPane.showConfirmDialog(null, "Are you sure you want to close this?", "Confirmation",
						JOptionPane.YES_NO_OPTION) == 0) {
					orderForm.this.dispose();
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
		lblX.setFont(new Font("Comic Sans MS", Font.BOLD, 14));
		
		JLabel lblLogo = new JLabel("");
		lblLogo.setIcon(new ImageIcon(familykit));
		lblLogo.setBounds(0, 11, 166, 72);
		panel.add(lblLogo);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(0, 94, 157, 365);
		panel_1.setBackground(new Color(240, 255, 255));
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(new Color(147, 112, 219));
		panel_2.setBounds(10, 11, 137, 58);
		panel_1.add(panel_2);
		panel_2.setLayout(null);
		
		JLabel lblHome = new JLabel("Menu");
		lblHome.setForeground(new Color(0, 0, 0));
		lblHome.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				MainForm main = new MainForm();
				main.setVisible(true);
				dispose();
			}
			@Override
			public void mouseEntered(MouseEvent e) {
				lblHome.setForeground(Color.RED);
			}
			@Override
			public void mouseExited(MouseEvent e) {
				lblHome.setForeground(Color.black);
			}
		});
		lblHome.setFont(new Font("Comic Sans MS", Font.BOLD, 20));
		lblHome.setHorizontalAlignment(SwingConstants.CENTER);
		lblHome.setBounds(0, 0, 137, 58);
		panel_2.add(lblHome);
		
		JPanel panel_2_2 = new JPanel();
		panel_2_2.setBackground(new Color(255, 192, 203));
		panel_2_2.setBounds(10, 80, 137, 58);
		panel_1.add(panel_2_2);
		panel_2_2.setLayout(null);
		
		JLabel lblPreview = new JLabel("Preview");
		lblPreview.setBounds(0, 0, 137, 58);
		panel_2_2.add(lblPreview);
		lblPreview.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				lblPreview.setForeground(Color.RED);
			}
			@Override
			public void mouseExited(MouseEvent e) {
				lblPreview.setForeground(Color.black);
			}
			@Override
			public void mouseClicked(MouseEvent e) {
				previewForm preview = new previewForm();
				preview.setVisible(true);
				dispose();
			}
		});
		lblPreview.setHorizontalAlignment(SwingConstants.CENTER);
		lblPreview.setFont(new Font("Comic Sans MS", Font.BOLD, 20));
		
		JPanel panel_2_3 = new JPanel();
		panel_2_3.setBackground(new Color(100, 149, 237));
		panel_2_3.setBounds(10, 218, 137, 58);
		panel_1.add(panel_2_3);
		panel_2_3.setLayout(null);
		
		JLabel lblOrder = new JLabel("Order");
		lblOrder.setBounds(0, 0, 137, 58);
		panel_2_3.add(lblOrder);
		lblOrder.setForeground(new Color(255, 0, 0));
		lblOrder.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				lblOrder.setForeground(Color.RED);
			}
			@Override
			public void mouseExited(MouseEvent e) {
				lblOrder.setForeground(Color.black);
			}
		});
		lblOrder.setFont(new Font("Comic Sans MS", Font.BOLD, 20));
		lblOrder.setHorizontalAlignment(SwingConstants.CENTER);
		
		JPanel panel_2_1 = new JPanel();
		panel_2_1.setBounds(10, 149, 137, 58);
		panel_1.add(panel_2_1);
		panel_2_1.setBackground(new Color(60, 179, 113));
		panel_2_1.setLayout(null);
		
		JLabel lblSearch = new JLabel("Search");
		lblSearch.addMouseListener(new MouseAdapter() {

			@Override
			public void mouseEntered(MouseEvent e) {
				lblSearch.setForeground(Color.RED);
			}

			@Override
			public void mouseExited(MouseEvent e) {
				lblSearch.setForeground(Color.black);
			}

			@Override
			public void mouseClicked(MouseEvent e) {
				searchForm search = new searchForm();
				search.setVisible(true);
				dispose();
			}
		});
		lblSearch.setBounds(0, 0, 137, 58);
		panel_2_1.add(lblSearch);
		lblSearch.setForeground(new Color(0, 0, 0));
		
		
		lblSearch.setHorizontalAlignment(SwingConstants.CENTER);
		lblSearch.setFont(new Font("Comic Sans MS", Font.BOLD, 20));
		
		JPanel panel_3 = new JPanel();
		panel_3.setBackground(new Color(240, 230, 140));
		panel_3.setBounds(10, 287, 137, 58);
		panel_1.add(panel_3);
		panel_3.setLayout(null);
		
		JLabel lblLogout = new JLabel("Logout");
		lblLogout.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				lblLogout.setForeground(Color.RED);
			}
			@Override
			public void mouseExited(MouseEvent e) {
				lblLogout.setForeground(Color.black);
			}
			@Override
			public void mouseClicked(MouseEvent e) {
				if (JOptionPane.showConfirmDialog(null, "Are you sure you want to Logout?", "Confirmation",
						JOptionPane.YES_NO_OPTION) == 0) {
				loginForm login = new loginForm();
				login.setVisible(true);
				dispose();}
			}
		});
		lblLogout.setBounds(0, 0, 137, 58);
		panel_3.add(lblLogout);
		lblLogout.setHorizontalAlignment(SwingConstants.CENTER);
		lblLogout.setFont(new Font("Comic Sans MS", Font.BOLD, 20));
		
		JPanel panel_5 = new JPanel();
		panel_5.setBounds(0, 457, 903, 61);
		panel_5.setLayout(null);
		panel_5.setBackground(new Color(47, 79, 79));
		contentPane.add(panel_5);
		
		JLabel lblNewLabel_8 = new JLabel("CopyRight@ Developed by Saw Kaung Set Hein");
		lblNewLabel_8.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_8.setFont(new Font("Comic Sans MS", Font.BOLD, 30));
		lblNewLabel_8.setBounds(0, 0, 903, 61);
		panel_5.add(lblNewLabel_8);
		
		JLabel lblNewLabel_1 = new JLabel("Name:");
		lblNewLabel_1.setFont(new Font("Comic Sans MS", Font.BOLD, 20));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBounds(188, 125, 148, 37);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Ph no:");
		lblNewLabel_1_1.setFont(new Font("Comic Sans MS", Font.BOLD, 20));
		lblNewLabel_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1.setBounds(188, 191, 148, 37);
		contentPane.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_2 = new JLabel("Payment:");
		lblNewLabel_1_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_2.setFont(new Font("Comic Sans MS", Font.BOLD, 20));
		lblNewLabel_1_2.setBounds(188, 255, 148, 37);
		contentPane.add(lblNewLabel_1_2);
		
		JLabel lblNewLabel_1_3 = new JLabel("Address:");
		lblNewLabel_1_3.setFont(new Font("Comic Sans MS", Font.BOLD, 20));
		lblNewLabel_1_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_3.setBounds(188, 317, 148, 37);
		contentPane.add(lblNewLabel_1_3);
		
		textField = new JTextField();
		textField.setFont(new Font("Comic Sans MS", Font.BOLD, 20));
		textField.setBounds(376, 125, 258, 37);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setFont(new Font("Comic Sans MS", Font.BOLD, 20));
		textField_1.setColumns(10);
		textField_1.setBounds(376, 191, 258, 37);
		contentPane.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setFont(new Font("Comic Sans MS", Font.BOLD, 20));
		textField_2.setColumns(10);
		textField_2.setBounds(376, 317, 258, 87);
		contentPane.add(textField_2);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("Cash on Delivery");
		rdbtnNewRadioButton.setBackground(new Color(176, 224, 230));
		rdbtnNewRadioButton.setFont(new Font("Comic Sans MS", Font.BOLD, 20));
		rdbtnNewRadioButton.setBounds(376, 255, 208, 34);
		contentPane.add(rdbtnNewRadioButton);
		
		String[] methods = {"Credit","Kpay","WavePay","Visa"};
		JComboBox comboBox = new JComboBox(methods);
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"None", "Credit", "Kpay", "WavePay", "Visa"}));
		comboBox.setFont(new Font("Comic Sans MS", Font.BOLD, 20));
		comboBox.setToolTipText("");
		comboBox.setBounds(638, 255, 106, 37);
		contentPane.add(comboBox);
		
		JPanel panel_4 = new JPanel();
		panel_4.setBorder(null);
		panel_4.setBackground(new Color(255, 255, 255));
		panel_4.setBounds(750, 400, 106, 37);
		contentPane.add(panel_4);
		panel_4.setLayout(null);
		
		JLabel lblOK = new JLabel("OK");
		lblOK.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (JOptionPane.showConfirmDialog(null, "Are you sure that you want to order?", "Confirmation",
						JOptionPane.YES_NO_OPTION) == 0) {
					JOptionPane.showMessageDialog(null, "Thank you for shopping with us :)");
					orderForm order = new orderForm();
					order.setVisible(true);
					dispose();
					
				}
			}

			@Override
			public void mouseEntered(MouseEvent e) {
				lblOK.setForeground(Color.RED);
			}

			@Override
			public void mouseExited(MouseEvent e) {
				lblOK.setForeground(Color.black);
			}
		});
		lblOK.setBorder(null);
		lblOK.setHorizontalAlignment(SwingConstants.CENTER);
		lblOK.setFont(new Font("Comic Sans MS", Font.BOLD, 20));
		lblOK.setBounds(0, 0, 106, 37);
		panel_4.add(lblOK);
	}
}

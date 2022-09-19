package familyKitchen;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
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

public class AdminSearchForm extends JFrame {
	private Image familykit = new ImageIcon(loginForm.class.getResource("/res/familykit.png")).getImage()
			.getScaledInstance(166, 72, Image.SCALE_SMOOTH);

	private JPanel contentPane;
	private JTable table;
	public static AdminFood[] f;
	public static Object[][] data;
	static int count = 20;
	int index = 0;
	Food temp;
	int result;
	int first;
	int last;
	int middle;
	int value;

	private JTextField txtEnterTheFood;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AdminSearchForm frame = new AdminSearchForm();
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
	public static void loadAdminFood() // Car information loading class
	{
		f = new AdminFood[count];
		f[0] = new AdminFood(1, "Pizza", "12/11/2021", "Anna", 1000);
		f[1] = new AdminFood(2, "Burger", "2/4/2021", "John", 600);
		f[2] = new AdminFood(3, "Hotdog", "3/4/2021", "Philip", 600);
		f[3] = new AdminFood(4, "Donut", "30/12/2021", "Emerald", 500);
		f[4] = new AdminFood(5, "Fired Chicken", "1/1/2022", "Shimazu", 700);
		f[5] = new AdminFood(6, "Coffee", "30/3/2021", "Levi", 800);
		f[6] = new AdminFood(7, "Sushi", "11/5/2021", "Rachel", 900);
		f[7] = new AdminFood(8, "Chocolate", "21/7/2021", "Lisa", 500);
		f[8] = new AdminFood(9, "Jelly", "10/9/2021", "Austin", 400);
		f[9] = new AdminFood(10, "Candy", "6/9/2021", "Kelvin", 300);
		f[10] = new AdminFood(11, "BBQ", "4/8/2021", "Rocky", 5000);
		f[11] = new AdminFood(12, "Hotpot", "5/7/2021", "El", 7000);
		f[12] = new AdminFood(13, "Orange Juice", "4/2/2021", "Sam", 5340);
		f[13] = new AdminFood(14, "Ice-cream", "8/2/2021", "Dean", 650);
		f[14] = new AdminFood(15, "Bubble Tea", "9/4/2021", "Cake", 230);
		f[15] = new AdminFood(16, "Coke", "7/7/2021", "ACE", 320);
		f[16] = new AdminFood(17, "White Wine", "6/2/2021", "Mikazu", 32000);
		f[17] = new AdminFood(18, "Smoothie", "8/9/2021", "Loreal", 900);
		f[18] = new AdminFood(19, "Coconut Juice", "21/5/2021", "Jake", 1000);
		f[19] = new AdminFood(20, "Ramen Noodle", "5/6/2021", "Felix", 3000);

		int i = 0;
		data = new Object[20][5];
		for (AdminFood r : f) {
			// System.out.println(r);// car objects data
			data[i][0] = r.getFoodID();
			data[i][1] = r.getFoodName();
			data[i][2] = r.getDate();
			data[i][3] = r.getCustomerName();
			data[i][4] = r.getPrice();
			i++;
		}
	}

	private void clear() {
		DefaultTableModel model = (DefaultTableModel) table.getModel();
		model.setRowCount(0);
	}

	private void dataFill() {
		DefaultTableModel model = (DefaultTableModel) table.getModel();
		String data[] = new String[] { String.valueOf(f[index].getFoodID()), f[index].getFoodName(), f[index].getDate(),
				f[index].getCustomerName(), String.valueOf(f[index].getPrice()) };// end of data
		model.addRow(data);
	}

	public AdminSearchForm() {
		loadAdminFood();
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
					AdminSearchForm.this.dispose();
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
		panel_1.setBounds(0, 93, 157, 365);
		panel_1.setBackground(new Color(240, 255, 255));
		contentPane.add(panel_1);
		panel_1.setLayout(null);

		JPanel panel_2 = new JPanel();
		panel_2.setBackground(new Color(147, 112, 219));
		panel_2.setBounds(10, 21, 137, 58);
		panel_1.add(panel_2);
		panel_2.setLayout(null);

		JLabel lblHome = new JLabel("Menu");
		lblHome.setForeground(new Color(0, 0, 0));
		lblHome.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				AdminMainForm main = new AdminMainForm();
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

		JPanel panel_2_1 = new JPanel();
		panel_2_1.setBounds(10, 180, 137, 58);
		panel_1.add(panel_2_1);
		panel_2_1.setBackground(new Color(60, 179, 113));
		panel_2_1.setLayout(null);

		JLabel lblSearch = new JLabel("Search");
		lblSearch.setBounds(0, 0, 137, 58);
		panel_2_1.add(lblSearch);
		lblSearch.setForeground(new Color(255, 0, 0));

		lblSearch.setHorizontalAlignment(SwingConstants.CENTER);
		lblSearch.setFont(new Font("Comic Sans MS", Font.BOLD, 20));

		JPanel panel_6 = new JPanel();
		panel_6.setBackground(new Color(255, 182, 193));
		panel_6.setBounds(10, 102, 137, 58);
		panel_1.add(panel_6);
		panel_6.setLayout(null);

		JLabel lblPreview = new JLabel("Preview");
		lblPreview.setBounds(0, 0, 137, 58);
		panel_6.add(lblPreview);
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
				AdminPreviewForm preview = new AdminPreviewForm();
				preview.setVisible(true);
				dispose();
			}
		});
		lblPreview.setHorizontalAlignment(SwingConstants.CENTER);
		lblPreview.setFont(new Font("Comic Sans MS", Font.BOLD, 20));

		JPanel panel_7 = new JPanel();
		panel_7.setBackground(new Color(240, 230, 140));
		panel_7.setBounds(10, 260, 137, 58);
		panel_1.add(panel_7);
		panel_7.setLayout(null);

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
					dispose();
				}
			}
		});
		lblLogout.setBounds(0, 0, 137, 58);
		panel_7.add(lblLogout);
		lblLogout.setHorizontalAlignment(SwingConstants.CENTER);
		lblLogout.setFont(new Font("Comic Sans MS", Font.BOLD, 20));

		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(188, 121, 551, 175);
		contentPane.add(scrollPane);

		scrollPane.setViewportView(table);

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

		txtEnterTheFood = new JTextField();
		txtEnterTheFood.setBorder(null);
		txtEnterTheFood.setForeground(Color.GRAY);
		txtEnterTheFood.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				if (txtEnterTheFood.getText().equals("Enter the Food name to search")) {
					txtEnterTheFood.setText("");
				} else {
					txtEnterTheFood.selectAll();
				}
			}

			@Override
			public void focusLost(FocusEvent e) {
				if (txtEnterTheFood.getText().equals(""))
					txtEnterTheFood.setText("Enter the Food name to search");
			}
		});
		txtEnterTheFood.setFont(new Font("Comic Sans MS", Font.BOLD, 18));
		txtEnterTheFood.setText("Enter the Food name to search");
		txtEnterTheFood.setBounds(303, 351, 277, 32);
		contentPane.add(txtEnterTheFood);
		txtEnterTheFood.setColumns(10);

		JPanel panel_3 = new JPanel();
		panel_3.setBounds(652, 351, 101, 32);
		contentPane.add(panel_3);
		panel_3.setLayout(null);
		JRadioButton rdbtnName = new JRadioButton("Search by Food Name");
		rdbtnName.setBorder(null);
		rdbtnName.setBackground(new Color(176, 224, 230));
		rdbtnName.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
		rdbtnName.setBounds(204, 310, 187, 23);
		contentPane.add(rdbtnName);

		JRadioButton rdbtnID = new JRadioButton("Search by Food ID");
		rdbtnID.setBorder(null);
		rdbtnID.setBackground(new Color(176, 224, 230));
		rdbtnID.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
		rdbtnID.setBounds(433, 308, 167, 23);
		contentPane.add(rdbtnID);
		ButtonGroup bg = new ButtonGroup();
		bg.add(rdbtnName);
		bg.add(rdbtnID);

		JLabel lblbtnSearch = new JLabel("Search");
		lblbtnSearch.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				lblbtnSearch.setForeground(Color.RED);
			}

			@Override
			public void mouseExited(MouseEvent e) {
				lblbtnSearch.setForeground(Color.black);
			}

			@Override
			public void mouseClicked(MouseEvent e) {
				if (rdbtnName.isSelected()) {
					String FoodName = txtEnterTheFood.getText();

					int j = 0;
					// index=0;
					boolean found = false;
					while (j < count && !found) {
						if (f[j].getFoodName().equals(FoodName)) {
							found = true;
							index = j;
						} else {
							j++;
						}
					}
					if (found == true) {

						clear();
						dataFill();
					} else {
						JOptionPane.showMessageDialog(null, "Food is not found!");
					}
				}
				if (rdbtnID.isSelected()) {
					value = Integer.parseInt(txtEnterTheFood.getText());
					first = 0;
					last = f.length - 1;
					while (first <= last) {
						middle = (first + last) / 2;
						if (value > f[middle].getFoodID()) {
							first = middle + 1;

						} else if (value < f[middle].getFoodID()) {

							last = middle - 1;
						} else {

							index = middle;

							clear();
							dataFill();
							break;
						}
					}

				
			
				if (first > last) {
					JOptionPane.showMessageDialog(null, "FoodID not Found");
				}}
			}
		}

		);
		table = new JTable();
		table.setModel(
				new DefaultTableModel(data, new String[] { "FoodID", "FoodName", "Date", "CustomerName", "Price " }));

		scrollPane.setViewportView(table);
		lblbtnSearch.setBounds(0, 0, 101, 32);
		panel_3.add(lblbtnSearch);
		lblbtnSearch.setHorizontalAlignment(SwingConstants.CENTER);
		lblbtnSearch.setFont(new Font("Comic Sans MS", Font.BOLD, 20));

		JPanel panel_4 = new JPanel();
		panel_4.setBackground(new Color(255, 255, 255));
		panel_4.setBounds(580, 351, 20, 32);
		contentPane.add(panel_4);
		panel_4.setLayout(null);

		JLabel lblCancel = new JLabel("\u274C");
		lblCancel.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				txtEnterTheFood.setText(null);
			}
		});
		lblCancel.setBounds(0, 0, 20, 33);
		panel_4.add(lblCancel);
		lblCancel.setBorder(null);
		lblCancel.setForeground(Color.GRAY);
		lblCancel.setHorizontalAlignment(SwingConstants.CENTER);
		lblCancel.setBackground(Color.WHITE);

	}
}

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
import javax.swing.JList;
import java.awt.ScrollPane;
import javax.swing.JScrollBar;
import java.awt.Scrollbar;
import java.awt.Label;
import java.awt.List;
import javax.swing.JTextField;
import javax.swing.JTabbedPane;
import javax.swing.JLayeredPane;
import javax.swing.JMenuBar;
import javax.swing.JInternalFrame;
import javax.swing.ImageIcon;
import javax.swing.JDesktopPane;
import javax.swing.JSplitPane;
import javax.swing.JToolBar;
import javax.swing.JSpinner;
import javax.swing.JRadioButton;

public class AdminPreviewForm extends JFrame {
	private Image familykit = new ImageIcon(loginForm.class.getResource("/res/familykit.png")).getImage().getScaledInstance(166, 72, Image.SCALE_SMOOTH);

	private Image BBQ = new ImageIcon(loginForm.class.getResource("/res/BBQ.png")).getImage().getScaledInstance(109, 78,
			Image.SCALE_SMOOTH);
	private Image bubbletea = new ImageIcon(loginForm.class.getResource("/res/bubbletea.png")).getImage()
			.getScaledInstance(109, 78, Image.SCALE_SMOOTH);
	private Image burger = new ImageIcon(loginForm.class.getResource("/res/burger.png")).getImage()
			.getScaledInstance(109, 78, Image.SCALE_SMOOTH);
	private Image candy = new ImageIcon(loginForm.class.getResource("/res/candy.png")).getImage().getScaledInstance(109,
			78, Image.SCALE_SMOOTH);
	private Image coke = new ImageIcon(loginForm.class.getResource("/res/coke.png")).getImage().getScaledInstance(109,
			78, Image.SCALE_SMOOTH);
	private Image donut = new ImageIcon(loginForm.class.getResource("/res/donut.png")).getImage().getScaledInstance(109,
			78, Image.SCALE_SMOOTH);
	private Image hotdog = new ImageIcon(loginForm.class.getResource("/res/hotdog.png")).getImage()
			.getScaledInstance(109, 78, Image.SCALE_SMOOTH);
	private Image hotpot = new ImageIcon(loginForm.class.getResource("/res/hotpot.png")).getImage()
			.getScaledInstance(109, 78, Image.SCALE_SMOOTH);
	private Image icecream = new ImageIcon(loginForm.class.getResource("/res/icecream.png")).getImage()
			.getScaledInstance(109, 78, Image.SCALE_SMOOTH);
	private Image jelly = new ImageIcon(loginForm.class.getResource("/res/jelly.png")).getImage().getScaledInstance(109,
			78, Image.SCALE_SMOOTH);
	private Image kfc = new ImageIcon(loginForm.class.getResource("/res/kfc.png")).getImage().getScaledInstance(109, 78,
			Image.SCALE_SMOOTH);
	private Image pizza = new ImageIcon(loginForm.class.getResource("/res/pizza.png")).getImage().getScaledInstance(109,
			78, Image.SCALE_SMOOTH);
	private Image ramen = new ImageIcon(loginForm.class.getResource("/res/ramen.png")).getImage().getScaledInstance(109,
			78, Image.SCALE_SMOOTH);
	private Image coconut = new ImageIcon(loginForm.class.getResource("/res/coconut.png")).getImage()
			.getScaledInstance(109, 78, Image.SCALE_SMOOTH);
	private Image smoothie = new ImageIcon(loginForm.class.getResource("/res/smoothie.png")).getImage()
			.getScaledInstance(109, 78, Image.SCALE_SMOOTH);
	private Image orange = new ImageIcon(loginForm.class.getResource("/res/orange.png")).getImage()
			.getScaledInstance(109, 78, Image.SCALE_SMOOTH);
	private Image coffee = new ImageIcon(loginForm.class.getResource("/res/coffee.png")).getImage()
			.getScaledInstance(109, 78, Image.SCALE_SMOOTH);
	private Image whitewine = new ImageIcon(loginForm.class.getResource("/res/whitewine.png")).getImage()
			.getScaledInstance(109, 78, Image.SCALE_SMOOTH);
	private Image sushi = new ImageIcon(loginForm.class.getResource("/res/sushi.png")).getImage().getScaledInstance(109,
			78, Image.SCALE_SMOOTH);
	private Image chocolate = new ImageIcon(loginForm.class.getResource("/res/chocolate.png")).getImage()
			.getScaledInstance(109, 78, Image.SCALE_SMOOTH);

	private JPanel contentPane;
	



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

	public AdminPreviewForm() {

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
							AdminPreviewForm.this.dispose();
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
		lblHome.addMouseListener(new MouseAdapter() {

			@Override
			public void mouseEntered(MouseEvent e) {
				lblHome.setForeground(Color.RED);
			}

			@Override
			public void mouseExited(MouseEvent e) {
				lblHome.setForeground(Color.black);
			}

			@Override
			public void mouseClicked(MouseEvent e) {
				AdminMainForm main = new AdminMainForm();
				main.setVisible(true);
				dispose();
			}
		});
		lblHome.setForeground(new Color(0, 0, 0));
		lblHome.setFont(new Font("Comic Sans MS", Font.BOLD, 20));
		lblHome.setHorizontalAlignment(SwingConstants.CENTER);
		lblHome.setBounds(0, 0, 137, 58);
		panel_2.add(lblHome);

		JPanel panel_2_2 = new JPanel();
		panel_2_2.setBounds(10, 106, 137, 58);
		panel_1.add(panel_2_2);
		panel_2_2.setBackground(new Color(255, 192, 203));
		panel_2_2.setLayout(null);
		
				JLabel lblPreview = new JLabel("Preview");
				lblPreview.setBounds(0, 0, 137, 58);
				panel_2_2.add(lblPreview);
				lblPreview.setForeground(new Color(255, 0, 0));
				lblPreview.addMouseListener(new MouseAdapter() {
					@Override
					public void mouseEntered(MouseEvent e) {
						lblPreview.setForeground(Color.RED);
					}

					@Override
					public void mouseExited(MouseEvent e) {
						lblPreview.setForeground(Color.black);
					}

				});
				lblPreview.setHorizontalAlignment(SwingConstants.CENTER);
				lblPreview.setFont(new Font("Comic Sans MS", Font.BOLD, 20));

		JPanel panel_2_1 = new JPanel();
		panel_2_1.setBounds(10, 189, 137, 58);
		panel_1.add(panel_2_1);
		panel_2_1.setBackground(new Color(60, 179, 113));
		panel_2_1.setLayout(null);
		
				JLabel lblSearch = new JLabel("Search");
				lblSearch.setBounds(0, 0, 137, 58);
				panel_2_1.add(lblSearch);
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
						AdminSearchForm search = new AdminSearchForm();
						search.setVisible(true);
						dispose();
					}
				});
				
						lblSearch.setHorizontalAlignment(SwingConstants.CENTER);
						lblSearch.setFont(new Font("Comic Sans MS", Font.BOLD, 20));
						
						JPanel panel_11 = new JPanel();
						panel_11.setBackground(new Color(240, 230, 140));
						panel_11.setBounds(10, 274, 137, 58);
						panel_1.add(panel_11);
						panel_11.setLayout(null);
						
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
						panel_11.add(lblLogout);
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

		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(155, 93, 748, 365);
		contentPane.add(tabbedPane);
		JPanel panel_3 = new JPanel();
		panel_3.setBackground(new Color(135, 206, 250));
		tabbedPane.addTab("Foods", null, panel_3, null);
		panel_3.setLayout(null);

		JLabel lblNewLabel_7 = new JLabel("New label");
		lblNewLabel_7.setBorder(new LineBorder(new Color(0, 0, 0)));
		lblNewLabel_7.setIcon(new ImageIcon(burger));
		lblNewLabel_7.setBounds(571, 11, 109, 78);
		panel_3.add(lblNewLabel_7);

		JLabel lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setBorder(new LineBorder(new Color(0, 0, 0)));
		lblNewLabel_1.setIcon(new ImageIcon(BBQ));
		lblNewLabel_1.setBounds(52, 11, 109, 78);
		panel_3.add(lblNewLabel_1);

		JLabel lblNewLabel_1_1 = new JLabel("New label");
		lblNewLabel_1_1.setBorder(new LineBorder(new Color(0, 0, 0)));
		lblNewLabel_1_1.setIcon(new ImageIcon(donut));
		lblNewLabel_1_1.setBounds(52, 117, 109, 78);
		panel_3.add(lblNewLabel_1_1);

		JLabel lblNewLabel_1_2 = new JLabel("New label");
		lblNewLabel_1_2.setBorder(new LineBorder(new Color(0, 0, 0)));
		lblNewLabel_1_2.setIcon(new ImageIcon(hotdog));
		lblNewLabel_1_2.setBounds(52, 228, 109, 78);
		panel_3.add(lblNewLabel_1_2);

		JLabel lblNewLabel_1_3 = new JLabel("New label");
		lblNewLabel_1_3.setBorder(new LineBorder(new Color(0, 0, 0)));
		lblNewLabel_1_3.setIcon(new ImageIcon(hotpot));
		lblNewLabel_1_3.setBounds(316, 11, 109, 78);
		panel_3.add(lblNewLabel_1_3);

		JLabel lblNewLabel_1_4 = new JLabel("New label");
		lblNewLabel_1_4.setBorder(new LineBorder(new Color(0, 0, 0)));
		lblNewLabel_1_4.setIcon(new ImageIcon(kfc));
		lblNewLabel_1_4.setBounds(316, 117, 109, 78);
		panel_3.add(lblNewLabel_1_4);

		JLabel lblNewLabel_1_5 = new JLabel("New label");
		lblNewLabel_1_5.setBorder(new LineBorder(new Color(0, 0, 0)));
		lblNewLabel_1_5.setIcon(new ImageIcon(pizza));
		lblNewLabel_1_5.setBounds(316, 228, 109, 78);
		panel_3.add(lblNewLabel_1_5);

		JLabel lblNewLabel_1_6 = new JLabel("New label");
		lblNewLabel_1_6.setBorder(new LineBorder(new Color(0, 0, 0)));
		lblNewLabel_1_6.setIcon(new ImageIcon(ramen));
		lblNewLabel_1_6.setBounds(571, 117, 109, 78);
		panel_3.add(lblNewLabel_1_6);

		JLabel lblNewLabel_1_7 = new JLabel("New label");
		lblNewLabel_1_7.setBorder(new LineBorder(new Color(0, 0, 0)));
		lblNewLabel_1_7.setIcon(new ImageIcon(sushi));
		lblNewLabel_1_7.setBounds(571, 228, 109, 78);
		panel_3.add(lblNewLabel_1_7);

		JPanel panel_4 = new JPanel();
		panel_4.setBackground(new Color(135, 206, 250));
		tabbedPane.addTab("Drinks", null, panel_4, null);
		panel_4.setLayout(null);

		JLabel lblNewLabel_1_8 = new JLabel("");
		lblNewLabel_1_8.setBorder(new LineBorder(new Color(0, 0, 0)));
		lblNewLabel_1_8.setIcon(new ImageIcon(bubbletea));
		lblNewLabel_1_8.setBounds(57, 11, 109, 78);
		panel_4.add(lblNewLabel_1_8);

		JLabel lblNewLabel_1_1_1 = new JLabel("");
		lblNewLabel_1_1_1.setBorder(new LineBorder(new Color(0, 0, 0)));
		lblNewLabel_1_1_1.setIcon(new ImageIcon(coke));
		lblNewLabel_1_1_1.setBounds(57, 117, 109, 78);
		panel_4.add(lblNewLabel_1_1_1);

		JLabel lblNewLabel_1_2_1 = new JLabel("");
		lblNewLabel_1_2_1.setBorder(new LineBorder(new Color(0, 0, 0)));
		lblNewLabel_1_2_1.setIcon(new ImageIcon(smoothie));
		lblNewLabel_1_2_1.setBounds(57, 228, 109, 78);
		panel_4.add(lblNewLabel_1_2_1);

		JLabel lblNewLabel_1_3_1 = new JLabel("");
		lblNewLabel_1_3_1.setBorder(new LineBorder(new Color(0, 0, 0)));
		lblNewLabel_1_3_1.setIcon(new ImageIcon(whitewine));
		lblNewLabel_1_3_1.setBounds(321, 11, 109, 78);
		panel_4.add(lblNewLabel_1_3_1);

		JLabel lblNewLabel_1_4_1 = new JLabel("");
		lblNewLabel_1_4_1.setBorder(new LineBorder(new Color(0, 0, 0)));
		lblNewLabel_1_7.setIcon(new ImageIcon(sushi));

		JLabel lblNewLabel_2 = new JLabel("BBQ");
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
		lblNewLabel_2.setBounds(62, 92, 86, 14);
		panel_3.add(lblNewLabel_2);

		JLabel lblNewLabel_2_1 = new JLabel("Donut");
		lblNewLabel_2_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2_1.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
		lblNewLabel_2_1.setBounds(62, 203, 86, 14);
		panel_3.add(lblNewLabel_2_1);

		JLabel lblNewLabel_2_2 = new JLabel("Hotdog");
		lblNewLabel_2_2.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
		lblNewLabel_2_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2_2.setBounds(62, 312, 86, 19);
		panel_3.add(lblNewLabel_2_2);

		JLabel lblNewLabel_2_3 = new JLabel("Pizza");
		lblNewLabel_2_3.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
		lblNewLabel_2_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2_3.setBounds(326, 312, 86, 14);
		panel_3.add(lblNewLabel_2_3);

		JLabel lblNewLabel_2_4 = new JLabel("Fried Chicken");
		lblNewLabel_2_4.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2_4.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
		lblNewLabel_2_4.setBounds(316, 203, 109, 14);
		panel_3.add(lblNewLabel_2_4);

		JLabel lblNewLabel_2_5 = new JLabel("Hotpot");
		lblNewLabel_2_5.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2_5.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
		lblNewLabel_2_5.setBounds(326, 92, 86, 19);
		panel_3.add(lblNewLabel_2_5);

		JLabel lblNewLabel_2_6 = new JLabel("Burger");
		lblNewLabel_2_6.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
		lblNewLabel_2_6.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2_6.setBounds(581, 92, 86, 19);
		panel_3.add(lblNewLabel_2_6);

		JLabel lblNewLabel_2_7 = new JLabel("Ramen Noodle");
		lblNewLabel_2_7.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2_7.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
		lblNewLabel_2_7.setBounds(571, 195, 109, 22);
		panel_3.add(lblNewLabel_2_7);

		JLabel lblNewLabel_2_8 = new JLabel("Sushi");
		lblNewLabel_2_8.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
		lblNewLabel_2_8.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2_8.setBounds(581, 312, 86, 14);
		panel_3.add(lblNewLabel_2_8);

		JPanel panel_9 = new JPanel();
		panel_9.setBounds(316, 228, 109, 78);
		panel_3.add(panel_9);

		JPanel panel_10 = new JPanel();
		panel_10.setBounds(571, 11, 109, 78);
		panel_3.add(panel_10);
		lblNewLabel_1_4_1.setBounds(321, 117, 109, 78);
		panel_4.add(lblNewLabel_1_4_1);

		JLabel lblNewLabel_1_5_1 = new JLabel("");
		lblNewLabel_1_5_1.setBorder(new LineBorder(new Color(0, 0, 0)));
		lblNewLabel_1_5_1.setIcon(new ImageIcon(coconut));
		lblNewLabel_1_5_1.setBounds(567, 117, 109, 78);
		panel_4.add(lblNewLabel_1_5_1);

		JLabel lblNewLabel_1_7_1 = new JLabel("");
		lblNewLabel_1_7_1.setBorder(new LineBorder(new Color(0, 0, 0)));
		lblNewLabel_1_7_1.setIcon(new ImageIcon(orange));
		lblNewLabel_1_7_1.setBounds(567, 11, 109, 78);
		panel_4.add(lblNewLabel_1_7_1);

		JLabel lblNewLabel_1_6_1 = new JLabel("");
		lblNewLabel_1_6_1.setIcon(new ImageIcon(coffee));
		lblNewLabel_1_6_1.setBounds(321, 117, 109, 78);
		panel_4.add(lblNewLabel_1_6_1);

		JLabel lblNewLabel_3 = new JLabel("Bubble Tea");
		lblNewLabel_3.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3.setBounds(57, 92, 109, 14);
		panel_4.add(lblNewLabel_3);

		JLabel lblNewLabel_3_1 = new JLabel("Coke");
		lblNewLabel_3_1.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
		lblNewLabel_3_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3_1.setBounds(67, 203, 83, 14);
		panel_4.add(lblNewLabel_3_1);

		JLabel lblNewLabel_3_2 = new JLabel("Smoothie");
		lblNewLabel_3_2.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
		lblNewLabel_3_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3_2.setBounds(67, 312, 83, 14);
		panel_4.add(lblNewLabel_3_2);

		JLabel lblNewLabel_3_3 = new JLabel("White Wine");
		lblNewLabel_3_3.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
		lblNewLabel_3_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3_3.setBounds(321, 92, 109, 14);
		panel_4.add(lblNewLabel_3_3);

		JLabel lblNewLabel_3_4 = new JLabel("Coffee");
		lblNewLabel_3_4.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
		lblNewLabel_3_4.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3_4.setBounds(331, 203, 83, 14);
		panel_4.add(lblNewLabel_3_4);

		JLabel lblNewLabel_3_5 = new JLabel("Orange Juice");
		lblNewLabel_3_5.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
		lblNewLabel_3_5.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3_5.setBounds(567, 92, 109, 22);
		panel_4.add(lblNewLabel_3_5);

		JLabel lblNewLabel_3_6 = new JLabel("Coconut Juice");
		lblNewLabel_3_6.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
		lblNewLabel_3_6.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3_6.setBounds(567, 203, 109, 14);
		panel_4.add(lblNewLabel_3_6);

		JPanel panel_8 = new JPanel();
		panel_8.setBounds(321, 11, 109, 78);
		panel_4.add(panel_8);

		JPanel panel_6 = new JPanel();
		panel_6.setBackground(new Color(135, 206, 250));
		tabbedPane.addTab("Desserts", null, panel_6, null);
		panel_6.setLayout(null);

		JLabel lblNewLabel_1_9 = new JLabel("");
		lblNewLabel_1_9.setBorder(new LineBorder(new Color(0, 0, 0)));
		lblNewLabel_1_9.setIcon(new ImageIcon(candy));
		lblNewLabel_1_9.setBounds(50, 11, 109, 78);
		panel_6.add(lblNewLabel_1_9);

		JLabel lblNewLabel_1_1_2 = new JLabel("");
		lblNewLabel_1_1_2.setBorder(new LineBorder(new Color(0, 0, 0)));
		lblNewLabel_1_1_2.setIcon(new ImageIcon(chocolate));
		lblNewLabel_1_1_2.setBounds(50, 158, 109, 78);
		panel_6.add(lblNewLabel_1_1_2);

		JLabel lblNewLabel_1_2_2 = new JLabel("");
		lblNewLabel_1_2_2.setBorder(new LineBorder(new Color(0, 0, 0)));
		lblNewLabel_1_2_2.setIcon(new ImageIcon(icecream));
		lblNewLabel_1_2_2.setBounds(314, 158, 109, 78);
		panel_6.add(lblNewLabel_1_2_2);

		JLabel lblNewLabel_1_3_2 = new JLabel("");
		lblNewLabel_1_3_2.setBorder(new LineBorder(new Color(0, 0, 0)));
		lblNewLabel_1_3_2.setIcon(new ImageIcon(jelly));
		lblNewLabel_1_3_2.setBounds(314, 11, 109, 78);
		panel_6.add(lblNewLabel_1_3_2);

		JLabel lblNewLabel_4 = new JLabel("Candy");
		lblNewLabel_4.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
		lblNewLabel_4.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_4.setBounds(60, 88, 86, 22);
		panel_6.add(lblNewLabel_4);

		JLabel lblNewLabel_4_1 = new JLabel("Chocolate");
		lblNewLabel_4_1.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
		lblNewLabel_4_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_4_1.setBounds(60, 247, 86, 14);
		panel_6.add(lblNewLabel_4_1);

		JLabel lblNewLabel_4_2 = new JLabel("Jelly");
		lblNewLabel_4_2.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
		lblNewLabel_4_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_4_2.setBounds(324, 88, 86, 22);
		panel_6.add(lblNewLabel_4_2);

		JLabel lblNewLabel_4_3 = new JLabel("Ice-Cream");
		lblNewLabel_4_3.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
		lblNewLabel_4_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_4_3.setBounds(324, 247, 86, 14);
		panel_6.add(lblNewLabel_4_3);

		JPanel panel_7 = new JPanel();
		panel_7.setBounds(314, 11, 109, 78);
		panel_6.add(panel_7);

	}
}

package display;

import java.awt.EventQueue;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JToolBar;
import java.awt.BorderLayout;
import javax.swing.JTabbedPane;
import javax.swing.JSplitPane;
import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.FlowLayout;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.Image;

import javax.swing.border.CompoundBorder;
import javax.swing.border.LineBorder;
import java.awt.Button;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Toolkit;
import java.awt.Label;
import java.awt.Dimension;
import javax.swing.border.SoftBevelBorder;
import javax.swing.border.BevelBorder;
import javax.swing.border.TitledBorder;
import java.awt.Component;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JMenu;
import net.miginfocom.swing.MigLayout;
import javax.swing.Box;
import java.awt.Cursor;

public class SplashScreen {

	private JFrame splashScreen;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SplashScreen window = new SplashScreen();
					window.splashScreen.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public SplashScreen() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		splashScreen = new JFrame();
		splashScreen.setForeground(new Color(0, 0, 0));
		splashScreen.setIconImage(Toolkit.getDefaultToolkit().getImage("VijayComputerDatabase\\resources\\logo.png"));
		splashScreen.setTitle("Vijay Computer Academy Database Application");
		splashScreen.setBounds(100, 100, 752, 707);
		splashScreen.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		splashScreen.getContentPane().setLayout(new BorderLayout(0, 0));
		
		JPanel titlePanel = new JPanel();
		titlePanel.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		titlePanel.setBackground(Color.LIGHT_GRAY);
		splashScreen.getContentPane().add(titlePanel, BorderLayout.NORTH);
		titlePanel.setLayout(new MigLayout("", "[14px][][][]", "[grow]"));
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.RED);
		titlePanel.add(panel, "cell 1 0,grow");
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(new ImageIcon("VijayComputerDatabase\\resources\\logo.png").getImage().getScaledInstance(90,90,Image.SCALE_SMOOTH)));
		panel.add(lblNewLabel);
		
		Component horizontalStrut = Box.createHorizontalStrut(20);
		titlePanel.add(horizontalStrut, "cell 2 0");
		
		JLabel lblNewLabel_1 = new JLabel("Vijay Computer Academy");
		lblNewLabel_1.setFont(new Font("Trebuchet MS", Font.BOLD, 24));
		lblNewLabel_1.setForeground(Color.DARK_GRAY);
		titlePanel.add(lblNewLabel_1, "flowy,cell 3 0,alignx center");
		
		JLabel lblNewLabel_2 = new JLabel("Global IT education & training institute since 1990 ");
		lblNewLabel_2.setIconTextGap(0);
		lblNewLabel_2.setCursor(Cursor.getPredefinedCursor(Cursor.CROSSHAIR_CURSOR));
		lblNewLabel_2.setFont(new Font("Tahoma", Font.ITALIC, 11));
		lblNewLabel_2.setForeground(Color.BLACK);
		titlePanel.add(lblNewLabel_2, "cell 3 0,alignx center");
		
		JPanel panel_1 = new JPanel();
		splashScreen.getContentPane().add(panel_1, BorderLayout.CENTER);
		panel_1.setLayout(new BorderLayout(0, 0));
		
		JPanel buttonPanel = new JPanel();
		panel_1.add(buttonPanel, BorderLayout.CENTER);
		buttonPanel.setLayout(new GridLayout(0, 2, 15, 15));
		
		
		//Enrollment Button
		JButton enrollmentButton = new JButton("Student Services");
		enrollmentButton.setPreferredSize(new Dimension(50, 50));
		enrollmentButton.setForeground(new Color(255, 255, 255));
		enrollmentButton.setBackground(new Color(204, 51, 51));
		enrollmentButton.setFont(new Font("Verdana", Font.BOLD, 21));
		enrollmentButton.setBorder(new LineBorder(new Color(0, 0, 0), 3));
		enrollmentButton.setIconTextGap(15);
		enrollmentButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				EnrollmentWindow enroll = new EnrollmentWindow();
				enroll.newScreen();
			}
		});
		enrollmentButton.setIcon(new ImageIcon(new ImageIcon("VijayComputerDatabase\\resources\\student.png").getImage().getScaledInstance(50,50,Image.SCALE_SMOOTH)));
		buttonPanel.add(enrollmentButton);
		
		
		//Calendar Button
		JButton calendarButton = new JButton("Calendar");
		calendarButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CalendarWindow calWin = new CalendarWindow();
				calWin.newScreen();
			}
		});
		calendarButton.setIconTextGap(15);
		calendarButton.setIcon(new ImageIcon(new ImageIcon("VijayComputerDatabase\\resources\\calendar.png").getImage().getScaledInstance(50,50,Image.SCALE_SMOOTH)));
		calendarButton.setForeground(new Color(255, 255, 255));
		calendarButton.setBackground(new Color(204, 51, 51));
		calendarButton.setFont(new Font("Verdana", Font.BOLD, 21));
		calendarButton.setBorder(new LineBorder(new Color(0, 0, 0), 3));
		calendarButton.setPreferredSize(new Dimension(25, 25));
		buttonPanel.add(calendarButton);
		
		
		//Equipment Button
		JButton equipmentButton = new JButton("Equipment");
		equipmentButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				EquipmentWindow equWin = new EquipmentWindow();
				equWin.createWindow();
			}
		});
		equipmentButton.setIcon(new ImageIcon(new ImageIcon("VijayComputerDatabase\\resources\\laptop.png").getImage().getScaledInstance(50,50,Image.SCALE_SMOOTH)));
		equipmentButton.setIconTextGap(15);
		equipmentButton.setForeground(new Color(255, 255, 255));
		equipmentButton.setBackground(new Color(204, 51, 51));
		equipmentButton.setFont(new Font("Verdana", Font.BOLD, 21));
		equipmentButton.setBorder(new LineBorder(new Color(0, 0, 0), 3));
		equipmentButton.setPreferredSize(new Dimension(25, 25));
		buttonPanel.add(equipmentButton);
		
		
		//Room Reserve Button
		JButton financeButton = new JButton("Room Reservation");
		financeButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				RoomRentalWindow fin = new RoomRentalWindow();
				fin.newWindow();
			}
		});
		financeButton.setIcon(new ImageIcon(new ImageIcon("VijayComputerDatabase\\resources\\classroom.png").getImage().getScaledInstance(50,50,Image.SCALE_SMOOTH)));
		financeButton.setIconTextGap(15);
		financeButton.setForeground(new Color(255, 255, 255));
		financeButton.setBackground(new Color(204, 51, 51));
		financeButton.setFont(new Font("Verdana", Font.BOLD, 21));
		financeButton.setBorder(new LineBorder(new Color(0, 0, 0), 3));
		financeButton.setPreferredSize(new Dimension(25, 25));
		buttonPanel.add(financeButton);
		
		//Directory Button
		JButton directoryButton = new JButton("Directory");
		directoryButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DirectoryWindow dir = new DirectoryWindow();
				dir.createWindow();
			}
		});
		directoryButton.setIcon(new ImageIcon(new ImageIcon("VijayComputerDatabase\\resources\\book.png").getImage().getScaledInstance(50,50,Image.SCALE_SMOOTH)));
		directoryButton.setIconTextGap(15);
		directoryButton.setForeground(new Color(255, 255, 255));
		directoryButton.setBackground(new Color(204, 51, 51));
		directoryButton.setFont(new Font("Verdana", Font.BOLD, 21));
		directoryButton.setBorder(new LineBorder(new Color(0, 0, 0), 3));
		directoryButton.setPreferredSize(new Dimension(25, 25));
		buttonPanel.add(directoryButton);
		
		//Employee Services
		JButton employeeSButton = new JButton("Employee Services");
		employeeSButton.setIcon(new ImageIcon(new ImageIcon("VijayComputerDatabase\\resources\\employee.png").getImage().getScaledInstance(50,50,Image.SCALE_SMOOTH)));
		employeeSButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				EmployeeServicesWindow esw = new EmployeeServicesWindow();
				esw.createWindow();
			}
		});
		employeeSButton.setIconTextGap(15);
		employeeSButton.setForeground(new Color(255, 255, 255));
		employeeSButton.setBackground(new Color(204, 51, 51));
		employeeSButton.setFont(new Font("Verdana", Font.BOLD, 18));
		employeeSButton.setBorder(new LineBorder(new Color(0, 0, 0), 3));
		buttonPanel.add(employeeSButton);
		
		JPanel panel_4 = new JPanel();
		FlowLayout flowLayout_1 = (FlowLayout) panel_4.getLayout();
		flowLayout_1.setVgap(10);
		flowLayout_1.setHgap(10);
		panel_1.add(panel_4, BorderLayout.NORTH);
		
		JPanel panel_5 = new JPanel();
		FlowLayout flowLayout_4 = (FlowLayout) panel_5.getLayout();
		flowLayout_4.setVgap(10);
		panel_1.add(panel_5, BorderLayout.SOUTH);
		
		JPanel panel_6 = new JPanel();
		FlowLayout flowLayout_2 = (FlowLayout) panel_6.getLayout();
		flowLayout_2.setHgap(25);
		panel_1.add(panel_6, BorderLayout.WEST);
		
		JPanel panel_7 = new JPanel();
		FlowLayout flowLayout_3 = (FlowLayout) panel_7.getLayout();
		flowLayout_3.setHgap(25);
		panel_1.add(panel_7, BorderLayout.EAST);
		
		
		//Menu Bar
		JMenuBar menuBar = new JMenuBar();
		splashScreen.setJMenuBar(menuBar);
		
		JMenu mnNewMenu = new JMenu("File");
		menuBar.add(mnNewMenu);
		
		JMenuItem exitNM = new JMenuItem("Exit");
		exitNM.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		
		JMenuItem signOutNM = new JMenuItem("Sign Out");
		signOutNM.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				splashScreen.dispose();
				MainScreen login = new MainScreen();
				login.newWindow();
				
			}
		});
		mnNewMenu.add(signOutNM);
		mnNewMenu.add(exitNM);
		
		JMenu mnNewMenu_1 = new JMenu("Help");
		menuBar.add(mnNewMenu_1);
		
		JMenuItem helpNM = new JMenuItem("Contact Red Cougar Data");
		helpNM.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				helpTicket help = new helpTicket();
				helpTicket.newScreen();
			}
		});
		mnNewMenu_1.add(helpNM);
		
	}

}

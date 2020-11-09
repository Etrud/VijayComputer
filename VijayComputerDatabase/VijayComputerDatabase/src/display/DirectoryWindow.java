package display;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.BorderLayout;
import javax.swing.JPanel;
import net.miginfocom.swing.MigLayout;
import java.awt.Toolkit;
import javax.swing.JLabel;
import javax.swing.JCheckBox;
import javax.swing.border.LineBorder;
import java.awt.Color;
import java.awt.Component;
import javax.swing.Box;
import javax.swing.JTable;
import javax.swing.JScrollPane;

public class DirectoryWindow {

	private JFrame frmVijayComputerDirectory;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void createWindow() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DirectoryWindow window = new DirectoryWindow();
					window.frmVijayComputerDirectory.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public DirectoryWindow() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmVijayComputerDirectory = new JFrame();
		frmVijayComputerDirectory.setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\bshaffer\\git\\VijayComputerDatabase\\VijayComputerDatabase\\resources\\communicate.png"));
		frmVijayComputerDirectory.setTitle("VCA - Directory");
		frmVijayComputerDirectory.setBounds(100, 100, 450, 300);
		frmVijayComputerDirectory.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		
		JMenuBar menuBar = new JMenuBar();
		frmVijayComputerDirectory.setJMenuBar(menuBar);
		
		JMenu mnNewMenu = new JMenu("File");
		menuBar.add(mnNewMenu);
		
		JMenuItem mntmNewMenuItem = new JMenuItem("Exit");
		mntmNewMenuItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		
		JMenuItem mntmNewMenuItem_3 = new JMenuItem("Print");
		mnNewMenu.add(mntmNewMenuItem_3);
		mnNewMenu.add(mntmNewMenuItem);
		
		JMenu mnNewMenu_1 = new JMenu("Edit");
		menuBar.add(mnNewMenu_1);
		
		JMenuItem mntmNewBusinessContact = new JMenuItem("New Business Contact");
		mntmNewBusinessContact.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				createBusinessContact contact = new createBusinessContact();
				contact.createWindow();
			}
		});
		mnNewMenu_1.add(mntmNewBusinessContact);
		
		JMenuItem mntmNewMenuItem_2 = new JMenuItem("Edit Business Contacts");
		mnNewMenu_1.add(mntmNewMenuItem_2);
		
		JMenu mnNewMenu_2 = new JMenu("View");
		menuBar.add(mnNewMenu_2);
		
		JMenuItem mntmNewMenuItem_1 = new JMenuItem("New menu item");
		mnNewMenu_2.add(mntmNewMenuItem_1);
		frmVijayComputerDirectory.getContentPane().setLayout(new BorderLayout(0, 0));
		
		JPanel panel = new JPanel();
		panel.setBorder(new LineBorder(new Color(0, 0, 0)));
		frmVijayComputerDirectory.getContentPane().add(panel, BorderLayout.CENTER);
		
		JScrollPane scrollPane = new JScrollPane();
		panel.add(scrollPane);
		
		table = new JTable();
		scrollPane.setViewportView(table);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(230, 230, 250));
		frmVijayComputerDirectory.getContentPane().add(panel_1, BorderLayout.NORTH);
		
		Component verticalStrut_1 = Box.createVerticalStrut(10);
		panel_1.add(verticalStrut_1);
		
		JPanel panel_4 = new JPanel();
		panel_4.setBackground(new Color(230, 230, 250));
		frmVijayComputerDirectory.getContentPane().add(panel_4, BorderLayout.EAST);
		
		Component horizontalStrut = Box.createHorizontalStrut(10);
		panel_4.add(horizontalStrut);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBackground(new Color(230, 230, 250));
		frmVijayComputerDirectory.getContentPane().add(panel_3, BorderLayout.WEST);
		panel_3.setLayout(new MigLayout("", "[grow]", "[][grow]"));
		
		JLabel lblNewLabel = new JLabel("Directory Selects:");
		panel_3.add(lblNewLabel, "cell 0 0,alignx center,aligny center");
		
		JPanel panel_5 = new JPanel();
		panel_5.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_3.add(panel_5, "cell 0 1,aligny top");
		panel_5.setLayout(new MigLayout("", "[]", "[][][]"));
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("Students");
		panel_5.add(chckbxNewCheckBox, "cell 0 0");
		
		JCheckBox chckbxNewCheckBox_1 = new JCheckBox("Employees");
		panel_5.add(chckbxNewCheckBox_1, "cell 0 1");
		
		JCheckBox chckbxNewCheckBox_2 = new JCheckBox("Business Contacts");
		panel_5.add(chckbxNewCheckBox_2, "cell 0 2");
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(new Color(230, 230, 250));
		frmVijayComputerDirectory.getContentPane().add(panel_2, BorderLayout.SOUTH);
		
		Component verticalStrut = Box.createVerticalStrut(10);
		panel_2.add(verticalStrut);
	}

}

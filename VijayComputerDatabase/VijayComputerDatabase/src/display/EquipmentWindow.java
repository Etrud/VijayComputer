package display;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.BorderLayout;
import java.awt.Toolkit;
import javax.swing.JPanel;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;

import net.miginfocom.swing.MigLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import java.awt.Color;
import javax.swing.border.LineBorder;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.awt.event.ActionEvent;
import javax.swing.JTable;
import javax.swing.JScrollPane;
import javax.swing.table.DefaultTableModel;
import java.awt.Component;
import javax.swing.Box;

public class EquipmentWindow {

	private JFrame frmEquipmentMenu;
	private JTable equipTable;

	/**
	 * Launch the application.
	 */
	public static void createWindow() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					EquipmentWindow window = new EquipmentWindow();
					window.frmEquipmentMenu.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public EquipmentWindow() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmEquipmentMenu = new JFrame();
		frmEquipmentMenu.setIconImage(Toolkit.getDefaultToolkit().getImage("VijayComputerDatabase\\resources\\laptop.png"));
		frmEquipmentMenu.setTitle("VCA - Equipment");
		frmEquipmentMenu.setBounds(100, 100, 829, 443);
		frmEquipmentMenu.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frmEquipmentMenu.getContentPane().setLayout(new BorderLayout(0, 0));
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(153, 204, 204));
		frmEquipmentMenu.getContentPane().add(panel, BorderLayout.NORTH);
		panel.setLayout(new MigLayout("", "[147px,grow][30px,grow]", "[22px]"));
		
		JLabel lblNewLabel = new JLabel("Display Equipment with status:");
		panel.add(lblNewLabel, "cell 0 0,alignx right");
		
		JPanel panel_6 = new JPanel();
		panel_6.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel.add(panel_6, "cell 1 0");
		panel_6.setLayout(new MigLayout("", "[30px][47px]", "[23px]"));
		
		JComboBox statusComboBox = new JComboBox();
		panel_6.add(statusComboBox, "cell 0 0,alignx left,aligny top");
		
		JButton btnNewButton_2 = new JButton("OK");
		panel_6.add(btnNewButton_2, "cell 1 0,alignx left,aligny top");
		
	    try{
	    	Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
	    	Connection conn = DriverManager.getConnection("jdbc:sqlserver://COT-CIS3365-03\\VIJAYCOMPUTER","sa","Cougarnet2020!");
	        String sql = "SELECT EqpStatus FROM EquipmentStatus";
	        PreparedStatement pst = conn.prepareStatement(sql);
	        ResultSet rs = pst.executeQuery();

	        while(rs.next()){
	         String s = rs.getString(1);
	         statusComboBox.addItem(s);

	        }

	        pst.close();
	        rs.close();
	        conn.close();

	    }catch (Exception e){
	        JOptionPane.showMessageDialog(null, e);
	    }
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(153, 204, 204));
		frmEquipmentMenu.getContentPane().add(panel_1, BorderLayout.WEST);
		panel_1.setLayout(new MigLayout("", "[grow]", "[][grow][][][grow][][][]"));
		
		JLabel lblNewLabel_1 = new JLabel("Equipment Checkout System");
		panel_1.add(lblNewLabel_1, "cell 0 0,alignx center,aligny center");
		
		JPanel panel_5 = new JPanel();
		panel_5.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_1.add(panel_5, "cell 0 1,alignx center");
		panel_5.setLayout(new MigLayout("", "[]", "[][][]"));
		
		JButton newCheckoutButton = new JButton("Checkout Equipment");
		panel_5.add(newCheckoutButton, "cell 0 0,alignx center,aligny center");
		
		JButton btnNewButton = new JButton("Return Equipment");
		panel_5.add(btnNewButton, "cell 0 1,alignx center,aligny center");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				NewReturnCheckout ret = new NewReturnCheckout();
				ret.newWindow();
			}
		});
		newCheckoutButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				NewEquipmentCheckout eqcheck = new NewEquipmentCheckout();
				eqcheck.createWindow();
			}
		});
		
		JLabel lblNewLabel_1_1 = new JLabel("Software Management");
		panel_1.add(lblNewLabel_1_1, "cell 0 3,alignx center,aligny center");
		
		JPanel panel_5_1 = new JPanel();
		panel_5_1.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_1.add(panel_5_1, "cell 0 4,alignx center");
		panel_5_1.setLayout(new MigLayout("", "[77px,grow]", "[23px]"));
		
		JButton btnNewButton_1 = new JButton("Software");
		panel_5_1.add(btnNewButton_1, "cell 0 0,alignx center,aligny center");
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(new Color(153, 204, 204));
		frmEquipmentMenu.getContentPane().add(panel_2, BorderLayout.SOUTH);
		
		Component verticalStrut = Box.createVerticalStrut(5);
		panel_2.add(verticalStrut);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBackground(new Color(153, 204, 204));
		frmEquipmentMenu.getContentPane().add(panel_3, BorderLayout.EAST);
		
		Component horizontalStrut = Box.createHorizontalStrut(5);
		panel_3.add(horizontalStrut);
		
		JPanel panel_4 = new JPanel();
		panel_4.setBorder(new LineBorder(new Color(0, 0, 0)));
		frmEquipmentMenu.getContentPane().add(panel_4, BorderLayout.CENTER);
		panel_4.setLayout(new BorderLayout(0, 0));
		
		JScrollPane scrollPane = new JScrollPane();
		panel_4.add(scrollPane);
		
		equipTable = new JTable();
		equipTable.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"Equipment Status", "Serial Number", "Equipment Type", "Checkout Date", "Check-in Date"
			}
		));
		equipTable.getColumnModel().getColumn(0).setPreferredWidth(98);
		equipTable.getColumnModel().getColumn(1).setPreferredWidth(80);
		equipTable.getColumnModel().getColumn(2).setPreferredWidth(88);
		equipTable.getColumnModel().getColumn(3).setPreferredWidth(86);
		equipTable.getColumnModel().getColumn(4).setPreferredWidth(85);
		scrollPane.setViewportView(equipTable);
		
		JMenuBar menuBar = new JMenuBar();
		frmEquipmentMenu.setJMenuBar(menuBar);
		
		JMenu mnNewMenu = new JMenu("File");
		menuBar.add(mnNewMenu);
		
		JMenuItem mntmNewMenuItem = new JMenuItem("Print");
		mnNewMenu.add(mntmNewMenuItem);
		
		JMenuItem mntmNewMenuItem_1 = new JMenuItem("Exit");
		mnNewMenu.add(mntmNewMenuItem_1);
		
		JMenu mnNewMenu_1 = new JMenu("Edit");
		menuBar.add(mnNewMenu_1);
		
		JMenuItem mntmNewMenuItem_2 = new JMenuItem("Edit Equipment");
		mnNewMenu_1.add(mntmNewMenuItem_2);
	}

}

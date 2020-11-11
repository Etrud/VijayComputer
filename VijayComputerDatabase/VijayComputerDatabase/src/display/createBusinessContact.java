package display;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.BorderLayout;
import javax.swing.JPanel;
import net.miginfocom.swing.MigLayout;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Toolkit;
import java.awt.Component;
import javax.swing.Box;
import javax.swing.border.LineBorder;
import java.awt.Color;

public class createBusinessContact {

	private JFrame frmVcaCreate;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;
	private JTextField textField_9;
	private JTextField textField_10;
	private JTextField textField_11;

	/**
	 * Launch the application.
	 */
	public static void createWindow() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					createBusinessContact window = new createBusinessContact();
					window.frmVcaCreate.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public createBusinessContact() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmVcaCreate = new JFrame();
		frmVcaCreate.setTitle("VCA - Create Business Contact");
		frmVcaCreate.setIconImage(Toolkit.getDefaultToolkit().getImage("VijayComputerDatabase\\VijayComputerDatabase\\resources\\book.png"));
		frmVcaCreate.setBounds(100, 100, 644, 575);
		frmVcaCreate.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frmVcaCreate.getContentPane().setLayout(new BorderLayout(0, 0));
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(135, 206, 235));
		frmVcaCreate.getContentPane().add(panel, BorderLayout.WEST);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(135, 206, 235));
		frmVcaCreate.getContentPane().add(panel_1, BorderLayout.NORTH);
		
		JButton btnNewButton_1 = new JButton("Create Business Contact");
		panel_1.add(btnNewButton_1);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(new Color(135, 206, 235));
		frmVcaCreate.getContentPane().add(panel_2, BorderLayout.EAST);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBackground(new Color(135, 206, 235));
		frmVcaCreate.getContentPane().add(panel_3, BorderLayout.SOUTH);
		
		JButton btnNewButton = new JButton("Create Business Contact");
		panel_3.add(btnNewButton);
		
		JPanel panel_4 = new JPanel();
		panel_4.setBorder(new LineBorder(new Color(0, 0, 0)));
		frmVcaCreate.getContentPane().add(panel_4, BorderLayout.CENTER);
		panel_4.setLayout(new MigLayout("", "[grow,center][grow]", "[][][][][][][][][][][][][][][][][][][]"));
		
		Component verticalStrut = Box.createVerticalStrut(20);
		panel_4.add(verticalStrut, "cell 1 0");
		
		JLabel lblNewLabel = new JLabel("Contact ID:");
		panel_4.add(lblNewLabel, "cell 0 1,alignx trailing");
		
		textField_10 = new JTextField();
		panel_4.add(textField_10, "cell 1 1,alignx leading,aligny center");
		textField_10.setColumns(7);
		
		JLabel lblNewLabel_1 = new JLabel("Business Name:");
		panel_4.add(lblNewLabel_1, "cell 0 2,alignx trailing");
		
		textField_11 = new JTextField();
		panel_4.add(textField_11, "cell 1 2,alignx leading");
		textField_11.setColumns(50);
		
		JLabel lblNewLabel_2 = new JLabel("Title:");
		panel_4.add(lblNewLabel_2, "cell 0 3,alignx trailing");
		
		JComboBox titleComboBox = new JComboBox();
		panel_4.add(titleComboBox, "cell 1 3,alignx left");
		
		JLabel lblNewLabel_3 = new JLabel("Department:");
		panel_4.add(lblNewLabel_3, "cell 0 4,alignx trailing");
		
		JComboBox departmentComboBox = new JComboBox();
		panel_4.add(departmentComboBox, "cell 1 4,alignx left");
		
		JLabel lblNewLabel_4 = new JLabel("First Name:");
		panel_4.add(lblNewLabel_4, "cell 0 5,alignx trailing");
		
		textField = new JTextField();
		panel_4.add(textField, "cell 1 5,alignx left");
		textField.setColumns(25);
		
		JLabel lblNewLabel_5 = new JLabel("Last Name:");
		panel_4.add(lblNewLabel_5, "cell 0 6,alignx trailing");
		
		textField_1 = new JTextField();
		panel_4.add(textField_1, "cell 1 6,alignx left");
		textField_1.setColumns(25);
		
		JLabel lblNewLabel_6 = new JLabel("Middle Initial:");
		panel_4.add(lblNewLabel_6, "cell 0 7,alignx trailing");
		
		textField_2 = new JTextField();
		panel_4.add(textField_2, "cell 1 7,alignx left");
		textField_2.setColumns(1);
		
		JLabel lblNewLabel_7 = new JLabel("Email:");
		panel_4.add(lblNewLabel_7, "cell 0 8,alignx trailing");
		
		textField_5 = new JTextField();
		panel_4.add(textField_5, "cell 1 8,alignx left");
		textField_5.setColumns(50);
		
		JLabel lblNewLabel_8 = new JLabel("Phone Number:");
		panel_4.add(lblNewLabel_8, "cell 0 9,alignx trailing");
		
		textField_3 = new JTextField();
		panel_4.add(textField_3, "cell 1 9,alignx left");
		textField_3.setColumns(10);
		
		JLabel lblNewLabel_9 = new JLabel("Address Number:");
		panel_4.add(lblNewLabel_9, "cell 0 10,alignx trailing");
		
		textField_4 = new JTextField();
		panel_4.add(textField_4, "cell 1 10,alignx left");
		textField_4.setColumns(8);
		
		JLabel lblNewLabel_10 = new JLabel("Address Street:");
		panel_4.add(lblNewLabel_10, "cell 0 11,alignx trailing");
		
		textField_6 = new JTextField();
		panel_4.add(textField_6, "cell 1 11,alignx left");
		textField_6.setColumns(50);
		
		JLabel lblNewLabel_11 = new JLabel("Address Line 2:");
		panel_4.add(lblNewLabel_11, "cell 0 12,alignx trailing");
		
		textField_7 = new JTextField();
		panel_4.add(textField_7, "cell 1 12,alignx left");
		textField_7.setColumns(50);
		
		JLabel lblNewLabel_12 = new JLabel("Postal Code:");
		panel_4.add(lblNewLabel_12, "cell 0 13,alignx trailing");
		
		textField_8 = new JTextField();
		panel_4.add(textField_8, "cell 1 13,alignx left");
		textField_8.setColumns(8);
		
		JLabel lblNewLabel_13 = new JLabel("City:");
		panel_4.add(lblNewLabel_13, "cell 0 14,alignx trailing");
		
		textField_9 = new JTextField();
		panel_4.add(textField_9, "cell 1 14,alignx left");
		textField_9.setColumns(50);
		
		JLabel lblNewLabel_14 = new JLabel("Country:");
		panel_4.add(lblNewLabel_14, "cell 0 15,alignx trailing");
		
		JComboBox countryComboBox = new JComboBox();
		panel_4.add(countryComboBox, "cell 1 15,alignx left");
		
		JLabel lblNewLabel_15 = new JLabel("State / Providence:");
		panel_4.add(lblNewLabel_15, "cell 0 16,alignx trailing");
		
		JComboBox stateProvComboBox = new JComboBox();
		panel_4.add(stateProvComboBox, "cell 1 16,alignx left");
		
		JLabel lblNewLabel_16 = new JLabel("Status:");
		panel_4.add(lblNewLabel_16, "cell 0 17,alignx trailing,aligny center");
		
		JComboBox busStatusComboBox = new JComboBox();
		panel_4.add(busStatusComboBox, "cell 1 17,alignx left");
	}

}

package display;

import java.awt.EventQueue;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.swing.JFrame;
import net.miginfocom.swing.MigLayout;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import java.awt.BorderLayout;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JFormattedTextField;
import java.awt.Component;
import javax.swing.Box;
import javax.swing.SwingConstants;
import javax.swing.border.LineBorder;
import java.awt.Color;

public class CreateClass {

	private JFrame frmCreateClass;
	private JFormattedTextField textField;
	private JLabel textField_5;
	private JTextField textField_6;
	private JTextField textField_8;
	private JTextField textField_9;
	private JTextField textField_7;
	private JTextField textField_10;
	private JTextField textField_11;
	private JTextField textField_13;
	private JTextField textField_14;
	private JTextField textField_15;
	private JTextField textField_16;

	/**
	 * Launch the application.
	 */
	public static void newWindow() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CreateClass window = new CreateClass();
					window.frmCreateClass.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public CreateClass() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmCreateClass = new JFrame();
		frmCreateClass.setTitle("Create Class");
		frmCreateClass.setBounds(100, 100, 668, 587);
		frmCreateClass.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmCreateClass.getContentPane().setLayout(new BorderLayout(0, 0));
		
		JPanel panel = new JPanel();
		panel.setBorder(new LineBorder(new Color(0, 0, 0)));
		frmCreateClass.getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLayout(new MigLayout("", "[][grow]", "[][][][grow][][][][][][][][][][][][][][][]"));
		
		JLabel lblNewLabel = new JLabel("Class ID:");
		panel.add(lblNewLabel, "cell 0 0,alignx trailing,aligny center");
		
		textField = new JFormattedTextField();
		textField.setAlignmentY(Component.TOP_ALIGNMENT);
		textField.setAlignmentX(Component.LEFT_ALIGNMENT);
		panel.add(textField, "cell 1 0,alignx left");
		textField.setColumns(8);
		
		
		//Employee Assigned Combo Box
		JLabel lblNewLabel_1 = new JLabel("Employee Assigned:");
		panel.add(lblNewLabel_1, "cell 0 1,alignx trailing");
		JComboBox employeeComboBox = new JComboBox();
		panel.add(employeeComboBox, "cell 1 1,alignx left");
		try{
	    	Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
	    	Connection conn = DriverManager.getConnection("jdbc:sqlserver://COT-CIS3365-03\\VIJAYCOMPUTER;databaseName=ProductionDB","sa","Cougarnet2020!");
	        String sql = "SELECT Employee.FirstName+ Employee.LastName FROM Employee";
	        PreparedStatement pst = conn.prepareStatement(sql);
	        ResultSet rs = pst.executeQuery();
	        while(rs.next()){
	         String s = rs.getString(1);
	         employeeComboBox.addItem(s);
	        }
	        pst.close();
	        rs.close();
	        conn.close();
	    }catch (Exception e){
	        JOptionPane.showMessageDialog(null, e);
	    }
		
		//Class Type Combo Box
		JLabel lblNewLabel_2 = new JLabel("Class Type:");
		panel.add(lblNewLabel_2, "cell 0 2,alignx trailing");
		JComboBox classTypeComboBox = new JComboBox();
		panel.add(classTypeComboBox, "cell 1 2,alignx left");
		try{
	    	Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
	    	Connection conn = DriverManager.getConnection("jdbc:sqlserver://COT-CIS3365-03\\VIJAYCOMPUTER;databaseName=ProductionDB","sa","Cougarnet2020!");
	        String sql = "SELECT GenderName FROM Gender";
	        PreparedStatement pst = conn.prepareStatement(sql);
	        ResultSet rs = pst.executeQuery();

	        while(rs.next()){
	         String s = rs.getString(1);
	         classTypeComboBox.addItem(s);

	        }

	        pst.close();
	        rs.close();
	        conn.close();

	    }catch (Exception e){
	        JOptionPane.showMessageDialog(null, e);
	    }
		
		
		
		
		JLabel lblNewLabel_3 = new JLabel("Course Name:");
		panel.add(lblNewLabel_3, "cell 0 3,alignx trailing");
		
		JComboBox courseNameComboBox = new JComboBox();
		panel.add(courseNameComboBox, "cell 1 3,alignx left");
		
		JLabel lblNewLabel_4 = new JLabel("Hardware Select:");
		panel.add(lblNewLabel_4, "cell 0 4,alignx trailing");
		
		JComboBox hardwareComboBox = new JComboBox();
		panel.add(hardwareComboBox, "cell 1 4,alignx left");
		
		JLabel lblNewLabel_5 = new JLabel("Mobile Phone:");
		panel.add(lblNewLabel_5, "cell 0 5,alignx trailing");
		
		textField_16 = new JTextField();
		textField_16.setColumns(11);
		panel.add(textField_16, "cell 1 5,alignx left");
		
		JLabel lblNewLabel_6 = new JLabel("Email:");
		panel.add(lblNewLabel_6, "cell 0 6,alignx trailing");
		
		textField_6 = new JTextField();
		textField_6.setColumns(35);
		panel.add(textField_6, "cell 1 6,alignx left");
		
		JLabel lblNewLabel_7 = new JLabel("Gender");
		panel.add(lblNewLabel_7, "cell 0 7,alignx trailing");
		
		JComboBox genderComboBox = new JComboBox();
		panel.add(genderComboBox, "cell 1 7,alignx left");
		
		JLabel lblNewLabel_8 = new JLabel("Date of Birth:");
		panel.add(lblNewLabel_8, "cell 0 8,alignx trailing,aligny baseline");
		
		textField_8 = new JTextField();
		textField_8.setColumns(10);
		panel.add(textField_8, "cell 1 8,alignx left");
		
		JLabel lblNewLabel_9 = new JLabel("Address Num:");
		panel.add(lblNewLabel_9, "cell 0 9,alignx trailing");
		
		textField_9 = new JTextField();
		textField_9.setColumns(10);
		panel.add(textField_9, "cell 1 9,alignx left");
		
		JLabel lblNewLabel_9_1 = new JLabel("Address Street:");
		panel.add(lblNewLabel_9_1, "cell 0 10,alignx trailing");
		
		textField_7 = new JTextField();
		textField_7.setColumns(30);
		panel.add(textField_7, "cell 1 10,alignx left");
		
		JLabel lblNewLabel_9_2 = new JLabel("Postal Code:");
		panel.add(lblNewLabel_9_2, "cell 0 11,alignx trailing");
		
		textField_10 = new JTextField();
		textField_10.setColumns(8);
		panel.add(textField_10, "cell 1 11,alignx left");
		
		JLabel lblNewLabel_9_2_1 = new JLabel("City:");
		panel.add(lblNewLabel_9_2_1, "cell 0 12,alignx trailing");
		
		textField_11 = new JTextField();
		textField_11.setColumns(30);
		panel.add(textField_11, "cell 1 12,alignx left");
		
		JLabel lblNewLabel_9_2_2 = new JLabel("Country:");
		panel.add(lblNewLabel_9_2_2, "cell 0 13,alignx trailing");
		
		JComboBox countryComboBox = new JComboBox();
		panel.add(countryComboBox, "cell 1 13,alignx left");
		
		JLabel lblNewLabel_10 = new JLabel("State / Providence:");
		panel.add(lblNewLabel_10, "cell 0 14,alignx trailing,aligny center");
		
		JComboBox stateProvComboBox = new JComboBox();
		panel.add(stateProvComboBox, "cell 1 14,alignx left");
		
		JLabel lblNewLabel_10_1 = new JLabel("Facebook:");
		panel.add(lblNewLabel_10_1, "cell 0 15,alignx trailing");
		
		textField_13 = new JTextField();
		textField_13.setColumns(30);
		panel.add(textField_13, "cell 1 15,alignx left");
		
		JLabel lblNewLabel_10_2 = new JLabel("Instagram Handle:");
		panel.add(lblNewLabel_10_2, "cell 0 16,alignx trailing");
		
		textField_14 = new JTextField();
		textField_14.setColumns(20);
		panel.add(textField_14, "cell 1 16,alignx left");
		
		JLabel lblNewLabel_10_3 = new JLabel("Twitter Handle:");
		panel.add(lblNewLabel_10_3, "cell 0 17,alignx trailing");
		
		textField_15 = new JTextField();
		textField_15.setColumns(20);
		panel.add(textField_15, "cell 1 17,alignx left");
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(173, 216, 230));
		frmCreateClass.getContentPane().add(panel_1, BorderLayout.NORTH);
		
		Component verticalStrut_1 = Box.createVerticalStrut(20);
		panel_1.add(verticalStrut_1);
		
		JButton btnNewButton = new JButton("Create");
		panel_1.add(btnNewButton);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(new Color(173, 216, 230));
		frmCreateClass.getContentPane().add(panel_2, BorderLayout.SOUTH);
		
		Component verticalStrut = Box.createVerticalStrut(20);
		panel_2.add(verticalStrut);
		
		JButton btnNewButton_1 = new JButton("Create");
		panel_2.add(btnNewButton_1);
		
		textField_5 = new JLabel();
		textField_5.setHorizontalAlignment(SwingConstants.CENTER);
		frmCreateClass.getContentPane().add(textField_5, BorderLayout.WEST);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBackground(new Color(173, 216, 230));
		frmCreateClass.getContentPane().add(panel_3, BorderLayout.WEST);
		
		Component horizontalStrut_1 = Box.createHorizontalStrut(10);
		panel_3.add(horizontalStrut_1);
		
		JPanel panel_4 = new JPanel();
		panel_4.setBackground(new Color(173, 216, 230));
		frmCreateClass.getContentPane().add(panel_4, BorderLayout.EAST);
		
		Component horizontalStrut = Box.createHorizontalStrut(10);
		panel_4.add(horizontalStrut);
	}

}

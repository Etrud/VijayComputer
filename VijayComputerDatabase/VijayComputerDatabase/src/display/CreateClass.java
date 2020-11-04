package display;

import java.awt.EventQueue;

import javax.swing.JFrame;
import net.miginfocom.swing.MigLayout;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.BorderLayout;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JFormattedTextField;
import java.awt.Component;
import javax.swing.Box;

public class CreateClass {

	private JFrame frmCreateClass;
	private JFormattedTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
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
	public static void main(String[] args) {
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
		frmCreateClass.setBounds(100, 100, 668, 569);
		frmCreateClass.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmCreateClass.getContentPane().setLayout(new BorderLayout(0, 0));
		
		JPanel panel = new JPanel();
		frmCreateClass.getContentPane().add(panel, BorderLayout.WEST);
		panel.setLayout(new MigLayout("", "[][grow][grow]", "[][][][grow][][][][][][][][][][][][][][][]"));
		
		JLabel lblNewLabel = new JLabel("Class ID:");
		panel.add(lblNewLabel, "cell 0 0,alignx trailing,aligny center");
		
		textField = new JFormattedTextField();
		textField.setAlignmentY(Component.TOP_ALIGNMENT);
		textField.setAlignmentX(Component.LEFT_ALIGNMENT);
		panel.add(textField, "cell 1 0,alignx left");
		textField.setColumns(8);
		
		JLabel lblNewLabel_1 = new JLabel("Employee ID:");
		panel.add(lblNewLabel_1, "cell 0 1,alignx trailing");
		
		textField_1 = new JTextField();
		panel.add(textField_1, "cell 1 1,alignx left");
		textField_1.setColumns(30);
		
		JLabel lblNewLabel_2 = new JLabel("Class Type:");
		panel.add(lblNewLabel_2, "cell 0 2,alignx trailing");
		
		textField_2 = new JTextField();
		panel.add(textField_2, "cell 1 2,alignx left");
		textField_2.setColumns(30);
		
		JLabel lblNewLabel_3 = new JLabel("Course ID:");
		panel.add(lblNewLabel_3, "cell 0 3,alignx trailing");
		
		textField_3 = new JTextField();
		textField_3.setColumns(1);
		panel.add(textField_3, "cell 1 3,alignx left");
		
		JLabel lblNewLabel_4 = new JLabel("Hardware ID");
		panel.add(lblNewLabel_4, "cell 0 4,alignx trailing");
		
		textField_4 = new JTextField();
		textField_4.setColumns(11);
		panel.add(textField_4, "cell 1 4,alignx left");
		
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
		
		JComboBox comboBox = new JComboBox();
		panel.add(comboBox, "cell 1 7,alignx left");
		
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
		
		JComboBox comboBox_1_1 = new JComboBox();
		panel.add(comboBox_1_1, "cell 1 13,alignx left");
		
		JLabel lblNewLabel_10 = new JLabel("State / Providence:");
		panel.add(lblNewLabel_10, "cell 0 14,alignx trailing,aligny center");
		
		JComboBox comboBox_1 = new JComboBox();
		panel.add(comboBox_1, "cell 1 14,alignx left");
		
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
		frmCreateClass.getContentPane().add(panel_1, BorderLayout.SOUTH);
		
		JButton btnNewButton = new JButton("Create");
		panel_1.add(btnNewButton);
		
		JPanel panel_2 = new JPanel();
		frmCreateClass.getContentPane().add(panel_2, BorderLayout.NORTH);
		
		JButton btnNewButton_1 = new JButton("Create");
		panel_2.add(btnNewButton_1);
		
		textField_5 = new JLabel();
		frmCreateClass.getContentPane().add(textField_5, BorderLayout.CENTER);
		
		Component horizontalStrut = Box.createHorizontalStrut(20);
		frmCreateClass.getContentPane().add(horizontalStrut, BorderLayout.EAST);
	}

}

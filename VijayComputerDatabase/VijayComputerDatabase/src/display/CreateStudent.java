package display;

import java.awt.EventQueue;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Properties;

import javax.swing.JFrame;
import net.miginfocom.swing.MigLayout;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.BorderLayout;
import javax.swing.JPanel;
import javax.swing.JTextField;

import org.jdatepicker.*;
import org.jdatepicker.impl.JDatePanelImpl;
import org.jdatepicker.impl.JDatePickerImpl;
import org.jdatepicker.impl.UtilDateModel;

import java.util.Calendar;
import java.util.Date;

import javax.swing.JComboBox;
import javax.swing.JFormattedTextField;
import javax.swing.JFormattedTextField.AbstractFormatter;

import java.awt.Component;
import javax.swing.Box;
import javax.swing.SpringLayout;
import javax.swing.text.MaskFormatter;

import java.awt.FlowLayout;
import java.awt.Image;
import java.awt.Dimension;
import java.awt.Toolkit;
import javax.swing.ImageIcon;

public class CreateStudent {

	private JFrame frmCreateStudent;
	private JFormattedTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JLabel textField_5;
	private JTextField textField_6;
	private JDatePickerImpl dateField;
	private JTextField textField_9;
	private JTextField textField_7;
	private JTextField textField_10;
	private JTextField textField_11;
	private JTextField textField_13;
	private JTextField textField_14;
	private JTextField textField_15;
	private JTextField textField_16;
	private JTextField textField_8;

	/**
	 * Launch the application.
	 */
	public static void createStud() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CreateStudent window = new CreateStudent();
					window.frmCreateStudent.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public CreateStudent() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmCreateStudent = new JFrame();
		frmCreateStudent.setIconImage(Toolkit.getDefaultToolkit().getImage("VijayComputerDatabase\\resources\\user.png"));
		frmCreateStudent.setTitle("Create Student");
		frmCreateStudent.setBounds(100, 100, 695, 660);
		frmCreateStudent.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frmCreateStudent.getContentPane().setLayout(new BorderLayout(0, 0));
		JPanel panel = new JPanel();
		frmCreateStudent.getContentPane().add(panel, BorderLayout.WEST);
		panel.setLayout(new MigLayout("", "[][][][grow][grow]", "[][][][][][grow][][][][][grow][][][][][][][][][][][][][]"));
		
		Component verticalStrut_1 = Box.createVerticalStrut(20);
		panel.add(verticalStrut_1, "cell 3 0");
		
		Component horizontalStrut_1_1 = Box.createHorizontalStrut(20);
		horizontalStrut_1_1.setPreferredSize(new Dimension(10, 0));
		horizontalStrut_1_1.setMinimumSize(new Dimension(10, 0));
		panel.add(horizontalStrut_1_1, "cell 0 2");
		
		JLabel lblNewLabel = new JLabel("Student ID:");
		panel.add(lblNewLabel, "cell 1 2,alignx trailing,aligny center");
		
		Component horizontalStrut_1 = Box.createHorizontalStrut(20);
		horizontalStrut_1.setMinimumSize(new Dimension(10, 0));
		horizontalStrut_1.setPreferredSize(new Dimension(10, 0));
		panel.add(horizontalStrut_1, "cell 2 2");
		
		textField = new JFormattedTextField();
		textField.setAlignmentY(Component.TOP_ALIGNMENT);
		textField.setAlignmentX(Component.LEFT_ALIGNMENT);
		panel.add(textField, "cell 3 2,alignx left");
		textField.setColumns(8);
		
		JLabel lblNewLabel_1 = new JLabel("First Name:");
		panel.add(lblNewLabel_1, "cell 1 3,alignx trailing");
		
		textField_1 = new JTextField();
		panel.add(textField_1, "cell 3 3,alignx left");
		textField_1.setColumns(30);
		
		JLabel lblNewLabel_2 = new JLabel("Last Name:");
		panel.add(lblNewLabel_2, "cell 1 4,alignx trailing");
		
		textField_2 = new JTextField();
		panel.add(textField_2, "cell 3 4,alignx left");
		textField_2.setColumns(30);
		
		JLabel lblNewLabel_3 = new JLabel("Middle Initial:");
		panel.add(lblNewLabel_3, "cell 1 5,alignx trailing");
		
		textField_3 = new JTextField();
		textField_3.setColumns(1);
		panel.add(textField_3, "cell 3 5,alignx left");
		
		JLabel lblNewLabel_4 = new JLabel("Home Phone:");
		panel.add(lblNewLabel_4, "cell 1 6,alignx trailing");
		MaskFormatter mf1 = null;
		try {
			mf1 = new MaskFormatter("(###)-###-####");
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	    mf1.setPlaceholderCharacter('_');
		
		textField_4 = new JFormattedTextField(mf1);
		textField_4.setColumns(11);
		panel.add(textField_4, "cell 3 6,alignx left");
		
		JLabel lblNewLabel_5 = new JLabel("Mobile Phone:");
		panel.add(lblNewLabel_5, "cell 1 7,alignx trailing");
		MaskFormatter mf2 = null;
		try {
			mf2 = new MaskFormatter("(###)-###-####");
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	    mf2.setPlaceholderCharacter('_');
		
		textField_16 = new JFormattedTextField(mf2);
		textField_16.setColumns(11);
		panel.add(textField_16, "cell 3 7,alignx left");
		
		JLabel lblNewLabel_6 = new JLabel("Email:");
		panel.add(lblNewLabel_6, "cell 1 8,alignx trailing");
		
		textField_6 = new JTextField();
		textField_6.setColumns(35);
		panel.add(textField_6, "cell 3 8,alignx left");
		
		JLabel lblNewLabel_7 = new JLabel("Gender");
		panel.add(lblNewLabel_7, "cell 1 9,alignx trailing");
		
		JComboBox comboBox = new JComboBox();
		panel.add(comboBox, "cell 3 9,alignx left");
		
		JLabel lblNewLabel_8 = new JLabel("Date of Birth:");
		panel.add(lblNewLabel_8, "cell 1 10,alignx trailing,aligny baseline");
		
		JPanel panel_3 = new JPanel();
		FlowLayout flowLayout = (FlowLayout) panel_3.getLayout();
		flowLayout.setHgap(0);
		panel.add(panel_3, "cell 3 10,alignx left,aligny center");
	    UtilDateModel model=new UtilDateModel();
	    Properties p = new Properties();
        p.put("text.today", "Today");
        p.put("text.month", "Month");
        p.put("text.year", "Year");
	    JDatePanelImpl datePanel = new JDatePanelImpl(model, p);
	    dateField = new JDatePickerImpl(datePanel, new DateLabelFormatter());
	    SpringLayout springLayout = (SpringLayout) dateField.getLayout();
	    springLayout.putConstraint(SpringLayout.WEST, dateField.getJFormattedTextField(), 0, SpringLayout.WEST, dateField);
	    panel_3.add(dateField);
	
	    


		
		JLabel lblNewLabel_9 = new JLabel("Address Num:");
		panel.add(lblNewLabel_9, "cell 1 11,alignx trailing");
		
		textField_9 = new JTextField();
		textField_9.setColumns(10);
		panel.add(textField_9, "cell 3 11,alignx left");
		
		JLabel lblNewLabel_9_1 = new JLabel("Address Street:");
		panel.add(lblNewLabel_9_1, "cell 1 12,alignx trailing");
		
		textField_7 = new JTextField();
		textField_7.setColumns(30);
		panel.add(textField_7, "cell 3 12,alignx left");
		
		JLabel lblNewLabel_9_1_1 = new JLabel("Address Line 2:");
		panel.add(lblNewLabel_9_1_1, "cell 1 13,alignx trailing");
		
		textField_8 = new JTextField();
		textField_8.setColumns(30);
		panel.add(textField_8, "cell 3 13,alignx left");
		
		JLabel lblNewLabel_9_2 = new JLabel("Postal Code:");
		panel.add(lblNewLabel_9_2, "cell 1 14,alignx trailing");
		
		textField_10 = new JTextField();
		textField_10.setColumns(8);
		panel.add(textField_10, "cell 3 14,alignx left");
		
		JLabel lblNewLabel_9_2_1 = new JLabel("City:");
		panel.add(lblNewLabel_9_2_1, "cell 1 15,alignx trailing");
		
		textField_11 = new JTextField();
		textField_11.setColumns(30);
		panel.add(textField_11, "cell 3 15,alignx left");
		
		JLabel lblNewLabel_9_2_2 = new JLabel("Country:");
		panel.add(lblNewLabel_9_2_2, "cell 1 16,alignx trailing");
		
		JComboBox comboBox_1_1 = new JComboBox();
		panel.add(comboBox_1_1, "cell 3 16,alignx left");
		
		JLabel lblNewLabel_10 = new JLabel("State / Providence:");
		panel.add(lblNewLabel_10, "cell 1 17,alignx trailing,aligny center");
		
		JComboBox comboBox_1 = new JComboBox();
		panel.add(comboBox_1, "cell 3 17,alignx left");
		
		JLabel lblNewLabel_10_1 = new JLabel("Facebook:");
		panel.add(lblNewLabel_10_1, "cell 1 18,alignx trailing");
		
		textField_13 = new JTextField();
		textField_13.setColumns(30);
		panel.add(textField_13, "cell 3 18,alignx left");
		
		JLabel lblNewLabel_10_2 = new JLabel("Instagram Handle:");
		panel.add(lblNewLabel_10_2, "cell 1 19,alignx trailing");
		
		textField_14 = new JTextField();
		textField_14.setColumns(20);
		panel.add(textField_14, "cell 3 19,alignx left");
		
		JLabel lblNewLabel_10_3 = new JLabel("Twitter Handle:");
		panel.add(lblNewLabel_10_3, "cell 1 20,alignx trailing");
		
		textField_15 = new JTextField();
		textField_15.setColumns(20);
		panel.add(textField_15, "cell 3 20,alignx left");
		
		Component verticalStrut = Box.createVerticalStrut(20);
		panel.add(verticalStrut, "cell 3 22");
		
		JPanel panel_1 = new JPanel();
		frmCreateStudent.getContentPane().add(panel_1, BorderLayout.SOUTH);
		
		JButton btnNewButton = new JButton("Create Student");
		panel_1.add(btnNewButton);
		
		JPanel panel_2 = new JPanel();
		panel_2.setAlignmentX(Component.LEFT_ALIGNMENT);
		frmCreateStudent.getContentPane().add(panel_2, BorderLayout.NORTH);
		panel_2.setLayout(new MigLayout("", "[107px,grow]", "[grow][23px]"));
		
		JButton btnNewButton_1 = new JButton("Create Student");
		panel_2.add(btnNewButton_1, "cell 0 1,alignx center");
		
		textField_5 = new JLabel();
		frmCreateStudent.getContentPane().add(textField_5, BorderLayout.CENTER);
		
		Component horizontalStrut = Box.createHorizontalStrut(20);
		frmCreateStudent.getContentPane().add(horizontalStrut, BorderLayout.EAST);
	}
	
public class DateLabelFormatter extends AbstractFormatter {

    private String datePattern = "yyyy-MM-dd";
    private SimpleDateFormat dateFormatter = new SimpleDateFormat(datePattern);

    @Override
    public Object stringToValue(String text) throws ParseException {
        return dateFormatter.parseObject(text);
    }

    @Override
    public String valueToString(Object value) throws ParseException {
        if (value != null) {
            Calendar cal = (Calendar) value;
            return dateFormatter.format(cal.getTime());
        }

        return "";
    }

}
}


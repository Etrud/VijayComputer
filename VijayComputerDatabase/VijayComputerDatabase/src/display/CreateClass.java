package display;

import java.awt.EventQueue;
import java.awt.FlowLayout;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Properties;

import javax.swing.JFrame;
import net.miginfocom.swing.MigLayout;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import java.awt.BorderLayout;
import javax.swing.JPanel;
import javax.swing.JSpinner;
import javax.swing.JTextField;
import javax.swing.SpinnerDateModel;
import javax.swing.SpringLayout;
import javax.swing.JComboBox;
import javax.swing.JFormattedTextField;
import java.awt.Component;
import javax.swing.Box;
import javax.swing.SwingConstants;
import javax.swing.JFormattedTextField.AbstractFormatter;
import javax.swing.border.LineBorder;

import org.jdatepicker.impl.JDatePanelImpl;
import org.jdatepicker.impl.JDatePickerImpl;
import org.jdatepicker.impl.UtilDateModel;

import display.createAnnouncement.DateLabelFormatter;

import java.awt.Color;

public class CreateClass {

	private JFrame frmCreateClass;
	private JFormattedTextField classIDTextField;
	private JLabel textField_5;
	private JTextField textField_10;
	private JDatePickerImpl dateField;



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
		frmCreateClass.setBounds(100, 100, 520, 517);
		frmCreateClass.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frmCreateClass.getContentPane().setLayout(new BorderLayout(0, 0));
		
		JPanel panel = new JPanel();
		panel.setBorder(new LineBorder(new Color(0, 0, 0)));
		frmCreateClass.getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLayout(new MigLayout("", "[][][grow,left]", "[][][][][][][][][][][][]"));
		
		JLabel lblNewLabel = new JLabel("Class ID:");
		panel.add(lblNewLabel, "cell 1 0,alignx trailing,aligny center");
		
		classIDTextField = new JFormattedTextField();
		classIDTextField.setAlignmentY(Component.TOP_ALIGNMENT);
		classIDTextField.setAlignmentX(Component.LEFT_ALIGNMENT);
		panel.add(classIDTextField, "cell 2 0,alignx left");
		classIDTextField.setColumns(8);
		
		try{
	    	Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
	    	Connection conn = DriverManager.getConnection("jdbc:sqlserver://COT-CIS3365-03\\VIJAYCOMPUTER;databaseName=ProductionDB","sa","Cougarnet2020!");
	        String sql = "SELECT MAX(ClassID) FROM Class";
	        PreparedStatement pst = conn.prepareStatement(sql);
	        ResultSet rs = pst.executeQuery();

	        while(rs.next()){
	         int s = rs.getInt(1);
	         int q = s +1;
	         classIDTextField.setText(Integer.toString(q));

	        }

	        pst.close();
	        rs.close();
	        conn.close();

	    }catch (Exception e){
	        JOptionPane.showMessageDialog(null, e);
	    }
		
		
		//Employee Assigned Combo Box
		JLabel lblNewLabel_1 = new JLabel("Employee Assigned:");
		panel.add(lblNewLabel_1, "cell 1 1,alignx trailing");
		JComboBox employeeComboBox = new JComboBox();
		panel.add(employeeComboBox, "cell 2 1,alignx left");
		try{
	    	Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
	    	Connection conn = DriverManager.getConnection("jdbc:sqlserver://COT-CIS3365-03\\VIJAYCOMPUTER;databaseName=ProductionDB","sa","Cougarnet2020!");
	    	String sql="SELECT Employee.FirstName+' '+ Employee.LastName+', '+EmployeeType.EmpTypeName FROM Employee INNER JOIN EmployeeType On Employee.EmployeeTypeID = EmployeeType.TypeID";
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
		panel.add(lblNewLabel_2, "cell 1 2,alignx trailing");
		JComboBox classTypeComboBox = new JComboBox();
		panel.add(classTypeComboBox, "cell 2 2,alignx left");
		try{
	    	Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
	    	Connection conn = DriverManager.getConnection("jdbc:sqlserver://COT-CIS3365-03\\VIJAYCOMPUTER;databaseName=ProductionDB","sa","Cougarnet2020!");
	        String sql = "SELECT ClassType FROM ClassType";
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
		panel.add(lblNewLabel_3, "cell 1 3,alignx trailing");
		
		JComboBox courseNameComboBox = new JComboBox();
		panel.add(courseNameComboBox, "cell 2 3,alignx left");
		try{
	    	Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
	    	Connection conn = DriverManager.getConnection("jdbc:sqlserver://COT-CIS3365-03\\VIJAYCOMPUTER;databaseName=ProductionDB","sa","Cougarnet2020!");
	        String sql = "SELECT CourseName FROM Course";
	        PreparedStatement pst = conn.prepareStatement(sql);
	        ResultSet rs = pst.executeQuery();

	        while(rs.next()){
	         String s = rs.getString(1);
	         courseNameComboBox.addItem(s);

	        }

	        pst.close();
	        rs.close();
	        conn.close();

	    }catch (Exception e){
	        JOptionPane.showMessageDialog(null, e);
	    }
		
		JLabel lblNewLabel_4 = new JLabel("Hardware Select:");
		panel.add(lblNewLabel_4, "cell 1 4,alignx trailing");
		
		JComboBox hardwareComboBox = new JComboBox();
		panel.add(hardwareComboBox, "cell 2 4,alignx left");
		try{
	    	Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
	    	Connection conn = DriverManager.getConnection("jdbc:sqlserver://COT-CIS3365-03\\VIJAYCOMPUTER;databaseName=ProductionDB","sa","Cougarnet2020!");
	        String sql = "SELECT EquipmentName FROM EquipmentType";
	        PreparedStatement pst = conn.prepareStatement(sql);
	        ResultSet rs = pst.executeQuery();

	        while(rs.next()){
	         String s = rs.getString(1);
	         hardwareComboBox.addItem(s);

	        }

	        pst.close();
	        rs.close();
	        conn.close();

	    }catch (Exception e){
	        JOptionPane.showMessageDialog(null, e);
	    }
		
		
		JLabel lblNewLabel_5 = new JLabel("Room Reservation:");
		panel.add(lblNewLabel_5, "cell 1 5,alignx trailing");
		
		JComboBox roomComboBox = new JComboBox();
		panel.add(roomComboBox, "cell 2 5,alignx left");
		
		try{
	    	Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
	    	Connection conn = DriverManager.getConnection("jdbc:sqlserver://COT-CIS3365-03\\VIJAYCOMPUTER;databaseName=ProductionDB","sa","Cougarnet2020!");
	        String sql = "SELECT CAST(Room.RoomNum AS varchar) +', '+ CAST(RoomReserve.Reserve AS varchar) AS MOVE "
	        		+ " FROM  RoomReserve INNER JOIN"
	        		+ " Room ON RoomReserve.RoomID = Room.RoomID";
	        PreparedStatement pst = conn.prepareStatement(sql);
	        ResultSet rs = pst.executeQuery();

	        while(rs.next()){
	         String s = rs.getString(1);
	         roomComboBox.addItem(s);

	        }

	        pst.close();
	        rs.close();
	        conn.close();

	    }catch (Exception e){
	        JOptionPane.showMessageDialog(null, e);
	    }
		
		
		
		
		JLabel lblNewLabel_6 = new JLabel("Section #:");
		panel.add(lblNewLabel_6, "cell 1 6,alignx trailing");
		
		JFormattedTextField classIDTextField_1 = new JFormattedTextField();
		classIDTextField_1.setColumns(8);
		classIDTextField_1.setAlignmentY(0.0f);
		classIDTextField_1.setAlignmentX(0.0f);
		panel.add(classIDTextField_1, "cell 2 6,alignx left");
		
		JLabel lblNewLabel_7 = new JLabel("Class Start Date");
		panel.add(lblNewLabel_7, "cell 1 7,alignx trailing");

		
		JPanel panel_5 = new JPanel();
		panel.add(panel_5, "cell 2 7,alignx left,growy");
		
	    UtilDateModel model=new UtilDateModel();
	    Properties p = new Properties();
        p.put("text.today", "Today");
        p.put("text.month", "Month");
        p.put("text.year", "Year");
	    JDatePanelImpl datePanel = new JDatePanelImpl(model, p);
	    dateField = new JDatePickerImpl(datePanel, new DateLabelFormatter());
	    dateField.getJFormattedTextField().setAlignmentX(Component.LEFT_ALIGNMENT);
	    SpringLayout springLayout = (SpringLayout) dateField.getLayout();
	    springLayout.putConstraint(SpringLayout.WEST, dateField.getJFormattedTextField(), 0, SpringLayout.WEST, dateField);
	    panel_5.add(dateField);
		
		JLabel lblNewLabel_8 = new JLabel("Class End Date");
		panel.add(lblNewLabel_8, "cell 1 8,alignx trailing,aligny baseline");
		
		JPanel panel_6 = new JPanel();
		panel.add(panel_6, "cell 2 8,alignx left,aligny center");
		UtilDateModel model2=new UtilDateModel();
	    Properties p2 = new Properties();
        p.put("text.today", "Today");
        p.put("text.month", "Month");
        p.put("text.year", "Year");
	    JDatePanelImpl datePanel2 = new JDatePanelImpl(model2, p2);
	    dateField = new JDatePickerImpl(datePanel2, new DateLabelFormatter());
	    dateField.getJFormattedTextField().setAlignmentX(Component.LEFT_ALIGNMENT);
	    SpringLayout springLayout2 = (SpringLayout) dateField.getLayout();
	    springLayout2.putConstraint(SpringLayout.WEST, dateField.getJFormattedTextField(), 0, SpringLayout.WEST, dateField);
	    panel_6.add(dateField);
		
		JLabel lblNewLabel_9 = new JLabel("Time Start");
		panel.add(lblNewLabel_9, "cell 1 9,alignx trailing,aligny center");
		
		JPanel timePanel1 = new JPanel();
		panel.add(timePanel1, "cell 2 9,alignx left,aligny center");
		
		FlowLayout flowLayout_1 = (FlowLayout) timePanel1.getLayout();
		flowLayout_1.setHgap(0);
		Date date = new Date();
		  SpinnerDateModel sm = 
		  new SpinnerDateModel(date, null, null, Calendar.HOUR_OF_DAY);
		  JSpinner spinner = new JSpinner(sm);
		  JSpinner.DateEditor de = new JSpinner.DateEditor(spinner, "HH:mm:ss");
		  de.setBorder(null);
		  spinner.setEditor(de);
		  timePanel1.add(spinner);
		
		JLabel lblNewLabel_9_1 = new JLabel("Time End:");
		panel.add(lblNewLabel_9_1, "cell 1 10,alignx trailing");
		
		JPanel timePanel2 = new JPanel();
		panel.add(timePanel2, "cell 2 10,alignx left,aligny center");
		
		FlowLayout flowLayout_2 = (FlowLayout) timePanel2.getLayout();
		flowLayout_2.setHgap(0);
		Date date2 = new Date();
		  SpinnerDateModel sm2 = 
		  new SpinnerDateModel(date2, null, null, Calendar.HOUR_OF_DAY);
		  JSpinner spinner2 = new JSpinner(sm);
		  de = new JSpinner.DateEditor(spinner2, "HH:mm:ss");
		  de.setBorder(null);
		  spinner2.setEditor(de);
		  timePanel2.add(spinner2);
		
		Component horizontalStrut_2 = Box.createHorizontalStrut(20);
		panel.add(horizontalStrut_2, "cell 0 11");
		
		JLabel lblNewLabel_9_2 = new JLabel("Max Number of Students:");
		panel.add(lblNewLabel_9_2, "cell 1 11,alignx trailing");
		
		textField_10 = new JTextField();
		textField_10.setColumns(4);
		panel.add(textField_10, "cell 2 11,alignx left");
		
		
		
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
package display;

import java.awt.EventQueue;
import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Properties;

import javax.swing.JFrame;
import java.awt.BorderLayout;
import java.awt.Component;

import javax.swing.JPanel;
import javax.swing.JSpinner;

import net.miginfocom.swing.MigLayout;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.SpinnerDateModel;
import javax.swing.SpringLayout;
import javax.swing.JFormattedTextField.AbstractFormatter;

import org.jdatepicker.impl.JDatePanelImpl;
import org.jdatepicker.impl.JDatePickerImpl;
import org.jdatepicker.impl.UtilDateModel;

import display.createAnnouncement.DateLabelFormatter;

import javax.swing.JComboBox;
import javax.swing.JButton;
import java.awt.Color;
import javax.swing.border.LineBorder;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class createEmpWorkHistory {

	private JFrame frmVcaCreate;
	private JTextField idtextField;
	private JTextField textField_1;
	private JDatePickerImpl dateField;

	/**
	 * Launch the application.
	 */
	public void createWindow() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					createEmpWorkHistory window = new createEmpWorkHistory();
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
	public createEmpWorkHistory() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmVcaCreate = new JFrame();
		frmVcaCreate.setTitle("VCA - Create Employee Pay Insert");
		frmVcaCreate.setBounds(100, 100, 383, 322);
		frmVcaCreate.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frmVcaCreate.getContentPane().setLayout(new BorderLayout(0, 0));
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(255, 204, 204));
		frmVcaCreate.getContentPane().add(panel, BorderLayout.NORTH);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(255, 204, 204));
		frmVcaCreate.getContentPane().add(panel_1, BorderLayout.WEST);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(new Color(255, 204, 204));
		frmVcaCreate.getContentPane().add(panel_2, BorderLayout.SOUTH);
		
		JButton btnNewButton = new JButton("Create Pay Insert");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		panel_2.add(btnNewButton);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBackground(new Color(255, 204, 204));
		frmVcaCreate.getContentPane().add(panel_3, BorderLayout.EAST);
		
		JPanel panel_4 = new JPanel();
		panel_4.setBorder(new LineBorder(new Color(0, 0, 0)));
		frmVcaCreate.getContentPane().add(panel_4, BorderLayout.CENTER);
		panel_4.setLayout(new MigLayout("", "[][grow]", "[][][][][][][]"));
		
		JLabel lblNewLabel = new JLabel("Work History ID:");
		panel_4.add(lblNewLabel, "cell 0 0,alignx trailing");
		
		idtextField = new JTextField();
		panel_4.add(idtextField, "cell 1 0,alignx left");
		idtextField.setColumns(10);
		
		try{
	    	Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
	    	Connection conn = DriverManager.getConnection("jdbc:sqlserver://COT-CIS3365-03\\VIJAYCOMPUTER;databaseName=ProductionDB","sa","Cougarnet2020!");
	        String sql = "SELECT MAX(EmpPK) FROM EmpPayHistory";
	        PreparedStatement pst = conn.prepareStatement(sql);
	        ResultSet rs = pst.executeQuery();

	        while(rs.next()){
	         int s = rs.getInt(1);
	         int q = s +1;
	         idtextField.setText(Integer.toString(q));

	        }

	        pst.close();
	        rs.close();
	        conn.close();

	    }catch (Exception e){
	        JOptionPane.showMessageDialog(null, e);
	    }
		
		
		JLabel lblNewLabel_1 = new JLabel("Employee:");
		panel_4.add(lblNewLabel_1, "cell 0 1,alignx right");
		
		JComboBox empComboBox = new JComboBox();
		panel_4.add(empComboBox, "cell 1 1,alignx left");
		try{
	    	
	    	Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
	    	Connection conn = DriverManager.getConnection("jdbc:sqlserver://COT-CIS3365-03\\VIJAYCOMPUTER;databaseName=ProductionDB","sa","Cougarnet2020!");
	    	String sql = "SELECT CAST(Employee.EmployeeID as varchar)+', '+Employee.FirstName+' '+Employee.LastName FROM Employee";
	        
	        PreparedStatement pst = conn.prepareStatement(sql);
	        ResultSet rs = pst.executeQuery();

	        while(rs.next()){
	         String s = rs.getString(1);
	         empComboBox.addItem(s);

	        }

	        pst.close();
	        rs.close();
	        conn.close();

	    }catch (Exception e){
	        JOptionPane.showMessageDialog(null, e);
	    }
		
		
		JLabel lblNewLabel_2 = new JLabel("Work Date:");
		panel_4.add(lblNewLabel_2, "cell 0 2,alignx right");
		
		JPanel workDatePanel = new JPanel();
		panel_4.add(workDatePanel, "cell 1 2,alignx leading,growy");
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
	    workDatePanel.add(dateField);
		
		
		
		JLabel lblNewLabel_2_1 = new JLabel("Day:");
		panel_4.add(lblNewLabel_2_1, "cell 0 3,alignx right");
		
		JComboBox dayComboBox = new JComboBox();
		panel_4.add(dayComboBox, "cell 1 3,alignx left");
		try{
	    	Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
	    	Connection conn = DriverManager.getConnection("jdbc:sqlserver://COT-CIS3365-03\\VIJAYCOMPUTER;databaseName=ProductionDB","sa","Cougarnet2020!");
	        String sql = "SELECT Day FROM Day";
	        PreparedStatement pst = conn.prepareStatement(sql);
	        ResultSet rs = pst.executeQuery();

	        while(rs.next()){
	         String s = rs.getString(1);
	         dayComboBox.addItem(s);
	        }

	        pst.close();
	        rs.close();
	        conn.close();

	    }catch (Exception e){
	        JOptionPane.showMessageDialog(null, e);
	    }
		
		JLabel lblNewLabel_2_1_1 = new JLabel("Time In:");
		panel_4.add(lblNewLabel_2_1_1, "cell 0 4,alignx right");
		
		JPanel TimeInPanel = new JPanel();
		panel_4.add(TimeInPanel, "cell 1 4,alignx left,aligny center");
		Date date = new Date(0);
		  SpinnerDateModel sm = 
		  new SpinnerDateModel(date, null, null, Calendar.HOUR_OF_DAY);
		  JSpinner spinner = new JSpinner(sm);
		  JSpinner.DateEditor de = new JSpinner.DateEditor(spinner, "HH:mm:ss");
		  de.setBorder(null);
		  spinner.setEditor(de);
		  TimeInPanel.add(spinner);
		
		JPanel TimeOutPanel = new JPanel();
		Date date2 = new Date(0);
		  SpinnerDateModel sm2 = 
		  new SpinnerDateModel(date2, null, null, Calendar.HOUR_OF_DAY);
		  JSpinner spinner2 = new JSpinner(sm2);
		  JSpinner.DateEditor de2 = new JSpinner.DateEditor(spinner2, "HH:mm:ss");
		  de2.setBorder(null);
		  
		  JLabel lblNewLabel_3 = new JLabel("Time Out:");
		  panel_4.add(lblNewLabel_3, "cell 0 5,alignx right");
		  spinner2.setEditor(de2);
		  TimeOutPanel.add(spinner2);
		panel_4.add(TimeOutPanel, "flowx,cell 1 5,alignx left,growy");
		
		JLabel lblNewLabel_4 = new JLabel("Hours Worked:");
		panel_4.add(lblNewLabel_4, "flowx,cell 0 6,alignx right");
		
		textField_1 = new JTextField();
		panel_4.add(textField_1, "cell 1 6,alignx left");
		textField_1.setColumns(10);
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

package display;

import java.awt.EventQueue;
import java.awt.FlowLayout;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Properties;

import javax.swing.JFrame;
import java.awt.BorderLayout;
import javax.swing.JPanel;
import javax.swing.JSpinner;
import javax.swing.SpinnerDateModel;

import net.miginfocom.swing.MigLayout;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax.swing.JButton;
import java.awt.Component;
import javax.swing.Box;
import javax.swing.SpinnerModel;
import javax.swing.SpringLayout;
import javax.swing.JFormattedTextField.AbstractFormatter;

import org.jdatepicker.impl.JDatePanelImpl;
import org.jdatepicker.impl.JDatePickerImpl;
import org.jdatepicker.impl.UtilDateModel;

import display.createAnnouncement.DateLabelFormatter;
import javax.swing.border.LineBorder;
import java.awt.Color;

public class NewRoomReserve {

	private JFrame frmVcaNew;
	private JDatePickerImpl dateField;
	private JPanel datePanel2;


	/**
	 * Launch the application.
	 */
	public static void newWindow() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					NewRoomReserve window = new NewRoomReserve();
					window.frmVcaNew.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public NewRoomReserve() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmVcaNew = new JFrame();
		frmVcaNew.setTitle("VCA - New Room Rental");
		frmVcaNew.setBounds(100, 100, 579, 400);
		frmVcaNew.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frmVcaNew.getContentPane().setLayout(new BorderLayout(0, 0));
		
		JPanel panel = new JPanel();
		frmVcaNew.getContentPane().add(panel, BorderLayout.WEST);
		
		Component horizontalStrut = Box.createHorizontalStrut(20);
		panel.add(horizontalStrut);
		
		JPanel panel_1 = new JPanel();
		frmVcaNew.getContentPane().add(panel_1, BorderLayout.EAST);
		
		Component horizontalStrut_1 = Box.createHorizontalStrut(20);
		panel_1.add(horizontalStrut_1);
		
		JPanel panel_2 = new JPanel();
		frmVcaNew.getContentPane().add(panel_2, BorderLayout.NORTH);
		
		Component verticalStrut = Box.createVerticalStrut(20);
		panel_2.add(verticalStrut);
		
		JButton btnNewButton_1 = new JButton("Create Reservation");
		panel_2.add(btnNewButton_1);
		
		JPanel panel_3 = new JPanel();
		frmVcaNew.getContentPane().add(panel_3, BorderLayout.SOUTH);
		
		Component verticalStrut_1 = Box.createVerticalStrut(20);
		panel_3.add(verticalStrut_1);
		
		JButton btnNewButton = new JButton("Create Reservation");
		panel_3.add(btnNewButton);
		
		JPanel panel_4 = new JPanel();
		frmVcaNew.getContentPane().add(panel_4, BorderLayout.CENTER);
		panel_4.setLayout(new MigLayout("", "[][grow,fill]", "[grow,center][grow][grow,center][grow,baseline]"));
		
		JLabel lblNewLabel = new JLabel("1. Please select a date for your reservation:");
		panel_4.add(lblNewLabel, "flowx,cell 0 0,alignx right");
		
		JPanel datePanel2;
		datePanel2 = new JPanel();
		datePanel2.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_4.add(datePanel2, "cell 1 0,growx,aligny center");
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
	    datePanel2.add(dateField);
		
		JLabel lblNewLabel_1 = new JLabel("2. Please select a time start for your reservation:");
		panel_4.add(lblNewLabel_1, "cell 0 1,alignx right");
		
		JPanel timeStartPanel = new JPanel();
		timeStartPanel.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_4.add(timeStartPanel, "cell 1 1,alignx left");
		Date date = new Date();
		  SpinnerDateModel sm = 
		  new SpinnerDateModel(date, null, null, Calendar.HOUR_OF_DAY);
		  JSpinner spinner = new JSpinner(sm);
		  JSpinner.DateEditor de = new JSpinner.DateEditor(spinner, "HH:mm:ss");
		  de.setBorder(null);
		  spinner.setEditor(de);
		  timeStartPanel.add(spinner);
		
		
		JLabel lblNewLabel_1_1 = new JLabel("3. Please select a time end for your reservation:");
		panel_4.add(lblNewLabel_1_1, "cell 0 2,alignx right");
		
		JPanel timeEndPanel = new JPanel();
		timeEndPanel.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_4.add(timeEndPanel, "cell 1 2,alignx center,aligny baseline");
		 date = new Date();
		   sm = 
		  new SpinnerDateModel(date, null, null, Calendar.HOUR_OF_DAY);
		   spinner = new JSpinner(sm);
		  de = new JSpinner.DateEditor(spinner, "HH:mm:ss");
		  de.setBorder(null);
		  spinner.setEditor(de);
		  timeEndPanel.add(spinner);
		
		
		JLabel lblNewLabel_2 = new JLabel("4. Please select from an open room:\r\n");
		panel_4.add(lblNewLabel_2, "cell 0 3,alignx right");
		
		JComboBox comboBox = new JComboBox();
		panel_4.add(comboBox, "cell 1 3,growx");
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

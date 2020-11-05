package display;

import java.awt.EventQueue;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Properties;

import javax.swing.JFrame;
import java.awt.BorderLayout;
import javax.swing.JPanel;
import javax.swing.SpringLayout;

import net.miginfocom.swing.MigLayout;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax.swing.JFormattedTextField.AbstractFormatter;
import javax.swing.JButton;
import javax.swing.border.LineBorder;

import org.jdatepicker.impl.JDatePanelImpl;
import org.jdatepicker.impl.JDatePickerImpl;
import org.jdatepicker.impl.UtilDateModel;

import display.CreateStudent.DateLabelFormatter;

import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class RoomRentalWindow {

	private JFrame frmVcaRoom;
	private JDatePickerImpl dateField;


	/**
	 * Launch the application.
	 */
	public static void newWindow() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					RoomRentalWindow window = new RoomRentalWindow();
					window.frmVcaRoom.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public RoomRentalWindow() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmVcaRoom = new JFrame();
		frmVcaRoom.setTitle("VCA - Room Rental");
		frmVcaRoom.setBounds(100, 100, 450, 300);
		frmVcaRoom.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmVcaRoom.getContentPane().setLayout(new BorderLayout(0, 0));
		
		JPanel panel = new JPanel();
		frmVcaRoom.getContentPane().add(panel, BorderLayout.WEST);
		panel.setLayout(new MigLayout("", "[][grow]", "[grow]"));
		
		//Room Rental Button
		JButton btnNewButton = new JButton("New Room Rental");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				NewRoomReserve nrr = new NewRoomReserve();
				nrr.newWindow();
			}
		});
		panel.add(btnNewButton, "cell 0 0");
		
		JPanel panel_1 = new JPanel();
		frmVcaRoom.getContentPane().add(panel_1, BorderLayout.EAST);
		
		JPanel panel_2 = new JPanel();
		frmVcaRoom.getContentPane().add(panel_2, BorderLayout.SOUTH);
		
		JPanel panel_3 = new JPanel();
		frmVcaRoom.getContentPane().add(panel_3, BorderLayout.NORTH);
		panel_3.setLayout(new MigLayout("", "[][grow][][grow]", "[grow][grow]"));
		
		JLabel lblNewLabel = new JLabel("Show Room Status:");
		panel_3.add(lblNewLabel, "cell 0 0,alignx trailing");
		
		JComboBox comboBox = new JComboBox();
		panel_3.add(comboBox, "cell 1 0,alignx left");
		
		JLabel lblNewLabel_1 = new JLabel("on date");
		panel_3.add(lblNewLabel_1, "cell 2 0,alignx right");
		
		JPanel panel_6 = new JPanel();
		panel_3.add(panel_6, "cell 3 0,alignx left,growy");
		 UtilDateModel model=new UtilDateModel();
		    Properties p = new Properties();
	        p.put("text.today", "Today");
	        p.put("text.month", "Month");
	        p.put("text.year", "Year");
		    JDatePanelImpl datePanel = new JDatePanelImpl(model, p);
		    dateField = new JDatePickerImpl(datePanel, new DateLabelFormatter());
		    SpringLayout springLayout = (SpringLayout) dateField.getLayout();
		    springLayout.putConstraint(SpringLayout.WEST, dateField.getJFormattedTextField(), 0, SpringLayout.WEST, dateField);
		    panel_6.add(dateField);
		
		JPanel panel_4 = new JPanel();
		panel_4.setBorder(new LineBorder(new Color(0, 0, 0)));
		frmVcaRoom.getContentPane().add(panel_4, BorderLayout.CENTER);
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
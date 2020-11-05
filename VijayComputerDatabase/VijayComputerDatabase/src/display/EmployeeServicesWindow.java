package display;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Toolkit;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import net.miginfocom.swing.MigLayout;
import javax.swing.JButton;

public class EmployeeServicesWindow {

	private JFrame frmVcaEmployee;

	/**
	 * Launch the application.
	 */
	public static void createWindow() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					EmployeeServicesWindow window = new EmployeeServicesWindow();
					window.frmVcaEmployee.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public EmployeeServicesWindow() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmVcaEmployee = new JFrame();
		frmVcaEmployee.setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\bshaffer\\git\\VijayComputerDatabase\\VijayComputerDatabase\\resources\\skills.png"));
		frmVcaEmployee.setTitle("VCA - Employee Services");
		frmVcaEmployee.setBounds(100, 100, 450, 300);
		frmVcaEmployee.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frmVcaEmployee.getContentPane().setLayout(new BorderLayout(0, 0));
		
		JPanel panel = new JPanel();
		frmVcaEmployee.getContentPane().add(panel, BorderLayout.NORTH);
		
		JPanel panel_1 = new JPanel();
		frmVcaEmployee.getContentPane().add(panel_1, BorderLayout.SOUTH);
		
		JPanel panel_2 = new JPanel();
		frmVcaEmployee.getContentPane().add(panel_2, BorderLayout.CENTER);
		
		JPanel panel_3 = new JPanel();
		frmVcaEmployee.getContentPane().add(panel_3, BorderLayout.WEST);
		panel_3.setLayout(new MigLayout("", "[]", "[]"));
		
		JButton btnNewButton = new JButton("Certification Center");
		btnNewButton.setToolTipText("This is where the certifications are granted to students");
		panel_3.add(btnNewButton, "cell 0 0");
		
		JPanel panel_4 = new JPanel();
		frmVcaEmployee.getContentPane().add(panel_4, BorderLayout.EAST);
		
		JMenuBar menuBar = new JMenuBar();
		frmVcaEmployee.setJMenuBar(menuBar);
		
		JMenu mnNewMenu = new JMenu("File");
		menuBar.add(mnNewMenu);
		
		JMenuItem mntmNewMenuItem = new JMenuItem("New menu item");
		mnNewMenu.add(mntmNewMenuItem);
	}

}

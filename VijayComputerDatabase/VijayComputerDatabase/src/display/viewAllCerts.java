package display;

import java.awt.EventQueue;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.MessageFormat;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JTable.PrintMode;

import java.awt.BorderLayout;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.table.DefaultTableModel;
import java.awt.Color;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import java.awt.event.ActionListener;
import java.awt.print.PrinterException;
import java.awt.event.ActionEvent;
import java.awt.Toolkit;

public class viewAllCerts {

	private JFrame frmVcaAll;
	private JTable certTable;
	private DefaultTableModel certModel;

	/**
	 * Launch the application.
	 */
	public void createWindow() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					viewAllCerts window = new viewAllCerts();
					window.frmVcaAll.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public viewAllCerts() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmVcaAll = new JFrame();
		frmVcaAll.setIconImage(Toolkit.getDefaultToolkit().getImage(viewAllCerts.class.getResource("/cert.png")));
		frmVcaAll.setTitle("VCA - All Certifications");
		frmVcaAll.setBounds(100, 100, 554, 300);
		frmVcaAll.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		
		JPanel panel = new JPanel();
		frmVcaAll.getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLayout(new BorderLayout(0, 0));
		
		JScrollPane scrollPane = new JScrollPane();
		panel.add(scrollPane);
		
		certTable = new JTable();
		certModel = new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"ID#", "Certification Name"
			}
		);
		certTable.setModel(certModel);
		certTable.getColumnModel().getColumn(1).setPreferredWidth(98);
		scrollPane.setViewportView(certTable);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(new Color(255, 204, 153));
		panel.add(panel_2, BorderLayout.NORTH);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBackground(new Color(255, 204, 153));
		panel.add(panel_3, BorderLayout.SOUTH);
		
		JPanel panel_4 = new JPanel();
		panel_4.setBackground(new Color(255, 204, 153));
		panel.add(panel_4, BorderLayout.WEST);
		
		JPanel panel_5 = new JPanel();
		panel_5.setBackground(new Color(255, 204, 153));
		panel.add(panel_5, BorderLayout.EAST);
		
		JMenuBar menuBar = new JMenuBar();
		frmVcaAll.setJMenuBar(menuBar);
		
		JMenu mnNewMenu = new JMenu("File");
		menuBar.add(mnNewMenu);
		
		JMenuItem mntmNewMenuItem = new JMenuItem("Print");
		mntmNewMenuItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
					final MessageFormat headerFormat= new MessageFormat("Certification Information");
					final MessageFormat footerFormat= new MessageFormat("- {0} -");
					certTable.print(PrintMode.FIT_WIDTH,headerFormat,footerFormat);
				} catch (PrinterException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		});
		mnNewMenu.add(mntmNewMenuItem);
		
		try {
			Connection conn = DriverManager.getConnection("jdbc:sqlserver://COT-CIS3365-03\\VIJAYCOMPUTER;databaseName=ProductionDB","sa","Cougarnet2020!");
			String sql = "SELECT * FROM Certification";
			PreparedStatement pst = conn.prepareStatement(sql);
	        ResultSet rs = pst.executeQuery();
	        
	        while(rs.next())
	        {
	            String a = rs.getString("CertID");
	            String b = rs.getString("CertName");
	            certModel.addRow(new Object[]{a, b, });
	        }

		} catch (SQLException e1) {
			JOptionPane.showMessageDialog(null, e1);
		}
		
		
		
		
	}

}

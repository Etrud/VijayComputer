package display;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextArea;
import javax.swing.JLabel;
import javax.swing.border.LineBorder;
import java.awt.Color;
import java.awt.Desktop;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.net.URI;
import java.util.concurrent.TimeUnit;
import java.awt.event.ActionEvent;

public class helpTicket extends JDialog {

	private final JPanel contentPanel = new JPanel();

	
	String helpString;
	JTextArea helpTextArea;
	/**
	 * Launch the application.
	 */
	public static void newScreen() {
		try {
			helpTicket dialog = new helpTicket();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public helpTicket() {
		setTitle("Submit a Help Request");
		setResizable(false);			
		helpTextArea = new JTextArea();
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setLayout(new FlowLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		{
			helpTextArea.setBorder(new LineBorder(new Color(0, 0, 0), 2));
			helpTextArea.setRows(10);
			helpTextArea.setColumns(35);
			contentPanel.add(helpTextArea);
		}
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			{
				JButton okButton = new JButton("OK");
				okButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						Desktop desktop = Desktop.getDesktop();
						String message = "mailto:redcougardata@gmail.com?subject=Service%20Email&body="+helpTextArea.getText().replace(" ","%20")+"";
						URI uri = URI.create(message);
						try {
							dispose();
							helpSent hs = new helpSent();
							helpSent.createWindow();
							TimeUnit.SECONDS.sleep(2);
							desktop.mail(uri);
						} catch (IOException e1) {
							// TODO Auto-generated catch block
							e1.printStackTrace();
						} catch (InterruptedException e1) {
							// TODO Auto-generated catch block
							e1.printStackTrace();
						}
					}
				});
				okButton.setActionCommand("OK");
				buttonPane.add(okButton);
				getRootPane().setDefaultButton(okButton);
			}
			{
				JButton cancelButton = new JButton("Cancel");
				cancelButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						dispose();
					}
				});
				cancelButton.setActionCommand("Cancel");
				buttonPane.add(cancelButton);
			}
		}
		{
			JPanel panel = new JPanel();
			getContentPane().add(panel, BorderLayout.NORTH);
			{
				JLabel lblNewLabel = new JLabel("Please type a small description of your issue below.");
				panel.add(lblNewLabel);
			}
		}
	}

}

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JTextField;



import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import java.awt.Font;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class DemoSep14 {

	private JFrame frame;
	private JTextField fn;
	private JTextField ln;

	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DemoSep14 window = new DemoSep14();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public DemoSep14() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 492, 476);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 375, 1);
		frame.getContentPane().add(panel);
		
		fn = new JTextField();
		fn.setText("First Name");
		fn.setBounds(10, 21, 147, 30);
		frame.getContentPane().add(fn);
		fn.setColumns(10);
		
		ln = new JTextField();
		ln.setText("Last Name");
		ln.setBounds(180, 21, 147, 30);
		frame.getContentPane().add(ln);
		ln.setColumns(10);
		
		JTextArea disp = new JTextArea();
		disp.setFont(new Font("Monospaced", Font.PLAIN, 15));
		disp.setBounds(10, 121, 317, 107);
		frame.getContentPane().add(disp);
		
		JComboBox CB1 = new JComboBox();
		CB1.setModel(new DefaultComboBoxModel(new String[] {"Select Grade", "10", "11", "12"}));
		CB1.setBounds(10, 62, 147, 22);
		frame.getContentPane().add(CB1);
		
		JComboBox CB2 = new JComboBox();
		CB2.setFont(new Font("Tahoma", Font.PLAIN, 11));
		CB2.setModel(new DefaultComboBoxModel(new String[] {"Select School", "Crescent", "Western", "Eastern"}));
		CB2.setBounds(180, 62, 135, 22);
		frame.getContentPane().add(CB2);
		
		JButton btnNewButton = new JButton("Submit");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				String fN = fn.getText();
				String lN = ln.getText();
				String grade = "";
				String school = "";
				
				if(CB1.getSelectedItem().equals("10"))
				{
					grade = "10";
				}
				else if(CB1.getSelectedItem().equals("11"))
				{
					grade = "11";
				}
				else 
				{
					grade = "12";
				}
				
				if(CB2.getSelectedItem().equals("Crescent"))
				{
					school = "Crescent";
				}
				else if(CB2.getSelectedItem().equals("Western"))
				{
					school = "Western";
				}
				else 
				{
					school = "Eastern";
				}
				
				
				disp.setText
				(
					fN + " " +	
					lN + " is in grade: " +	grade + " and goes to: " + school + " high school"
						
				);
			}
			
			
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnNewButton.setBounds(337, 21, 89, 207);
		frame.getContentPane().add(btnNewButton);
		
		
		
		
	}
}

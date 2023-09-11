import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.BorderLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import java.awt.Color;

public class JonathanBaerComp30DemoGUI {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JonathanBaerComp30DemoGUI window = new JonathanBaerComp30DemoGUI();
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
	public JonathanBaerComp30DemoGUI() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setForeground(Color.RED);
		frame.setBounds(100, 100, 473, 319);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JLabel Display = new JLabel("");
		Display.setBounds(49, 92, 347, 52);
		frame.getContentPane().add(Display);
		
		JButton Submit = new JButton("SUBMIT");
		Submit.setBounds(49, 11, 347, 35);
		Submit.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				
				Display.setText("Hello, Computer Science students!");
				
			}
		});
		frame.getContentPane().setLayout(null);
		frame.getContentPane().add(Submit);
		
		
	}
}

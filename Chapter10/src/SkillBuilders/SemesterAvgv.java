package SkillBuilders;

import java.awt.EventQueue;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class SemesterAvgv implements ActionListener
{

	private JFrame frame;
	
	JPanel contentPane;

	JLabel prompt1, prompt2, prompt3, average;


	JButton avgButton;

    String eventName;
	private JTextField grade1;
	private JTextField grade2;
	private JTextField grade3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SemesterAvgv window = new SemesterAvgv();
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
	public SemesterAvgv() 
	{
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() 
	{
		frame = new JFrame("Semester Average");
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel prompt1 = new JLabel("Enter the first grade: ");
		prompt1.setBounds(24, 29, 105, 14);
		frame.getContentPane().add(prompt1);
		
		grade1 = new JTextField();
		grade1.setBounds(190, 26, 86, 20);
		frame.getContentPane().add(grade1);
		grade1.setColumns(10);
		
		JLabel prompt2 = new JLabel("Enter the second grade: ");
		prompt2.setBounds(24, 69, 120, 14);
		frame.getContentPane().add(prompt2);
		
		grade2 = new JTextField();
		grade2.setBounds(190, 66, 86, 20);
		frame.getContentPane().add(grade2);
		grade2.setColumns(10);
		
		JLabel prompt3 = new JLabel("Enter the third grade: ");
		prompt3.setBounds(24, 110, 120, 14);
		frame.getContentPane().add(prompt3);
		
		grade3 = new JTextField();
		grade3.setBounds(190, 107, 86, 20);
		frame.getContentPane().add(grade3);
		grade3.setColumns(10);
		
		JButton avgButton = new JButton("Average");
		avgButton.setBounds(22, 164, 89, 23);
		avgButton.setActionCommand("Average");
		avgButton.addActionListener(this);
		frame.getContentPane().add(avgButton);
		
		JLabel average = new JLabel(" ");
		average.setBounds(190, 168, 46, 14);
		frame.getContentPane().add(average);
		
		contentPane = new JPanel();
		/* frame.getContentPane().add(contentPane); */
		contentPane.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
		contentPane.setLayout(new GridLayout(0, 2, 10, 5));
		
		
	}
	
	public void actionPerformed(ActionEvent event) {
		String eventName = event.getActionCommand();

		if (eventName.equals("Average")) {
			double avgGrade;
			String g1 = grade1.getText();
			String g2 = grade2.getText();
			String g3 = grade3.getText();

			avgGrade = (Double.parseDouble(g1) + Double.parseDouble(g2) + Double.parseDouble(g3)) / 3;

			average.setText(Double.toString(avgGrade));
		}

	}
}

package SkillBuilders;

import java.awt.EventQueue;

import javax.swing.JFrame;
/*import java.awt.Font;*/
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.border.EmptyBorder;

public class SemesterAvg /*implements ActionListener*/ 
{

	JFrame frame;
	
	JPanel contentPane;
	
	JLabel prompt1, prompt2, prompt3, average;
	
	JTextField grade1, grade2, grade3;
	
	JButton avgButton;
	
	private JFrame frmSemesterAverage;

	/**
	 * Launch the application.
	 */
	/*
	public static void main(String[] args) 
	{
		EventQueue.invokeLater(new Runnable() 
		{
			public void run() 
			{
				try 
				{
					SemesterAvg window = new SemesterAvg();
					window.frmSemesterAverage.setVisible(true);
				} catch (Exception e) 
				{
					e.printStackTrace();
				}
			}
		});
	}
	*/
	/**
	 * Create the application.
	 */
	public SemesterAvg() 
	{
		/*initialize();*/
		
		frame = new JFrame("Semester Average");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel panel = new JPanel();
		panel.setBorder(new EmptyBorder(10, 10, 10, 10));
		panel.setBounds(new Rectangle(0, 2, 10, 5));
		frame.getContentPane().add(panel, BorderLayout.NORTH);
		panel.setLayout(new GridLayout(1, 0, 0, 0));
		contentPane = new JPanel();
		contentPane.setLayout(new GridLayout(0, 2, 10, 5));
		contentPane.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
		prompt1 = new JLabel("Enter the first grade: ");
		contentPane.add(prompt1);
		
		
		
		
	}

	/**
	 * Initialize the contents of the frame.
	 */
	/*
	private void initialize() 
	{
		
		
		
	}
	*/
}

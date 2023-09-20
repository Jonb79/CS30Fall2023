package SkillBuilders;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Font;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

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
	/**
	 * Create the application.
	 */
	public SemesterAvg() 
	{
		initialize();
		
		
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() 
	{
		frmSemesterAverage = new JFrame("Semester Average");
		frmSemesterAverage.setOpacity(2.0f);
		frmSemesterAverage.setBounds(100, 100, 544, 407);
		frmSemesterAverage.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmSemesterAverage.getContentPane().setLayout(null);
	}

}

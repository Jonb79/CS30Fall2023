package SkillBuilders;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Font;

public class SemesterAvg 
{

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
		frmSemesterAverage.setBounds(100, 100, 450, 300);
		frmSemesterAverage.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}

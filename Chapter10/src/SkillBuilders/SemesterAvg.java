package SkillBuilders;

import java.awt.EventQueue;

import javax.swing.JFrame;
/*import java.awt.Font;*/
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.border.EmptyBorder;

public abstract class SemesterAvg implements ActionListener {

	JFrame frame;

	JPanel contentPane;

	JLabel prompt1, prompt2, prompt3, average;

	JTextField grade1, grade2, grade3;

	JButton avgButton;

	String eventName;

	/**
	 * Launch the application.
	 */
	/*
	 * public static void main(String[] args) { EventQueue.invokeLater(new
	 * Runnable() { public void run() { try { SemesterAvg window = new
	 * SemesterAvg(); window.frmSemesterAverage.setVisible(true); } catch (Exception
	 * e) { e.printStackTrace(); } } }); }
	 */
	/**
	 * Create the application.
	 */
	public SemesterAvg() {
		/* initialize(); */

		frame = new JFrame("Semester Average");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(new GridLayout(0, 1, 0, 0));

		contentPane = new JPanel();
		/* frame.getContentPane().add(contentPane); */
		contentPane.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
		contentPane.setLayout(new GridLayout(0, 2, 10, 5));
		prompt1 = new JLabel("Enter the first grade: ");
		contentPane.add(prompt1);

		grade1 = new JTextField(10);
		contentPane.add(grade1);

		prompt2 = new JLabel("Enter the second grade: ");
		contentPane.add(prompt2);

		grade2 = new JTextField(10);
		contentPane.add(grade2);

		prompt3 = new JLabel("Enter the third grade: ");
		contentPane.add(prompt3);

		grade3 = new JTextField(10);
		contentPane.add(grade3);

		avgButton = new JButton("Average");
		avgButton.setActionCommand("Average");
		avgButton.addActionListener(this);
		contentPane.add(avgButton);

		average = new JLabel("");
		contentPane.add(average);

		frame.setContentPane(contentPane);

		frame.pack();
		frame.setVisible(true);

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

	/**/private static void runGUI() {
		JFrame.setDefaultLookAndFeelDecorated(true);

		SemesterAvg myGrades = new SemesterAvg();
	}

	public static void main(String[] args) {
		/*
		 * Methods that create and show a GUI should be run from an event-dispatching
		 * thread
		 */
		javax.swing.SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				runGUI();
			}
		});

	}

	/**
	 * Initialize the contents of the frame.
	 */
	/*
	 * private void initialize() {
	 * 
	 * 
	 * 
	 * }
	 */
}

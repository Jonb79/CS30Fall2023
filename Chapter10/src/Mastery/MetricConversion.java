package Mastery;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import java.awt.Font;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextPane;
import javax.swing.JTextArea;
import java.awt.SystemColor;

public class MetricConversion 
{

	private JFrame MetricConversion;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) 
	{
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MetricConversion window = new MetricConversion();
					window.MetricConversion.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public MetricConversion() 
	{
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() 
	{
		MetricConversion = new JFrame("MetricConversion");
		MetricConversion.getContentPane().setForeground(Color.BLACK);
		MetricConversion.setBounds(100, 100, 450, 300);
		MetricConversion.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		MetricConversion.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Select a conversion type:");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel.setBounds(20, 11, 227, 33);
		MetricConversion.getContentPane().add(lblNewLabel);
	
		JComboBox cnversionTypes = new JComboBox();
		cnversionTypes.setBounds(20, 46, 246, 22);
		cnversionTypes.setModel(new DefaultComboBoxModel(new String[] {"inches to centimeters", "feet to meters", "gallons to liters", "pounds to kilograms"}));
		MetricConversion.getContentPane().add(cnversionTypes);
		
		JLabel displayFormula = new JLabel("");
		displayFormula.setBounds(20, 82, 333, 44);
		MetricConversion.getContentPane().add(displayFormula);
		
		cnversionTypes.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				
				if(cnversionTypes.getSelectedItem().equals("inches to centimeters"))
				{
					displayFormula.setText("1 inch = 2.54 centimeters");
				}
				else if(cnversionTypes.getSelectedItem().equals("feet to meters"))
				{
					displayFormula.setText("1 foot = 0.3048 meters");
				}
				else if(cnversionTypes.getSelectedItem().equals("gallons to liters")) 
				{
					displayFormula.setText("1 gallon = 4.5461 liters");
				}
				else if(cnversionTypes.getSelectedItem().equals("pounds to kilograms"))
				{
					displayFormula.setText("1 pound = 0.4536 kilograms");
				}
				else 
				{
					displayFormula.setText("");
				}
				
			}
		});
		
		
	}
	}
		
		
		
			
			
			
		

	
	
	


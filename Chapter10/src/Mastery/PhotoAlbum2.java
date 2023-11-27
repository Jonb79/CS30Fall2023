/*
Program: PhotoAlbum.java 
Last Date of this Revision: October 16, 2023
Purpose: An application that uses if-else statements to output two
ImageIcons that diplay the number of broken plates and the prize won by the player.
Author: Jonathan,
School: CHHS
Course: Computer Science 30
*/
package Mastery;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Dimension;

public class PhotoAlbum2 implements ActionListener
{
	static final String FIRST_PHOTO = "Mount Fuji";
	static final String SECOND_PHOTO = "sticker";
	static final String THIRD_PHOTO = "sticker";
	static final String FOURTH_PHOTO = "sticker";
	ImageIcon FIRST_PHOTO2 = new ImageIcon("C:\\Users\\26031001\\git\\CS30Fall2023\\Chapter10\\Mount_Fuji.jpeg");  
	ImageIcon SECOND_PHOTO2 = new ImageIcon("C:\\Users\\26031001\\git\\CS30Fall2023\\Chapter10\\sticker.gif");
	ImageIcon THIRD_PHOTO2 = new ImageIcon("C:\\Users\\26031001\\git\\CS30Fall2023\\Chapter10\\sticker.gif");
	ImageIcon FOURTH_PHOTO2 = new ImageIcon("C:\\Users\\26031001\\git\\CS30Fall2023\\Chapter10\\sticker.gif");
	private JFrame frame;
	JPanel contentPane;
	JButton Next;
	JLabel Photo;
	GameBooth breakAPlate;
	

	/**
	 * Create the application.
	 */
	public PhotoAlbum2() 
	{
		/*The GUI needs four photos!*/
		
		/*Create and set up the frame*/
		frame = new JFrame("PhotoAlbum");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		/*Create a content pane with a BoxLayout and empty borders*/
	    contentPane = new JPanel();
		contentPane.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));
		contentPane.setBackground(Color.white);
		contentPane.setLayout(new BoxLayout(contentPane, BoxLayout.PAGE_AXIS));
		
		/*Create a Play button*/
		Next = new JButton("Next");
		Next.setActionCommand("Next");
		Next.setAlignmentX(JButton.CENTER_ALIGNMENT);
		Next.addActionListener(this);
		contentPane.add(Next);
		
		/*Create a label that will show prizes won */
		Photo = new JLabel(new ImageIcon("C:\\Users\\26031001\\git\\CS30Fall2023\\Chapter10\\Mount_Fuji.jpeg"));
		/*Photo.setIcon(null);*/
		Photo.setAlignmentX(JLabel.CENTER_ALIGNMENT);
		Photo.setBorder(new EmptyBorder(20, 20, 20, 20));
		contentPane.add(Photo);
		
		/*Add content pane to frame*/
		frame.setContentPane(contentPane);
		
		
		/*Size and then display the frame.*/
		
		frame.pack();
		frame.setVisible(true);
		
	}

	/*private double cost;
    private String FIRST_PRIZE, CONSOLATION_PRIZE; 
	
	/**
	 * constructor
	 * pre: none
	 * post: A GameBooth object created.
	 * The cost of prizes are set.
	
	*/

	/*public photoAlbum(double charge, String p1, String p2) 
	{
		cost = charge;
		FIRST_PRIZE = p1;
		CONSOLATION_PRIZE = p2;
		charge = 0;
		
	}*/

	public void actionPerformed(ActionEvent e) 
	{
		String eventName = e.getActionCommand();
		String photo;
		
		if (eventName == "Next")
		{
			photo = PhotoAlbum2.start();
			
			if (photo.equals(FIRST_PHOTO))
			{
				Photo.setIcon(new ImageIcon("C:\\Users\\26031001\\git\\CS30Fall2023\\Chapter10\\plates_all_broken.gif"));
			}
			else if (photo.equals(SECOND_PHOTO))
			{
				Photo.setIcon(new ImageIcon("C:\\Users\\26031001\\git\\CS30Fall2023\\Chapter10\\plates_all_broken.gif"));
			}
			else if (photo.equals(THIRD_PHOTO))
			{
				Photo.setIcon(new ImageIcon("C:\\Users\\26031001\\git\\CS30Fall2023\\Chapter10\\plates_all_broken.gif"));
			}
			else if (photo.equals(FOURTH_PHOTO))
			{
				Photo.setIcon(new ImageIcon("C:\\Users\\26031001\\git\\CS30Fall2023\\Chapter10\\plates_all_broken.gif"));
			}
			Next.setText("Back To The Start");
			Next.setActionCommand("Back To The Start");
		}
		else if (eventName == "Back To The Start")
		{
			Photo.setIcon(new ImageIcon("C:\\Users\\26031001\\git\\CS30Fall2023\\Chapter10\\Mount_Fuji.jpeg"));
			/*Photo.setIcon(null);*/
			Next.setText("Next");
			Next.setActionCommand("Next");
		}
	}
	
	static String start() 
	{
		// TODO Auto-generated method stub
		return null;
	}




	/**
	 * Create and show the GUI.
	 */
	private static void runGUI()
	{
		JFrame.setDefaultLookAndFeelDecorated(true);
		
		PhotoAlbum2 photoAlbum = new PhotoAlbum2();
	}
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) 
	{
		/*Methods that create and show a GUI should be run from an event-dispatching thread*/
		javax.swing.SwingUtilities.invokeLater(new Runnable()
		{
			public void run() 
			{ 
				runGUI();
		    }
	    });
	
    }
}

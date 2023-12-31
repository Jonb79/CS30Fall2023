package Mastery;

import java.awt.Color;
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

import Mastery.PhotoAlbum.photoAlbum;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class PhotoAlbum implements ActionListener
{

	/**
		 * @author 26031001
		 *
		 */
	public static class photoAlbum 
	{

		/**
		 * @param args
		 */
		public static void main(String[] args) 
		{
			// TODO Auto-generated method stub

		}

		public static String start() 
		{
			// TODO Auto-generated method stub
			return null;
		}

	}

	/**
	 * Launch the application.
	 */
	
	static final String FIRST_PHOTO = "Mount Fuji";
	static final String SECOND_PHOTO = "sticker";
	static final String THIRD_PHOTO = "sticker";
	static final String FOURTH_PHOTO = "sticker";
	ImageIcon FIRST_PHOTO2 = new ImageIcon("C:\\Users\\26031001\\git\\CS30Fall2023\\Chapter10\\Mount_Fuji.jpg");  
	ImageIcon SECOND_PHOTO2 = new ImageIcon("C:\\Users\\26031001\\git\\CS30Fall2023\\Chapter10\\sticker.gif");
	ImageIcon THIRD_PHOTO2 = new ImageIcon("C:\\Users\\26031001\\git\\CS30Fall2023\\Chapter10\\sticker.gif");
	ImageIcon FOURTH_PHOTO2 = new ImageIcon("C:\\Users\\26031001\\git\\CS30Fall2023\\Chapter10\\sticker.gif");
	private JFrame frame;
	JPanel contentPane;
	JButton Next;
	JLabel Photo;
	
	/**
	 * Create the application.
	 * @wbp.parser.entryPoint
	 */
	public PhotoAlbum() 
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
		Photo = new JLabel(" ");
		/*Photo.setIcon(null);*/
		Photo.setAlignmentX(JLabel.CENTER_ALIGNMENT);
		Photo.setBorder(new EmptyBorder(20, 20, 20, 20));
		contentPane.add(Photo);
		
		/*Add content pane to frame*/
		frame.setContentPane(contentPane);
		
		Photo.setIcon(SECOND_PHOTO2);
		/*Size and then display the frame.*/
		
		frame.pack();
		frame.setVisible(true);
		
		
		
	}
	
	@Override
	public void actionPerformed(ActionEvent e) 
	{
		String eventName = e.getActionCommand();
		String photo;
		
		if (eventName == "Next")
		{
			photo = photoAlbum.start();
			
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
			Photo.setIcon(new ImageIcon("C:\\Users\\26031001\\git\\CS30Fall2023\\Chapter10\\Mount_Fuji.jpg"));
			/*Photo.setIcon(null);*/
			Next.setText("Next");
			Next.setActionCommand("Next");
		}
		
	}
	
	private static String start() 
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
		
		PhotoAlbum photoAlbum = new PhotoAlbum();
	}

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

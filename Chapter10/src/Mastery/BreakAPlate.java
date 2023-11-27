/*
Program: BreakAPlate.java 
Last Date of this Revision: October 13, 2023
Purpose: An application that uses if-else statements to output two
ImageIcons that diplay the number of broken plates and the prize won by the player.
Author: Jonathan,
School: CHHS
Course: Computer Science 30
*/

package Mastery;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import java.awt.Color;

import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.border.EmptyBorder;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


/**
 * BreakAPlate
 */

public class BreakAPlate implements ActionListener
{

	/**
	 * Launch the application.
	 */
	
	static final String FIRST_PRIZE = "tiger plush";
	static final String CONSOLATION_PRIZE = "sticker";
	ImageIcon FIRST_PRIZE2 = new ImageIcon("C:\\Users\\26031001\\git\\CS30Fall2023\\Chapter10\\tiger_plush.gif");  
	ImageIcon CONSOLATION_PRIZE2 = new ImageIcon("C:\\Users\\26031001\\git\\CS30Fall2023\\Chapter10\\sticker.gif");
	JFrame frame;
	JPanel contentPane;
	JButton play;
	JLabel plates, prizeWon;
	GameBooth breakAPlate;

	/**
	 * Create the application.
	 */
	public BreakAPlate() 
	{
		/*initialize game booth and player */
		breakAPlate = new GameBooth(0, FIRST_PRIZE, CONSOLATION_PRIZE);
		
		/*Create and set up the frame*/
		frame = new JFrame("BreakAPlate");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		/*Create a content pane with a BoxLayout and empty borders*/
	    contentPane = new JPanel();
		contentPane.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));
		contentPane.setBackground(Color.white);
		contentPane.setLayout(new BoxLayout(contentPane, BoxLayout.PAGE_AXIS));
		
		
		/*Create a label that shows the start of the game*/
		plates = new JLabel(new ImageIcon("C:\\Users\\26031001\\git\\CS30Fall2023\\Chapter10\\plates.gif"));
		plates.setAlignmentX(JLabel.CENTER_ALIGNMENT);
		plates.setBorder(BorderFactory.createEmptyBorder(10, 10, 20, 10));
		contentPane.add(plates);
		
		/*Create a Play button*/
		play = new JButton("Play");
		play.setActionCommand("Play");
		play.setAlignmentX(JButton.CENTER_ALIGNMENT);
		play.addActionListener(this);
		contentPane.add(play);
		
		/*Create a label that will show prizes won */
		prizeWon = new JLabel(" ");
		prizeWon.setIcon(null);
		prizeWon.setAlignmentX(JLabel.CENTER_ALIGNMENT);
		prizeWon.setBorder(new EmptyBorder(30, 100, 30, 100));
		contentPane.add(prizeWon);
		
		/*Add content pane to frame*/
		frame.setContentPane(contentPane);
		
		
		/*Size and then display the frame.*/
		
		frame.pack();
		frame.setVisible(true);
		
		
		
		
		
		
	}
	/**
	 * Handle the button click.
	 * pre: none
	 * post: The appropriate image and message are displayed.
	 */
	public void actionPerformed(ActionEvent event)
	{
		String eventName = event.getActionCommand();
		String prize;
		
		/*Checks to see if the player has won the First prize or consolation prize before displaying either three broken plates and a tiger plush or two broken plates and a sticker after which it will display the option to play again.*/
		
		if (eventName == "Play")
		{
			prize = breakAPlate.start();
			if (prize.equals(FIRST_PRIZE))
			{
				plates.setIcon(new ImageIcon("C:\\Users\\26031001\\git\\CS30Fall2023\\Chapter10\\plates_all_broken.gif"));
				
				prizeWon.setIcon(new ImageIcon("C:\\Users\\26031001\\git\\CS30Fall2023\\Chapter10\\tiger_plush.gif"));
			}
			else if (prize.equals(CONSOLATION_PRIZE))
			{
				plates.setIcon(new ImageIcon("C:\\Users\\26031001\\git\\CS30Fall2023\\Chapter10\\plates_two_broken.gif"));
				
				prizeWon.setIcon(new ImageIcon("C:\\Users\\26031001\\git\\CS30Fall2023\\Chapter10\\sticker.gif"));
			}
			prizeWon.setText("You win: " + prize);
			play.setText("Play Again");
			play.setActionCommand("Play Again");
		}
		else if (eventName == "Play Again")
		{
			plates.setIcon(new ImageIcon("C:\\Users\\26031001\\git\\CS30Fall2023\\Chapter10\\plates.gif"));
			prizeWon.setText(" ");
			prizeWon.setIcon(null);
			play.setText("Play");
			play.setActionCommand("Play");
		}
	}
	/**
	 * Create and show the GUI.
	 */
	private static void runGUI()
	{
		JFrame.setDefaultLookAndFeelDecorated(true);
		
		BreakAPlate carnivalGame = new BreakAPlate();
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

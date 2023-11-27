package Mastery;

import java.awt.EventQueue;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Component;
import javax.swing.BoxLayout;

public class PhotoAlbum3 
{
	
	
	int counter = 1;

	private JFrame frame;

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
					PhotoAlbum3 window = new PhotoAlbum3();
					window.frame.setVisible(true);
				} 
				catch (Exception e) 
				{
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public PhotoAlbum3() 
	{
		initialize();
	}
	
	
	
	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() 
	{
	    String FIRST_PHOTO = "Mount Fuji";
		String SECOND_PHOTO = "Eiffel Tower";
		String THIRD_PHOTO = "Calgary Saddledome";
		String FOURTH_PHOTO = "Moraine Lake";
		ImageIcon FIRST_PHOTO2 = new ImageIcon("C:\\Users\\26031001\\git\\CS30Fall2023\\Chapter10v\\src\\Mastery\\Mount_Fuji.jpg");  
		ImageIcon SECOND_PHOTO2 = new ImageIcon("C:\\Users\\26031001\\git\\CS30Fall2023\\Chapter10v\\Eiffel_Tower.jpg");
		ImageIcon THIRD_PHOTO2 = new ImageIcon("C:\\Users\\26031001\\git\\CS30Fall2023\\Chapter10v\\Calgary_Saddledome.jpg");
		ImageIcon FOURTH_PHOTO2 = new ImageIcon("C:\\Users\\26031001\\git\\CS30Fall2023\\Chapter10v\\Moraine_Lake.jpg");
		

		
		frame = new JFrame("PhotoAlbum");
		frame.setBounds(100, 100, 253, 237);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 237, 198);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel photName = new JLabel(" ");
		photName.setBounds(0, 11, 237, 14);
		panel.add(photName);
		
		JLabel phot = new JLabel("");
		phot.setBounds(23, 35, 192, 89);
		phot.setAlignmentX(Component.CENTER_ALIGNMENT);
		panel.add(phot);
		
		
		
		JButton Next = new JButton("Next");
		Next.setActionCommand("Next");
		Next.setBounds(78, 135, 79, 23);
		Next.setAlignmentX(Component.CENTER_ALIGNMENT);
		Next.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
			
				counter++;
				
				
				if(counter == 5)
				{
					counter = 1;
				}
				if(counter == 1)
				{
					phot.setIcon(FIRST_PHOTO2);
					
					photName.setText("Photo one's Name: " + FIRST_PHOTO);
				}
				else if(counter == 2)
				{
					phot.setIcon(SECOND_PHOTO2);
					
					photName.setText("Photo two's Name: " + SECOND_PHOTO);
				}
				else if(counter == 3)
				{
					phot.setIcon(THIRD_PHOTO2);
					
					photName.setText("Photo three's Name: " + THIRD_PHOTO);
				}
				else if(counter == 4)
				{
					phot.setIcon(FOURTH_PHOTO2);
					
					photName.setText("Photo four's Name: " + FOURTH_PHOTO);
				}
				else
				{
					System.out.println(counter);
				}
						
			
			
			}
				
				
				
				
				
			
		});
		panel.add(Next);
		
	
		

		
		
		
		
		
		
		
		
	}

	protected static String start() 
	{
		// TODO Auto-generated method stub
		return null;
	}
}

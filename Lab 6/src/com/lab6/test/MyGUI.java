package com.lab6.test;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class MyGUI extends JFrame implements ActionListener
{
	//Attributes
	private JButton button1;
	private JButton button2;
	private JLabel label1;
	private JTextField field1;
	Random rand = new Random();
	int randnum;
	int counter = 0;
	int check = 0;
	
	//Constructor
	public MyGUI(String title)
	{
		super(title);
		setLayout(new BorderLayout());
		setLayout(new FlowLayout());
		
		button1 = new JButton("Generate the random number");
		button2 = new JButton("Check your guess");
		label1 =  new JLabel("Then make a guess..  ");
		field1 = new JTextField(100);
		field1 = new JTextField("Enter your guess");
		//field1 = new IntTextField(12, 3);
		field1.setColumns(15);
		
		//Create panels
		JPanel panel1 = new JPanel();
		JPanel panel2 = new JPanel();
		JPanel panel3 = new JPanel();
		
		//Adding the panels
		add(panel1, BorderLayout.NORTH);
		add(panel2, BorderLayout.CENTER);
		add(panel3, BorderLayout.SOUTH);
		
		//Adding attributes to the panel
		panel1.add(button1);
		panel2.add(label1);
		panel2.add(field1);
		panel3.add(button2);
		
		//Set screen size
		setSize(400,400);
		
		//Makes the screen visible
		setVisible(true);
		
		//Set the location of the screen
		setLocation(100,100);
		
		//Link the listener to the button you want to monitor
		button1.addActionListener(this);
		button2.addActionListener(this);
		field1.addActionListener(this);
	}
	
	public void actionPerformed(ActionEvent event) 
	{	
		if(event.getSource() == button1)
		{
			check += 1;
			randnum = rand.nextInt(100);
			System.out.println(randnum);
		}
		
		if(event.getSource() == button2)
		{
			field1.getText();
			
			if(check != 0)
			{
				counter += 1;
				try 
				{	
					int guess = Integer.parseInt(field1.getText());
					
					//Checks if guess within the correct range
					if(guess < 0 || guess > 100)
					{
						JOptionPane.showMessageDialog(this,"Your guess is not within range guess again!!!");
						counter -= 1;
					}
					else
					{
						if(guess == randnum)
						{
							JOptionPane.showMessageDialog(this,"Well done! Your guess of "+field1.getText()+" is equal to the random number. It took you "+counter+" guesses."); 
						}
						else if(guess > randnum)
						{
							JOptionPane.showMessageDialog(this,"Your guess of "+field1.getText()+" is too high. Guess again.");
						}
						else if(guess < randnum)
						{
							JOptionPane.showMessageDialog(this,"Your guess of "+field1.getText()+" is too low. Guess again.");
						}
					}	
				}
				catch(Exception ee)
				{
					JOptionPane.showMessageDialog(this,"Invalid Input");
				}
			}
		}
		
		if(check == 0)
		{
			JOptionPane.showMessageDialog(this,"You have not generated a random number yet!!!");
		}
	}
}
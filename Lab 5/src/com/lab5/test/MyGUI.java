package com.lab5.test;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.Hashtable;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JSlider;
import javax.swing.JTextField;

public class MyGUI extends JFrame implements ActionListener, MouseListener
{
	//Attributes
	private JButton button1, button2;
	private JLabel label1;
	private JLabel label2;
	private JSlider slider1;
	private JTextField field1;
	
	
	//Constructor
	public MyGUI()
	{
		super("My Screen");
		setLayout(new BorderLayout());
		setLayout(new FlowLayout());
		
		button1 = new JButton("The first GUI button");
		button2 = new JButton("The second GUI button");
		label1 =  new JLabel("The first label on the screen");
		slider1 = new JSlider();
		field1 = new JTextField("Name");
		label2 =  new JLabel("The label is here");
		field1.setColumns(20);
		
		//Setting the Labels for the Table
		slider1.setPaintLabels(true);
		Hashtable<Integer,JLabel> table = new Hashtable<Integer,JLabel>();
		table.put(0, new JLabel("YES....."));
		table.put(100, new JLabel("NO....."));
		slider1.setLabelTable(table);  	
		
		//Create panels
		JPanel panel1 = new JPanel();
		JPanel panel2 = new JPanel();
		
		//Adding the panels
		add(panel1, BorderLayout.CENTER);
		add(panel2, BorderLayout.CENTER);
		
		//Adding attributes to the panel
		panel1.add(button1);
		panel1.add(button2);
		panel1.add(slider1);
		panel1.add(label1);
		panel1.add(field1);
		panel2.add(label2);
		
		//Setting background color of the label to red
		panel2.setBackground(Color.red);
		
		//Set screen size
		setSize(1000,800);
		
		//Makes the screen visible
		setVisible(true);
		
		//Set the location of the screen
		setLocation(100,100);
		
		//JOptionPane pane = new JOptionPane(button1);
		
		
		//Link the listener to the button you want to monitor
		button1.addActionListener(this);
		button2.addActionListener(this);
		field1.addActionListener(this);
		panel2.addMouseListener(this);
	}
		
	public void actionPerformed(ActionEvent event) 
	{
		if(event.getSource() == button1)
		{
			JOptionPane.showMessageDialog(this, "You have just clicked Button 1");
		}
		if(event.getSource() == button2)
		{
			JOptionPane.showMessageDialog(this, "You have just clicked Button 2");
		}
		if(event.getSource() == field1)
		{
			JOptionPane.showMessageDialog(this,"You Entered: "+field1.getText());
			
		}
	}
	
	@Override
	public void mouseClicked(MouseEvent e) 
	{
		if(e.getButton() == MouseEvent.BUTTON1)
		{
			JOptionPane.showMessageDialog(this,"Left Click");
		}

		if(e.getButton() == MouseEvent.BUTTON3)
		{
			JOptionPane.showMessageDialog(this,"Right Click");
		}
	}


	@Override
	public void mouseEntered(MouseEvent e) 
	{
		JOptionPane.showMessageDialog(this,"Mouse Entered the Panel");
		
		
	}


	@Override
	public void mouseExited(MouseEvent e) 
	{
		JOptionPane.showMessageDialog(this,"Mouse Exited the Panel");
		
	}


	@Override
	public void mousePressed(MouseEvent e) 
	{
		// TODO Auto-generated method stub
		
	}


	public void mouseReleased(MouseEvent e) 
	{
		// TODO Auto-generated method stub
		
	}
}

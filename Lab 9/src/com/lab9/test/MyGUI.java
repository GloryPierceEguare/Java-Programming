package com.lab9.test;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class MyGUI extends JFrame implements ActionListener
{
	//Attributes
	private JTextField field1;
	private JTextField field2;
	private JTextField field3;
	private JButton button1;
	private JButton button2;
	private JButton button3;
	private JTextArea area1; 
	private ArrayList<Person> personList = new ArrayList<Person>();
	private Person p1;
	
	//Constructor
	public MyGUI(String title)
	{
		super(title);
		setLayout(new BorderLayout());
		setLayout(new FlowLayout());
		
		button1 = new JButton("Save");
		button2 = new JButton("Show all");
		button3 = new JButton("Delete");
		field1 = new JTextField(100);
		field1 = new JTextField("First Name");
		field1.setColumns(10);
		field2 = new JTextField(100);
		field2 = new JTextField("Surname");
		field2.setColumns(10);
		field3 = new JTextField(100);
		field3 = new JTextField("City");
		field3.setColumns(10);
		area1 = new JTextArea("People added are:\n");
		area1.setRows(8);
		area1.setColumns(40);
		
		//Create panels
		JPanel panel1 = new JPanel();
		JPanel panel2 = new JPanel();
		
		//Adding the panels
		add(panel1, BorderLayout.NORTH);
		add(panel2, BorderLayout.SOUTH);
		
		//Adding attributes to the panel
		panel1.add(field1);
		panel1.add(field2);
		panel1.add(field3);
		panel1.add(button1);
		panel1.add(button2);
		panel2.add(button3);
		panel2.add(area1);
		
		//Set screen size
		setSize(600,400);
		
		//Makes the screen visible
		setVisible(true);
		
		//Set the location of the screen
		setLocation(100,100);
		
		//Link the listener to the button you want to monitor
		button1.addActionListener(this);
		button2.addActionListener(this);
		button3.addActionListener(this);
		field1.addActionListener(this);
	}

	public void actionPerformed(ActionEvent event) 
	{
		if(event.getSource() == button1)
		{
			p1 = new Person(field1.getText(),field2.getText(),field3.getText());
			JOptionPane.showMessageDialog(this,"You just added this person: "+field1.getText()+" "+field2.getText()+" from "+field3.getText()+".");
			personList.add(p1); 
		}
		
		if(event.getSource() == button2)
		{
			for(Person i : personList)
			{
				area1.append(i +"\n");
			}
			//area1.append("You just added this person: "+field1.getText()+" "+field2.getText()+" from "+field3.getText()+".\n");
		     
		}
		
		if(event.getSource() == button3)
		{
			personList.clear();
			area1.setText(null);
		}
	}
}

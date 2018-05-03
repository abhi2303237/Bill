package com.bill;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class UserInterface extends JFrame{
	
	private JTextField fname;
	private JLabel lname;
	private JTextField femail;
	private JLabel lemail;
	private JTextField fpasswd;
	private JLabel lpasswd;
	private JTextField fmark;
	private JLabel lmark;
	private JButton save;
	
	
	UserInterface(){
		setTitle("Bill");
		fname = new JTextField(40);
		femail = new JTextField(40);
		fpasswd = new JTextField(40);
		fmark = new JTextField(40);
		
		lname = new JLabel("Name:");
		lemail = new JLabel("Email:");
		lpasswd = new JLabel("Password:");
		lmark = new JLabel("Mark:");
		
		save = new JButton("SAVE");
		
		add(lname);
		add(fname);
		add(lemail);
		add(femail);
		add(lpasswd);
		add(fpasswd);
		add(lmark);
		add(fmark);
		add(save);
		
//        add(label);
//        label.setLocation(10, 490);
        this.setSize(500,500);
        setVisible(true);
        setLayout(new FlowLayout());
	}

	public static void main(String args[]) {
		
		UserInterface ui= new UserInterface();
	}
	
}

	


	
	
	
	


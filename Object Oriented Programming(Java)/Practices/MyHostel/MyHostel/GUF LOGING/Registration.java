import java.lang.*;
import javax.swing.*;
import java.awt.Color;
import java.io.FileWriter;
import java.awt.*;
import java.awt.event.*;
import java.io.*;

public class Registration extends JFrame implements ActionListener {
	ImageIcon img;
	JLabel userLabel, passLabel, imgLabel;
	JTextField userTF;
	JPasswordField passPF;
	JButton loginBtn, backBtn;
	JRadioButton r1, r2, r3;
	JCheckBox c1, c2, c3;
	ButtonGroup bg1;
	JComboBox combo;
	JPanel panel;

	public Registration() {
		super("Hostal System");
		this.setSize(700, 450);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.getContentPane().setBackground(new java.awt.Color(145, 204, 243));

		panel = new JPanel();
		panel.setLayout(null);

		userLabel = new JLabel("User Name : ");
		userLabel.setBounds(150, 115, 100, 30);
		panel.add(userLabel);

		userTF = new JTextField();
		userTF.setBounds(280, 115, 200, 30);
		panel.add(userTF);

		passLabel = new JLabel("Password : ");
		passLabel.setBounds(150, 165, 200, 30);
		panel.add(passLabel);

		passPF = new JPasswordField();
		passPF.setBounds(280, 165, 200, 30);
		panel.add(passPF);

		JButton regBtn = new JButton("Registration");
		regBtn.setBounds(150, 225, 110, 30);
		panel.add(regBtn);

		backBtn = new JButton("Back");
		backBtn.setBounds(390, 225, 80, 30);
		backBtn.addActionListener(this);
		panel.add(backBtn);

		regBtn.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent ae) {
				try{
				FileWriter fw =new FileWriter("login.txt",true);
				//userTF = new JTextField();
				fw.write(userTF.getText()+"\t"+passPF.getText()+"\n");
				fw.close();
				JFrame f = new JFrame();
				JOptionPane.showMessageDialog(f,"Registration Completed ");
				dispose();
				}catch(Exception e){}
			}
		});



		bg1 = new ButtonGroup();
		bg1.add(r1);
		bg1.add(r2);
		bg1.add(r3);

		String items[] = { "Student", "Manager" };
		combo = new JComboBox(items);
		combo.setBounds(150, 50, 330, 30);
		panel.add(combo);

		this.add(panel);
		setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==backBtn){
			this.dispose();
			Admin a = new Admin();
		}
		
	}

}
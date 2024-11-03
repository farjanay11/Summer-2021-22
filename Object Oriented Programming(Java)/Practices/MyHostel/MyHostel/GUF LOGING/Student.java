import java.lang.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Student extends JFrame
{
	JPanel panel;
	JLabel L1,L2,L3;
	JTextField nameTF,idTF,roomTF;
    JButton btnE,btnB;
	Font font;
	Color c;
	
	public Student()
	{
		super ("Student");
		this.setSize(400,400);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		c = new Color(128, 128, 128);
		
		panel = new JPanel();
		panel.setLayout(null);
		panel.setBackground(c);
		
		L1 = new JLabel("Name:");
		L1.setBounds(80,40,80,50);
		font = new Font ("Arial" , Font.BOLD,15);
		L1.setFont(font);
		c = new Color(0,0,0);
		L1.setForeground(c);
		panel.add(L1);
		
		nameTF = new JTextField();
		nameTF.setBounds(160, 50, 100, 30);
		c = new Color(192,192,192);
		nameTF.setBackground(c);
		panel.add(nameTF);
		
		L2 = new JLabel("ID:");
		L2.setBounds(80,120,80,50);
		font = new Font ("Arial" , Font.BOLD,15);
		L2.setFont(font);
		c = new Color(0,0,0);
		L2.setForeground(c);
		panel.add(L2);
		
	    idTF = new JTextField();
		idTF.setBounds(160, 130, 100, 30);
		c = new Color(192,192,192);
		idTF.setBackground(c);
		panel.add(idTF);
		
		L3 = new JLabel("Room No:");
		font = new Font ("Arial" , Font.BOLD,15);
		L3.setFont(font);
		c = new Color(0,0,0);
		L3.setForeground(c);
		L3.setBounds(80,190,80,50);
		panel.add(L3);
		
	    roomTF = new JTextField();
		roomTF.setBounds(160, 200, 100, 30);
		c = new Color(192,192,192);
		roomTF.setBackground(c);
		panel.add(roomTF);
		
		btnE = new JButton("Enter");
		btnE.setBounds(80,280,80,30);
		c = new Color(0,0,0);
		btnE.setForeground(c);
		c = new Color(255,255,255);
		btnE.setBackground(c);
		font = new Font ("Arial" , Font.BOLD,15);
		btnE.setFont(font);
		panel.add(btnE);
		
		btnB = new JButton("Back");
		btnB.setBounds(180,280,80,30);
		c = new Color(0,0,0);
		btnB.setForeground(c);
		c = new Color(255,255,255);
		btnB.setBackground(c);
		font = new Font ("Arial" , Font.BOLD,15);
		btnB.setFont(font);
		panel.add(btnB);
		
		btnE.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				dispose();
				ConfirmMeal me = new ConfirmMeal();
				me.setVisible(true);
			}
		});
		
		btnB.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				dispose();
				Admin a = new Admin();
				a.setVisible(true);
			}
		});
	
			
		this.add(panel);
		
	}
	
}

import java.lang.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ConfirmMeal extends JFrame
{
	JPanel panel;
	JLabel label;
	Font font;
	Color c;
	//JCheckBox r1,f1,d1,m1,v1,e1;
	JComboBox r2,f2,d2,m2,v2,e2;
	JButton btnC,btnB;
	
	public ConfirmMeal()
	{
		super ("ConfirmMeal");
		this.setSize(600,600);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		c = new Color(128, 128, 128);
		
		panel = new JPanel();
		panel.setLayout(null);
		panel.setBackground(c);
		
		label = new JLabel("Select Meal");
		c = new Color(0,0,0);
		label.setForeground(c);
		font = new Font ("Arial" , Font.BOLD,18);
		label.setFont(font);
		label.setBounds(235,5,150,50);
		panel.add(label);
		
		/*r1 = new JCheckBox("Rice");
		r1.setBounds(20, 10, 80, 20);
		panel.add(r1);*/
		
		String rice[] = {"Rice(0)","Rice(1)","Rice(2)","Rice(3)"};
		r2 = new JComboBox(rice);
		r2.setBounds(40, 70, 90, 30);
		c = new Color(192,192,192);
		r2.setBackground(c);
		panel.add(r2);
		
		/*f1 = new JCheckBox("Fish");
		f1.setBounds(220, 10, 80, 20);
		panel.add(f1);*/
		
		String fish[] = {"Fish(0)","Fish(1)", "Fish(2)", "Fish(3)"};
		f2 = new JComboBox(fish);
		f2.setBounds(240, 70, 90, 30);
		c = new Color(192,192,192);
		f2.setBackground(c);
		panel.add(f2);
		
		/*d1 = new JCheckBox("Dal");
		r1.setBounds(420, 10, 80, 20);
		panel.add(r1);*/
		
		String dal[] = {"Dal(0)","Dal(1)", "Dal(2)", "Dal(3)"};
		d2 = new JComboBox(dal);
		d2.setBounds(440, 70, 90, 30);
		c = new Color(192,192,192);
		d2.setBackground(c);
		panel.add(d2);
		
		/*m1 = new JCheckBox("Meat");
		m1.setBounds(20, 80, 80, 20);
		panel.add(m1);*/
		
		String meat[] = {"Meat(0)","Meat(1)", "Meat(2)", "Meat(3)"};
		m2 = new JComboBox(meat);
		m2.setBounds(40, 130, 90, 30);
		c = new Color(192,192,192);
		m2.setBackground(c);
		panel.add(m2);
		
		/*v1 = new JCheckBox("Vegetables");
		v1.setBounds(220, 80, 80, 20);
		panel.add(v1);*/
		
		String veg[] = {"Vegetables(0)","Vegetables(1)", "Vegetables(2)", "Vegetables(3)"};
		v2 = new JComboBox(veg);
		v2.setBounds(240, 130, 90, 30);
		c = new Color(192,192,192);
		v2.setBackground(c);
		panel.add(v2);
		
		/*e1 = new JCheckBox("Egg");
		e1.setBounds(320, 80, 80, 20);
		panel.add(e1);*/
		
		String egg[] = {"Egg(0)","Egg(1)", "Egg(2)", "Egg(3)"};
		e2 = new JComboBox(egg);
		e2.setBounds(440, 130, 90, 30);
		c = new Color(192,192,192);
		e2.setBackground(c);
		panel.add(e2);
		
		btnC = new JButton("Confirm");
		btnC.setBounds(160,190,100,30);
		c = new Color(0,0,0);
		btnC.setForeground(c);
		c = new Color(255,255,255);
		btnC.setBackground(c);
		font = new Font ("Arial" , Font.BOLD,15);
		btnC.setFont(font);   
		panel.add(btnC);
		
		btnB = new JButton("Back");
		btnB.setBounds(310,190,100,30);
		c = new Color(0,0,0);
		btnB.setForeground(c);
		c = new Color(255,255,255);
		btnB.setBackground(c);
		font = new Font ("Arial" , Font.BOLD,15);
		btnB.setFont(font);
		panel.add(btnB);
		
		
		btnB.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				dispose();
				Student s = new Student();
				s.setVisible(true);
			}
		});
        
		
		/*btnB.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				Employee em = new Employee();
				em.setVisible(true);
			}
		});*/
     
	 
	 

			
		this.add(panel);
		
	}
	
}

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
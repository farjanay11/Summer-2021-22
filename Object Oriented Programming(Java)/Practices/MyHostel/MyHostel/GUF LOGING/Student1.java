import javax.swing.*;    
import javax.swing.border.*;

public class Student1 extends JFrame
{
	ImageIcon img;
	
	JPanel panel;
	JButton viewBtn,resultBtn,noticeBtn,sBtn,paymentBtn,s2Btn,lBtn,bBtn; 
	public Student1()
	{
		super("Student");
		this.setSize(800, 800);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		panel = new JPanel();
		panel.setLayout(null);
		panel.setVisible(true);
		JLabel background;
		
		viewBtn = new JButton("View Profile");
		viewBtn.setBounds(280, 220, 220, 30);
		
		panel.add(viewBtn);
		
		
		resultBtn = new JButton("Result");
		resultBtn.setBounds(280, 270, 220, 30);
		
		panel.add(resultBtn);
		
		noticeBtn = new JButton("Notice");
		noticeBtn.setBounds(280, 320, 220, 30);
		
		panel.add(noticeBtn);
		
		sBtn = new JButton("Class Schedule");
		sBtn.setBounds(280, 370, 220, 30);
		
		panel.add(sBtn);
		
		paymentBtn = new JButton("Payment");
		paymentBtn.setBounds(280, 420, 220, 30);
		
		panel.add(paymentBtn);
		
		
		lBtn = new JButton("Logout");
		lBtn.setBounds(400, 50, 80, 30);
		
		panel.add(lBtn);
		
		bBtn = new JButton("Back");
		bBtn.setBounds(500, 50, 80, 30);
		
		panel.add(bBtn);
		
		background = new JLabel(" ",img,JLabel.CENTER);
		background.setBounds(200,45,1200,700);
		add(background);
		
		this.add(panel);
		this.setVisible(true);
	}
	public static void main(String[] args)
	{
		Student1 S = new Student1();
	}
}
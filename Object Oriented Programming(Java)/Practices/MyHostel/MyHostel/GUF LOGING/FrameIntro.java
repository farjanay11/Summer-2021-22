import java.lang.*;
import javax.swing.*;
import java.awt.*;


public class FrameIntro extends JFrame
{
	
	JLabel idLabel, fnameLabel, lnameLabel,phonelabel,emaillabel,grouplabel,piclabel,addresslabel;
	JTextField idTF,fnameTF,lnameTF,phoneTF,emailTF,groupTF,picTF,addressTF;
	JButton browseBtn, deleteBtn,editBtn,addBtn;
	JComboBox combo;
	JPanel panel;
	Color myColor;
	Font myFont;

	public FrameIntro()
	{
		super("Premium Alcazaba Hostel");
		this.setSize(800, 700);
		Image icon = Toolkit.getDefaultToolkit().getImage("hostel-sign-.jpg");
		setIconImage(icon);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		myColor = new Color(192, 192, 192);
		myFont = new Font("Arial", Font.PLAIN, 28);
		
		panel = new JPanel();
		panel.setLayout(null);
		panel.setBackground(myColor);
		
		idLabel = new JLabel("ID : ");
		idLabel.setBounds(10,10, 160, 30);
		panel.add(idLabel);
		
		fnameLabel = new JLabel("First Name : ");
		fnameLabel.setBounds(10, 60, 160, 30);
		panel.add(fnameLabel);
		
		lnameLabel = new JLabel("Last Name : ");
		lnameLabel.setBounds(10, 110, 160, 30);
		panel.add(lnameLabel);
		
		
		phonelabel = new JLabel("Phone Number: ");
		phonelabel.setBounds(10, 160, 160, 30);
		panel.add(phonelabel);
		
		
		emaillabel = new JLabel("EMAIL: ");
		emaillabel.setBounds(10, 210, 160, 30);
		panel.add(emaillabel);
		
		
		
		/*grouplabel = new JLabel(" ");
		grouplabel.setBounds(10, 260, 160, 30);
		panel.add(grouplabel);*/
		
		
		piclabel = new JLabel("Profile Picture: ");
		piclabel.setBounds(10, 320, 160, 30);
		panel.add(piclabel);
		
		
		addresslabel = new JLabel("Address: ");
		addresslabel.setBounds(10, 400, 160, 30);
		panel.add(addresslabel);
		
		
		
		idTF = new JTextField();
		idTF .setBounds(110,10, 160, 30);
		panel.add(idTF);
		
		
		fnameTF = new JTextField();
		fnameTF .setBounds(110, 60, 160, 30);
		panel.add(fnameTF);
		
		
		lnameTF = new JTextField();
		lnameTF .setBounds(110, 110, 160, 30);
		panel.add(lnameTF);
		
		
		phoneTF = new JTextField();
		phoneTF .setBounds(110, 160, 160, 30);
		panel.add(phoneTF);
		
		
		
		emailTF = new JTextField();
		emailTF .setBounds(110, 210, 160, 30);
		panel.add(emailTF);
		
		
		
		
		
		
		picTF = new JTextField();
		picTF .setBounds(110, 320, 160, 70);
		panel.add(picTF);
		
		
		
		addressTF = new JTextField();
		addressTF .setBounds(110, 400, 220, 70);
		panel.add(addressTF);
		
		
		
		
		
		
		
		
		browseBtn = new JButton("Browse");
		browseBtn.setBounds(300, 340, 85, 30);
		panel.add(browseBtn);
		
		
		deleteBtn = new JButton("Delete");
		deleteBtn.setBounds(50,500, 75, 30);
		panel.add(deleteBtn);
		
		
		editBtn = new JButton("EDIT");
		editBtn.setBounds(150,500, 75, 30);
		panel.add(editBtn);
		
		
		addBtn = new JButton("ADD");
		addBtn.setBounds(250,500, 75, 30);
		panel.add(addBtn);
		
		
		
		String items[] = { "Student", "Empolory"};
		combo = new JComboBox(items);
		combo.setBounds(10, 260, 260, 30);
		panel.add(combo);
		
		this.add(panel);
	}
	
	
	public static void main(String args[])
	{
		FrameIntro fi = new FrameIntro();
		fi.setVisible(true);
	}
}
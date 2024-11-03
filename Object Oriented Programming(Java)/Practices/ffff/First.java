import javax.swing.*;  
public class First {  
public static void main(String[] args) {  
JFrame f=new JFrame();//creating instance of JFrame  
          
JButton b=new JButton("Farjana");//creating instance of JButton  
b.setBounds(50,50,100, 40);//x axis, y axis, width, height  
f.add(b);//adding button in JFrame  

JButton c=new JButton("Yesmin");
c.setBounds(200,50,100,40);
f.add(c);
 
JButton d=new JButton("Opi");
d.setBounds(130,120,100,40);
f.add(d);

          
f.setSize(400,500);//400 width and 500 height  
f.setLayout(null);//using no layout managers  
f.setVisible(true);//making the frame visible  
}  
}  

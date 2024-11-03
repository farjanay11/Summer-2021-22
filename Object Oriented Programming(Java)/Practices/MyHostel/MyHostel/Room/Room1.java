import java.lang.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Room1 extends JFrame implements ActionListener{

    JPanel panel;
    JLabel label1,label2,label3;
    JButton r1,r2,r3,r4,r5,r6,r7,r8,r9,r10,br1,br2,br3,br4,br5,ar1,ar2,ar3,ar4,ar5,cnf,can,back;
    JCheckBox cbr1,cbr2,cbr3,cbr4,cbr5;
    ButtonGroup checkbox;
    
    public Room1(){
        super("Room management page");
        this.setSize(800,800);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //this.setLayout(null);
        
        panel = new JPanel();
        panel.setLayout(null);
        panel.setVisible(true);
        this.add(panel);
        
        label1 = new JLabel("ALL ROOMS");
        label1.setBounds(80,10,200,50);
        label1.setFont(new Font("Rockwell",Font.BOLD,20));
        panel.add(label1);

        r1 = new JButton("Room1");
        r1.setBounds(40,70,200,50);
        panel.add(r1);
        
        r2 = new JButton("Room2");
        r2.setBounds(40,130,200,50);
        panel.add(r2);

        r3 = new JButton("Room3");
        r3.setBounds(40,190,200,50);
        panel.add(r3);

        r4 = new JButton("Room4");
        r4.setBounds(40,250,200,50);
        panel.add(r4);

        r5 = new JButton("Room5");
        r5.setBounds(40,310,200,50);
        panel.add(r5);

        r6 = new JButton("Room6");
        r6.setBounds(40,370,200,50);
        panel.add(r6);

        r7 = new JButton("Room7");
        r7.setBounds(40,430,200,50);
        panel.add(r7);

        r8 = new JButton("Room8");
        r8.setBounds(40,490,200,50);
        panel.add(r8);

        r9 = new JButton("Room9");
        r9.setBounds(40,550,200,50);
        panel.add(r9);

        r10 = new JButton("Room10");
        r10.setBounds(40,610,200,50);
        r10.addActionListener(this);
        panel.add(r10);
        
        label2 = new JLabel("BOOKED ROOMS");
        label2.setFont(new Font("Rockwell",Font.BOLD,20));
        label2.setBounds(260,10,200,50);
        panel.add(label2);

        br1 = new JButton("Room1");
        br1.setBounds(250,70,200,50);
        panel.add(br1);

        br2 = new JButton("Room2");
        br2.setBounds(250,130,200,50);
        panel.add(br2);

        br3 = new JButton("Room3");
        br3.setBounds(250,190,200,50);
        panel.add(br3);

        br4 = new JButton("Room4");
        br4.setBounds(250,250,200,50);
        panel.add(br4);

        br5 = new JButton("Room5");
        br5.setBounds(250,310,200,50);
        panel.add(br5);

        label3 = new JLabel("AVAILABLE ROOMS");
        label3.setFont(new Font("RockWell",Font.BOLD,20));
        label3.setBounds(470,10,200,50);
        panel.add(label3);
        
        ar1 = new JButton("Room6");
        ar1.setBounds(460,70,200,50);
        panel.add(ar1);

        ar2 = new JButton("Room7");
        ar2.setBounds(460,130,200,50);
        panel.add(ar2);

        ar3 = new JButton("Room8");
        ar3.setBounds(460,190,200,50);
        panel.add(ar3);

        ar4 = new JButton("Room9");
        ar4.setBounds(460,250,200,50);
        panel.add(ar4);

        ar5 = new JButton("Room10");
        ar5.setBounds(460,310,200,50);
        panel.add(ar5);

        cbr1 = new JCheckBox();
        cbr1.setBounds(670,85,40,20);
        panel.add(cbr1);

        cbr2 = new JCheckBox();
        cbr2.setBounds(670,145,40,20);
        panel.add(cbr2);

        cbr3 = new JCheckBox();
        cbr3.setBounds(670,205,40,20);
        panel.add(cbr3);

        cbr4 = new JCheckBox();
        cbr4.setBounds(670,265,40,20);
        panel.add(cbr4);

        cbr5 = new JCheckBox();
        cbr5.setBounds(670,325,40,20);
        panel.add(cbr5);

        cnf = new JButton("CONFIRM");
        cnf.setBounds(470,370,90,30);
        cnf.addActionListener(this);
        panel.add(cnf);

        can = new JButton("Cancel");
        can.setBounds(570,370,80,30);
        panel.add(can);

        back = new JButton("Back");
        back.setBounds(600,500,50,50);
        panel.add(back);

        checkbox = new ButtonGroup();
        checkbox.add(cbr1);
        checkbox.add(cbr2);
        checkbox.add(cbr3);
        checkbox.add(cbr4);
        checkbox.add(cbr5);
    

        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // TODO Auto-generated method stub
        if(cbr1.isSelected() && e.getSource() == cnf || cbr2.isSelected() && e.getSource() == cnf || cbr3.isSelected() &&
        e.getSource()==cnf || cbr4.isSelected()&& e.getSource()==cnf || cbr5.isSelected() && e.getSource()==cnf ){
            this.dispose();
            Room2 r = new Room2();
            
        }
    }

}

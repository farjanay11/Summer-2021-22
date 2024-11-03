import javax.swing.*;
import java.awt.Color;
import java.awt.event.*;
import java.io.BufferedReader;
import java.io.FileReader;
import java.awt.Font;
import java.awt.*;
import java.io.*;
import static javax.swing.JOptionPane.showMessageDialog;

public class LoginPage implements ActionListener {

    JFrame f;

    JLabel UsernameNameLabel;
    JLabel PasswordLabel;
    JLabel LoginPageLogo;
    JLabel LogoMessage;

    JTextField UsernameTextField;

    JPasswordField PasswordField;

    JButton Login;
    JButton ForgotPassword;
    JButton RegisterAccount;

    LoginPage() {

        f = new JFrame();

        // --------------------------------------------------- Color, Font initializer
        Color lightBlue = new Color(102, 178, 255);
        f.getContentPane().setBackground(lightBlue);

        Color ForButtonInLoginPage = new Color(255, 255, 255);
        Color ForButton = new Color(0, 0, 255);

        Font ButtonFont = new Font("Arial Black", Font.BOLD, 12);
        Font UnderLogo = new Font("classic-roman", Font.ITALIC, 25);

        // -------------------------------------------------- JPanel Borders
        JPanel border = new JPanel();
        border.setBounds(20, 20, 700, 450);
        border.setBackground(lightBlue);
        border.setBorder(BorderFactory.createLineBorder(Color.white, 4, true));

        // ---------------------------------------------- JLebel bounds, color
        // ------------------------------------------------ JTextField JPasswordField
        // bounds, color

        UsernameNameLabel = new JLabel("Username");
        UsernameNameLabel.setBounds(200, 170, 200, 20);
        UsernameNameLabel.setForeground(Color.white);
        UsernameTextField = new JTextField();
        UsernameTextField.setBounds(300, 170, 150, 20);

        PasswordLabel = new JLabel("Password");
        PasswordLabel.setBounds(200, 200, 200, 20);
        PasswordLabel.setForeground(Color.white);
        PasswordField = new JPasswordField();
        PasswordField.setBounds(300, 200, 150, 20);

        // --------------------------------------------------------------- Login Page
        // Logo and Message
        LoginPageLogo = new JLabel();
        LoginPageLogo.setIcon(new ImageIcon("Booking.png"));
        LoginPageLogo.setBounds(300, -20, 200, 200);
        LoginPageLogo.setLayout(null);

        LogoMessage = new JLabel("Premium Alcazaba Hostel");
        LogoMessage.setBounds(180, 90, 500, 100);
        LogoMessage.setForeground(Color.white);
        LogoMessage.setFont(UnderLogo);

        // ------------------------------------------------- JButton bounds
        Login = new JButton("Login");
        Login.setBounds(280, 235, 80, 30);
        Login.addActionListener(this);
        Login.setBackground(ForButtonInLoginPage);
        // Login.setForeground(Color.black);
        Login.setFont(ButtonFont);
        Login.setFocusPainted(false); // removes the selection border

        ForgotPassword = new JButton("Forgot Password");
        ForgotPassword.setBounds(385, 235, 150, 30);
        ForgotPassword.setBackground(ForButtonInLoginPage);
        // ForgotPassword.setForeground(Color.black);
        ForgotPassword.setFont(ButtonFont);
        ForgotPassword.setFocusPainted(false); // removes the selection border

        RegisterAccount = new JButton("Register");
        RegisterAccount.setBounds(150, 235, 110, 30);
        RegisterAccount.addActionListener(this);
        RegisterAccount.setBackground(ForButtonInLoginPage);
        // RegisterAccount.setForeground(Color.black);
        RegisterAccount.setFont(ButtonFont);
        RegisterAccount.setFocusPainted(false); // removes the selection border

        // ---------------------------------------------------- Adding in frame
        f.add(UsernameNameLabel);
        f.add(PasswordLabel);
        f.add(UsernameTextField);
        f.add(PasswordField);
        f.add(Login);
        f.add(ForgotPassword);
        f.add(RegisterAccount);
        f.add(LoginPageLogo);
        f.add(LogoMessage);
        f.add(border);

        // ---------------------------------------------------- Setting size of frame
        f.setTitle("Premium Alcazaba Hostel");
        f.setSize(700, 450);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.getContentPane().setBackground(new java.awt.Color(145, 204, 243));
        // -------------------------------------- for centering the frame
        f.setLocationRelativeTo(null);
        f.setLayout(null);

        // ---------------------------------------- Icon Settings
        Image icon = Toolkit.getDefaultToolkit().getImage("hostel-sign-.jpg");

        f.setIconImage(icon);
        f.setLayout(null);
        f.setVisible(true);

    }

    public void actionPerformed(ActionEvent e) {
        RegisterAccount.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
               Registration r= new Registration();
               r.setVisible(true);
            }
        });
        Login.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent ae) {
                    Boolean matched = false;
                    String user = UsernameTextField.getText().toString();
                    String pass = PasswordField.getText().toString(); // this will not keep pass in the string pool
                    try {
                        FileReader fr = new FileReader("login.txt");
                        BufferedReader br = new BufferedReader(fr);
                        String line;
                        while ((line = br.readLine()) != null) {
                            if (line.equals(user + "\t" + pass)) {
                                matched = true;
                                break;
                            }
                        }
                        fr.close();
                    }  catch (Exception a) {
                    }
                     if (matched) {

                        // ------------------- Disabling previous frame so that new frame can emerge
                        f.setVisible(false);

                        // ------------------------- Sample() contains new JFrame
                        new Admin();
                    } else {
                        showMessageDialog(null, "Invalid Username and password! Try Again");

                    }
                }

            });
            
        }

    }

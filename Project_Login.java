import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Project_Login extends JFrame implements ActionListener
{
  
JLabel lb1,lb2,lb3,lb4,lb5,lb6,lb7;
JTextField tfusername;
JPasswordField tfpassword;
JButton butlogin,butcancel;
  Project_Login()
  {
    setSize(1250,800);
    
    setLayout(null);
    setTitle("Login Form");
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    //getContentPane().setBackground(Color.PINK);
       
   Font f1=new Font("arial",Font.BOLD,18);         
   Font f2=new Font("arial",Font.BOLD,22);         
   Font f3=new Font("arial black",Font.PLAIN,  32);  
   
   lb1=new JLabel("A Mini Project");
   lb2=new JLabel("Students Campus Placement Information System");
   lb3=new JLabel("Developed for");
   lb4=new JLabel("TNP Section, Pravara Rural College Loni,Rahata,A.nagar");
   lb5=new JLabel("Enter your Username and Password...");
   lb6=new JLabel("Username");
   lb7=new JLabel("Password");
             
   tfusername=new JTextField();
   tfpassword=new JPasswordField();
   tfpassword.setEchoChar('*');
   
   butlogin=new JButton("Login");
   butcancel=new JButton("Cancel");
   butlogin.addActionListener(this);
   butcancel.addActionListener(this);

   lb1.setFont(f1);
   lb2.setFont(f3);
   lb3.setFont(f1);
   lb4.setFont(f2);
   lb5.setFont(f2);
   lb6.setFont(f1);
   lb7.setFont(f1);
   tfusername.setFont(f1);
   tfpassword.setFont(f1);
   butlogin.setFont(f1);
   butcancel.setFont(f1);
   add(lb1);
   add(lb2);
   add(lb3);
   add(lb4);
   add(lb5);
   add(lb6);
   add(lb7);
   add(tfusername);
   add(tfpassword);
   add(butlogin);
   add(butcancel);
   lb1.setBounds(550,55,200,20);
   lb2.setBounds(250,90,900,40);
   lb3.setBounds(550,145,200,20);
   lb4.setBounds(300,180,700,25);

   //code for showing the login image
   ImageIcon img=new ImageIcon("295128.png");
   JLabel lbimage=new JLabel(img);
   add(lbimage);
   lbimage.setBounds(30,220,595,550);

   lb5.setBounds(700,500,400,25);
   lb6.setBounds(700,550,120,25);
   tfusername.setBounds(820,550,150,25);
   lb7.setBounds(700,600,120,25);
   tfpassword.setBounds(820,600,150,25);
   butlogin.setBounds(730,650,120,25);
   butcancel.setBounds(870,650,120,25);
   setVisible(true);
  }

  public void actionPerformed(ActionEvent ae)
  {
    if(ae.getSource()==butlogin)
    {
     if((tfusername.getText().equals("Pranav") && tfpassword.getText().equals("Mhaske")) ||(tfusername.getText().equals("Pranit") && tfpassword.getText().equals("Mandlik")) || (tfusername.getText().equals("Mayur") && tfpassword.getText().equals("Gandu")) )  
     {
      JOptionPane.showMessageDialog(this,"Login Succesfull");
      dispose();
      new Project_Menu();
     }
     else 
     JOptionPane.showMessageDialog(this, "Wrong Username or Password (your coimplaint is forwarded towards DBA)");
    }
    else if(ae.getSource()==butcancel)
    {
      dispose();
    }
  }   

  public static void main(String args[])
  {
    new Project_Login();
  }
}

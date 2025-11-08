import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.util.Date;
import java.text.SimpleDateFormat;

public class Students_registration_form extends JFrame implements ActionListener
{
  
JLabel lbtitle,lbregno,lbregdate,lbstudname,lbemailid,lbmobileno,lbgender,lbbirthdate,lbbranch,lbyearno,lbexparea,lbawards;
JTextField tfregno,tfregdate,tfstudname,tfemailid,tfmobileno,tfbirthdate,tfexparea,tfawards;
JButton butadd,butsave,butback;
ButtonGroup bggender,bgyear;
JRadioButton rbmale,rbfemale,rbthird,rbfourth;
JComboBox jcbbranch;
  Students_registration_form()
  {
    setSize(1250,800);
    
    setLayout(null);
    setTitle("New Students Registration Form");
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    getContentPane().setBackground(Color.GRAY);
       
   Font f1=new Font("arial black",Font.PLAIN,  30);  
   Font f2=new Font("arial",Font.BOLD,18);         
   Font f3=new Font("times new roman",Font.BOLD,14);         
  
  lbtitle=new JLabel("Students Registration for Campus placement");
  lbregno=new JLabel("Placement reg. No.");
  lbregdate=new JLabel("Date of registration");
  lbstudname=new JLabel("Student Name");
  lbemailid=new JLabel("Email ID");
  lbmobileno=new JLabel("Mobile No.");
  lbgender=new JLabel("Gender");
  lbbirthdate=new JLabel("Birth Date");
  lbbranch=new JLabel("Branch");
  lbyearno=new JLabel("Select the Year");
  lbexparea=new JLabel("Expertise Area");
  lbawards=new JLabel("Competitive Awards Info");


   tfregno=new JTextField();
   tfregdate=new JTextField();
   tfstudname=new JTextField();
   tfemailid=new JTextField();
   tfmobileno=new JTextField();
   tfbirthdate=new JTextField();
   tfexparea=new JTextField();
   tfawards=new JTextField();
   rbmale=new JRadioButton("Male") ;  
   rbfemale=new JRadioButton("Female");   
   bggender =new ButtonGroup();
   bggender.add(rbmale);
   bggender.add(rbfemale);

     rbthird=new JRadioButton("Third Year") ;  
   rbfourth=new JRadioButton("Fourth Year");   
   bgyear =new ButtonGroup();
   bgyear.add(rbthird);
   bgyear.add(rbfourth);


   jcbbranch=new JComboBox();
   jcbbranch.addItem("Computer");
   jcbbranch.addItem("IT");
   jcbbranch.addItem("AI/DS");
   jcbbranch.addItem("ECE");
   jcbbranch.addItem("Civil");
   jcbbranch.addItem("ETC");
   jcbbranch.addItem("Robotics");
   jcbbranch.addItem("Instru");
   jcbbranch.addItem("Mechanical");
   jcbbranch.addItem("Electrical");
   jcbbranch.addItem("Chemical");

   butadd=new JButton("Add new Student");
   butsave=new JButton("Save Registration Date");
   butback=new JButton("Back to Menu");
butadd.addActionListener(this);
butsave.addActionListener(this);
butback.addActionListener(this);

lbtitle.setFont(f1);
lbregno.setFont(f2);
lbregdate.setFont(f2);
lbstudname.setFont(f2);
lbemailid.setFont(f2);
lbmobileno.setFont(f2);
lbmobileno.setFont(f2);
lbgender.setFont(f2);
lbbirthdate.setFont(f2);
lbbranch.setFont(f2);
lbyearno.setFont(f2);
lbexparea.setFont(f2);
lbawards.setFont(f2);


rbmale.setFont(f3);
rbfemale.setFont(f3);
rbthird.setFont(f3);
rbfourth.setFont(f3);
jcbbranch.setFont(f3);

add(lbtitle);
add(lbregno);
add(tfregno);
add(lbregdate);
add(tfregdate);
add(lbstudname);
add(tfstudname);
add(lbemailid);
add(tfemailid);
add(lbmobileno);
add(tfmobileno);
add(lbgender);
add(rbmale);
add(rbfemale);
add(lbbirthdate);
add(tfbirthdate);
add(lbbranch);
add(jcbbranch);
add(jcbbranch);
add(lbyearno);
add(rbthird);
add(rbfourth);
add(lbexparea);
add(tfexparea);
add(lbawards);
add(tfawards);
add(butadd);
add(butsave);
add(butback);


lbtitle.setBounds(200,60,800,50);
lbregno.setBounds(70,226,180,25);
tfregno.setBounds(240,226,200,25);
lbregdate.setBounds(560,226,180,25);
tfregdate.setBounds(760,226,180,25);
lbstudname.setBounds(70,266,130,25);
tfstudname.setBounds(240,266,400,25);
 lbemailid.setBounds(70,306,80,25);
 tfemailid.setBounds(240,306,230,25);
 lbmobileno.setBounds(560,306,100,25);
 tfmobileno.setBounds(760,306,180,25);
 lbgender.setBounds(70,346,230,25);
 rbmale.setBounds(240,346,70,25);
 rbfemale.setBounds(320,346,80,25);
 lbbirthdate.setBounds(560,346,90,25);
 tfbirthdate.setBounds(760,346,100,25);
 lbbranch.setBounds(70,421,70,25);
 jcbbranch.setBounds(240,421,130,25);
 lbyearno.setBounds(540,421,150,25);
 rbthird.setBounds(760,421,100,25);
 rbfourth.setBounds(870,421,120,25);
 lbexparea.setBounds(70,451,170,25);
 tfexparea.setBounds(240,451,400,25);
 lbawards.setBounds(25,491,240,25);
tfawards.setBounds(240,491,400,25);
butadd.setBounds(350,550,150,30);
butsave.setBounds(528,550,180,30);
butback.setBounds(750,550,180,30);


tfregno.addKeyListener(
  new KeyAdapter()
  {
   public void keyTyped(KeyEvent ke)
   {
    if(tfregno.getText().length()>=4)
    ke.consume();
    if(ke.getKeyChar()>='0' && ke.getKeyChar()<='9')
    return;
    else 
    ke.consume();
   }
  }
);
tfregdate.addKeyListener(
  new KeyAdapter()
  {
   public void keyTyped(KeyEvent ke)
   {
    if(tfregdate.getText().length()>=10)
    ke.consume();
    }
  }
);
tfstudname.addKeyListener(
  new KeyAdapter()
  {
   public void keyTyped(KeyEvent ke)
   {
    if(tfstudname.getText().length()>=30)
    ke.consume();
    if((ke.getKeyChar()>='A' && ke.getKeyChar()<='Z') ||(ke.getKeyChar()>='a' && ke.getKeyChar()<='z') || ke.getKeyChar()==' ')
    return;
    else
    ke.consume();
    }
  }
);
tfemailid.addKeyListener(
  new KeyAdapter()
  {
   public void keyTyped(KeyEvent ke)
   {
    if(tfemailid.getText().length()>=30)
    ke.consume();
    }
  }
);
tfmobileno.addKeyListener(
  new KeyAdapter()
  {
   public void keyTyped(KeyEvent ke)
   {
    if(tfmobileno.getText().length()>=10)
    ke.consume();
    if(ke.getKeyChar()>='0' && ke.getKeyChar()<='9')
    return;
    else 
    ke.consume();
   }
  }
);
tfbirthdate.addKeyListener(
  new KeyAdapter()
  {
   public void keyTyped(KeyEvent ke)
   {
    if(tfbirthdate.getText().length()>=10)
    ke.consume();
    }
  }
);
tfexparea.addKeyListener(
  new KeyAdapter()
  {
   public void keyTyped(KeyEvent ke)
   {
    if(tfexparea.getText().length()>=40)
    ke.consume();
    }
  }
);
tfawards.addKeyListener(
  new KeyAdapter()
  {
   public void keyTyped(KeyEvent ke)
   {
    if(tfawards.getText().length()>=60)
    ke.consume();
    }
  }
);
tfregno.setEditable(false);
tfregdate.setEditable(false);
tfstudname.setEditable(false);
tfemailid.setEditable(false);
tfmobileno.setEditable(false);
tfbirthdate.setEditable(false);
tfexparea.setEditable(false);
tfawards.setEditable(false);
rbmale.setEnabled(false);
rbfemale.setEnabled(false);
rbthird.setEnabled(false);
rbfourth.setEnabled(false);
jcbbranch.setEnabled(false);


butsave.setEnabled(false);
   setVisible(true);
  }

  public void actionPerformed(ActionEvent ae)
  {
    if(ae.getSource()==butadd)
    {
     tfregno.setEditable(true);
     tfregdate.setEditable(true);
     tfstudname.setEditable(true);
     tfemailid.setEditable(true);
     tfmobileno.setEditable(true);
     tfbirthdate.setEditable(true);
     tfexparea.setEditable(true);
     tfawards.setEditable(true);
     rbmale.setEnabled(true);
     rbfemale.setEnabled(true);
     rbthird.setEnabled(true);
     rbfourth.setEnabled(true);
     jcbbranch.setEnabled(true);
     tfregno.setText("");
     tfregdate.setText("");
     tfstudname.setText("");
     tfemailid.setText("");
     tfmobileno.setText("");
     tfbirthdate.setText("");
     tfexparea.setText("");
     tfawards.setText("");
     bgyear.clearSelection();
     bggender.clearSelection();
     int rn=produce_regno();
     tfregno.setText(String.valueOf(rn));
     tfregno.setEditable(false);
     Date dt=new Date();
     SimpleDateFormat sdf=new SimpleDateFormat("E dd/MM/yyyy");
     String current_date=sdf.format(dt);
     tfregdate.setText(current_date);
     
     tfregdate.requestFocus();
     tfbirthdate.setText("dd/mm/yyyy");
     butsave.setEnabled(true);
 

     
    }
    else if(ae.getSource()==butsave)
    {
         if(tfregno.getText().length()==0){
         JOptionPane.showMessageDialog(this, "Student's registration number should not. be empty please Enter Student's PRN "); 
         }
         else if(tfregdate.getText().length()==0)
         {
           tfregdate.requestFocus();
            JOptionPane.showMessageDialog(this,"Registration date is empty, Please enter date of registration ");
         }
         else if(tfstudname.getText().length()==0)
         {
           tfstudname.requestFocus();
            JOptionPane.showMessageDialog(this,"Student name is empty, please enter student name");
         }
         else if(tfemailid.getText().length()==0)
         {
           tfemailid.requestFocus();
            JOptionPane.showMessageDialog(this,"Student Email id is empty , please enter students email id");
         }
         else if(tfmobileno.getText().length()==0)
         {
           tfmobileno.requestFocus();
            JOptionPane.showMessageDialog(this,"Student mobile no is empty , please enter students mobile no");
         }
         else if(!rbmale.isSelected() && !rbfemale.isSelected())
         {
           
            JOptionPane.showMessageDialog(this,"Student gender is not selected , please select the gender");
         }
          else if(tfbirthdate.getText().length()==0)
         {
           tfbirthdate.requestFocus();
            JOptionPane.showMessageDialog(this,"Registration date is empty, Please enter date of registration ");
         }
          else if(jcbbranch.getSelectedIndex()==-1)
         {
           
            JOptionPane.showMessageDialog(this,"Youu did not select branch ");
         }
          else if(!rbthird.isSelected() && !rbfourth.isSelected())
         {
           
            JOptionPane.showMessageDialog(this,"Student year is not selected , please select the year");
         }
             else if(tfexparea.getText().length()==0)
         {
           tfexparea.requestFocus();
            JOptionPane.showMessageDialog(this,"You not enter your experties ");
         }
             else if(tfawards.getText().length()==0)
         {
           tfawards.requestFocus();
            JOptionPane.showMessageDialog(this,"You not enter your awards ");
         }
         else{
          try{
            String sd="";
            sd=tfregno.getText()+"$"+tfregdate.getText()+"$"+tfstudname.getText()+"$"+tfemailid.getText()+"$"+tfmobileno.getText()+"$";
            if(rbmale.isSelected())
            sd=sd+"Male"+"$";
            else
            sd=sd+"Female"+"$";
            sd=sd+tfbirthdate.getText()+"$"+jcbbranch.getSelectedItem()+"$";
            if(rbthird.isSelected())
            sd=sd+"TE"+"$";
            else
            sd=sd+"BE"+"$";
            sd=sd+tfexparea.getText()+"$"+tfawards.getText();
            BufferedWriter bw=new BufferedWriter(new FileWriter("Students_registration_data.txt",true));
            bw.write(sd);
            bw.newLine();
            bw.close();
             JOptionPane.showMessageDialog(this,"Students registration data added, saved successfully");
             butsave.setEnabled(false);
          }catch(IOException e2)
          {
            JOptionPane.showMessageDialog(this,"");
          }
                       
          JOptionPane.showMessageDialog(this,"Congratulations, you enter complete and correct data");

         }
    }
    else if(ae.getSource()==butback)
    {
      new Project_Menu();
    }
 
  }  
  int produce_regno()
  {
    int rn=1;
    try{
      File myfile=new File("Students_registration_data.txt");
      if(myfile.length()!=0){
      BufferedReader br=new BufferedReader(new FileReader("Students_registration_data.txt"));
      String stud, studdata="";
      while((stud=br.readLine())!=null)
      {
        studdata=stud;
      }
      if(studdata.length()==0)
      rn=1;
      else
      {
        String data[]=studdata.split("\\$");
        rn=Integer.parseInt(data[0])+1;
      }
      br.close();
    }
      

    }catch(IOException e1)
    {
     JOptionPane.showMessageDialog(this,"I/O System might be failure, so problems");
    }
    return rn;
  }

  public static void main(String args[])
  {
    new Students_registration_form();
  }
}

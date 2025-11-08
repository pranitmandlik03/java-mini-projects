import java.awt.*;
import java.io.*;
import javax.swing.*;
import java.awt.event.*;
public class Academic_Result extends JFrame implements ActionListener,ItemListener
{
    JLabel lbtitle,lbprn,lbsem1,lbsem2,lbsem3,lbsem4,lbsem5,lbsem6,lbsem7,lbsem8,lbbacklogs,lb10,lb12,lbstudname,lbbranch,lbyear;
    JTextField tfprn,tfsem1,tfsem2,tfsem3,tfsem4,tfsem5,tfsem6,tfsem7,tfsem8,tfbacklogs,tf10,tf12,tfstudname,tfbranch,tfyear;
    JButton butadd,butsave,butback,butvalidate;
    JComboBox jcbprn;
    Academic_Result()
    {
    setSize(1000,800);
    getContentPane().setBackground(Color.GRAY);
    setLayout(null);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setTitle("Academic result");
       

  Font f1=new Font("arial black",Font.PLAIN,  30);  
  Font f2=new Font("arial",Font.BOLD,18);         
  Font f3=new Font("times new roman",Font.BOLD,14);   

   
     lbtitle=new JLabel("REGISTERED: Student's Academic Result");
     lbprn=new JLabel("Student's PRN");
     lbsem1=new JLabel("Sem 1 CGPA");
     lbsem2=new JLabel("Sem 2 CGPA");
     lbsem3=new JLabel("Sem 3 CGPA");
     lbsem4=new JLabel("Sem 4 CGPA");
     lbsem5=new JLabel("Sem 5 CGPA");
     lbsem6=new JLabel("Sem 6 CGPA");
     lbsem7=new JLabel("Sem 7 CGPA");
     lbsem8=new JLabel("Sem 8 CGPA");
     lbbacklogs=new JLabel("No. Of Active Backlogs");
     lbstudname=new JLabel("Student's Name");
     lbbranch=new JLabel("Branch");
     lbyear=new JLabel("Year");
     lb10=new JLabel("10th % Marks");
     lb12=new JLabel("12th % Marks");
      




     tfprn=new JTextField();
     tfsem1=new JTextField();
     tfsem2=new JTextField();
     tfsem3=new JTextField();
     tfsem4=new JTextField();
     tfsem5=new JTextField();
     tfsem6=new JTextField();
     tfsem7=new JTextField();
     tfsem8=new JTextField();
     tfbacklogs=new JTextField();
     tfstudname=new JTextField();
     tfbranch=new JTextField();
     tfyear=new JTextField();
     tf10=new JTextField();
     tf12=new JTextField();

     jcbprn=new JComboBox();
     


     tfprn.setFont(f3);
     tfsem1.setFont(f3);
     tfsem2.setFont(f3);
     tfsem3.setFont(f3);
     tfsem4.setFont(f3);
     tfsem5.setFont(f3);
     tfsem6.setFont(f3);
     tfsem7.setFont(f3);
     tfsem8.setFont(f3);
     tfbacklogs.setFont(f3);
     tfstudname.setFont(f3);
     tfbranch.setFont(f3);
     tfyear.setFont(f3);
     tf10.setFont(f3);
     tf12.setFont(f3);

     butadd=new JButton("Add New Record");
     butsave=new JButton("Save Result Data");
     butback=new JButton("Back To Menu");
     butvalidate=new JButton("Validate");

     butadd.addActionListener(this);
     butsave.addActionListener(this);
     butback.addActionListener(this);
     butvalidate.addActionListener(this);

     add(lbtitle);
     add(butvalidate);
     add(jcbprn);
     add(lbstudname);
     add(tfstudname);
     add(lbbranch);
     add(tfbranch);
     add(lbyear);
     add(tfyear);
     add(lb10);
     add(tf10);
     add(lb12);
     add(tf12);
     add(lbprn);
     add(tfprn);
     add(lbsem1);
     add(tfsem1);
     add(lbsem2);
     add(tfsem2);
     add(lbsem3);
     add(tfsem3);
     add(lbsem4);
     add(tfsem4);
     add(lbsem5);
     add(tfsem5);
     add(lbsem6);
     add(tfsem6);
     add(lbsem7);
     add(tfsem7);
     add(lbsem8);
     add(tfsem8);
     add(lbbacklogs);
     add(tfbacklogs);
     add(butadd);
     add(butsave);
     add(butback);

       lbtitle.setFont(f1);
       lbsem2.setFont(f2);
       lbsem3.setFont(f2);
       lbsem4.setFont(f2);
       lbsem5.setFont(f2);
       lbsem6.setFont(f2);
       lbsem7.setFont(f2);
       lbsem8.setFont(f2);
       lbsem1.setFont(f2);
       lbprn.setFont(f2);
       lbbacklogs.setFont(f2);
       lbstudname.setFont(f2);
       lbbranch.setFont(f2);
       lbyear.setFont(f2);
       lb10.setFont(f2);
       lb12.setFont(f2);
       butadd.setFont(f2);
       butsave.setFont(f2);
       butback.setFont(f2);
       butvalidate.setFont(f2);

    lbtitle.setBounds(90,100,700,25);
    lbprn.setBounds(70,200,150,25);
    tfprn.setBounds(220,200,150,25);
     butvalidate.setBounds(450,200,150,25);
     jcbprn.setBounds(600,200,150,25);
     lbstudname.setBounds(70,250,150,25);
     tfstudname.setBounds(220,250,400,25);
     lbbranch.setBounds(70,300,150,25);
     tfbranch.setBounds(220,300,150,25);
    lbyear.setBounds(520,300,130,25);
    tfyear.setBounds(600,300,150,25);
     lb10.setBounds(70,350,150,25);
     tf10.setBounds(220,350,150,25);
    lb12.setBounds(450,350,130,25);
    tf12.setBounds(600,350,150,25);
    lbsem1.setBounds(70,400,130,25);
    tfsem1.setBounds(220,400,150,25);
    lbsem2.setBounds(450,400,130,25);
    tfsem2.setBounds(600,400,150,25);
    lbsem3.setBounds(70,455,130,25);
    tfsem3.setBounds(220,455,150,25);
    lbsem4.setBounds(450,455,130,25);
    tfsem4.setBounds(600,455,150,25);
    lbsem5.setBounds(70,510,130,25);
    tfsem5.setBounds(220,510,150,25);
    lbsem6.setBounds(450,510,130,25);
    tfsem6.setBounds(600,510,150,25);
    lbsem7.setBounds(70,575,130,25);
    tfsem7.setBounds(220,575,150,25);
    lbsem8.setBounds(450,575,130,25);
    tfsem8.setBounds(600,575,150,25);
    lbbacklogs.setBounds(10,630,220,25);
    tfbacklogs.setBounds(220,630,150,25);

     butadd.setBounds(170,700,180,25);
     butsave.setBounds(380,700,180,25);
     butback.setBounds(590,700,180,25);


     butsave.setEnabled(false);
     butvalidate.setEnabled(false);
     jcbprn.setEnabled(false);
     tfprn.setEditable(false);
     tfsem1.setEditable(false);
     tfsem2.setEditable(false);
     tfsem3.setEditable(false);
     tfsem4.setEditable(false);
     tfsem5.setEditable(false);
     tfsem6.setEditable(false);
     tfsem7.setEditable(false);
     tfsem8.setEditable(false);
     tfstudname.setEditable(false);
     tfbranch.setEditable(false);
     tfyear.setEditable(false);
     tf10.setEditable(false);
     tf12.setEditable(false);
     tfbacklogs.setEditable(false);

    setVisible(true);

    tfprn.addKeyListener(
      new KeyAdapter()
      {
        public void keyTyped(KeyEvent ke)
        {
          if(tfprn.getText().length()>=9)
          ke.consume();
          if(ke.getKeyChar()>='0' && ke.getKeyChar()<='9' || ke.getKeyChar()>='A' || ke.getKeyChar()<='Z')
          return;
          else
          ke.consume();
        }
      }
    );
tfsem1.addKeyListener(
  new KeyAdapter() {
      public void keyTyped(KeyEvent ke)
      {
        if(tfsem1.getText().length()>=4)
        ke.consume();
        if(ke.getKeyChar()>='0' && ke.getKeyChar()<='9' || ke.getKeyChar()=='.' )
        return;
        else
        ke.consume();
        
      }
    }
);
tfsem2.addKeyListener(
  new KeyAdapter() {
      public void keyTyped(KeyEvent ke)
      {
        if(tfsem2.getText().length()>=4)
        ke.consume();
        if(ke.getKeyChar()>='0' && ke.getKeyChar()<='9' || ke.getKeyChar()=='.' )
        return;
        else
        ke.consume();
        
      }
    }
);
tfsem3.addKeyListener(
  new KeyAdapter() {
      public void keyTyped(KeyEvent ke)
      {
        if(tfsem3.getText().length()>=4)
        ke.consume();
        if(ke.getKeyChar()>='0' && ke.getKeyChar()<='9' || ke.getKeyChar()=='.' )
        return;
        else
        ke.consume();
        
      }
    }
);
tfsem4.addKeyListener(
  new KeyAdapter() {
      public void keyTyped(KeyEvent ke)
      {
        if(tfsem4.getText().length()>=4)
        ke.consume();
        if(ke.getKeyChar()>='0' && ke.getKeyChar()<='9' || ke.getKeyChar()=='.' )
        return;
        else
        ke.consume();
        
      }
    }
);
tfsem5.addKeyListener(
  new KeyAdapter() {
      public void keyTyped(KeyEvent ke)
      {
        if(tfsem5.getText().length()>=4)
        ke.consume();
        if(ke.getKeyChar()>='0' && ke.getKeyChar()<='9' || ke.getKeyChar()=='.' )
        return;
        else
        ke.consume();
        
      }
    }
);

tfsem6.addKeyListener(
  new KeyAdapter() {
      public void keyTyped(KeyEvent ke)
      {
        if(tfsem6.getText().length()>=4)
        ke.consume();
        if(ke.getKeyChar()>='0' && ke.getKeyChar()<='9' || ke.getKeyChar()=='.' )
        return;
        else
        ke.consume();
        
      }
    }
);
tfsem7.addKeyListener(
  new KeyAdapter() {
      public void keyTyped(KeyEvent ke)
      {
        if(tfsem7.getText().length()>=4)
        ke.consume();
        if(ke.getKeyChar()>='0' && ke.getKeyChar()<='9' || ke.getKeyChar()=='.' )
        return;
        else
        ke.consume();
        
      }
    }
);
tfsem8.addKeyListener(
  new KeyAdapter() {
      public void keyTyped(KeyEvent ke)
      {
        if(tfsem8.getText().length()>=4)
        ke.consume();
        if(ke.getKeyChar()>='0' && ke.getKeyChar()<='9' || ke.getKeyChar()=='.' )
        return;
        else
        ke.consume();
        
      }
    }
);
tfbacklogs.addKeyListener(
  new KeyAdapter() {
      public void keyTyped(KeyEvent ke)
      {
        if(tfbacklogs.getText().length()>=1)
        ke.consume();
        if(ke.getKeyChar()>='0' && ke.getKeyChar()<='9'  )
        return;
        else
        ke.consume();  
      }
    }
);
tf10.addKeyListener(
  new KeyAdapter() {
      public void keyTyped(KeyEvent ke)
      {
        if(tf10.getText().length()>=5)
        ke.consume();
        if(ke.getKeyChar()>='0' && ke.getKeyChar()<='9' || ke.getKeyChar()=='.' )
        return;
        else
        ke.consume();  
      }
    }
);
tf12.addKeyListener(
  new KeyAdapter() {
      public void keyTyped(KeyEvent ke)
      {
        if(tf12.getText().length()>=5)
        ke.consume();
        if(ke.getKeyChar()>='0' && ke.getKeyChar()<='9' || ke.getKeyChar()=='.' )
        return;
        else
        ke.consume();  
      }
    }
);
tfprn.setText("");
tfstudname.setText("");
tfbranch.setText("");
tfyear.setText("");

    }

public void itemStateChanged(ItemEvent ie)
{
if(ie.getSource()==jcbprn)
{
  String studitem=(String)jcbprn.getSelectedItem();
  String studdata[]=studitem.split("\\$");
  tfprn.setText(studdata[0]);
  tfstudname.setText(studdata[2]);
  tfbranch.setText(studdata[7]);
  tfyear.setText(studdata[8]);
  tf10.requestFocus();
}
}



    public void actionPerformed(ActionEvent ae)
    {
      if(ae.getSource()==butadd)
      {

     butsave.setEnabled(true);
     jcbprn.setEnabled(true);
     butvalidate.setEnabled(true);
     tfprn.setEditable(true);
     tfsem1.setEditable(true);
     tfsem2.setEditable(true);
     tfsem3.setEditable(true);
     tfsem4.setEditable(true);
     tfsem5.setEditable(true);
     tfsem6.setEditable(true);
     tfsem7.setEditable(true);
     tfsem8.setEditable(true);
     tf10.setEditable(true);
     tf12.setEditable(true);
     tfbacklogs.setEditable(true);
   
   
     tfprn.setText("");
     tfsem1.setText("");
     tfsem2.setText("");
     tfsem3.setText("");
     tfsem4.setText("");
     tfsem5.setText("");
     tfsem6.setText("");
     tfsem7.setText("");
     tfsem8.setText("");
     tf10.setText("");
     tf12.setText("");
     tfbacklogs.setText("");

       try{
   File myfile=new File("Students_registration_data.txt");
   if(myfile.length()>0)
   {
BufferedReader br=new BufferedReader(new FileReader("Students_registration_data.txt"));
String stud,studdata[],studitem="";
while((stud=br.readLine())!=null){
studdata=stud.split("\\$");
studitem=studdata[0]+"$"+studdata[2]+"$"+studdata[7]+"$"+studdata[8];
jcbprn.addItem(studitem);
System.out.println(studitem);
}
br.close();
jcbprn.addItemListener(this);
   }
   else{
JOptionPane.showMessageDialog(this,"No one students is registered so cannot enter academic result");
   }

       }catch(Exception e)
       {
 
       }

       
       tfprn.requestFocus();
       

       
      }
      else if(ae.getSource()==butsave)
      {
        
    if(tfprn.getText().length()==0)
    {
      tfprn.requestFocus();
      JOptionPane.showMessageDialog(this,"Students PRN is empty please enter registered student PRN");
    }
    else if(tfstudname.getText().length()==0 || tfbranch.getText().length()==0 || tfyear.getText().length()==0)
    { 
     tfprn.requestFocus();
      JOptionPane.showMessageDialog(this,"Students PRN is not validate, please validate students PRN");
    } 
    else if(tf10.getText().length()==0)
    {
    tf10.requestFocus();
    JOptionPane.showMessageDialog(this,"Students marks of 10th standard is not entered ");
    }
    else if(tf12.getText().length()==0)
    {
    tf12.requestFocus();
    JOptionPane.showMessageDialog(this,"Students marks of 12th standard is not entered ");
    }
    
    else if(tfsem1.getText().length()==0)
    {
    tfsem1.requestFocus();
    JOptionPane.showMessageDialog(this,"Students marks of sem1 standard is not entered ");
    }
    else if(tfsem2.getText().length()==0)
    {
    tfsem2.requestFocus();
    JOptionPane.showMessageDialog(this,"Students marks of sem2 standard is not entered ");
    }
    else if(tfsem3.getText().length()==0)
    {
    tfsem3.requestFocus();
    JOptionPane.showMessageDialog(this,"Students marks of sem3 standard is not entered ");
    }
    else if(tfsem4.getText().length()==0)
    {
    tfsem4.requestFocus();
    JOptionPane.showMessageDialog(this,"Students marks of sem4 standard is not entered ");
    }
    else if(tfsem5.getText().length()==0)
    {
    tfsem5.requestFocus();
    JOptionPane.showMessageDialog(this,"Students marks of sem5 are empty, if sem5 result is not available please enter 0 ");
    }
    else if(tfsem6.getText().length()==0)
    {
    tfsem6.requestFocus();
    JOptionPane.showMessageDialog(this,"Students marks of sem6 are empty, if sem6 result is not available please enter 0 ");
    }
    else if(tfsem7.getText().length()==0)
    {
    tfsem7.requestFocus();
    JOptionPane.showMessageDialog(this,"Students marks of sem7 are empty, if sem7 result is not available please enter 0 ");
    }
    else if(tfsem8.getText().length()==0)
    {
    tfsem8.requestFocus();
    JOptionPane.showMessageDialog(this,"Students marks of sem8 are empty, if sem8 result is not available please enter 0 ");
    }
    else if(tfbacklogs.getText().length()==0)
    {
    tfbacklogs.requestFocus();
    JOptionPane.showMessageDialog(this,"You did not enter number of active backlog if no backlog please enter 0");
    }
    else
    { 
      int chk=0;
      try{
        String filedata, data[];
        BufferedReader br=new BufferedReader(new FileReader("Academics_results.txt"));
        while((filedata=br.readLine())!=null)
        {
          data=filedata.split("\\$");
          if(data[0].equals(tfprn.getText()))
          {
            chk=1;
            break;
          }
        }
        br.close();
      }catch(IOException e){
          JOptionPane.showMessageDialog(this,"Problem occur during checking student prn weether repeat");

      }

      if(chk==0){
      String acdata="";
      acdata=tfprn.getText()+"$"+tf10.getText()+"$"+tf12.getText()+"$"+tfsem1.getText()+"$"+tfsem2.getText()+"$"+tfsem3.getText()+"$"+tfsem4.getText()+"$"+tfsem5.getText()+"$"+tfsem6.getText()+"$"+tfsem7.getText()+"$"+tfsem8.getText()+"$"+tfbacklogs.getText();
      try{
        BufferedWriter bw=new BufferedWriter(new FileWriter("Academics_results.txt",true));
        bw.write(acdata);
        bw.newLine();
        bw.close();
        JOptionPane.showMessageDialog(this,"Entered academic result data is added, saves successfully");
        butsave.setEnabled(false);
     butvalidate.setEnabled(false);
     jcbprn.setEnabled(false);
     tfprn.setEditable(false);
     tfsem1.setEditable(false);
     tfsem2.setEditable(false);
     tfsem3.setEditable(false);
     tfsem4.setEditable(false);
     tfsem5.setEditable(false);
     tfsem6.setEditable(false);
     tfsem7.setEditable(false);
     tfsem8.setEditable(false);
     tfstudname.setEditable(false);
     tfbranch.setEditable(false);
     tfyear.setEditable(false);
     tf10.setEditable(false);
     tf12.setEditable(false);
     tfbacklogs.setEditable(false);

      }catch(IOException e1){
          JOptionPane.showMessageDialog(this,"Problem occur during save the record into file ");

      }
    }
    else{
                JOptionPane.showMessageDialog(this,"Academic result of this student is already entered, you cannot enter again");

    }

    }

     }
      else if(ae.getSource()==butback){
        dispose();

      }
      else if(ae.getSource()==butvalidate){
      if(tfprn.getText().length()>0)
      {
       int chk=0;
       try{
       BufferedReader br=new BufferedReader(new FileReader("Students_registration_data.txt"));  
       String stud,studdata[];
       while((stud=br.readLine())!=null)
       {
        studdata=stud.split("\\$");
        if(tfprn.getText().equals(studdata[0]))
        {
          tfstudname.setText(studdata[2]);
          tfbranch.setText(studdata[7]);
          tfyear.setText(studdata[8]);
          chk=1;
          break;
        }
       }
       br.close();
       if(chk==0)
       {
        JOptionPane.showMessageDialog(this, "Invalid students PRN, Please enter correct PRN");
       }
       }catch(Exception e)
       {

       }
      }
      butvalidate.setEnabled(false);

      }

    }
    public static void main(String[] args) {
        new Academic_Result();
    }
}

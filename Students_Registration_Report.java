import javax.swing.*;
import java.awt.Font;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.awt.event.*;
import java.io.*;
public class Students_Registration_Report extends JFrame implements ActionListener
{
    JLabel lbtitle,lbdate;
    JButton butback;
    JTable mytable;
    Students_Registration_Report()
    {
    setSize(1000,800);
    setLayout(null);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setTitle("Report number 1");
       

  Font f1=new Font("arial black",Font.PLAIN,  30); 


  int rows=0;
  try
  {
   BufferedReader br=new BufferedReader(new FileReader("Students_registration_data.txt"));
    String filedata;
    while((filedata=br.readLine())!=null)
    {
        rows++;
    }
br.close();
  }catch(Exception e){}
  String report_data[][]=new String[rows][11];
  String heading[]={"Student PRN","Reg. date","Student name","Email ID","Mobile no.","Gender","Birth Date","Branch","Year","Expertise Area","Compititive Awards Information"};
    try
  {
   BufferedReader br=new BufferedReader(new FileReader("Students_registration_data.txt"));
    String filedata,data[];
    int r=0,c;
    while((filedata=br.readLine())!=null)
    {
      data=filedata.split("\\$");
      for(c=0;c<11;c++){
        report_data[r][c]=data[c];
      }
      r++;
    }
  br.close();
  }catch(Exception e){}
  mytable=new JTable(report_data,heading);
  JScrollPane jsp=new JScrollPane(mytable);

 

   
     lbtitle=new JLabel("Students Registration(for job placement) Report");
     Date dt=new Date();
     SimpleDateFormat sdf=new SimpleDateFormat("dd MMMM, yyyy ");
     String current_date=sdf.format(dt);
     lbdate=new JLabel("Report Date: "+current_date);
     
    
     lbtitle.setFont(f1);
    
     butback=new JButton("Back To Menu");
     butback.addActionListener(this);
    add(lbtitle);
    add(lbdate);
    add(butback);
    add(jsp);
    lbtitle.setBounds(100,75,800,35);
    lbdate.setBounds(10,150,200,20);
    jsp.setBounds(10,180,980,740);
     butback.setBounds(770,840,200,30);

    
     setVisible(true);
    }
    public void actionPerformed(ActionEvent ae)
    {
    dispose();
    }
    public static void main(String[] args) {
      new Students_Registration_Report();
    }
}

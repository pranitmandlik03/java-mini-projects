import javax.swing.*;
import java.awt.Color;
import java.awt.event.*;
public class Project_Menu extends JFrame implements ActionListener
{
  JMenuBar jmb;
  JMenu jmn1,jmn2,jmn3,jmn4;
  JMenuItem jmi11,jmi12,jmi13,jmi14;
  JMenuItem jmi21,jmi22,jmi23,jmi24;
  JMenuItem jmi31,jmi32,jmi33,jmi34,jmi35,jmi36,jmi37,jmi38,jmi39,jmi310,jmi311;
  JMenuItem jmi41;
  Project_Menu()
  {
    setSize(1250,750);
    
    setLayout(null);
    setTitle("Main Menu of the Project");
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    getContentPane().setBackground(Color.PINK);

    jmb=new JMenuBar();
    jmn1=new JMenu("Primary Data Retrieval Module");
    jmn2=new JMenu("Placement Transaction Data Entry Module");
    jmn3=new JMenu("Reports Module");
    jmn4=new JMenu("Close the Project");
 
    jmi11=new JMenuItem("Student Registration for Job Placement");
    jmi12=new JMenuItem("Registered Students Academic Results");
    jmi13=new JMenuItem("Registered Students Certified Courses");
    jmi14=new JMenuItem("Job Provider Companies");

    jmn1.add(jmi11);
    jmn1.add(jmi12);
    jmn1.add(jmi13);
    jmn1.add(jmi14);

    jmi21=new JMenuItem("Scheduled Campus Interview's Data Entry");
    jmi22=new JMenuItem("Interview-Appeared Student's Performance Data Entry");
    jmi23=new JMenuItem("Shortlisted Student's(in Interviews) Data Entry");
    jmi24=new JMenuItem("Interview wise Selected/Placed Student's Data Entry");      

    jmn2.add(jmi21);
    jmn2.add(jmi22);
    jmn2.add(jmi23);
    jmn2.add(jmi24);

    jmi31=new JMenuItem("Registered Students Information Report");
    jmi32=new JMenuItem("Students Academic Results Information report");
    jmi33=new JMenuItem("Students Certified Courses & Projects Information Report");
    jmi34=new JMenuItem("Job Provider Companies Information Report");      
    jmi35=new JMenuItem("Scheduled Campus Interview's Periodical Report");
    jmi36=new JMenuItem("Interview wise Appeared Student's Performance Report");
    jmi37=new JMenuItem("Shortlisted Student's Summary Report");
    jmi38=new JMenuItem("Placed Student's Summary Report");      
    jmi39=new JMenuItem("Interview (Company) wise Shortlisted Student's Report");
    jmi310=new JMenuItem("Interview (Company) wise Placed Students Report");
    jmi311=new JMenuItem("Unplaced Student's Information Report");

    jmn3.add(jmi31);
    jmn3.add(jmi32);
    jmn3.add(jmi33);
    jmn3.add(jmi34);
    jmn3.add(jmi35);
    jmn3.add(jmi36);
    jmn3.add(jmi37);
    jmn3.add(jmi38);
    jmn3.add(jmi39);
    jmn3.add(jmi310);
    jmn3.add(jmi311);

    jmi41=new JMenuItem("Close the Report");      
    jmn4.add(jmi41);

    jmb.add(jmn1);
    jmb.add(jmn2);
    jmb.add(jmn3);
    jmb.add(jmn4);    
    setJMenuBar(jmb);

    jmi11.addActionListener(this);
    jmi12.addActionListener(this);
    jmi13.addActionListener(this);
    jmi14.addActionListener(this);
    jmi21.addActionListener(this);
    jmi22.addActionListener(this);
    jmi23.addActionListener(this);
    jmi24.addActionListener(this);
    jmi31.addActionListener(this);
    jmi32.addActionListener(this);
    jmi33.addActionListener(this);
    jmi34.addActionListener(this);
    jmi35.addActionListener(this);
    jmi36.addActionListener(this);
    jmi37.addActionListener(this);
    jmi38.addActionListener(this);
    jmi39.addActionListener(this);
    jmi310.addActionListener(this);
    jmi311.addActionListener(this);
    jmi41.addActionListener(this);
    setVisible(true);
  }

  public void actionPerformed(ActionEvent ae)
  {
    if(ae.getSource()==jmi11)
  new Students_registration_form();
    else if(ae.getSource()==jmi12)
       new Academic_Result();
    else if(ae.getSource()==jmi13)
       ;
    else if(ae.getSource()==jmi14)
       ;
    else if(ae.getSource()==jmi21)
    ;
      // new swing_radio();
    else if(ae.getSource()==jmi22)
       ;
    else if(ae.getSource()==jmi23)
       ;
    else if(ae.getSource()==jmi24)
       ;
    else if(ae.getSource()==jmi31)
       new Students_Registration_Report();
    else if(ae.getSource()==jmi32)
       ;
    else if(ae.getSource()==jmi33)
       ;
    else if(ae.getSource()==jmi34)
       ;
    else if(ae.getSource()==jmi35)
       ;
    else if(ae.getSource()==jmi36)
       ;
    else if(ae.getSource()==jmi37)
       ;
    else if(ae.getSource()==jmi38)
       ;
    else if(ae.getSource()==jmi39)
       ;
    else if(ae.getSource()==jmi310)
        ;
    else if(ae.getSource()==jmi311)
       ;
    else if(ae.getSource()==jmi41)
       dispose();
  }   

  public static void main(String args[])
  {
    new Project_Menu();
  }
}
import java.awt.*;
import javax.swing.*;
import java.sql.*;

public class DatabaseGUI implements ActionListener{

    JTextfield tf1, tf2, tf3;
    JButton button;
    public void studentList(){
        JFrame frm = new JFrame("Details of students");
        frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JLabel lb1, lb2, lb3;
        lb1=new JLabel("Name:");  
        lb1.setBounds(50,20, 100,30);
        lb2=new JLabel("Roll No:");  
        lb2.setBounds(50,70, 600,30);
        lb3=new JLabel("Age");  
        lb3.setBounds(50,120, 600,30);

        tf1=new JTextField();  
        tf1.setBounds(50,50,350,20);  
        tf2=new JTextField();  
        tf2.setBounds(50,100,350,20);
        tf3=new JTextField();  
        tf3.setBounds(50,150,350,20);

        button=new JButton("Update List");  
        button.setBounds(50,200,250,30);  
        button.addActionListener(this); 

        frm.add(tf1);frm.add(tf2);frm.add(tf3);frm.add(lb1);frm.add(lb2);frm.add(lb3); frm.add(button);
        frm.setSize(800,400);  
        frm.setLayout(null);  
        frm.setVisible(true); 

    }
    public void actionPerformed(ActionEvent e)
    {  
        String Name = tf1.getText(); 
        int roll = Integer.parseInt(tf2.getText()); 
        int age = Integer.parseInt(tf3.getText()); 



        try 
        {
            
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/4chillz","root","Krishna@2001");
            
            Statement st=con.createStatement();
            st.executeUpdate("insert into student(name,age,rollNo) values('"+Name+"','"+age+"','"+roll+"')") ;
            
            con.close(); 
        }
        catch(SQLException error) 
        { 
            System.out.println("Error is " +error); 
        } 
    }
    
    public static void main(String str[])throws ClassNotFoundException
    {   
        DatabaseGUI aa = new DatabaseGUI();
    }

    
}

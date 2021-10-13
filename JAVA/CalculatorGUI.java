import javax.swing.*; 
import java.awt.event.*;
import java.awt.Color;
public class CalculatorGUI implements ActionListener
{  
        JTextField tf1,tf2,tf3;  
        JButton b1,b2,b3,b4;  
        CalculatorGUI()
		{  
            JFrame frm= new JFrame();  
            frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			frm.getContentPane().setBackground(Color.gray);
			
            tf1=new JTextField();  
            tf1.setBounds(50,50,150,20);  
			
            tf2=new JTextField();  
            tf2.setBounds(50,100,150,20);
			
            tf3=new JTextField();  
            tf3.setBounds(240,77,150,20);  
            tf3.setEditable(false); 
  			
            b1=new JButton("+");
			b1.setBounds(50,150,50,50);			
			b1.setBackground(Color.DARK_GRAY);
			b1.setForeground(Color.white);
              
            b2=new JButton("-");  
            b2.setBounds(120,150,50,50);
			b2.setBackground(Color.DARK_GRAY);
			b2.setForeground(Color.white);
			
            b3=new JButton("*");  
            b3.setBounds(190,150,50,50); 
			b3.setBackground(Color.DARK_GRAY);
			b3.setForeground(Color.white);			
			
            b4=new JButton("/");  
            b4.setBounds(260,150,50,50);
			b4.setBackground(Color.DARK_GRAY);
			b4.setForeground(Color.white);			
			
            b1.addActionListener(this);  
            b2.addActionListener(this); 
            b3.addActionListener(this);  
            b4.addActionListener(this);  
			
            frm.add(tf1); frm.add(tf2); frm.add(tf3);
			frm.add(b1); frm.add(b2); frm.add(b3); frm.add(b4);  
            frm.setSize(500,300);  
            frm.setLayout(null);  
            frm.setVisible(true);  
        }         
        public void actionPerformed(ActionEvent e)
	{  
            String s1=tf1.getText();  
            String s2=tf2.getText();  
			
            int x=Integer.parseInt(s1);  
            int y=Integer.parseInt(s2);  
            int ans=0;  
			
            if(e.getSource()==b1)
            {  
                ans=x+y;  
            }
            else if(e.getSource()==b2)
            {  
                ans=x-y;  
            } 
            else if(e.getSource()==b3)
            {  
                ans=x*y;  
            }
            else if(e.getSource()==b4)
            {  
                ans=x/y;  
            } 
            String result=" "+ans;
            tf3.setText(result);  
        }  
	public static void main(String[] args) 
	{  
		CalculatorGUI calc=new CalculatorGUI();  
        } 
} 
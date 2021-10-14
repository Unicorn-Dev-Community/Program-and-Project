import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class SwingListener1 implements ActionListener
{
	TextField tf1;
	SwingListener1()
	{
		JFrame obj=new JFrame("Button Example"); 
		obj.setTitle("FIRST SWING PGM");
		obj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		tf1=new TextField();
		tf1.setBounds(60,50,170,20);
		JButton b1=new JButton("BUTTON 1");
		b1.addActionListener(this);
		b1.setBounds(50,100,95,30);
		obj.setSize(400,400);
		obj.add(b1);
		obj.add(tf1);
		obj.setLayout(new FlowLayout());
		obj.setVisible(true);
		
	}
	public void actionPerformed(ActionEvent e)
	{
		tf1.setText("Welcome to Swing");
	}
	public static void main(String args[])
	{
		SwingListener1 s=new SwingListener1();//Jframe not created when we call this
	}
}
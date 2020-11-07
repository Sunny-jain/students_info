package students_info;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Collections;

import javax.swing.*;

public class GUI implements  ActionListener {
	static ArrayList<students> mn=new ArrayList<>();
	JFrame f;
	JTextField r1,n1,m1;
	JButton b1,b2,b3,b4;
	JComboBox c;
	JTextArea a=new JTextArea();
	String z;
	GUI()
	{
		f=new JFrame("Students");
		f.setVisible(true);
		f.setBackground(Color.DARK_GRAY);
		f.setLayout(null);
		f.setSize(340,600);
	
		r1=new JTextField();
		r1.setBounds(20,20,100,30);
		f.add(r1);
		
		n1=new JTextField();
		n1.setBounds(20,80,100,30);
		f.add(n1);
		
		m1=new JTextField();
		m1.setBounds(20,140,100,30);
		f.add(m1);
		
		Font f1=new Font("serif",Font.BOLD,15);
		b1=new JButton("ADD");
		b1.setBounds(20, 200, 80, 30);
		b1.setFont(f1);
		b1.addActionListener(this);
		f.add(b1);
		
		b2=new JButton("SHOW");
		b2.setBounds(120, 200, 80, 30);
		b2.setFont(f1);
		b2.addActionListener(this);
		f.add(b2);
		
		b3=new JButton("SORT");
		b3.setBounds(220,200,80, 30);
		b3.setFont(f1);
		b3.addActionListener(this);
		f.add(b3);
		
		JLabel i=new JLabel("Choose one for sorting");
		i.setBounds(140,20,500, 30);
		i.setFont(new Font("italic",Font.BOLD,10));
		f.add(i);
		
		String []s={"Roll No.","Marks","Name"};
		c=new JComboBox(s);
		c.setBounds(140, 80, 160, 30);
		f.add(c);
		c.addActionListener(this);
		
		
		a.setBounds(20, 240, 260, 200);
		f.add(a);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==c)
		{
			z=(String) c.getSelectedItem();
			System.out.println(z);
		}
		if(e.getSource()==b1)
		{
			students o=new students(Integer.parseInt(r1.getText()),n1.getText(),Double.parseDouble(m1.getText()));
			r1.setText("");
			n1.setText("");
			m1.setText("");
			mn.add(o);
		}
		if(e.getSource()==b2)
		{
			a.setText("");
			for(students x:mn)
			{
				a.append(x.toString());
			}
		}
		if(e.getSource()==b3)
		{
			a.setText("");
			if(z.compareTo("Roll No.")==0)
			{
				students k=new students(1);
			}
			else if(z.compareTo("Marks")==0)
			{
				students k=new students(2);
			}
			else
			{
				students k=new students(3);
			}
			Collections.sort(mn);
			for(students x:mn)
			{
				a.append(x.toString());
			}
		}
	}
	public static void main(String [] args)
	{
		new GUI();
	}
}

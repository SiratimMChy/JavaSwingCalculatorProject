package Calculator;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Calculator_S extends JFrame implements ActionListener {
	JPanel Panel1,Panel2,Panel3;
	JButton btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9,btn10,btnDot,btnCLR,btnSqr,btnEq,btnA,btnS,btnD,btnM,btnPr;
	JTextField txt1;
	JLabel label1;
	int temp;
	double n1,n2,n3,R;
	Font  font = new Font("Bold Text",Font.BOLD,20);
	public Calculator_S() {
		setSize(430,510);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLayout(null);
		
		Panel1 = new JPanel();
		Panel1.setBounds(0,0,430,100);
		Panel1.setBackground(Color.GRAY);
		Panel1.setLayout(null);
		add(Panel1);
		 
		Panel2 = new JPanel();
		Panel2.setLayout(new GridLayout(4,3,2,2));
		Panel2.setBounds(0,100,250,370);
		Panel2.setBackground(Color.WHITE);
		add(Panel2);
		
		Panel3 = new JPanel();
		Panel3.setLayout(new GridLayout(3,3,1,1));
		Panel3.setBounds(250,100,180,370);
		Panel3.setBackground(Color.WHITE);
		add(Panel3);
	
	
		
		txt1 = new JTextField();
		txt1.setBounds(5,20,410,70);
		Panel1.add(txt1);
		txt1.setFont(font);
		
		
		btn1 = new JButton("1");
		btn1.addActionListener(this);
		btn1.setFocusable(false);
		btn1.setForeground(Color.WHITE);
		btn1.setBackground(Color.BLACK);
		Panel2.add(btn1);
		
		btn2 = new JButton("2");
		btn2.addActionListener(this);
		btn2.setFocusable(false);
		btn2.setForeground(Color.WHITE);
		btn2.setBackground(Color.BLACK);
		Panel2.add(btn2);
		
		btn3 = new JButton("3");
		btn3.addActionListener(this);
		btn3.setFocusable(false);
		btn3.setForeground(Color.WHITE);
		btn3.setBackground(Color.BLACK);
		Panel2.add(btn3);
		
		
		btn4 = new JButton("4");
		btn4.addActionListener(this);
		btn4.setFocusable(false);
		btn4.setForeground(Color.WHITE);
		btn4.setBackground(Color.BLACK);
		Panel2.add(btn4);
		
		btn5 = new JButton("5");
		btn5.addActionListener(this);
		btn5.setFocusable(false);
		btn5.setForeground(Color.WHITE);
		btn5.setBackground(Color.BLACK);
		Panel2.add(btn5);
		
		btn6 = new JButton("6");
		btn6.addActionListener(this);
		btn6.setFocusable(false);
		btn6.setForeground(Color.WHITE);
		btn6.setBackground(Color.BLACK);
		Panel2.add(btn6);
		
		btn7 = new JButton("7");
		btn7.addActionListener(this);
		btn7.setFocusable(false);
		btn7.setForeground(Color.WHITE);
		btn7.setBackground(Color.BLACK);
		Panel2.add(btn7);
		
		btn8 = new JButton("8");
		btn8.addActionListener(this);
		btn8.setFocusable(false);
		btn8.setForeground(Color.WHITE);
		btn8.setBackground(Color.BLACK);
		Panel2.add(btn8);
		
		btn9 = new JButton("9");
		btn9.addActionListener(this);
		btn9.setFocusable(false);
		btn9.setForeground(Color.WHITE);
		btn9.setBackground(Color.BLACK);
		Panel2.add(btn9);
		
		btn10 = new JButton("0");
		btn10.addActionListener(this);
		btn10.setFocusable(false);
		btn10.setForeground(Color.WHITE);
		btn10.setBackground(Color.BLACK);
		Panel2.add(btn10);
		
		btnDot = new JButton(".");
		btnDot.addActionListener(this);
		btnDot.setFocusable(false);
		btnDot.setForeground(Color.WHITE);
		btnDot.setBackground(Color.BLACK);
		Panel2.add(btnDot);
		
		btnEq = new JButton("=");
		btnEq.addActionListener(this);
		btnEq.setFocusable(false);
		btnEq.setForeground(Color.WHITE);
		btnEq.setBackground(Color.BLACK);
		Panel2.add(btnEq);
		
		
		btnA = new JButton("+");
		btnA.addActionListener(this);
		btnA.setFocusable(false);
		btnA.setForeground(Color.WHITE);
		btnA.setBackground(Color.BLACK);
		Panel3.add(btnA);
		
		btnCLR = new JButton("C");
		btnCLR.addActionListener(this);
		btnCLR.setFocusable(false);
		btnCLR.setForeground(Color.WHITE);
		btnCLR.setBackground(new Color(255, 140, 0));
		Panel3.add(btnCLR);
		
		btnS = new JButton("-");
		btnS.addActionListener(this);
		btnS.setFocusable(false);
		btnS.setForeground(Color.WHITE);
		btnS.setBackground(Color.BLACK);
		Panel3.add(btnS);
		
		btnD = new JButton("/");
		btnD.addActionListener(this);
		btnD.setForeground(Color.WHITE);
		btnD.setBackground(Color.BLACK);
		Panel3.add(btnD);
		
		btnM = new JButton("*");
		btnM.addActionListener(this);
		btnM.setFocusable(false);
		btnM.setForeground(Color.WHITE);
		btnM.setBackground(Color.BLACK);
		Panel3.add(btnM);
		
		btnSqr = new JButton("x²");
		btnSqr.addActionListener(this);
		btnSqr.setFocusable(false);
		btnSqr.setForeground(Color.WHITE);
		btnSqr.setBackground(Color.BLACK);
		Panel3.add(btnSqr);
		
		btnPr = new JButton("%");
		btnPr.addActionListener(this);
		btnPr.setFocusable(false);
		btnPr.setForeground(Color.WHITE);
		btnPr.setBackground(Color.BLACK);
		
		
		
		setVisible(true);	
}
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()== btn1)
		{
			
			 txt1.setText(txt1.getText()+"1");
		}
		if(e.getSource()== btn2)
		{
			txt1.setText(txt1.getText()+"2");
		}
		if(e.getSource()== btn3)
		{
			txt1.setText(txt1.getText()+"3");
		}
		if(e.getSource()== btn4) 
		{
			txt1.setText(txt1.getText()+"4");
		}
		if(e.getSource()== btn5)
		{
			txt1.setText(txt1.getText()+"5");
		}
		if(e.getSource()== btn6) 
		{
			txt1.setText(txt1.getText()+"6");
		}
		if(e.getSource()== btn7) 
		{
			txt1.setText(txt1.getText()+"7");
		}
		if(e.getSource()== btn8) 
		{
			txt1.setText(txt1.getText()+"8");
		}
		if(e.getSource()== btn9) 
		{
			txt1.setText(txt1.getText()+"9");
		}
		if(e.getSource()== btn10) 
		{
			txt1.setText(txt1.getText()+"0");
		}
		if(e.getSource()== btnDot) 
		{
			txt1.setText(txt1.getText()+".");
		}
		if(e.getSource()==btnCLR)
		{
			txt1.setText("");
			//R=0;
		    //n3=0;
			
		}
		if(e.getSource()==btnSqr)
		{
			String s1 = txt1.getText();
			n1 = Double.parseDouble(s1);
			n2 = n1*n1;
			txt1.setText(Double.toString(n2));
		}
		if(e.getSource()== btnA)
		{
			String s1 = txt1.getText();
			n1 = Double.parseDouble(s1);
			n3 = n1+n3;
			txt1.setText("");
			temp =0;
		}
			if(e.getSource()== btnS)
			{
				String s1 = txt1.getText();
				n1 = Double.parseDouble(s1);
				if(n3==0)
				{
					n3=n1;
				}
				else
				{
					n3=n3-n1;
				}
				txt1.setText("");
				temp =1;
		}
			if(e.getSource()== btnD)
			{
				String s1 = txt1.getText();
				n1 = Double.parseDouble(s1);
				if(n3==0)
				{
					n3=n1;
				}
				else
				{
					n3=n3/n1;
				}
				txt1.setText("");
				temp =2;
		}
			if(e.getSource()== btnM) 
			{
				String s1 = txt1.getText();
				n1 = Double.parseDouble(s1);
				if(n3==0)
				{
					n3=n1;
				}
				else
				{
					n3=n3*n1;
				}
				txt1.setText("");
				temp =3;
		}
			if(e.getSource() == btnEq) 
			{
				  if(temp == 0) {
				    String s2 = txt1.getText();
				    n2 = Double.parseDouble(s2);
				    R = n3 + n2;
				    txt1.setText(Double.toString(R));
				    n3=0;
				    R=0;
				  }
				  if(temp == 1)
				  {String s2 = txt1.getText();
			      n2 = Double.parseDouble(s2);
			      R = n3 - n2;
			      txt1.setText(Double.toString(R));
			      n3=0;
			      R=0;
			      }
				  if(temp == 2)
				  {
				    String s2 = txt1.getText();
				    n2 = Double.parseDouble(s2);
				    R = n3 / n2;
				    txt1.setText(Double.toString(R));
				    n3=0;
				    R=0;
				    
				  }
				  if(temp == 3) {
				  String s2 = txt1.getText();
		          n2 = Double.parseDouble(s2);
		          R = n3 * n2;
		          txt1.setText(Double.toString(R));
		          n3=0;
		          R=0;
		      }
		 
	      }
		
       }
}
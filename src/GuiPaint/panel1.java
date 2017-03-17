package hw2;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.JLabel;
import javax.swing.JPanel;

public class panel1 extends JPanel{
	
	public panel1()
	{
		
		this.setBackground(Color.red);
		this.setPreferredSize(new Dimension(100,600));
		JLabel jl1 = new JLabel();
		add(jl1);
	}

}

package hw2;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JLabel;
import javax.swing.JPanel;

public class East extends JPanel{
	
	public East()
	{
		this.setBackground(Color.yellow);
		this.setPreferredSize(new Dimension(100,600));
		JLabel jl1 = new JLabel();
		add(jl1);
		
	}

}

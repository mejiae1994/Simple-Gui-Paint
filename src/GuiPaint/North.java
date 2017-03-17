package hw2;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class North extends JPanel implements ActionListener{
	JButton jb;
	
	public North()
	{
		this.setBackground(Color.CYAN.brighter().brighter());
		JLabel jl1 = new JLabel();
		add(jl1);
	
	
		
		
	}
	

	@Override
	public void actionPerformed(ActionEvent e) {
		Object source = e.getSource();
		if(source == jb)
		{	
			
			
			
		}
		
	}

}

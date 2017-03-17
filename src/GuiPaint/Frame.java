package hw2;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JColorChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JSlider;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class Frame extends JFrame implements ActionListener, ItemListener{
	
	JButton jb;
	JButton jb2;
	JButton jb3;
	JButton jb4;
	JCheckBox sw;
	JCheckBox sw2;
	
	JPanel content;
	DrawAndType dt;
	CircleDraw draw;
	
	panel1 west;
	North north;
	East east;
	South south;
	
	JButton change;
	JSlider slide;
	
	
	
	public Frame()
	{
		content = new JPanel();
		content.setLayout(new BorderLayout());
		
		west = new panel1();
		north = new North();
		east = new East();
		south = new South();
		draw = new CircleDraw();
		
		west.setLayout(new BoxLayout(west, BoxLayout.PAGE_AXIS));
		east.setLayout(new BoxLayout(east, BoxLayout.PAGE_AXIS));
		
		
		jb2 = new JButton("Color");
		west.add(jb2);
		jb2.addActionListener(this);
		
		jb3 = new JButton("Color");
		east.add(jb3);
		jb3.addActionListener(this);
		
		
		
		jb4 = new JButton("Color");
		south.add(jb4);
		jb4.addActionListener(this);
		
		sw = new JCheckBox("square");
		sw2 = new JCheckBox("circle");
		south.add(sw);
		south.add(sw2);
		sw.addItemListener(this);
		sw2.addItemListener(this);
		
		
		
		jb = new JButton("reset");
		north.add(jb);
		jb.addActionListener(this);
		
		change = new JButton("choose a brush color");
		south.add(change);
		change.addActionListener(this);
		
		slide = new JSlider(JSlider.HORIZONTAL,0,30,0);
		slide.setMajorTickSpacing(10);
		slide.setMinorTickSpacing(1);
		slide.setPaintLabels(true);
		slide.setPaintTicks(false);
		slide.setPreferredSize(null);
		
		
		
		east.add(slide);
		
		
		slide.addChangeListener(new ChangeListener() {
			
			@Override
			public void stateChanged(ChangeEvent e) {
				JSlider source = (JSlider) e.getSource();
				{
					dt.changeSize(source.getValue());
					dt.changeFont(source.getValue());
				}
				
			}
		});
		
		dt = new DrawAndType();
		
		
		
		content.add(BorderLayout.CENTER, dt);
		content.add(BorderLayout.WEST, west);
		content.add(BorderLayout.NORTH, north);
		content.add(BorderLayout.EAST, east);
		content.add(BorderLayout.SOUTH, south);
		
		
		
		setSize(1400,800);
		setTitle("Noobie Paint");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.add(content);
		
		
		setResizable(false);
		setVisible(true);
	}
	public static void refresh(){
		
	}
	
public static void main(String []args)
{
	new Frame();
}
@Override
public void actionPerformed(ActionEvent e) {
	Object source = e.getSource();
	if(source == jb)
	{	
		dt.repaint();
		
	}
	else if(source == change)
	{
		Color tint  = JColorChooser.showDialog(this, "change color", Color.BLACK);
		dt.changeColor(tint);
	}
	else if(source == sw)
	{
		boolean switching = true;
		
		if(switching)
		{
		
			dt.shapes(switching);
		} 
		
	}
	
	else if(source == jb2){
		Color color=JColorChooser.showDialog(this,"Select a color",Color.BLACK);    
		west.setBackground(color);
	}
	else if(source == jb3){
		Color color=JColorChooser.showDialog(this,"Select a color",Color.BLACK);    
		east.setBackground(color);
	}
	else if(source == jb4){
		Color color=JColorChooser.showDialog(this,"Select a color",Color.BLACK);    
		south.setBackground(color);
	}
	
}
@Override
public void itemStateChanged(ItemEvent e) {
	if(sw.isSelected())
	{
		dt.circle(false);
		dt.shapes(true);
		dt.rectangle(true);
		
	}
	else if(sw2.isSelected())
	{
		dt.rectangle(false);
		dt.shapes(true);
		dt.circle(true);
	}
	else
	{
		dt.shapes(false);
	}
	
	
}
	

}

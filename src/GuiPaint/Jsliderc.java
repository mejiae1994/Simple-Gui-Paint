package hw2;

import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSlider;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class Jsliderc {
	
	JLabel label;
	JSlider slide;
	
	public Jsliderc()
	{
		
		
		label = new JLabel();
		slide = new JSlider(JSlider.VERTICAL,0,30,0);
		label.setOpaque(true);
		slide.setMajorTickSpacing(10);
		slide.setMinorTickSpacing(1);
		slide.setPaintLabels(true);
		slide.setPaintTicks(true);
		
		
	
		
		slide.addChangeListener(new ChangeListener() {
			
			@Override
			public void stateChanged(ChangeEvent e) {
				JSlider source = (JSlider) e.getSource();
				{
					
				}
				
			}
		});
		
	}
	

}

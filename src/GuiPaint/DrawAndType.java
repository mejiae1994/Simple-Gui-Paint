package hw2;

import java.awt.Color;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class DrawAndType extends CircleDraw implements KeyListener{
	private FontMetrics fm;
	
	private int fSize = 45;
	private int fontSize = 60;
	Font font = new Font("serif",Font.ITALIC, fontSize);
	Font font2;
	
	
	
	public DrawAndType()
	{
		super();
		addKeyListener(this);
		
		fm = getFontMetrics(font);
		
	}
	public void changeFont(int val) 
	{
		fontSize = val;
		fSize = fontSize*3;
		
		
	}
	

	@Override
	public void keyPressed(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyReleased(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyTyped(KeyEvent e) 
	{
		String s = String.valueOf(e.getKeyChar());
		Graphics g = getGraphics();
		g.setColor(color1);
		Font test = new Font("serif", Font.ITALIC, fSize);
		g.setFont(test);
		g.drawString(s, getLastX(), getLastY());
		record(getLastX() + fm.stringWidth(s), getLastY());
		
	}
	
	

}

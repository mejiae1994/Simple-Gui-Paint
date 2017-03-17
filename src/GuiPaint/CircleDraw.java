package hw2;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.awt.image.BufferedImage;

import javax.swing.JPanel;

public class CircleDraw extends JPanel implements MouseListener, MouseMotionListener{
	private int circleSize = 40;
	private int lastX=0, lastY=0;
	private int times = 0;
	private int size = 0;
	protected Color color1 = Color.RED;
	private boolean drawShapes = false;
	private boolean rect = false;
	private boolean circle = false;
	BufferedImage img;
	Graphics2D g2;
	
	public CircleDraw()
	{
		setBackground(Color.WHITE);
		//img = new BufferedImage(1400,1000, BufferedImage.TYPE_INT_RGB);
		//g2 = img.createGraphics();
		//g2.setBackground(Color.BLACK);
	
	
		//g2.setColor(Color.PINK);
		//g2.fillRect(0, 0, 1200, 700);
		addMouseListener(new CircleAdapter());
		addMouseMotionListener(this);
		addMouseListener(this);
		
	}
	/*public void paint(Graphics g)
	{
		super.paint(g);
		
		g.drawImage(img, 1, 1, this);
		g.dispose();
		
		
	}*/
	public void changeSize(int val) 
	{
		size = val;
		
	}
	public void shapes(boolean state)
	{
		drawShapes = state;
		
		
	}
	public void circle(boolean val)
	{
		circle = val;
	}
	public void rectangle(boolean valu)
	{
		rect = valu;
	}
	
	public void changeColor(Color tint) 
	{
		color1 = tint;
		
	}
	
	
	
	private class CircleAdapter extends MouseAdapter{
		
		
		public void mousePressed(MouseEvent e)
		{
			if(drawShapes) {
			lastX = e.getX();//puts the information from the mouse into the event e
			lastY = e.getY();
			Graphics g = e.getComponent().getGraphics();
			Graphics2D g2d = (Graphics2D)g; //cast graphics g into graphics2d
			g2d.setColor(color1);
			
			if(rect)
			{
			g2d.fillRect(lastX-(circleSize/2), lastY-(circleSize/2), (circleSize *size)/2, (circleSize*size)/2);
			}
			else if(circle)
			{
			g2d.fillOval(lastX-(circleSize/2), lastY-(circleSize/2), (circleSize*size)/2, (circleSize*size)/2);
			}
			
			}
		}
	}
	
	



	@Override
	public void mouseDragged(MouseEvent e) 
	{
		System.out.println("working");
		int x = e.getX();
		int y = e.getY();
		Graphics g = getGraphics();
		Graphics g2 = (Graphics2D) g;
		g2.setColor(color1);
		((Graphics2D) g2).setStroke(new BasicStroke(size));
		g2.drawLine(lastX, lastY, x, y);
		g2.dispose();
		record(x,y);
	}
	protected void record(int x,int y)
	{
		lastX = x;
		lastY = y;
	}
	public int getLastX()
	{
		return lastX;
	}
	public int getLastY()
	{
		return lastY;
	}



	@Override
	public void mouseMoved(MouseEvent e) {
		record(e.getX(),e.getY());
		
	}



	@Override
	public void mouseClicked(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}



	@Override
	public void mouseEntered(MouseEvent e) {
		requestFocus();
		record(e.getX(),e.getY());
		
	}



	@Override
	public void mouseExited(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}



	@Override
	public void mousePressed(MouseEvent e) 
	{
		int x = e.getX();
		int y = e.getY();
		record(x, y);
		
	}



	@Override
	public void mouseReleased(MouseEvent e) {
		
		
	}
	
	

}

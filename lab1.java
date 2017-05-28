import javax.swing.*;
import java.awt.*;
import java.awt.geom.*;
class jo extends JPanel{
 static int x=0;
 int y=100;
  int flag =2;
 int a= 150;
 int b= 0;
public void paintComponent(Graphics g){
		Graphics2D g2d =(Graphics2D)g;
		super.paintComponent( g );
		if (flag==2){
	
		g2d.fill(new Ellipse2D.Double(x,y,65,100));
		x+=25;
	
	 if (x==400)
		{
		flag =1;
	
		}
		}
		else if (flag==1) 
		{
		g2d.fill(new Ellipse2D.Double(a,b,65,100));
		b+=25;
		if (b==400){ 
		flag =2;
		}
		}
	
		try {
		Thread.sleep(100);
		}
		catch (Exception e){}
		repaint(100);
 
		}
 
	}
	/*class jp extends JPanel{
	JButton jb1= new JButton ("Pause");

	
	}*/
	
 public class lab1 extends JFrame{
 	public static void main (String args[])
	{
		jo mp= new jo();
		lab1 mf= new lab1();
		mf.add(mp);
		/*jp p = new jp();
		p.setLayout(new BoxLayout(p, BoxLayout.PAGE_AXIS));
		mf.add(p);*/
		mf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		mf.setBounds(100,100,400,400);
		mf.setVisible(true);
		}
		}
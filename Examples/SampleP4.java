import java.awt.*;
import java.awt.event.*;

public class SampleP4 extends Frame
{
  boolean bl;

  public static void main(String[] args)
  {
	SampleP4 sm = new SampleP4();
  }
  public SampleP4()
  {
	super("샘플");

	bl = true;

	addWindowListener(new SampleWindowListener());
	addMouseListener(new SampleMouseAdapter());
	
	setSize(250, 200);
	setVisible(true);
  }
  public void paint(Graphics g)
  {
    if(bl == true){
	  g.drawString("안녕하세요.", 100, 100);
	}
	else{
	  g.drawString("안녕히 가세요.", 100, 100);
	}
  }
  class SampleWindowListener extends WindowAdapter
  {
	public void windowClosing(WindowEvent e)
	{
	  System.exit(0);
	}
  }
  class SampleMouseAdapter extends MouseAdapter
  {
	public void mouseEntered(MouseEvent e)
	{
	  bl = true;
	  repaint();
	}
    public void mouseExited(MouseEvent e)
	{
	  bl = false;
	  repaint();
    }
  }
}
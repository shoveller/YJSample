import java.awt.*;
import java.awt.event.*;

public class SampleP3 extends Frame
{
  Image im;
  int x = 100;
  int y = 100;

  public static void main(String[] args)
  {
	SampleP3 sm = new SampleP3();
  }
  public SampleP3()
  {
    super("ป๙วร");

	Toolkit tk = getToolkit();
	im = tk.getImage("Image.jpg");
	
	addWindowListener(new SampleWindowListener());
	addMouseListener(new SampleMouseAdapter());
	
	setSize(250, 200);
	setVisible(true);
  }
  public void paint(Graphics g)
  {
    g.drawImage(im, x, y, this);
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
    public void mousePressed(MouseEvent e)
    {
	  x = e.getX();
	  y = e.getY();
	  repaint();
	}
  }
}
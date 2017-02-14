import java.awt.*;
import java.awt.event.*;

public class SampleP2 extends Frame
{
  public static void main(String[] args)
  {
    SampleP2 sm = new SampleP2();
  }
  public SampleP2()
  {
    super("ป๙วร");

    addWindowListener(new SampleWindowListener());
    
    setSize(250, 200);
	setVisible(true);
  }
  public void paint(Graphics g)
  {
    g.setColor(Color.BLUE);
    g.fillRect(50, 50, 100, 100);
  }
  class SampleWindowListener extends WindowAdapter
  {
    public void windowClosing(WindowEvent e)
	{
	  System.exit(0);
 	}
  }
}
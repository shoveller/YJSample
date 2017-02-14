import java.awt.*;
import java.awt.event.*;

public class SampleP1 extends Frame
{
  private Label lb;

  public static void main(String[] args)
  {
    SampleP1 sm = new SampleP1();
  }
  public SampleP1()
  {
    super("샘플");

    lb = new Label("Hello");

    add(lb);

    lb.setForeground(Color.blue);
    lb.setFont(new Font("Serif", Font.ITALIC, 32));

    addWindowListener(new SampleWindowListener());
  
    setSize(250, 200);
    setVisible(true);
  }

  class SampleWindowListener extends WindowAdapter
  {
    public void windowClosing(WindowEvent e)
    {
      System.exit(0);
    }
  }
}
import java.awt.*;
import java.awt.event.*;

public class Sample1 extends Frame
{
  public static void main(String[] args)
  {
     Sample1 sm = new Sample1();
  }

  public Sample1()
  {
     super("샘플");

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
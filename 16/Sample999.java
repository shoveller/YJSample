import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Sample999 extends Applet implements ActionListener
{
    Button bt;
    public void init()
    {
        bt = new Button("버튼");
        add(bt);
        bt.addActionListener(this);

        add(new Checkbox());

        Choice choice = new Choice();
        choice.add("초이스");
        add(choice);

        Label label = new Label("라벨");
        add(label);
        List list = new List();
        list.add("리스트 1");
        list.add("리스트 2");
        list.add("리스트 3");
        add(list);

        add(new TextField("텍스트 필드",30));

        add(new TextArea("텍스트 에이리어"));

        add(new Scrollbar());
    }
    public void actionPerformed(ActionEvent ae)
    {
        bt.setLabel("중단");
    }
}
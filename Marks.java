import java.applet.*;
import java.awt.*;
import java.awt.event;
class Marks extends Applet implements ActionListener
{
	TextField t1,t2,t3,t4;
	Button b;
	Label l1,l2,l3,l4;
	public void init()
	{
		l1=new Label("Mark 1");
		t1=new TextField(5);
		l2=new Label("Mark 2");
		t2=new TextField(5);
		l3=new Label("Mark 3");
		t3=new TextField(5);
		l4=new Label("Result");
		t4=new TextField(5);
		t1.setBounds(210,40,100,20);
		t2.setBounds(210,80,100,20);
		t3.setBounds(210,120,100,20);
		t4.setBounds(210,140,100,20);
		l1.setBounds(100,40,100,20);
		l2.setBounds(100,80,100,20);
		l3.setBounds(100,120,100,20);
		l4.setBounds(100,140,100,20);
		b=new Button("Find");
		b.setBound(230,150,60,50);
		add(l1);
		add(l2);
		add(l3);
		add(l4);
		add(t1);
		add(t2);
		add(t3);
		add(t4);
		add(b);
		b.addActionListener(this);
	}
	public void actionPerformed(ActionEvent e)
	{
		int x=y=z=total=0;
		x=Integer.parseInt(t1.getText());
		y=Integer.parseInt(t2.getText());
		z=Integer.parseInt(t3.getText());
		if(e.getSource()==b)
		{
			total=(x+y+z)/3;
			t4.setText(String.valueOf(total));
		}
	}
	public void paint(Graphics g)
	{
		int x=y=z=total=0;
		x=Integer.parseInt(t1.getText());
		y=Integer.parseInt(t2.getText());
		z=Integer.parseInt(t3.getText());
		total=(x+y+z)/3;
		if(total>50)
		{
			g.setColor(Color.YELLOW);
			g.fillOval(80,70,150,150);
			g.setColor(Color.BLACK);
			g.fillOval(120,120,15,15);
			g.fillOval(120,120,15,15);
			g.drawArc(130,180,50,20,180,180);
		}
		else
		{
			g.setColor(Color.YELLOW);
			g.fillOval(80,70,150,150);
			g.setColor(Color.BLACK);
			g.fillOval(120,120,15,15);
			g.fillOval(120,120,15,15);
			g.drawArc(130,180,50,20,180,-180);
		}
	}
}	
		
		
		
		
		
		
		
		
		

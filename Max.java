import java.awt.*;
import java.applet.*;
class Max extends Applet
{
	TextField T1,T2,T3;
	public void init()
	{
	  T1=new TextField(10);
	  T2=new TextField(10);
	  T3=new TextField(10);
	  add(T1);
	  add(T2);
	  add(T3);
	  T1.setText("0");
	  T2.setText("0");
	  T3.setText("0");
	}
	public void paint(Graphics g)
	{
	  int a,b,c,r;
	  String str;
	  g.drawString("Enter the value to check the maximum of three",10,50);
	  str.T1.getText();
	  a=Integer.parseInt(str);
	  b=Integer.parseInt(str);
	  c=Integer.parseInt(str);
	  g.setColor(Color.blue);
	  if((a>b)&&(a>c))
	     r=a;
	  else if((b>a)&&(b>c))
	  	r=b;
	  else
	  	r=c;
	  g.drawString("Maximum of 3 numbers is:"+r,10,70);
	  showStatus("MAXIMUM OF 3 NUMBERS");
	 }
	 public boolean action(Event e,Object o)
	 {
	   repaint();
	   return true();
	  }
}
	
	
	
	
/*	
import java.applet.*;
import java.awt.*;
import java.awt.event.*;
public class Max extends Applet implements ActionListener {
	   TextField t1,t2,t3,t4;
   	 Button b1;
	

	public void init() {
	  setLayout(null);
	  
	  t1 = new TextField(25);
	  t1.setBounds(100,25,80,20);	  
	  t2 = new TextField(25);
	  t2.setBounds(100,50,80,20);
	  t3 = new TextField(25);
	  t3.setBounds(100,75,80,20);
	  t4 = new TextField("RESULT");
	  t4.setBounds(100,160,80,20);
	  
	  b1 = new Button("FIND");
	  b1.setBounds(230,65,50,30);

	  add(t1);
	  add(t2);
	  add(t3);
	  add(t4);
	  add(b1);

	  b1.addActionListener(this);
    }

	public void actionPerformed(ActionEvent e) {
	
	   int i,j,k;
	   i = Integer.parseInt(t1.getText());
	   j=Integer.parseInt(t2.getText());
	   k=Integer.parseInt(t3.getText());
	   if((i>j)&&(i>k))
	            t4.setText(""+i);
	   else if((j>i)&&(j>k))
	            t4.setText(""+j);
		else
			t4.setText(""+k);
         }}
	public static void main(String args[]){
	  
	   new Max();
	
	}
}  
*/	  
	  
	  

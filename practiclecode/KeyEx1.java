package practiclecode;

import java.awt.*;
import java.awt.event.*;
public class KeyEx1 implements KeyListener
{
	Label label1, label2;
	TextField field1;
	Frame jf;
	String str;
	KeyEx1()
	{
		jf = new Frame("Handling KeyEvent");
		label1= new Label("Press any key on keyboad, to see the events it generates -",
		Label.CENTER);
		label2= new Label();
		field1 = new TextField(20); //calling TextField(String)
		jf.setLayout(new FlowLayout());
		jf.add(label1);
		jf.add(field1);
		jf.add(label2);
		field1.addKeyListener(this); //As soon as button is clicked, data from all the textfields is read
		jf.setSize(360,200);
		jf.setVisible(true);
	}
	@Override
	public void keyPressed(KeyEvent ke)
	{
	str= "KeyCode : " + ke.getKeyCode() + ", -Key Pressed- ";
	label2.setText(str);
	jf.setVisible(true);
	}
	@Override
	public void keyReleased(KeyEvent ke)
	{
	str+=" -Key Released- ";
	label2.setText(str);
	jf.setVisible(true);
	str="";
	}
	@Override
	public void keyTyped(KeyEvent ke)
	{
	str+=" -Key Typed- ";
	label2.setText(str);
	jf.setVisible(true);
	}
	public static void main(String... ar)
	{
	new KeyEx1();
	}
}

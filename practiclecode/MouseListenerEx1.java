package practiclecode;

import java.awt.FlowLayout;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class MouceEx1 implements  MouseListener{
	
	
	JFrame frame;
	JLabel l1, l2;
	String str;
	
	
	
	MouceEx1(){
		frame = new JFrame("Handling mouce event");
		frame.setSize(500,500);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		
		l1 = new JLabel("Move the mouce");
		l2 = new JLabel("Result is here");
		frame.add(l1);
		frame.add(l2);
		frame.addMouseListener(this);
		frame.setLayout(new FlowLayout());
		frame.setVisible(true);
	}
	

	public static void main(String[] args) {
		new MouceEx1();
		

	}


	@Override
	public void mouseClicked(MouseEvent e) {
		str = "mouseClicked";
		l2.setText(str);
		
		
	}


	@Override
	public void mousePressed(MouseEvent e) {
		str+="mousePressed";
		l2.setText(str);
		
		
	}


	@Override
	public void mouseReleased(MouseEvent e) {
		str+="mouseReleased";
		l2.setText(str);
		
		
	}


	@Override
	public void mouseEntered(MouseEvent e) {
		str += "mouseEntered";
		l2.setText(str);
		
		
	}


	@Override
	public void mouseExited(MouseEvent e) {
		str += "mouseExited";
		l2.setText(str);
		
		
	}

}

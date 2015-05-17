import java.awt.event.*;
import javax.swing.*;
import java.awt.*;
public class testG extends JFrame{
	TestCircle circle = new TestCircle();

	public testG(){
		add(circle);
	}
	
	//Main method
	public static void main(String[] args) {
		JFrame frame = new testG();
		frame.setTitle("U10316006 GeoCalculate");
		frame.setSize(400,200);
 		frame.setLocationRelativeTo(null);
		frame.getContentPane().setBackground(Color.YELLOW);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}
}

import java.awt.event.*;
import javax.swing.*;
import java.awt.*;
import java.awt.BorderLayout;

public class TestCircle extends JPanel {
	private JButton jbtCalculate = new JButton("Calculate");
	private JButton jbtDelete = new JButton("Delete");
	double radius;
	
	JLabel label1 = new JLabel("Radius:");
	JTextField label2 = new JTextField(4);
	
	JLabel label3 = new JLabel("The area is:");
	JTextField label4 = new JTextField(4);
	
	JLabel label5 = new JLabel("The perimeter is:");
	JTextField label6 = new JTextField(4);
	
	public TestCircle(){
		//panel1
		JPanel p1 = new JPanel();
		p1.setLayout(new GridLayout(1,4));
		
		p1.add(label1);
		p1.add(label2);
		p1.add(jbtCalculate);
		p1.add(jbtDelete);
		
		label2.setForeground(Color.BLUE);
		add(p1, BorderLayout.NORTH);
		
		jbtCalculate.addActionListener(new ButtonListener());
		jbtCalculate.setForeground(Color.GREEN);
		jbtDelete.addActionListener(new ButtonListener1());
		jbtDelete.setForeground(Color.RED);
		

		//panel2
		JPanel p2 = new JPanel();
		p2.setLayout(new GridLayout(1,2));
		
		p2.add(label3);
		p2.add(label4);
		
	    label4.setForeground(Color.BLUE);
		add(p2, BorderLayout.CENTER);
		
		//panel3
		JPanel p3 = new JPanel();
		p3.setLayout(new GridLayout(1,2));
		
		p3.add(label5);
		p3.add(label6);
		
		label6.setForeground(Color.BLUE);
		add(p3, BorderLayout.SOUTH);

}
	private class ButtonListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			radius = Integer.parseInt(label2.getText());
			label4.setText( String.valueOf( String.format("%.2f", getArea())));
			label6.setText( String.valueOf( String.format("%.2f", getPerimeter())));
		}
	}
	
	private class ButtonListener1 implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			label2.setText("");
			label4.setText("");
			label6.setText("");
		}
	}
	
	//method
	public double getArea() {
		return radius * radius * Math.PI;
  }

	public double getPerimeter() {
    return 2 * radius * Math.PI;
  }
}

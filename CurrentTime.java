import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CurrentTime extends JFrame{
	
	private Timer t;
	
	public CurrentTime() {
		
		ActionListener listener = new TimerListener();
		
		int oneSec = 1000;
		t = new Timer(oneSec, listener);
		t.restart();
		
		JLabel label = new JLabel("TEST");		
	}
	
	class TimerListener implements ActionListener {
		
		public void actionPerformed(ActionEvent event) {
			System.out.println(new java.util.Date());
		}
	}
	
	public static void main(String[]args) {
		
		JFrame frame = new CurrentTime();
	    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(400, 300);		
		frame.setVisible(true);
	}
}	


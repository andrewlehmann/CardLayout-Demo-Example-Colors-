package colors;

import java.awt.CardLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class Color extends JFrame {

	
	private static final long serialVersionUID = 1L;
	JPanel Cards;
	public static Blue BLUE;
	public static Red RED;
	public static Green GREEN;
	
	public static void main(String[] args) {
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Color frame = new Color();
					BLUE = new Blue(frame);
					GREEN = new Green(frame);
					RED = new Red(frame);
					
					frame.Cards.add(BLUE, "Blue");
					frame.Cards.add(RED, "Red");
					frame.Cards.add(GREEN, "Green");
					frame.setVisible(true);
					
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public Color() {
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		Cards = new JPanel();
		Cards.setBorder(new EmptyBorder(0, 0, 0, 0));
		Cards.setLayout(new CardLayout(0, 0));
		setContentPane(Cards);
	}

}

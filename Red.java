package colors;

import javax.swing.JPanel;

import java.awt.CardLayout;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Red extends JPanel {

	private static final long serialVersionUID = 1L;

	public Red(colors.Color frame) {
		
		setBackground(Color.RED);
		setLayout(null);
		
		JButton btnNextColor = new JButton("Next Color");
		btnNextColor.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				CardLayout cardLayout = (CardLayout)(frame.Cards.getLayout());
				cardLayout.show(frame.Cards, "Green");
				frame.Cards.revalidate();
				frame.Cards.repaint();
			}
		});
		btnNextColor.setBounds(173, 138, 104, 23);
		add(btnNextColor);

	}

}

package colors;

import javax.swing.JPanel;

import java.awt.CardLayout;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Green extends JPanel {

	private static final long serialVersionUID = 1L;

	public Green(colors.Color frame) {
		setBackground(Color.GREEN);
		setLayout(null);
		
		JButton btnNextColor = new JButton("Next Color");
		btnNextColor.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				CardLayout cardLayout = (CardLayout)(frame.Cards.getLayout());
				cardLayout.show(frame.Cards, "Blue");
				frame.Cards.revalidate();
				frame.Cards.repaint();
			}
		});
		btnNextColor.setBounds(176, 138, 103, 23);
		add(btnNextColor);

	}

}

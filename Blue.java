package colors;

import java.awt.CardLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;

public class Blue extends JPanel {
	
	private static final long serialVersionUID = 1L;

	public Blue(colors.Color frame) {
		
		setBackground(Color.BLUE);
		setLayout(null);
		
		JButton btnNextColor = new JButton("Next Color");
		btnNextColor.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				CardLayout cardLayout = (CardLayout)(frame.Cards.getLayout());
				cardLayout.show(frame.Cards,"Red");
				frame.Cards.revalidate();
				frame.Cards.repaint();
			}
		});
		btnNextColor.setBounds(174, 138, 102, 23);
		add(btnNextColor);

	}

}

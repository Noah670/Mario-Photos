package Login;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.ImageIcon;

public class HomePage implements ActionListener {

	// Private swing fields
	private static JLabel userLabel;

	private static JButton peach;
	private static ImageIcon peachImage;
	private static JLabel peachLabel;
	private static JFrame myFrame;
	private static JPanel myPanel;
	private static JButton daisy;
	private static ImageIcon daisyImage;
	private static JLabel daisyLabel;
	private static JButton rosalina;
	private static ImageIcon rosalinaImage;
	private static JLabel rosalinaLabel;

	public static void newFrame() {
		myFrame = new JFrame();
		myPanel = new JPanel();

		myFrame.setSize(1366, 768);
		myFrame.setTitle("Mario pictures Home");
		myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		myFrame.add(myPanel);

		// panel setup
		myPanel.setLayout(null);

		userLabel = new JLabel("Here are your pictures Mario:");
		userLabel.setBounds(500, 0, 300, 80);
		myPanel.add(userLabel);

		peach = new JButton("Peach");
		peach.setBounds(100, 50, 80, 25);
		peach.addActionListener(new HomePage());
		myPanel.add(peach);

		peachImage = new ImageIcon("peach.png");
		peachLabel = new JLabel(peachImage);
		peachLabel.setBounds(10, 100, 374, 654);
		myPanel.add(peachLabel);
		peachLabel.hide();

		daisy = new JButton("Daisy");
		daisy.setBounds(550, 50, 80, 25);
		daisy.addActionListener(new HomePage());
		myPanel.add(daisy);

		daisyImage = new ImageIcon("daisy.jpg");
		daisyLabel = new JLabel(daisyImage);
		daisyLabel.setBounds(380, 100, 500, 688);
		myPanel.add(daisyLabel);
		daisyLabel.hide();

		rosalina = new JButton("Rosalina");
		rosalina.setBounds(1000, 50, 100, 25);
		rosalina.addActionListener(new HomePage());
		myPanel.add(rosalina);

		rosalinaImage = new ImageIcon("rosalina.png");
		rosalinaLabel = new JLabel(rosalinaImage);
		rosalinaLabel.setBounds(850, 100, 567, 688);
		myPanel.add(rosalinaLabel);
		rosalinaLabel.hide();

		myPanel.setBorder(new EmptyBorder(7, 8, 6, 8));
		myPanel.setBackground(new Color(255, 111, 97));

		myFrame.setLocationRelativeTo(null);
		myFrame.setVisible(true);

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub

		// peachLabel.show();

		if (peach.getModel().isArmed()) {
			peachLabel.setVisible(!peachLabel.isVisible());
		}

		if (daisy.getModel().isArmed()) {
			daisyLabel.setVisible(!daisyLabel.isVisible());
		}

		if (rosalina.getModel().isArmed()) {
			rosalinaLabel.setVisible(!rosalinaLabel.isVisible());
		}

		// peachLabel.setVisible(false);

	}

}

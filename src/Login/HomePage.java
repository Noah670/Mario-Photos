package Login;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.IOException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;

public class HomePage implements ActionListener {

	// Private swing fields
	private static JLabel userLabel;

	private static JButton peach;
	private static BufferedImage newPeachImage;
	private static JLabel peachLabel;
	private static JFrame myFrame;
	private static JPanel myPanel;
	private static JButton daisy;
	private static BufferedImage newDaisyImage;
	private static JLabel daisyLabel;
	private static JButton rosalina;
	private static BufferedImage newRosalinaImage;
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

		try {
			newPeachImage = ImageIO.read(HomePage.class.getResource("/res/peach.png"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		peachLabel = new JLabel("peach");
		peachLabel.setIcon(new ImageIcon(newPeachImage));
		peachLabel.setBounds(10, 100, 374, 654);
		myPanel.add(peachLabel);
		peachLabel.hide();

		daisy = new JButton("Daisy");
		daisy.setBounds(550, 50, 80, 25);
		daisy.addActionListener(new HomePage());
		myPanel.add(daisy);

		try {
			newDaisyImage = ImageIO.read(HomePage.class.getResource("/res/daisy.jpg"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		daisyLabel = new JLabel("daisy");
		daisyLabel.setIcon(new ImageIcon(newDaisyImage));
		daisyLabel.setBounds(380, 100, 500, 688);
		myPanel.add(daisyLabel);
		daisyLabel.hide();

		rosalina = new JButton("Rosalina");
		rosalina.setBounds(1000, 50, 100, 25);
		rosalina.addActionListener(new HomePage());
		myPanel.add(rosalina);

		try {
			newRosalinaImage = ImageIO.read(HomePage.class.getResource("/res/rosalina.png"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		rosalinaLabel = new JLabel("rosalina");
		rosalinaLabel.setIcon(new ImageIcon(newRosalinaImage));
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

		if (peach.getModel().isArmed()) {
			peachLabel.setVisible(!peachLabel.isVisible());
		}

		if (daisy.getModel().isArmed()) {
			daisyLabel.setVisible(!daisyLabel.isVisible());
		}

		if (rosalina.getModel().isArmed()) {
			rosalinaLabel.setVisible(!rosalinaLabel.isVisible());
		}

	}

}

package Login;

import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.concurrent.TimeUnit;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.border.EmptyBorder;

public class LoginUI implements ActionListener {

	// Private swing fields
	private static JLabel userLabel;
	private static JTextField userText;
	private static JLabel passwordLabel;
	private static JPasswordField passwordText;
	private static JButton myButton;
	private static JLabel correctLogin;

	public static void main(String[] args) {
		JFrame myFrame = new JFrame();
		JPanel myPanel = new JPanel();

		try {
			// Set cross-platform Java L&F (also called "Metal")
			UIManager.setLookAndFeel("javax.swing.plaf.metal.MetalLookAndFeel");
		} catch (UnsupportedLookAndFeelException e) {
			// handle exception
		} catch (ClassNotFoundException e) {
			// handle exception
		} catch (InstantiationException e) {
			// handle exception
		} catch (IllegalAccessException e) {
			// handle exception
		}

		myFrame.setSize(340, 200);
		myFrame.setTitle("Mario Login");
		myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		myFrame.add(myPanel);

		// panel setup
		// myPanel.setLocation(null);
		myPanel.setLayout(null);

		userLabel = new JLabel("Username:");
		userLabel.setBounds(10, 20, 80, 25);
		myPanel.add(userLabel);

		userText = new JTextField(30);
		userText.setBounds(100, 20, 165, 25);
		myPanel.add(userText);

		passwordLabel = new JLabel("Password:");
		passwordLabel.setBounds(10, 50, 80, 25);
		myPanel.add(passwordLabel);

		passwordText = new JPasswordField();
		passwordText.setBounds(100, 50, 165, 25);
		myPanel.add(passwordText);

		myButton = new JButton("Login");
		myButton.setBounds(10, 80, 80, 25);
		myButton.addActionListener(new LoginUI());
		myPanel.add(myButton);

		correctLogin = new JLabel("");
		correctLogin.setBounds(10, 110, 300, 25);
		myPanel.add(correctLogin);
		correctLogin.setText("");

		myPanel.setBorder(new EmptyBorder(7, 8, 6, 8));
		myPanel.setBackground(new Color(255, 111, 97));

		myFrame.setLocationRelativeTo(null);
		myFrame.setVisible(true);

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String username = userText.getText();
		String password = passwordText.getText();

		if (username.equals("mario") && password.equals("epic")) {
			correctLogin.setText("Successfully logged in!");
			try {
				TimeUnit.MILLISECONDS.sleep(200);
			} catch (InterruptedException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			// HomePage myHome = new HomePage();
			HomePage.newFrame();
		} else {
			correctLogin.setText("Incorrect Username or Password");

		}

	}

}

package guis;

import java.awt.Color;
import java.awt.Font;
import java.awt.image.BufferedImage;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class RegisterGui  extends BaseFrame {
	public RegisterGui() {
		super("Banking App Register");
	}
	
	@Override protected void addGuiComponents() {
		// creates banking app label
				JLabel bankingAppLabel = new JLabel("MESA VERDE");
				bankingAppLabel.setBounds(15, 20, super.getWidth(), 40);
				bankingAppLabel.setFont(new Font("Coolvetica", Font.BOLD, 32));
				bankingAppLabel.setHorizontalAlignment(SwingConstants.CENTER);
				bankingAppLabel.setForeground(Color.BLACK);
				add(bankingAppLabel);
				
				// subheading 
				JLabel bankingSubLabel = new JLabel("B A N K  &  T R U S T");
				bankingSubLabel.setBounds(15, 40, super.getWidth(), 40);	
				bankingSubLabel.setFont(new Font("Coolvetica", Font.BOLD, 16));
				bankingSubLabel.setHorizontalAlignment(SwingConstants.CENTER);
				bankingSubLabel.setForeground(new Color(8,164,121));
				add(bankingSubLabel);
				
				// logo
				BufferedImage mesaVerdeLeogo = null;
				try {
					mesaVerdeLeogo = ImageIO.read(this.getClass().getResource("mesaVerdeLogo.png"));
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				JLabel logo = new JLabel(new ImageIcon(mesaVerdeLeogo));
				logo.setBounds(85, 18, 50, 50);
				add(logo);
				
				// username label
				JLabel usernameLabel = new JLabel("Username");
				usernameLabel.setBounds(20, 120, getWidth() - 30, 24);
				usernameLabel.setFont(new Font("Dialog", Font.BOLD, 20));
				usernameLabel.setForeground(new Color(8,164,121));
				add(usernameLabel);
				
				// user icon panel
				JPanel panel = new JPanel();
		        panel.setLayout(new BoxLayout(panel, BoxLayout.X_AXIS));
		        // Create an icon label and set the login icon
		        JLabel iconLabel = new JLabel(new ImageIcon(getClass().getResource("user.png")));
		        panel.setBackground(new Color(230, 246, 241));
		        
		        // Create the text field
		        JTextField usernameField = new JTextField("");
		        usernameField.setFont(new Font("Arial", Font.PLAIN, 18));
		        usernameField.setForeground(new Color(158,175,175));
		        usernameField.setBackground(new Color(230, 246, 241));
		        usernameField.setBorder(null);
		        panel.add(iconLabel);
		        panel.add(usernameField);
		        panel.setBounds(20, 160, getWidth() - 50, 40);
		        add(panel);
				
				// password label
				JLabel passwordLabel = new JLabel("Password");
				passwordLabel.setBounds(20, 220, getWidth() - 50, 24);
				passwordLabel.setFont(new Font("Dialog", Font.BOLD, 20));
				passwordLabel.setForeground(new Color(8,164,121));
				add(passwordLabel);
				
				// password field with icon
				JPanel passwordPanel = new JPanel();
				passwordPanel.setLayout(new BoxLayout(passwordPanel, BoxLayout.X_AXIS));
				passwordPanel.setBackground(new Color(230, 246, 241));
				passwordPanel.setBounds(20, 260, getWidth() - 50, 40);

				// Create an icon label and set the password icon
				JLabel passwordIconLabel = new JLabel(new ImageIcon(getClass().getResource("pass.png")));
				passwordPanel.add(passwordIconLabel);

				// Create the password field
				JTextField passwordField = new JPasswordField();
				passwordField.setFont(new Font("Dialog", Font.PLAIN, 28));
				passwordField.setForeground(new Color(158, 175, 175));
				passwordField.setBackground(new Color(230, 246, 241));
				passwordField.setBorder(null);
				passwordPanel.add(passwordField);
				add(passwordPanel);
				
				// re-type password label ---------------------------
				JLabel rePasswordLabel = new JLabel("Re-type Password:");
				rePasswordLabel.setBounds(20, 310, getWidth() - 50, 40);
				rePasswordLabel.setFont(new Font("Dialog", Font.BOLD, 20));
				rePasswordLabel.setForeground(new Color(8,164,121));
				add(rePasswordLabel);

				// re-type password field
				
				JPanel repasswordPanel = new JPanel();
				repasswordPanel.setLayout(new BoxLayout(repasswordPanel, BoxLayout.X_AXIS));  // Change this line
				repasswordPanel.setBackground(new Color(230, 246, 241));
				repasswordPanel.setBounds(20, 360, getWidth() - 50, 40);

				// Create an icon label and set the password icon
				JLabel repasswordIconLabel = new JLabel(new ImageIcon(getClass().getResource("pass.png")));
				repasswordPanel.add(repasswordIconLabel);

				// Create the password field
				JTextField repasswordField = new JPasswordField();
				repasswordField.setFont(new Font("Dialog", Font.PLAIN, 28));
				repasswordField.setForeground(new Color(158, 175, 175));
				repasswordField.setBackground(new Color(230, 246, 241));
				repasswordField.setBorder(null);
				repasswordPanel.add(repasswordField);
				add(repasswordPanel);
				
				// login buttons -----------------------
				JButton registerButton = new JButton("Register");
				registerButton.setBounds(20, 460, getWidth() - 50, 40);
				registerButton.setFont(new Font("Arial", Font.PLAIN, 20));
				registerButton.setBackground(new Color(8,164,121));
				registerButton.setForeground(Color.WHITE);
				registerButton.setFocusPainted(false);
				add(registerButton);
				
				// register button
				JLabel registerLabel = new JLabel("Have an account? Sign in here");
				registerLabel.setBounds(getWidth()/5+10, 510, getWidth() - 50, 40);
				registerLabel.setFont(new Font("Arial", Font.PLAIN, 16));
				registerLabel.setForeground(Color.GRAY);
				add(registerLabel);
	}
}

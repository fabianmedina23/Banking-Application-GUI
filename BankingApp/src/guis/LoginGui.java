package guis;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.image.BufferedImage;
import java.io.File;
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
import javax.swing.border.MatteBorder;


public class LoginGui extends BaseFrame {
	public LoginGui() {
		super("Banking App Login");
	}
	
	@Override
	protected void addGuiComponents() {

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
		passwordLabel.setBounds(20, 230, getWidth() - 50, 24);
		passwordLabel.setFont(new Font("Dialog", Font.BOLD, 20));
		passwordLabel.setForeground(new Color(8,164,121));
		add(passwordLabel);
		
		// password field with icon
		JPanel passwordPanel = new JPanel();
		passwordPanel.setLayout(new BoxLayout(passwordPanel, BoxLayout.X_AXIS));
		passwordPanel.setBackground(new Color(230, 246, 241));
		passwordPanel.setBounds(20, 270, getWidth() - 50, 40);

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
		
		// login buttons
		JButton loginButton = new JButton("Login");
		loginButton.setBounds(20, 460, getWidth() - 50, 40);
		loginButton.setFont(new Font("Arial", Font.PLAIN, 20));
		loginButton.setBackground(new Color(8,164,121));
		loginButton.setForeground(Color.WHITE);
		loginButton.setFocusPainted(false);
		add(loginButton);
		
		// register button
		JLabel registerLabel = new JLabel("Don't have an account? Reigster Here");
		registerLabel.setBounds(getWidth()/7+5, 510, getWidth() - 50, 40);
		registerLabel.setFont(new Font("Arial", Font.PLAIN, 16));
		registerLabel.setForeground(Color.GRAY);
		add(registerLabel);
   
	}
}

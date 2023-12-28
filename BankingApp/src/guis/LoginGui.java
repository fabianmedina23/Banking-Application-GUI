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
		bankingAppLabel.setForeground(new Color(8,164,121));
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
		usernameLabel.setFont(new Font("Dialog", Font.PLAIN, 20));
		add(usernameLabel);
		
		usernameLabel.setForeground(Color.BLACK);

		
		// username field
        //MatteBorder matteBorder = new MatteBorder(0, 0, 1, 0, Color.BLACK);
	/**	JTextField usernameField = new JTextField();
		usernameField.setBounds(20, 160, getWidth() - 50, 40);
		usernameField.setFont(new Font("Dialog", Font.PLAIN, 28));
		//usernameField.setBorder(matteBorder);
		usernameField.setBackground(new Color (230,246,241));
		usernameField.setBorder(null);
		usernameField.setPrefixIcon(new ImageIcon(getClass().getResource("login.png")));
		
		add(usernameField);
		**/
		
		JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.X_AXIS));
        

        // Create an icon label and set the login icon
        JLabel iconLabel = new JLabel(new ImageIcon(getClass().getResource("user.png")));
        
        panel.setBackground(new Color(230, 246, 241));
        // Create the text field
        JTextField usernameField = new JTextField(" Username");
        usernameField.setFont(new Font("Arial", Font.PLAIN, 18));
        usernameField.setForeground(new Color(158,175,175));
        usernameField.setBackground(new Color(230, 246, 241));
        usernameField.setBorder(null);



        // Add the icon label and text field to the panel
        panel.add(iconLabel);
        panel.add(usernameField);

        // Set the bounds for the panel
        panel.setBounds(20, 160, getWidth() - 50, 40);

        add(panel);


		
		// password label
		JLabel passwordLabel = new JLabel("Password");
		passwordLabel.setBounds(20, 280, getWidth() - 50, 24);
		passwordLabel.setFont(new Font("Dialog", Font.PLAIN, 20));
		add(passwordLabel);
		
		passwordLabel.setForeground(Color.BLACK);

		
		// username field
		JTextField passwordField = new JPasswordField();
		passwordField.setBounds(20, 320, getWidth() - 50, 40);
		passwordField.setFont(new Font("Dialog", Font.PLAIN, 28));
        //passwordField.setBorder(matteBorder);
		passwordField.setBackground(new Color (230,246,241));
		passwordField.setBorder(null);
		

		add(passwordField);
		

		
		// login buttons
		JButton loginButton = new JButton("Login");
		loginButton.setBounds(20, 460, getWidth() - 50, 40);
		loginButton.setFont(new Font("Dialog", Font.BOLD, 20));
		add(loginButton);
		
		loginButton.setBackground(new Color(255,255,255));
		loginButton.setForeground(Color.BLACK);
		loginButton.setFocusPainted(false);
   
	}
}

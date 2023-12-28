import guis.LoginGui;
import javax.swing.*;

public class AppLauncher {
	public static void main(String[] args) {
	// use invokeLater to make updates to GUI thread-safe
	SwingUtilities.invokeLater(new Runnable(){
		@Override
		public void run() {
			new LoginGui().setVisible(true);
		}
	});
}
}

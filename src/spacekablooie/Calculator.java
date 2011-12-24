package spacekablooie;

import java.awt.event.WindowAdapter;

import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.UIManager;

public class Calculator extends JComponent {

	/**
	 * Serial Version ID = 1
	 * (to make java happy)
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * @param args does nothing (yet)
	 */
	public static void main(String[] args) {
		try {
			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
		} catch (Exception e) {
			e.printStackTrace();
		}
		Calculator calculator = new Calculator();
		JFrame window = new JFrame("Super Calculator");
		window.add(calculator);
		window.pack();
		window.setLocationRelativeTo(null);
		window.setVisible(true);
		window.addWindowListener(new WindowAdapter() {
			
		});
	}

}

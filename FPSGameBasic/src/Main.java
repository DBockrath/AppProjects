import java.awt.Insets;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;

public class Game extends JFrame {

	public static final int DISPLAY_WIDTH = 300;
	public static final int DISPLAY_HEIGHT = 200;

	private static int DISPLAY_X;
	private static int DISPLAY_Y;

	public Game() {

		add(new Board());
		setTitle("FPS Game Basic");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(DISPLAY_WIDTH, DISPLAY_HEIGHT);
		setLocationRelativeTo(null);
		setResizable(false);
		setVisible(true);

		Insets insets = getInsets();
		DISPLAY_X = insets.left;
		DISPLAY_Y = insets.top;
		resizeToInternalSize(DISPLAY_WIDTH, DISPLAY_HEIGHT);

	}

	public void resizeToInternalSize(int internalWidth, int internalHeight) {

		Insets insets = getInsets();
		final int newWidth = internalWidth + insets.left + insets.right;
		final int newHeight = internalHeight + insets.top + insets.bottom;

		Runnable resize = new Runnable() {

			public void run() {

				setSize(newWidth, newHeight);

			}

		};

		if (SwingUtilities.isEventDispatchThread()) {

			try {

				SwingUtilities.invokeAndWait(resize);

			}

			catch (Exception e) {

			}

		}

		else {

			resize.run();

		}

		validate();

	}

	public static void main(String[] args) {

		new Game();

	}	

}

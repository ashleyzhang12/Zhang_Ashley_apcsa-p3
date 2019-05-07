
import javax.swing.JFrame;
import java.awt.Component;
public class BreakOutGame extends JFrame{

	//(c) A+ Computer Science
	//www.apluscompsci.com
	//Name -

		private static final int WIDTH = 800;
		private static final int HEIGHT = 600;

		public BreakOutGame()
		{
			super("BREAKOUT");
			setSize(WIDTH,HEIGHT);

			BreakOut game = new BreakOut();

			((Component)game).setFocusable(true);
			getContentPane().add(game);

			setVisible(true);

			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		}

		public static void main( String args[] )
		{
			BreakOutGame run = new BreakOutGame();
		}
	}


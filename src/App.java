import javax.swing.JFrame;

public class App {

	public static void main(String[] args) {
		
		JFrame frame = new JFrame();
		EspiralPanel espiral = new EspiralPanel();
		
		frame.add(espiral);
		frame.setSize(500, 500);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}

}

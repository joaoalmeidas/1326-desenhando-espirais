import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Polygon;

import javax.swing.JPanel;

public class EspiralPanel extends JPanel {

	@Override
	public void paintComponent(Graphics g) {
		
		
		int[] pontosX = new int[18];
		int[] pontosY = new int[18];
		
		pontosX[0] = getWidth()/2;
		pontosY[0] = getWidth()/2;
		
		for(int i = 0; i < pontosX.length; i++) {
			
			
			
			
		}
		
		
		g.drawPolyline(pontosX, pontosY, pontosX.length);
	}
	
}

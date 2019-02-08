import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Polygon;

import javax.swing.JPanel;

public class EspiralPanel extends JPanel {

	@Override
	public void paintComponent(Graphics g) {
		
		
		int[] pontosX = new int[20];
		int[] pontosY = new int[20];
		
		int pulo = 30;
		
		pontosX[0] = getWidth()/2;
		pontosY[0] = getHeight()/2;
		
		for(int i = 1; i < pontosX.length; i++) {
			
			if(i%8 == 1) {
				
				pontosX[i] = pontosX[i - 1] - 20;
				pontosY[i] = pontosY[i - 1] +  pulo;
				
			}else if(i%8 == 2) {
				
				pontosX[i] = pontosX[i - 1] - pulo;
				pontosY[i] = pontosY[i - 1] +  20;
				//
			}else if(i%8 == 3) {
				
				pontosX[i] = pontosX[i - 1] - pulo;
				pontosY[i] = pontosY[i - 1] - 20;
				
			}else if(i%8 == 4) {
				
				pontosX[i] = pontosX[i - 1] - 20;
				pontosY[i] = pontosY[i - 1] - pulo;
				//
			}else if(i%8 == 5) {
				
				pontosX[i] = pontosX[i - 1] + 20;
				pontosY[i] = pontosY[i - 1] - pulo;
				
			}else if(i%8 == 6) {
				
				pontosX[i] = pontosX[i - 1] + pulo;
				pontosY[i] = pontosY[i - 1] - 20;
				//
			}else if(i%8 == 7) {
				
				pontosX[i] = pontosX[i - 1] + pulo;
				pontosY[i] = pontosY[i - 1] + 20;
				
			}else if(i%8 == 0) {
				
				pontosX[i] = pontosX[i - 1] + 20;
				pontosY[i] = pontosY[i - 1] + pulo;
				
			}

			if(i%2 == 0) {
				
				pulo+=7;
				
			}
			
			
		}
		
		
		g.drawPolyline(pontosX, pontosY, pontosX.length);
	}
	
}

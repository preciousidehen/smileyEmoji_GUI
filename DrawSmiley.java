/*
 * program: this program draws a smiley emoji using GUI component
 */


import java.awt.Color;
import java.awt.Graphics;
import java.awt.color.*;
import javax.swing.JPanel;

public class DrawSmiley extends JPanel {
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.setColor(Color.GREEN);
		g.fillOval(10, 10, 200, 200);
		
		
		g.setColor(Color.BLACK);
		g.fillOval(65, 55, 30, 30);
		g.fillOval(135, 55, 30, 30);
		
		
		g.fillOval(50, 110, 120, 60);
		
		g.setColor(Color.BLACK);
		g.fillRect(50, 110, 120, 30);
		g.fillOval(50, 120, 110, 30);
		
		
		
		
	}

}

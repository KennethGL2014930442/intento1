package ejemplosgraficos;

import javax.swing.*;
import java.awt.*;
import java.awt.geom.*;
import java.awt.geom.Ellipse2D.Double;

public class TrabajandoColores {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MarcoConColor mimarco = new MarcoConColor();
		mimarco.setVisible(true);
		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		mimarco.setBackground(Color.yellow);
	}

}

class MarcoConColor extends JFrame{
	
	public MarcoConColor() {
	
		setTitle("Prueba de colores");
		setSize(400,400);
		
		LaminaConColor laminacolor = new LaminaConColor();
		
		add(laminacolor);
		
		
		
	}
	
}

class LaminaConColor extends JPanel{
	
	public void paintComponent(Graphics g) {
		
		super.paintComponents(g);
		
		Graphics2D g2 = (Graphics2D) g;
		
		Rectangle2D rectangulo = new Rectangle2D.Double(100,100,200,150);
		g2.setPaint(Color.blue);
		g2.draw(rectangulo);
		g2.setPaint(Color.MAGENTA);
		g2.fill(rectangulo);
		
		Ellipse2D elipse = new Ellipse2D.Double();
		elipse.setFrame(rectangulo);
		
		g2.setPaint(Color.BLACK);
		g2.fill(elipse);	
		g2.setPaint(Color.WHITE);
		g2.draw(elipse);
		
	}
	
}
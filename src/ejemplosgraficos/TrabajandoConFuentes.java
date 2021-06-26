package ejemplosgraficos;

import java.awt.*;
import javax.swing.*;


public class TrabajandoConFuentes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MarcoConFuentes mimarco = new MarcoConFuentes();
		
		mimarco.setVisible(true);
		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
	}

}

class MarcoConFuentes extends JFrame{
	
	public MarcoConFuentes() {
		
		setTitle("Prueba con fuentes");
		setSize(400,400);
		
		LaminaConFuentes milamina = new LaminaConFuentes();
		add(milamina);
		milamina.setForeground(Color.BLUE);
		
	}
	
}

class LaminaConFuentes extends JPanel{
	
	public void paintComponent(Graphics g) {
		
		super.paintComponent(g);
		Graphics2D g2 = (Graphics2D) g;
		
		Font mifuente = new Font("Arial", Font.BOLD, 26);
		
		g2.setFont(mifuente);
		//g2.setColor(Color.BLUE);
		g2.drawString("Kenneth", 100, 150);

		g2.setFont(new Font("Times New Roman", Font.ITALIC, 25));
		//g2.setColor(new Color(128,90,50).brighter());
		g2.drawString("Gonzalez", 100, 185);
		
	}	
}
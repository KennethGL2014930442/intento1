package ejemplosgraficos;

import java.awt.*;
import javax.swing.*;
import java.io.*;
import javax.imageio.*;

public class PruebaImagenes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MarcoImagen mimarco = new MarcoImagen();
		mimarco.setVisible(true);
		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	
	}
}

class MarcoImagen extends JFrame{
	
	public MarcoImagen() {
		setTitle("Marco con imagen");
		setBounds(550,75,740,740);
		LaminaImagen imagen = new LaminaImagen();
		add(imagen);	
	}
}

class LaminaImagen extends JPanel{
	
	public LaminaImagen() {
		try {
			imagen = ImageIO.read(new File("src/ejemplosgraficos/dados.jpg"));
		}
		catch(IOException e) {
			System.out.println("La imagen no se ha encontrado");		
		}		
	}
	
	public void paintComponent(Graphics g) {
	
		super.paintComponent(g);
		
		int anchuraImagen=imagen.getWidth(this);
		int alturaImagen=imagen.getHeight(this);
		
		g.drawImage(imagen, 0, 0, null);
	
		for(int i=0; i<300;i++) {
			for(int j=0; j<450;j++) {
				if(i+j>0) {
					g.copyArea(0, 0, anchuraImagen, alturaImagen, anchuraImagen*i, alturaImagen*j);
				}	
			}
		}			
	}
	
	private Image imagen;
}
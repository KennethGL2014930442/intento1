package ejemplosgraficos;

import java.awt.Toolkit;
import java.awt.*;
import javax.swing.*;


public class CreandoMarcoCentrado {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MarcoCentrado centrado = new MarcoCentrado();
		
		centrado.setVisible(true);
		centrado.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
	}

}

class MarcoCentrado extends JFrame{
	
	public MarcoCentrado() {
		
		Toolkit mipantalla=Toolkit.getDefaultToolkit();
		Dimension tamanioPantalla=mipantalla.getScreenSize();
		int alturaPantalla=tamanioPantalla.height;
		int anchoPantalla=tamanioPantalla.width;
		
		setSize(anchoPantalla/2, alturaPantalla/2);
		setLocation(anchoPantalla/4, alturaPantalla/4);
		setTitle("Mi primer marco centrado");
		
		Image miIcono = mipantalla.getImage("src/ejemplosgraficos/icono.jpg");
		setIconImage(miIcono);
		
		
	}
	
}

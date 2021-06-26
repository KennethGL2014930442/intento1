package ejemplosgraficos;

import java.awt.Frame;

import javax.swing.*;

public class CreandoMarcos {

	public static void main(String[] args) {
		
		miMarco marco1 = new miMarco();
		marco1.setVisible(true);
		marco1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}

}

class miMarco extends JFrame{
	
	public miMarco() {
		
		//setSize(500,300);//tamanio del marco
		//setLocation(500,300);//locacion del marco al iniciar el programa.
		setBounds(500,300,500,300);//metodo inicia el marco con tamanio y posicion
		//setResizable(false);//no se puede redimensionar el marco.
		//setExtendedState(Frame.MAXIMIZED_BOTH);//abre el marco a pantalla completa
		setTitle("Mi primer ventana");//nombre de la ventana
		
	}
	
}

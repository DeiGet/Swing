package com.masqueprogramar.apariencia;

import java.awt.Dimension;
import java.awt.Toolkit;

import javax.swing.JOptionPane;

/**
 * @author masqueprogramar (https://masqueprogramar.wordpress.com)
 * @date 22-marzo-2019
 * @description Mostrar resolución de la pantalla en Java       
 * @version 1.0
 * @url https://masqueprogramar.wordpress.com/2019/03/22/mostrar-resolucion-pantalla-java- 
 */


public class MostrarResolucionPantalla {

	public static void main(String[] args) {
		
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		Dimension screenSize = toolkit.getScreenSize();
		String resolucion = "La resolución de la pantalla es de " + 
				(int)screenSize.getWidth() + " x " + 
				(int)screenSize.getHeight(); 
		
		JOptionPane.showMessageDialog(null, 
				resolucion, 
				"Resolución de la pantalla", 
				JOptionPane.INFORMATION_MESSAGE);
				
	}
}

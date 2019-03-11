package com.masqueprogramar.dialogos;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 * @author masqueprogramar (https://masqueprogramar.wordpress.com)
 * @date 05-marzo-2019
 * @description Ejemplos ShowConfirmDialog      
 * @version 1.0
 * @url https://masqueprogramar.wordpress.com/2019/03/05/ejemplos-showconfirmdialog 
 */


public class EjemplosShowConfirmDialog {

	public static void main(String[] args) {
		
		// Devuelven un int:
		//	0 - Aceptar, Sí
		//	1 - No
		//	2 - Cancelar
		
		// Método con 2 parámetros
		JOptionPane.showConfirmDialog(null, "Método con 2 parámetros");
		
		
		// Método con 4 parámetros
		JOptionPane.showConfirmDialog(null, "Aceptar o Cancelar", 
				"OK_CANCEL_OPTION", JOptionPane.OK_CANCEL_OPTION, 
				JOptionPane.INFORMATION_MESSAGE);
				
		JOptionPane.showConfirmDialog(null, "Aceptar", 
				"CLOSED_OPTION", JOptionPane.CLOSED_OPTION, 
				JOptionPane.INFORMATION_MESSAGE);
				
		JOptionPane.showConfirmDialog(null, "Sí o No", 
				"YES_NO_OPTION", JOptionPane.YES_NO_OPTION, 
				JOptionPane.INFORMATION_MESSAGE);
				
		JOptionPane.showConfirmDialog(null, "Sí, No o Cancelar", 
				"YES_NO_CANCEL_OPTION", JOptionPane.YES_NO_CANCEL_OPTION, 
				JOptionPane.INFORMATION_MESSAGE);	
		
		
		// Método con 5 parámetros
		JOptionPane.showConfirmDialog(null, "Mensaje de información", 
				"INFORMATION_MESSAGE", JOptionPane.OK_CANCEL_OPTION, 
				JOptionPane.INFORMATION_MESSAGE);
		
		JOptionPane.showConfirmDialog(null, "Mensaje de error", 
				"ERROR_MESSAGE", JOptionPane.OK_CANCEL_OPTION, 
				JOptionPane.ERROR_MESSAGE);
		
		
		// Método con 6 parámetros
		ImageIcon icono = new ImageIcon("resources/parentesisIcono.png");
		int resp =JOptionPane.showConfirmDialog(null, "Personalizando cuadro de diálogo", 
				"Blog masqueprogramar", JOptionPane.YES_NO_CANCEL_OPTION, 
				JOptionPane.INFORMATION_MESSAGE, icono);
		
		
		String mensaje = "";
		switch (resp) {
		case 0:
			mensaje = "Has pulsado Sí";
			break;
		case 1:
			mensaje = "Has pulsado No";
			break;
		case 2:
			mensaje = "Has pulsado Cancelar";
		}
		JOptionPane.showMessageDialog(null, mensaje);
		
	}

}

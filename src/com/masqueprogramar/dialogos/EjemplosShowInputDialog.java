package com.masqueprogramar.dialogos;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 * @author masqueprogramar (https://masqueprogramar.wordpress.com)
 * @date 06-marzo-2019
 * @description Ejemplos ShowInputDialog      
 * @version 1.0
 * @url https://masqueprogramar.wordpress.com/2019/03/06/ejemplos-showinputdialog
 */

public class EjemplosShowInputDialog {
	
	public static void main(String[] args) {
		
		// Método con un parámetro
		JOptionPane.showInputDialog("Método con un parámetro");
		
		
		// Métodos con 2 parámetros
		// parentComponent y message
		JOptionPane.showInputDialog(null, "Método con 2 parámetros");
		
		// message y initialSelectionValue
		JOptionPane.showInputDialog("Método con 2 parámetros", "Valor inicial");
		
		
		// Método con 3 parámetros
		JOptionPane.showInputDialog(null, "Método con 3 parámetros", "Valor inicial");
		
		
		// Método con 4 parámetros 
		JOptionPane.showInputDialog(null, "Método con 4 parámetros", 
				"Título del diálogo", JOptionPane.INFORMATION_MESSAGE);
		
		
		// Método con 7 parámetros
		ImageIcon icono = new ImageIcon("resources/parentesisIcono.png");
		
		Object resp = JOptionPane.showInputDialog(null, "Método con 7 parámetros",
				"Título del diálogo", JOptionPane.INFORMATION_MESSAGE, 
				icono, new Object[] { "Opción 1","Opción 2", "Opción 3", "Opción 4" }, 
				"Opción 2");
				
		JOptionPane.showMessageDialog(null, resp, 
				"Selección", JOptionPane.INFORMATION_MESSAGE);
				
	}

}

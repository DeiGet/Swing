package com.masqueprogramar.dialogos;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 * @author masqueprogramar (https://masqueprogramar.wordpress.com)
 * @date 04-marzo-2019
 * @description Ejemplos ShowMessageDialog      
 * @version 1.0
 * @url https://masqueprogramar.wordpress.com/2019/03/04/ejemplos-showmessagedialog 
 */

public class EjemplosShowMessageDialog {

	public static void main(String[] args) {
		
		JOptionPane.showMessageDialog(null, "Método con 2 parámetros");
				
		JOptionPane.showMessageDialog(null, "Mensaje sin icono", 
				"PLAIN_MESSAGE", JOptionPane.PLAIN_MESSAGE);
		
		JOptionPane.showMessageDialog(null, "Mensaje de información", 
				"INFORMATION_MESSAGE", JOptionPane.INFORMATION_MESSAGE);
		
		JOptionPane.showMessageDialog(null, "Mensaje de advertencia", 
				"WARNING_MESSAGE", JOptionPane.WARNING_MESSAGE);
		
		JOptionPane.showMessageDialog(null, "Mensaje de Error", 
				"ERROR_MESSAGE", JOptionPane.ERROR_MESSAGE);
		
		JOptionPane.showMessageDialog(null, "Mensaje de pregunta", 
				"QUESTION_MESSAGE", JOptionPane.QUESTION_MESSAGE);
		
		
		ImageIcon icono = new ImageIcon("resources/parentesisIcono.png");
		JOptionPane.showMessageDialog(null, "Personalizando cuadro de diálogo", 
					"Blog masqueprogramar", JOptionPane.INFORMATION_MESSAGE, icono);
	}
}

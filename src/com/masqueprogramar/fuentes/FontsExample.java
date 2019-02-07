package com.masqueprogramar.fuentes;

import java.awt.Font;
import java.awt.GraphicsEnvironment;
import java.util.Arrays;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;


/**
 * Example of Fonts.
 * 
 * @author Chuidiang
 * @url http://chuwiki.chuidiang.org/index.php?title=Fuentes_de_texto_en_Java
 * 
 * 
 * @date 07-febrero-2019
 * @version 1.0
 * @description Interfaz gráfica que muestra las fuentes disponibles del sistema
 * @url https://masqueprogramar.wordpress.com/2019/02/07/interfaz-grafica-muestre-fuentes
 * 
 */

public class FontsExample {

	public static void main(String[] args) throws InterruptedException {
		
		// List all available fonts.
		String[] fontNames = GraphicsEnvironment.getLocalGraphicsEnvironment()
				.getAvailableFontFamilyNames();
		//System.out.println(Arrays.toString(fontNames));
		
		// A window with label
		JFrame frame = new JFrame("Fonts example");
		JLabel label = new JLabel();
		label.setHorizontalAlignment(SwingConstants.CENTER);
		frame.getContentPane().add(label);
		frame.setSize(400, 100);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
		
		// Show a text for each font
		for (String font : fontNames) {
			label.setText("Hi, I'm " + font);
			label.setFont(new Font(font, Font.PLAIN, 15));
			Thread.sleep(1000);
		}
		
	}

}

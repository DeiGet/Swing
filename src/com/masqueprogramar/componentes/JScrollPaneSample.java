package com.masqueprogramar.componentes;

import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

/**
 * @author masqueprogramar (https://masqueprogramar.wordpress.com)
 * @date 21-febrero-2019
 * @description Ejemplo de JScrollPane en Swing       
 * @version 1.0
 * @url https://masqueprogramar.wordpress.com/2019/02/21/ejemplo-jscrollpane-en-swing 
 */


public class JScrollPaneSample {

	public JScrollPaneSample() {
		JTextArea textArea = new JTextArea();
		textArea.setText("Indice TIOBE");
		textArea.append("\n*************");
		textArea.append("\n 1 - Java");
		textArea.append("\n 2 - C");
		textArea.append("\n 3 - Phyton");
		textArea.append("\n 4 - C++");
		textArea.append("\n 5 - Visual Basic .NET");
		textArea.append("\n 6 - JavaScript");
		textArea.append("\n 7 - C#");
		textArea.append("\n 8 - PHP");
		textArea.append("\n 9 - SQL");
		textArea.append("\n 10 - Objective - C");
		
		JScrollPane scroll = new JScrollPane(textArea);
		
		JFrame frame = new JFrame("Ejemplo JScrollPane");
		frame.getContentPane().add(scroll, BorderLayout.CENTER);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(300, 180);
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
	}
	
	public static void main(String[] args) {
		new JScrollPaneSample();
	}

}

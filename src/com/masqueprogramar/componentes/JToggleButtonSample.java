package com.masqueprogramar.componentes;

import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JToggleButton;

/**
 * @author masqueprogramar (https://masqueprogramar.wordpress.com)
 * @date 20-marzo-2019
 * @description Ejemplo de JToggleButton en Swing       
 * @version 1.0
 * @url https://masqueprogramar.wordpress.com/2019/03/20/ejemplojtogglebutton-en-swing/ 
 */

public class JToggleButtonSample {
	
	public JToggleButtonSample() {
		
		JToggleButton toggleButton = new JToggleButton("Botón Toggle");
		toggleButton.setBounds(0, 0, 300, 30);
		
		JLabel label1 = new JLabel("");
		label1.setHorizontalAlignment(JLabel.CENTER);
		label1.setBounds(0, 30, 300, 30);
		
		toggleButton.addItemListener(new ItemListener() {
			
			@Override
			public void itemStateChanged(ItemEvent itemEvent) {
				int estado = itemEvent.getStateChange();
				if(estado == ItemEvent.SELECTED){
					label1.setText("Botón seleccionado");
				} else {
					label1.setText("Botón deseleccionado");
				}
			}
		});
		
		JFrame frame = new JFrame("Ejemplo JToggleButton"); 
		frame.setLayout(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		frame.setBounds(0, 0, 300, 100);
		frame.add(toggleButton);
		frame.add(label1);
	}

	public static void main(String[] args) {
		new JToggleButtonSample();
	}

}

package com.masqueprogramar.componentes;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;

/**
 * @author masqueprogramar (https://masqueprogramar.wordpress.com)
 * @date 22-marzo-2019
 * @description Ejemplo de ToolTipText       
 * @version 1.0
 * @url https://masqueprogramar.wordpress.com/2019/03/22/ejemplo-de-tooltiptext-en-swing/ 
 */

public class ToolTipTextSample extends JFrame {
	
	private static final long serialVersionUID = 1L;
	
	private JLabel label;
	private JTextField textField;
	private JButton button;
	
	public ToolTipTextSample() {
		setTitle("Ejemplo ToolTipText");
		setLayout(new FlowLayout());
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		addComponents();
	}
	
	private void addComponents(){
		label = new JLabel("Usuario:");
		label.setToolTipText("Introduce nombre usuario");
		
		textField = new JTextField(10);
		textField.setToolTipText("Nombre de usuario");
		
		button = new JButton("Aceptar");
		button.setToolTipText("Pulsa el botón aceptar");
		
		add(label);
		add(textField);
		add(button);
		
		pack();
		setLocationRelativeTo(null);
	}

	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			
			@Override
			public void run() {
				try{
					new ToolTipTextSample();
				} catch(Exception e){
					e.printStackTrace();
				}
			}
		});
	}
}

package com.masqueprogramar.dialogos;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.UIManager;

/**
 * @author masqueprogramar (https://masqueprogramar.wordpress.com)
 * @date 11-marzo-2019
 * @description Ejemplo JPanel en ShowMessageDialog      
 * @version 1.0
 * @url https://masqueprogramar.wordpress.com/2019/03/11/ejemplo-jpanel-en-showmessagedialog/ 
 */

public class EjemploPanelShowMessageDialog {

	public static void main(String[] args) {
		
		ImageIcon icono = new ImageIcon("resources/parentesisIcono.png");
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(102, 205, 170));
		panel.setSize(new Dimension(200, 64));
		panel.setLayout(null);
		
		JLabel label = new JLabel("Blog Masqueprogramar");
		label.setBounds(0, 0, 200, 64);
		label.setFont(new Font("Arial", Font.BOLD, 13));
		label.setHorizontalAlignment(SwingConstants.CENTER);
		panel.add(label);
		
		UIManager.put("OptionPane.minimumSize", new Dimension(300, 120));
		JOptionPane.showMessageDialog(null, panel, 
				"Customized Message Dialog", JOptionPane.PLAIN_MESSAGE, 
				icono);

	}
}

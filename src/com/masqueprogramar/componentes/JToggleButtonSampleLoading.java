package com.masqueprogramar.componentes;

import java.awt.FlowLayout;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JToggleButton;

/**
 * JToggleButton with ItemListener (Another Example)
 * 
 * @author hajsof - Blog Java tutorial 
 * @url https://hajsoftutorial.com/jtogglebutton-with-itemlistener-another-example/
 * 
 * 
 * @date 21-marzo-2019
 * @version 1.0
 * @description Ejemplo JToggleButton con imagen loading
 * @url https://masqueprogramar.wordpress.com/2019/03/21/ejemplo-jtogglebutton-ii-loading
 * 
 */

public class JToggleButtonSampleLoading extends JFrame implements ItemListener {
	
	private static final long serialVersionUID = 1L;
	
	private JToggleButton toogle;
	private JButton boton;
	
	public JToggleButtonSampleLoading() {
	
		setTitle("JToggleButton con ItemListener");
		setLayout(new FlowLayout());
		setJToggleButton();
		setAction();
		setSize(700, 150);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
	private void setJToggleButton(){
		toogle = new JToggleButton("Start");
		add(toogle);
		boton = new JButton(new ImageIcon("resources/unload.png"));
		add(boton);
	}
	
	private void setAction(){
		toogle.addItemListener(this);
	}

	@Override
	public void itemStateChanged(ItemEvent e) {
		if(toogle.isSelected()){
			toogle.setText("Stop");
			boton.setIcon(new ImageIcon("resources/loading.gif"));
		} else {
			toogle.setText("Start");
			boton.setIcon(new ImageIcon("resources/unload.png"));
		}
		
	}

	public static void main(String[] args) {
		new JToggleButtonSampleLoading();
	}
}

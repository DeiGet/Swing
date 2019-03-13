package com.masqueprogramar.apariencia;

import java.util.Enumeration;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.UIDefaults;
import javax.swing.UIManager;


/**
 * @author masqueprogramar (https://masqueprogramar.wordpress.com)
 * @date 12-marzo-2019
 * @description Propiedades de UIManager en Swing       
 * @version 1.0
 * @url https://masqueprogramar.wordpress.com/2019/03/12/propiedades-de-uimanager 
 */


public class ListarPropiedadesUIManager {

	public static void main(String[] args) {
		
		UIDefaults defaults = UIManager.getDefaults();
        String[] colName = {"Clave", "Valor"};
        String[][] rowData = new String[defaults.size()][2];
        int i = 0;
        for(Enumeration<Object> e = defaults.keys(); e.hasMoreElements(); i++){
            Object key = e.nextElement();
            rowData[i][0] = key.toString();
            rowData[i][1] = "" + defaults.get(key);
        }
        JFrame frame = new JFrame("Propiedades UIManager valores por defecto");
        JTable table = new JTable(rowData, colName);
        frame.setContentPane(new JScrollPane(table));
        frame.pack();
        frame.setVisible(true);
        frame.setSize(800, 600);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}

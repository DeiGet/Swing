package com.masqueprogramar;

import javax.swing.JOptionPane;
import javax.swing.JTextArea;

/**
 * @author masqueprogramar (https://masqueprogramar.wordpress.com)
 * @date 11-mayo-2018
 * @description Programa simule el lanzamiento de dos dados y muestre la frecuencia de los resultados       
 * @version 1.0
 * @url https://masqueprogramar.wordpress.com/2018/05/11/simulacion-lanzamiento-dados-java/ 
 */

public class LanzamientoDados {

	public static void main(String[] args) {
		
		int dado1, dado2;
		double frecuencia, porcentaje;
		int[] resultadosDado = new int[11];

		String strNumLanzamientos = JOptionPane.showInputDialog(null, 
				"Introduce el número de tiradas", 
				"Lanzamiento de dados", 
				JOptionPane.QUESTION_MESSAGE);
		int numLanzamientos = Integer.parseInt(strNumLanzamientos);
		
		for(int lanzamiento=0;lanzamiento<numLanzamientos;lanzamiento++){
			dado1 = lanzamientoDado();
			dado2 = lanzamientoDado();
			resultadosDado[(dado1+dado2)-2]++;
		}
		
		JTextArea textArea = new JTextArea("");
		textArea.append("Número de lanzamientos :" + numLanzamientos + "\n\n");
		textArea.append("Dados\tTotal\tFrecuencia\tPorcentaje" + "\n");
		for(int aux=0;aux<resultadosDado.length;aux++){
			frecuencia = (double)resultadosDado[aux]/numLanzamientos;
			porcentaje = frecuencia * 100;
			textArea.append((aux+2) + 
					"\t" + resultadosDado[aux] + 
					"\t" + frecuencia +
					"\t" + String.format("%.2f", porcentaje) + "%" +
					"\n");
		}
		JOptionPane.showMessageDialog(null, 
				textArea, 
				"Lanzamiento de dados", 
				JOptionPane.INFORMATION_MESSAGE);
	}
	
	static int lanzamientoDado(){
		return (int)Math.floor(Math.random()*6+1);
	}
}

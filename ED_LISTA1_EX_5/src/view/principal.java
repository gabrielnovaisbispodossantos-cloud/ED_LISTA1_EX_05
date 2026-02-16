package view;

import javax.swing.JOptionPane;

import controller.metodos;
public class principal {

	public static void main(String[] args) {
		   metodos m = new metodos();

		   int n = Integer.parseInt(JOptionPane.showInputDialog("digite um numero : ")); 
		   
	        double resultado = m.somatoria(n);

	        System.out.println("Resultado da somatória = " + resultado);
	    }
	}
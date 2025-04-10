package com.empresa;

public class VariableDeInstancia {
	String nombre;
	
	void mostrarnombre() {
		System.out.println("nombre: "+nombre);
	}

	public static void main(String[] args) {
		VariableDeInstancia p1 = new VariableDeInstancia();
		p1.nombre = "Jorge";
		p1.mostrarnombre();

	}

}

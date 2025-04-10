package com.empresa;

public class SwitchCase {

	public static void main(String[] args) {
		/*int dia = 8;
		
		switch(dia) {
		case 1:
			System.out.println("Este es el dia lunes");
			break;
			
		case 2:	
			System.out.println("Este es el dia martes");
			break;
			
		case 3:	
			System.out.println("Este es el dia miercoles");
			break;
			
		case 4:	
			System.out.println("Este es el dia jueves");
			break;	
			
		case 5:	
			System.out.println("Este es el dia viernes");
			break;	
			
		case 6:	
			System.out.println("Este es el dia sabado");
			break;
			
		case 7:	
			System.out.println("Este es el dia domingo");
			break;
			
			default:
				System.out.println("Dia no valido");
		}*/
		
		String modulo = "Contabilidad";
		
		switch(modulo) {
		case "Contabilidad":
			System.out.println("Ingreso al modulo de Contabilidad");
			break;
			
		case "Presupuesto":	
			System.out.println("Ingreso al modulo de Presupuesto");
			break;
			
		case "Tesoreria":	
			System.out.println("Ingreso al modulo de Tesoreria");
			break;
			
		case "Nomina":	
			System.out.println("Ingreso al modulo de Nomina");
			break;	
			
		case "Inventatios":	
			System.out.println("Ingreso al modulo de Inventatios");
			break;	
			
		case "Indycom":	
			System.out.println("Ingreso al modulo de Indycom");
			break;
			
		case "Predial":	
			System.out.println("Ingreso al modulo de Predial");
			break;
			
			default:
				System.out.println("Regrese a la pagina de inicio y seleccione un modulo");
		}

	}

}

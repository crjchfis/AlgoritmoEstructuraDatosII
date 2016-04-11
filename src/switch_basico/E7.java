/*
 * Ejercicio N° 7
 * Escribir un número de los meses del año, y me muestre su equivalente en cadena;
 */

package switch_basico;

import java.util.Scanner; //importamos la clase Scanner

public class E7 
{
	///PROPIEDADES
	byte nma;		//número de meses del año
	String m;		//meses
	
	//MÉTODOS
	
	void leer()
	{
		//creamos el objeto Scanner
		Scanner leer=new Scanner(System.in);
		
		System.out.print("Ingresar el número de un mes del año: ");
		nma=leer.nextByte();
		
	} //fin del método leer
	
	
	void calcular()
	{
		//calculamos el mes equivalente
		switch(nma)
		{
		case 1:
			m="enero";
			break;
			
		case 2:
			m="febrero";
			break;
			
		case 3:
			m="marzo";
			break;
			
		case 4:
			m="abril";
			break;
			
		case 5:
			m="mayo";
			break;
			
		case 6:
			m="junio";
			break;
			
		case 7:
			m="julio";
			break;
			
		case 8:
			m="agosto";
			break;
			
		case 9:
			m="septiembre";
			break;
			
		case 10:
			m="octubre";
			break;
			
		case 11:
			m="noviembre";
			break;
			
		case 12:
			m="diciembre";
			break;
		} //fin del switch
		
	} //fin del método calcular
	
	
	void mostrar()
	{
		System.out.print("El mes equivalente es: "+m);
		
	} //fin del método mostrar
	
	
	
	public static void main(String[] args)
	{
		//creamos el objeto E7
		E7 a=new E7();
		
		a.leer();
		a.calcular();
		a.mostrar();
		
	} //fin del método main
	
} //fin de la clase E7

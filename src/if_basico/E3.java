/*
 * Ejercicio N° 3
 * Realice un algoritmo para determinar cuánto se debe pagar por equis cantidad de lápices 
 * considerando que si son 100 o más el costo es de $85; de lo contrario, el precio es de $90. 
 */

package if_basico;

import java.util.Scanner; //importamos la clase Scanner

public class E3 
{
	//PROPIEDADES
	int cl;				//cantidad de lápices
	final byte c1=85;	//primer costo
	final byte c2=90;	//segundo costo
	int pt;				//precio total
	
	//MÉTODOS
	
	void leer()
	{
		//creamos el objeto Scanner
		Scanner leer=new Scanner(System.in);
		
		System.out.print("Ingresar la cantidad de lápices: ");
		cl=leer.nextInt();
				
	} //fin del método leer
	
	void calcular()
	{
		if (cl>=100)
		{
			pt=cl*c1;
		}
		else
		{
			pt=cl*c2;
		} //fin del si
		
	} //fin del método calcular
	
	
	void mostrar()
	{
		System.out.print("El precio total es: "+pt);
		
	} //fin del método mostrar
	
	
	
	public static void main(String[] args)
	{
		//creamos el objeto E3
		E3 p=new E3();
		
		p.leer();
		p.calcular();
		p.mostrar();
		
	} //fin del método main

} //fin de la clase E3

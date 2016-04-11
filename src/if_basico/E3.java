/*
 * Ejercicio N� 3
 * Realice un algoritmo para determinar cu�nto se debe pagar por equis cantidad de l�pices 
 * considerando que si son 100 o m�s el costo es de $85; de lo contrario, el precio es de $90. 
 */

package if_basico;

import java.util.Scanner; //importamos la clase Scanner

public class E3 
{
	//PROPIEDADES
	int cl;				//cantidad de l�pices
	final byte c1=85;	//primer costo
	final byte c2=90;	//segundo costo
	int pt;				//precio total
	
	//M�TODOS
	
	void leer()
	{
		//creamos el objeto Scanner
		Scanner leer=new Scanner(System.in);
		
		System.out.print("Ingresar la cantidad de l�pices: ");
		cl=leer.nextInt();
				
	} //fin del m�todo leer
	
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
		
	} //fin del m�todo calcular
	
	
	void mostrar()
	{
		System.out.print("El precio total es: "+pt);
		
	} //fin del m�todo mostrar
	
	
	
	public static void main(String[] args)
	{
		//creamos el objeto E3
		E3 p=new E3();
		
		p.leer();
		p.calcular();
		p.mostrar();
		
	} //fin del m�todo main

} //fin de la clase E3

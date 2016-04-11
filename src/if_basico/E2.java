/*
 * Ejercicio N° 2
 * Realice un algoritmo para determinar si un número es positivo o negativo.
 */

package if_basico;

import java.util.Scanner; //importamos la clase Scanner

public class E2 
{
	//PROPIEDADES
	
	int n;		//número
	String m;	//mensaje
		
	//MÉTODOS
	
	void leer()
	{
		//creamos el objeto Scanner
		Scanner leer=new Scanner(System.in);
		
		System.out.print("Ingresar el número: ");
		n=leer.nextInt();
	} //fin del método leer
	
	
	void deteminar()
	{
		if (n>=0)
		{
			m="Número positivo";
		}
		else
		{
			m="Número negativo";
		} //fin del if
		
	} //fin del método determinar
	
	
	void mostrar()
	{
		System.out.print(m);
		
	} //fin del método mostrar
	
	
	public static void main(String[] args)
	{
		//creamos el objeto E2
		E2 d=new E2();
		
		d.leer();
		d.deteminar();
		d.mostrar();
		
	} //fin del método main
	
} //fin de la clase E2

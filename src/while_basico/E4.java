/*
 * Ejercicio N° 4
 * Elaborar un programa que imprima n veces los números pares.
 */

package while_basico;

import java.util.Scanner; //importamos la clase Scanner

public class E4 
{
	//PROPIEDADES
	int n;		//número de veces
	int c;		//contador
	int np;		//números pares
		
	//MÉTODOS
	
	void leer()
	{
		//creamos el objeto Scanner
		Scanner leer=new Scanner(System.in);
		
		System.out.print("Ingresar el número de veces: ");
		n=leer.nextInt();
		
	} //fin del método leer
	
	
	void imprima()
	{
		//inicializamos el contador, acumulador, números pares
		c=1;
		np=2;
		
		while(c<=n)
		{
			System.out.println(np);
			np=np+2;
			c++;
		} //fin del while
		
	} //fin del método imprima
	
	
	
	public static void main(String[] args)
	{
		//creamos el objeto E4
		E4 e=new E4();
		
		e.leer();
		e.imprima();
		
	} //fin del método main
	
} //fin de la clase E4

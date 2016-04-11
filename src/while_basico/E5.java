/*
 * Ejercicio N° 5
 * Elaborar un programa que imprima n veces los número impares.
 */

package while_basico;

import java.util.Scanner; //importamos la clase Scanner

public class E5 
{
	//PROPIEDADES
	int n;		//número de veces
	int c; 		//contador
	int ni;		//números impares
		
	//MÉTODOS
	
	void leer()
	{
		//creamos el objeto Scanner
		Scanner leer =new Scanner(System.in);
		
		System.out.print("Ingresar el número de veces: ");
		n=leer.nextInt();
		
	} //fin del método leer
	
	
	void imprima()
	{
		//incializamos el contador y el acumulador
		c=1; ni=1;
		
		while(c<=n)
		{
			System.out.println(ni);
			ni+=2;
			c++;
		} //fin del while
		
	} //fin del método imprima
	
	
	
	public static void main(String[] args)
	{
		//creamos el objeto E5
		E5 i=new E5();
		
		i.leer();
		i.imprima();
		
	} //fin del método main
	
} //fin de la clase E5

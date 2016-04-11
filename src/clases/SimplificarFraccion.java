/*
 * Primera Clase
 * Mag. Rolando Chavez Guillen
 * 
 * Elabore un algoritmo orientado a objetos, que pueda simplificar una fracción.
 */

package clases;

import java.util.Scanner; //importamos la clase Scanner

public class SimplificarFraccion 
{
	
	//PROPIEDADES
	int n;			//numerador
	int d;			//denominador
	int div=2;		//divisor
	
	//MÉTODOS
	
	//método para leer los datos
	void leer()
	{
		//creamos el objeto Scanner
		Scanner leer=new Scanner(System.in);
				
		System.out.print("Ingrese el numerador: ");
		n=leer.nextInt();
		
		d=0;
		while(d==0)
		{
			System.out.print("Ingrese el denominador: ");
			d=leer.nextInt();		
		} //fin del mientras
		
	} //fin del método leer
	
	
	//método para simplificar la fracción
	void simplificar()
	{
		while(div<=n && div<=d)
		{
			if (n % div==0 && d % div==0)
			{
				n=n/div;
				d=d/div;
			} 
			else
			{
				div=div+1;
			}
		} //fin del mientras
		
	} //fin del método simplificar
	
	
	//método para mostrar la fracción
	void mostrar()
	{
		System.out.print("La fracción simplificada es: "+n+"/"+d);
	} //fin del metodo mostrar
	

	//método main
	public static void main(String[] args)
	{
		
		//creamos el objeto SimplificarFraccion
		SimplificarFraccion f=new SimplificarFraccion();
		
		f.leer();
		f.simplificar();
		f.mostrar();
				
	} //fin del método main
	
	
} //fin de la clase SimplificarFraccion

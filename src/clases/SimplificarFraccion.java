/*
 * Primera Clase
 * Mag. Rolando Chavez Guillen
 * 
 * Elabore un algoritmo orientado a objetos, que pueda simplificar una fracci�n.
 */

package clases;

import java.util.Scanner; //importamos la clase Scanner

public class SimplificarFraccion 
{
	
	//PROPIEDADES
	int n;			//numerador
	int d;			//denominador
	int div=2;		//divisor
	
	//M�TODOS
	
	//m�todo para leer los datos
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
		
	} //fin del m�todo leer
	
	
	//m�todo para simplificar la fracci�n
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
		
	} //fin del m�todo simplificar
	
	
	//m�todo para mostrar la fracci�n
	void mostrar()
	{
		System.out.print("La fracci�n simplificada es: "+n+"/"+d);
	} //fin del metodo mostrar
	

	//m�todo main
	public static void main(String[] args)
	{
		
		//creamos el objeto SimplificarFraccion
		SimplificarFraccion f=new SimplificarFraccion();
		
		f.leer();
		f.simplificar();
		f.mostrar();
				
	} //fin del m�todo main
	
	
} //fin de la clase SimplificarFraccion

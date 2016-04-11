/*
 * Ejercicio N° 3
 * Elaborar un programa que imprima del 10 al 1.
 */

package while_basico;

public class E3 
{
	//PROPIEDADES
	byte c;		//contador
	
	//MÉTODOS
	
	void imprima()
	{
		//inicializamos el contador
		c=10;
		
		while(c>=1)
		{
			System.out.println(c);
			c-=1;
		} //fin del while
		
	} //fin del método imprima
	
	
	
	public static void main(String[] args)
	{
		//creamos el objeto E3
		E3 i=new E3();
		
		i.imprima();
		
	} //fin del método main
	
} //fin de la clase E3

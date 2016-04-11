/*
 * Ejercicio N° 2
 * Realizar un algoritmo que imprima los números del 1 al 100.
 */

package while_basico;

public class E2 
{
	//PROPIEDADES
	byte c;		//contador
		
	//MÉTODOS
	
	void imprima()
	{
		//inicializamos el contador
		c=1;
		
		while(c<=100)
		{
			System.out.println(c);
			c++;
		} //fin del while
		
	} //fin del método imprima
	
	
	
	public static void main(String[] args)
	{
		//creamos el objeto E2
		E2 i=new E2();
		
		i.imprima();
		
	} //fin del método main
	
} //fin de la clase E2

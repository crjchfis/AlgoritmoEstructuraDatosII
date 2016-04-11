/*
 * Ejercicio N� 4
 * Elaborar un programa que imprima n veces los n�meros pares.
 */

package while_basico;

import java.util.Scanner; //importamos la clase Scanner

public class E4 
{
	//PROPIEDADES
	int n;		//n�mero de veces
	int c;		//contador
	int np;		//n�meros pares
		
	//M�TODOS
	
	void leer()
	{
		//creamos el objeto Scanner
		Scanner leer=new Scanner(System.in);
		
		System.out.print("Ingresar el n�mero de veces: ");
		n=leer.nextInt();
		
	} //fin del m�todo leer
	
	
	void imprima()
	{
		//inicializamos el contador, acumulador, n�meros pares
		c=1;
		np=2;
		
		while(c<=n)
		{
			System.out.println(np);
			np=np+2;
			c++;
		} //fin del while
		
	} //fin del m�todo imprima
	
	
	
	public static void main(String[] args)
	{
		//creamos el objeto E4
		E4 e=new E4();
		
		e.leer();
		e.imprima();
		
	} //fin del m�todo main
	
} //fin de la clase E4

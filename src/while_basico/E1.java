/*
 * Ejercicio N° 1
 * Elaborar un programa que imprima n veces la palabra "HOLA".
 */

package while_basico;

import java.util.Scanner; //importamos la clase Scanner

public class E1 
{
	//PROPIEDADES
	int n;		//número de veces
	String p;	//palabra
	int c;		//contador
	
	//MÉTODOS
	
	void leer()
	{
		//creamos el objeto Scanner
		Scanner leer=new Scanner(System.in);
		
		System.out.print("Ingresar el número de veces: ");
		n=leer.nextInt();
		
	} //fin del método leer
	
	
	void calcular()
	{
		//inicializamos el contador
		c=1;
		
		while(c<=n)
		{
			p="HOLA";
			System.out.println(p);
			c++;
		} //fin del while
		
	} //fin del método calcular
	
	
	
	public static void main(String[] args)
	{
		//creamos el objeto E1
		E1 i=new E1();
		
		i.leer();
		i.calcular();
		
	} //fin del método main
	
} //fin de la clase E1

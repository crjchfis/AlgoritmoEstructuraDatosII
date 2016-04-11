/*
 * Ejercicio N� 1
 * Elaborar un programa que imprima n veces la palabra "HOLA".
 */

package while_basico;

import java.util.Scanner; //importamos la clase Scanner

public class E1 
{
	//PROPIEDADES
	int n;		//n�mero de veces
	String p;	//palabra
	int c;		//contador
	
	//M�TODOS
	
	void leer()
	{
		//creamos el objeto Scanner
		Scanner leer=new Scanner(System.in);
		
		System.out.print("Ingresar el n�mero de veces: ");
		n=leer.nextInt();
		
	} //fin del m�todo leer
	
	
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
		
	} //fin del m�todo calcular
	
	
	
	public static void main(String[] args)
	{
		//creamos el objeto E1
		E1 i=new E1();
		
		i.leer();
		i.calcular();
		
	} //fin del m�todo main
	
} //fin de la clase E1

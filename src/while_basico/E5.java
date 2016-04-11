/*
 * Ejercicio N� 5
 * Elaborar un programa que imprima n veces los n�mero impares.
 */

package while_basico;

import java.util.Scanner; //importamos la clase Scanner

public class E5 
{
	//PROPIEDADES
	int n;		//n�mero de veces
	int c; 		//contador
	int ni;		//n�meros impares
		
	//M�TODOS
	
	void leer()
	{
		//creamos el objeto Scanner
		Scanner leer =new Scanner(System.in);
		
		System.out.print("Ingresar el n�mero de veces: ");
		n=leer.nextInt();
		
	} //fin del m�todo leer
	
	
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
		
	} //fin del m�todo imprima
	
	
	
	public static void main(String[] args)
	{
		//creamos el objeto E5
		E5 i=new E5();
		
		i.leer();
		i.imprima();
		
	} //fin del m�todo main
	
} //fin de la clase E5

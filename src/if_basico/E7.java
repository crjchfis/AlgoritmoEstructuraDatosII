/*
 * Ejercicio N° 7
 * Determinar la suma de dos números si el segundo número es mayor que el primero, 
 * en caso contrario, determinar una resta. 
 */

package if_basico;

import java.util.Scanner; //importamos la clase Scanner

public class E7 
{
	//PROPIEDADES
	int n1;		//primer número
	int n2;		//segundo número
	int sor;	//suma o resta
		
	//MÉTODOS
	
	void leer()
	{
		//creamos el objeto Scanner
		Scanner leer=new Scanner(System.in);
		
		System.out.print("Ingresar el primer número: ");
		n1=leer.nextInt();
		
		System.out.print("Ingresar el segundo número: ");
		n2=leer.nextInt();
		
	} //fin del método leer
	
	
	void calcular()
	{
		if (n2>n1)
		{
			sor=n1+n2;
		}
		else
		{
			sor=n1-n2;
		} //fin del si
		
	} //fin del método calcular
	
	
	void mostrar()
	{
		System.out.print("El resultado es: "+sor);
		
	} //fin del método mostrar
	
	
	
	public static void main(String[] args)
	{
		//creamos el objeto E7
		E7 o=new E7();
		
		o.leer();
		o.calcular();
		o.mostrar();
		
	} //fin del método main
	
} //fin de la clase E7

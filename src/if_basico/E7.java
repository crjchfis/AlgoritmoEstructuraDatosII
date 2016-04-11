/*
 * Ejercicio N� 7
 * Determinar la suma de dos n�meros si el segundo n�mero es mayor que el primero, 
 * en caso contrario, determinar una resta. 
 */

package if_basico;

import java.util.Scanner; //importamos la clase Scanner

public class E7 
{
	//PROPIEDADES
	int n1;		//primer n�mero
	int n2;		//segundo n�mero
	int sor;	//suma o resta
		
	//M�TODOS
	
	void leer()
	{
		//creamos el objeto Scanner
		Scanner leer=new Scanner(System.in);
		
		System.out.print("Ingresar el primer n�mero: ");
		n1=leer.nextInt();
		
		System.out.print("Ingresar el segundo n�mero: ");
		n2=leer.nextInt();
		
	} //fin del m�todo leer
	
	
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
		
	} //fin del m�todo calcular
	
	
	void mostrar()
	{
		System.out.print("El resultado es: "+sor);
		
	} //fin del m�todo mostrar
	
	
	
	public static void main(String[] args)
	{
		//creamos el objeto E7
		E7 o=new E7();
		
		o.leer();
		o.calcular();
		o.mostrar();
		
	} //fin del m�todo main
	
} //fin de la clase E7

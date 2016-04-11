/*
 * Ejercicio N� 2
 * Realice un algoritmo para determinar si un n�mero es positivo o negativo.
 */

package if_basico;

import java.util.Scanner; //importamos la clase Scanner

public class E2 
{
	//PROPIEDADES
	
	int n;		//n�mero
	String m;	//mensaje
		
	//M�TODOS
	
	void leer()
	{
		//creamos el objeto Scanner
		Scanner leer=new Scanner(System.in);
		
		System.out.print("Ingresar el n�mero: ");
		n=leer.nextInt();
	} //fin del m�todo leer
	
	
	void deteminar()
	{
		if (n>=0)
		{
			m="N�mero positivo";
		}
		else
		{
			m="N�mero negativo";
		} //fin del if
		
	} //fin del m�todo determinar
	
	
	void mostrar()
	{
		System.out.print(m);
		
	} //fin del m�todo mostrar
	
	
	public static void main(String[] args)
	{
		//creamos el objeto E2
		E2 d=new E2();
		
		d.leer();
		d.deteminar();
		d.mostrar();
		
	} //fin del m�todo main
	
} //fin de la clase E2

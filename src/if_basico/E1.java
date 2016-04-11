/*
 * Ejercicio N° 1
 * Se desea implementar un algoritmo para determinar cuál de dos valores proporcionados es el mayor.
 */

package if_basico;

import java.util.Scanner; //importamos la clase Scanner

public class E1 
{
	//PROPIEDADES
	
	int n1,n2;	//números
	int nm;		//número mayor
		
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
		if (n1>n2)
		{
			nm=n1;
		}
		else
		{
			nm=n2;
		} //fin del if
		
	} //fin del método calcular
	
	void mostrar()
	{
		System.out.print("El número mayor es: "+nm);
		
	} //fin del métod mostrar
	
	
	
	public static void main(String[] args)
	{
		//creamos el objeto E1
		E1 m =new E1();
		
		m.leer();
		m.calcular();
		m.mostrar();
		
	} //fin del método main
	
} //fin de la clase E1

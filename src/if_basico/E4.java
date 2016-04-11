/*
 * Ejercicio N° 4
 * Determinar la suma de dos números siempre y cuando el primer número sea diferente al segundo número.
 */

package if_basico;

import java.util.Scanner; //importamos la clase Scanner

public class E4 
{
	//PROPIEDADES
	int n1,n2;		//números
	int suma;		//suma
	String m;		//mensaje
	
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
		if(n1 != n2)
		{
			suma=n1+n2;
		} //fin del if
				
	} //fin del método calcular
	
	
	void mostrar()
	{
		System.out.print("La suma es: "+suma);
		
	} //fin del método mostrar
	
	
	public static void main(String[] args)
	{
		//creamos el objeto E4
		E4 s=new E4();
		
		s.leer();
		s.calcular();
		s.mostrar();
		
	} //fin del método main
	
} //fin de la clase E4

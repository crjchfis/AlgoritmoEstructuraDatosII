/*
 * Ejercicio N� 4
 * Determinar la suma de dos n�meros siempre y cuando el primer n�mero sea diferente al segundo n�mero.
 */

package if_basico;

import java.util.Scanner; //importamos la clase Scanner

public class E4 
{
	//PROPIEDADES
	int n1,n2;		//n�meros
	int suma;		//suma
	String m;		//mensaje
	
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
		if(n1 != n2)
		{
			suma=n1+n2;
		} //fin del if
				
	} //fin del m�todo calcular
	
	
	void mostrar()
	{
		System.out.print("La suma es: "+suma);
		
	} //fin del m�todo mostrar
	
	
	public static void main(String[] args)
	{
		//creamos el objeto E4
		E4 s=new E4();
		
		s.leer();
		s.calcular();
		s.mostrar();
		
	} //fin del m�todo main
	
} //fin de la clase E4

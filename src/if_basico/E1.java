/*
 * Ejercicio N� 1
 * Se desea implementar un algoritmo para determinar cu�l de dos valores proporcionados es el mayor.
 */

package if_basico;

import java.util.Scanner; //importamos la clase Scanner

public class E1 
{
	//PROPIEDADES
	
	int n1,n2;	//n�meros
	int nm;		//n�mero mayor
		
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
		if (n1>n2)
		{
			nm=n1;
		}
		else
		{
			nm=n2;
		} //fin del if
		
	} //fin del m�todo calcular
	
	void mostrar()
	{
		System.out.print("El n�mero mayor es: "+nm);
		
	} //fin del m�tod mostrar
	
	
	
	public static void main(String[] args)
	{
		//creamos el objeto E1
		E1 m =new E1();
		
		m.leer();
		m.calcular();
		m.mostrar();
		
	} //fin del m�todo main
	
} //fin de la clase E1

/*
 * Ejercicio N� 9
 * Calcular el total que una persona debe pagar en una llantera, si el precio de cada
 * llanta es de $300 si se compran menos de 5 llantas y de $250 si se compran 5 o m�s. 
 */

package if_basico;

import java.util.Scanner; //importamos la clase Scanner

public class E9 
{
	//PROPIEDADES
	int nll;	//n�mero de llantas
	int pt;		//precio total
	
	//M�TODOS
	
	void leer()
	{
		//creamos el objeto Scanner
		Scanner leer=new Scanner(System.in);
		
		System.out.print("Ingresar el n�mero de llantas: ");
		nll=leer.nextInt();
		
	} //fin del m�todo leer
	
	
	void calcular()
	{
		if(nll>=5)
		{
			pt=nll*250;
		}
		else
		{
			pt=nll*300;
		} //fin del si
		
	} //fin del m�todo calcular
	
	
	void mostrar()
	{
		System.out.print("El precio a pagar es: "+pt);
		
	} //fin del m�todo mostrar
	
	
	
	public static void main(String[] args)
	{
		//creamos el objeto de la clase E9
		E9 p=new E9();
		
		p.leer();
		p.calcular();
		p.mostrar();
		
	} //fin del m�todo main
	
} //fin de la clase E9

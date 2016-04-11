/*
 * Ejercicio N� 6
 * Una tienda tiene promociones en sus televisiones; al cliente se le aplicar�
 * un descuento del 5% sobre el total de la compra, siempre y cuando lleve m�s de 
 * tres televisiones. Determinar el importe a pagar, el descuento y la compra.
 */

package if_basico;

import java.util.Scanner;

public class E6 
{
	//PROPIEDADES
	int nt;		//n�mero de televisiones
	double pt;	//precio del televisor
	double ic;	//importe de la compra
	double id;	//importe de descuento
	double ip;	//importe a pagar	
	
	//M�TODOS
	
	void leer()
	{
		//creamos el objeto Scanner
		Scanner leer=new Scanner(System.in);
		
		System.out.print("Ingresar el n�mero de televisores: ");
		nt=leer.nextInt();
		
		System.out.print("Ingresar el precio del televisor: ");
		pt=leer.nextFloat();
		
	} //fin del m�todo leer
	
	
	void calcular()
	{
		//calculamos el importe de la compra
		ic=nt*pt;
		
		//calculamos el importe de descuento
		if(nt>3)
		{
			id=(0.05)*ic;
		} //fin del si
		
		//calculamos el importe a pagar
		ip=ic-id;
		
	} //fin del m�todo calcular
	
	
	void mostrar()
	{
		System.out.println("El importe de la compra es: "+ic);
		System.out.println("El importe del descuento es: "+id);
		System.out.print("El importe a pagar es: "+ip);
		
	} //fin del m�todo mostrar
	
	
	
	public static void main(String[] args)
	{
		//creamos el objeto E6
		E6 i=new E6();
		
		i.leer();
		i.calcular();
		i.mostrar();
		
	} //fin del m�todo main
	
} //fin de la clase E6

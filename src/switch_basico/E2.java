/*
 * Ejercicio N° 2
 * En una tienda por aniversario están otorgando un descuento a sus clientes, 
 * esto dependiendo del número que el cliente saque al llegar a la caja a pagar, 
 * los descuentos son: si el número es 1 el descuento es de 2%, si el número es 2 
 * el descuento es del 5%, si el número es 3 el descuento es del 7% y si el número 
 * es 4 el descuento es del 10%. Determinar e imprimir la compra, el descuento y el 
 * importe a pagar.
 */
 
package switch_basico;

import java.util.Scanner; //importamos la clase Scanner

public class E2 
{
	//PROPIEDADES
	double ic; 	//importe de la compra
	double id;	//importe de descuento
	double ip;	//importe a pagar
	byte num;	//número
		
	//MÉTODOS
	
	void leer()
	{
		//creamos el objeto Scanner
		Scanner leer=new Scanner(System.in);
		
		System.out.print("El importe de la compra es: ");
		ic=leer.nextInt();
		
		System.out.print("El número sacado es: ");
		num=leer.nextByte();
		
	} //fin del método leer
	
	
	void calcular()
	{
		//calculamos el importe de descuento
		switch(num)
		{
		case 1:
			id=0.02*ic;
			break;
			
		case 2:
			id=0.05*ic;
			break;
			
		case 3:
			id=0.07*ic;
			break;
			
		case 4:
			id=0.1*ic;
			break;		
		}//fin del switch
		
		//calculamos el importe a pagar
		ip=ic-id;
		
	} //fin del método calcular
	
	
	void mostrar()
	{
		System.out.println("El importe de compra es: "+ic);
		System.out.println("El importe de descuento es: "+id);
		System.out.print("El importe a pagar es: "+ip);
		
	} //fin del método mostrar
	
	
	
	public static void main(String[] args)
	{
		//creamos el objeto E2
		E2 c=new E2();
		
		c.leer();
		c.calcular();
		c.mostrar();
		
	} //fin del método main
	
} //fin de la clase E2

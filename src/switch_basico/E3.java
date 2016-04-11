/*
 * Ejercicio N° 3
 * Una fabrica de impresoras por aniversario tiene una serie de 
 * promociones para sus clientes como se muestra en la siguiente tabla:
 * 
 * MODELO			DESCUENTO				PRECIO
 * 10				10%						1000
 * 20				7%						1500
 * 30				15%						2000
 * 
 * Determinar la compra, el descuento y el importe a pagar.				
 */

package switch_basico;

import java.util.Scanner; //importamos la clase Scanner

public class E3 
{
	//PROPIEDADES
	byte mod;		//modelo
	int ni;			//número de modelos
	int ic;			//importe de la compra
	double id;		//importe de descuento
	double ip;		//importe a pagar
	
	//MÉTODOS
	
	void leer()
	{
		//creamos el objeto Scanner
		Scanner leer=new Scanner(System.in);
		
		System.out.print("Ingresar el modelo de impresora: ");
		mod=leer.nextByte();
		
		System.out.print("Ingresar el número total de impresoras");
		ni=leer.nextInt();
		
	} //fin del método leer
	
	
	void calcular()
	{
		//calculamos el importe de compra y descuento
		switch(mod)
		{
		case 10:
			ic=ni*1000;
			id=0.1*ic;
			break;
			
		case 20:
			ic=ni*1500;
			id=0.07*ic;
			break;
			
		case 30:
			ic=ni*2000;
			id=0.15*ic;
			break;
		} //fin del switch
		
		//calculamos el importe a pagar
		ip=ic-id;
		
	} //fin del método calcular
	
	
	void mostrar()
	{
		System.out.println("El importe de la compra es: "+ic);
		System.out.println("El importe del descuento es: "+id);
		System.out.println("El importe a pagar es: "+ip);
		
	} //fin del método mostrar
	
	
	
	public static void main(String[] args)
	{
		//creamos el objeto E3
		E3 i=new E3();
		
		i.leer();
		i.calcular();
		i.mostrar();
		
	} //fin del método main
		
} //fin de la clase E3

/*
 * Ejercicio N° 9
 * Elaborar un algoritmo para leer un menú la opción para dibujar 
 * las siguientes figuras geométricas:
 * 
 * NÚMERO					FIGURAS
 * 1						Triángulo
 * 2						Cuadrado
 * 3						Círculo
 * 4						Rectángulo
 * 5						Rombo
 * 
 */

package switch_basico;

import java.util.Scanner; //importamos la clase Scanner

public class E9 
{
	//PROPIEDADES
	int n;			//número
	String fg;		//figuras geómetricas
	
	//MÉTODOS
	
	void leer()
	{
		//creamos el objeto Scanner
		Scanner leer=new Scanner(System.in);
		
		System.out.print("Ingresar un número: ");
		n=leer.nextInt();
		
	} //fin del método leer
	
	
	void determinar()
	{
		//determinamos la figura geómetrica
		switch(n)
		{
		case 1:
			fg="Triángulo";
			break;
			
		case 2:
			fg="Cuadrado";
			break;
			
		case 3:
			fg="Círculo";
			break;
			
		case 4:
			fg="Rectángulo";
			break;
			
		case 5:
			fg="Rombo";
		} //fin del switch
		
	} //fin del método determinar
	
	
	void mostrar()
	{
		System.out.print("La figura geométrica es: "+fg);
		
	} //fin del método mostrar
	
	
	
	public static void main(String[] args)
	{
		//creamos el objeto E9
		E9 f=new E9();
		
		f.leer();
		f.determinar();
		f.mostrar();
		
	} //fin del método main
	
} //fin de la clase E9

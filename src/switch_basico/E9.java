/*
 * Ejercicio N� 9
 * Elaborar un algoritmo para leer un men� la opci�n para dibujar 
 * las siguientes figuras geom�tricas:
 * 
 * N�MERO					FIGURAS
 * 1						Tri�ngulo
 * 2						Cuadrado
 * 3						C�rculo
 * 4						Rect�ngulo
 * 5						Rombo
 * 
 */

package switch_basico;

import java.util.Scanner; //importamos la clase Scanner

public class E9 
{
	//PROPIEDADES
	int n;			//n�mero
	String fg;		//figuras ge�metricas
	
	//M�TODOS
	
	void leer()
	{
		//creamos el objeto Scanner
		Scanner leer=new Scanner(System.in);
		
		System.out.print("Ingresar un n�mero: ");
		n=leer.nextInt();
		
	} //fin del m�todo leer
	
	
	void determinar()
	{
		//determinamos la figura ge�metrica
		switch(n)
		{
		case 1:
			fg="Tri�ngulo";
			break;
			
		case 2:
			fg="Cuadrado";
			break;
			
		case 3:
			fg="C�rculo";
			break;
			
		case 4:
			fg="Rect�ngulo";
			break;
			
		case 5:
			fg="Rombo";
		} //fin del switch
		
	} //fin del m�todo determinar
	
	
	void mostrar()
	{
		System.out.print("La figura geom�trica es: "+fg);
		
	} //fin del m�todo mostrar
	
	
	
	public static void main(String[] args)
	{
		//creamos el objeto E9
		E9 f=new E9();
		
		f.leer();
		f.determinar();
		f.mostrar();
		
	} //fin del m�todo main
	
} //fin de la clase E9

/*
 * Ejercicio N° 8
 * Elabore un algoritmo que solicite un número entero y muestre un mensaje
 * inidcando la vocal correspondiente, considerando que la vocal A=1.
 */

package switch_basico;

import java.util.Scanner; //importamos la clase Scanner

public class E8 
{
	//PROPIEDADES
	int n;			//número entero
	String m;		//mensaje
		
	//MÉTODOS
	
	void leer()
	{
		//creamos el objeto Scanner
		Scanner leer=new Scanner(System.in);
		
		System.out.print("Ingresar el número entero: ");
		n=leer.nextInt();
		
	} //fin del método leer
	
	
	void determinamos()
	{
		//determinamos el mensaje
		switch(n)
		{
		case 1:
			m="A";
			break;
			
		case 2:
			m="E";
			break;
			
		case 3:
			m="I";
			break;
			
		case 4:
			m="O";
			break;
		
		case 5:
			m="U";
			break;
		} //fin del switch
		
	} //fin del método determinamos
	
	
	void mostrar()
	{
		System.out.print("La vocal es: "+m);
		
	} //fin del método mostrar
	
	
	
	public static void main(String[] args)
	{
		//creamos el objeto E8
		E8 v=new E8();
		
		v.leer();
		v.determinamos();
		v.mostrar();
		
	} //fin del método main
	
} //fin de la clase E8

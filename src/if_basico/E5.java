/*
 * Ejercicio N° 5
 * Determinar si una persona debe sacar su credencial del INE sabiendo su año de nacimiento. 
 * Se debe considerar que para solicitar la credencial del INE la edad de la persona debe 
 * ser mayor o igual a 18 años. Imprimir si la persona puede solicitar su credencial.
 */

package if_basico;

import java.util.Scanner; //importamos la clase Scanner

public class E5 
{
	//PROPIEDADES
	int an;		//año de nacimiento
	int aa;		//año actual
	String m;	//mensaje
	int edad;	//edad
		
	//MÉTODOS
	
	void leer()
	{
		//creamos el objeto Scanner
		Scanner leer=new Scanner(System.in);
		
		System.out.print("Ingresar el año actual: ");
		aa=leer.nextInt();
		
		System.out.print("Ingresar el año de nacimiento: ");
		an=leer.nextInt();
		
	} //fin del método leer
	
	
	void determinamos()
	{
		//hallamos su edad
		edad=aa-an;
		
		if (edad>=18)
		{
			m="Puede solicitar su credencial del INE";
		}
		else
		{
			m="No puede solicitar su credencial del INE";
		} //fin del if
		
	} //fin del método determinamos
	
	
	void mostrar()
	{
		System.out.print(m);
		
	} //fin del método mostrar
	
	
	
	public static void main(String[] args)
	{
		//creamos el objeto E5
		E5 c=new E5();
		
		c.leer();
		c.determinamos();
		c.mostrar();
		
	} //fin del métod main
	
} //fin de la clase E5

/*
 * Ejercicio N� 5
 * Determinar si una persona debe sacar su credencial del INE sabiendo su a�o de nacimiento. 
 * Se debe considerar que para solicitar la credencial del INE la edad de la persona debe 
 * ser mayor o igual a 18 a�os. Imprimir si la persona puede solicitar su credencial.
 */

package if_basico;

import java.util.Scanner; //importamos la clase Scanner

public class E5 
{
	//PROPIEDADES
	int an;		//a�o de nacimiento
	int aa;		//a�o actual
	String m;	//mensaje
	int edad;	//edad
		
	//M�TODOS
	
	void leer()
	{
		//creamos el objeto Scanner
		Scanner leer=new Scanner(System.in);
		
		System.out.print("Ingresar el a�o actual: ");
		aa=leer.nextInt();
		
		System.out.print("Ingresar el a�o de nacimiento: ");
		an=leer.nextInt();
		
	} //fin del m�todo leer
	
	
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
		
	} //fin del m�todo determinamos
	
	
	void mostrar()
	{
		System.out.print(m);
		
	} //fin del m�todo mostrar
	
	
	
	public static void main(String[] args)
	{
		//creamos el objeto E5
		E5 c=new E5();
		
		c.leer();
		c.determinamos();
		c.mostrar();
		
	} //fin del m�tod main
	
} //fin de la clase E5

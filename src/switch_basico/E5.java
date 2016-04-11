/*
 * Ejercicio N� 5
 * Calcular el aumento de un trabajador tomando en cuenta su categor�a y su
 * sueldo actual. La tabla para considerar los aumentoss de acuerdo a la categor�a es:
 * 
 * CATEGOR�A				AUMENTO
 * 1						15%
 * 2						10%
 * 3						8%
 * 4						3%
 * 5						5%
 * 
 * Imprimir la categor�a, su aumento y nuevo salario.
 */

package switch_basico;

import java.util.Scanner; //importamos la clase Scanner

public class E5 
{
	//PROPIEDADES
	int st;			//salario del trabajador
	byte c;			//categor�a
	double a;		//aumento
	double ns;		//nuevo salario
	
	//M�TODOS
	
	void leer()
	{
		//creamos el objeto Scanner
		Scanner leer=new Scanner(System.in);
		
		System.out.print("Ingresar el salario bruto del trabajador: ");
		st=leer.nextInt();
		
		System.out.print("Ingresar la categor�a: ");
		c=leer.nextByte();
		
	} //fin del m�todo leer
	
	
	void calcular()
	{
		//calculamos el aumento
		switch(c)
		{
		case 1:
			a=(st*0.15);
			ns=st+a;
			break;
			
		case 2:
			a=st*0.1;
			ns=st+a;
			break;
			
		case 3:
			a=st*0.08;
			ns=st+a;
			break;
			
		case 4:
			a=st*0.03;
			ns=st+a;
			break;
			
		case 5:
			a=st*0.05;
			ns=st+a;
			break;
		} //fin del switch
		
	} //fin del m�todo calcular
	
	
	void msotrar()
	{
		System.out.println("La categor�a es: "+c);
		System.out.println("El aumento es: "+a);
		System.out.print("EL nuevo salario es: "+ns);
		
	} //fin del m�todo mostrar
	
	
	
	public static void main(String[] args)
	{
		//creamos el objeto E5
		E5 c=new E5();
		
		c.leer();
		c.calcular();
		c.msotrar();
		
	} //fin del m�todo main
	
} //fin de la clase E5

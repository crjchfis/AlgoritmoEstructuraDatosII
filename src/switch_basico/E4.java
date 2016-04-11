/*
 * Ejercicio N� 4
 * Determinar el sueldo de un trabajador tomando en consideraci�n la siguiente
 * tabla:
 * 
 * CATEGOR�A 				AUMENTO
 * 1						15%
 * 2						10%
 * 3						8%
 * 4						3%
 * 
 */

package switch_basico;

import java.util.Scanner; //importamos la clase Scanner

public class E4 
{
	//PROPIEDADES
	int st;			//sueldo del trabajador
	byte c;			//categor�a
	double sn;		//sueldo neto
		
	//M�TODO
	
	void leer()
	{
		//creamos el objeto Scanner
		Scanner leer=new Scanner(System.in);
		
		System.out.print("Ingresar el sueldo bruto del trabajador: ");
		st=leer.nextInt();
		
		System.out.print("Ingresar la categor�a: ");
		c=leer.nextByte();
		
	} //fin del m�todo leer
	
	
	void calcular()
	{
		//calculamos el sueldo neto
		switch (c)
		{
		case 1:
			sn=st*(st*0.15);
			break;
			
		case 2:
			sn=st+(st*0.10);
			break;
			
		case 3:
			sn=st+(st*0.08);
			break;
			
		case 4:
			sn=st+(st*0.03);
			break;
		} //fin del switch
		
	} //fin del m�todo calcular
	
	
	void mostrar()
	{
		System.out.print("El sueldo neto es: "+sn);
		
	} //fin del m�todo mostrar
	
	
	
	public static void main(String[] args)
	{
		//creamos el objeto E4
		E4 s=new E4();
		
		s.leer();
		s.calcular();
		s.mostrar();
		
	} //fin del m�todo main
	
} //fin de la clase E4

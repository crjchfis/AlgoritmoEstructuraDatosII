/*
 * Ejercicio N� 8
 * Se tiene registrado la producci�n lograda por un operario a lo largo de la semana
 * (lunes a s�bado). Determinar el promedio de la producci�n, si es igual o mayor
 * a 100, recibir� un incentivo.
 */

package if_basico;

import java.util.Scanner; //importamos la clase Scanner

public class E8 
{
	//PROPIEDADES
	int l,m,mi,j,v,s;		//d�as 
	float p;				//promedio
	String me;				//mensaje
	
	//M�TODOS
	
	void leer()
	{
		//creamos el objeto Scanner
		Scanner leer =new Scanner(System.in);
		
		System.out.print("Ingresar la producci�n de lunes: ");
		l=leer.nextInt();
		
		System.out.print("Ingresar la producci�n de martes: ");
		m=leer.nextInt();
		
		System.out.print("Ingresar la producci�n de mi�rcoles: ");
		mi=leer.nextInt();
		
		System.out.print("Ingresar la producci�n de jueves: ");
		j=leer.nextInt();
		
		System.out.print("Ingresar la producci�n de viernes: ");
		v=leer.nextInt();
		
		System.out.print("Ingresar la producci�n de s�bado: ");
		s=leer.nextInt();
	
	} //fin del m�todo leer
	
	
	void calcular()
	{
		//calculamos el promedio
		p=(l+m+mi+j+v+s)/6;
		
		//condici�n
		if(p>=100)
		{
			me="Recibir� un incentivo";
		}
		else
		{
			me="No alcanzo el incentivo";
		}//fin del si
		
	} //fin del m�todo calcular
	
	
	void mostrar()
	{
		System.out.print(me);
		
	} //fin del m�todo mostrar
	
	
	
	public static void main(String[] args)
	{
		//creamos el objeto E8
		E8 i=new E8();
		
		i.leer();
		i.calcular();
		i.mostrar();
		
	} //fin del m�todo main
	
} //fin de la clase E8 

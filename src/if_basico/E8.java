/*
 * Ejercicio N° 8
 * Se tiene registrado la producción lograda por un operario a lo largo de la semana
 * (lunes a sábado). Determinar el promedio de la producción, si es igual o mayor
 * a 100, recibirá un incentivo.
 */

package if_basico;

import java.util.Scanner; //importamos la clase Scanner

public class E8 
{
	//PROPIEDADES
	int l,m,mi,j,v,s;		//días 
	float p;				//promedio
	String me;				//mensaje
	
	//MÉTODOS
	
	void leer()
	{
		//creamos el objeto Scanner
		Scanner leer =new Scanner(System.in);
		
		System.out.print("Ingresar la producción de lunes: ");
		l=leer.nextInt();
		
		System.out.print("Ingresar la producción de martes: ");
		m=leer.nextInt();
		
		System.out.print("Ingresar la producción de miércoles: ");
		mi=leer.nextInt();
		
		System.out.print("Ingresar la producción de jueves: ");
		j=leer.nextInt();
		
		System.out.print("Ingresar la producción de viernes: ");
		v=leer.nextInt();
		
		System.out.print("Ingresar la producción de sábado: ");
		s=leer.nextInt();
	
	} //fin del método leer
	
	
	void calcular()
	{
		//calculamos el promedio
		p=(l+m+mi+j+v+s)/6;
		
		//condición
		if(p>=100)
		{
			me="Recibirá un incentivo";
		}
		else
		{
			me="No alcanzo el incentivo";
		}//fin del si
		
	} //fin del método calcular
	
	
	void mostrar()
	{
		System.out.print(me);
		
	} //fin del método mostrar
	
	
	
	public static void main(String[] args)
	{
		//creamos el objeto E8
		E8 i=new E8();
		
		i.leer();
		i.calcular();
		i.mostrar();
		
	} //fin del método main
	
} //fin de la clase E8 

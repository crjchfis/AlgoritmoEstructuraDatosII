/*
 * Ejercicio N° 9
 * Se requiere un algoritmo para obtener la edad promedio de un grupo de N alumnos. 
 */

package while_basico;

import java.util.Scanner; //importamos la clase Scanner

public class E9 
{
	//PROPIEDADES
	int n;		//número de alumnos
	int c;		//contador
	double s;		//acumulador (suma)
	double e;		//edad
	double p;	//promedio
	
	//MÉTODOS
	
	//creamos el objeto Scanner
	Scanner leer=new Scanner(System.in);
	
	void leer()
	{
		System.out.print("Ingresar el número de alumnos: ");
		n=leer.nextInt();
		
	} //fin del método leer
	
	
	void calcular()
	{
		//inicializamos el contador, acumulador
		c=1; s=0;
		
		//calculamos la suma de edades
		while(c<=n)
		{
			//leemos las edades
			System.out.print("La edad del "+c+" alumno es: ");
			e=leer.nextInt();
			s=s+e;
			c++;
		} //fin del while
		
		//calculamos el promedio de edades
		p=s/n;
		
	} //fin del método calcular
	
	
	void mostrar()
	{
		System.out.print("El promedio de edades es: "+p);
		
	} //fin del método mostrar
	
	
	
	public static void main(String[] args)
	{
		//creamos el objeto E9
		E9 a=new E9();
		
		a.leer();
		a.calcular();
		a.mostrar();
		
	} //fin del método main

} //fin de la clase E9

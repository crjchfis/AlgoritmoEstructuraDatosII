/*
 * Ejercicio N� 9
 * Se requiere un algoritmo para obtener la edad promedio de un grupo de N alumnos. 
 */

package while_basico;

import java.util.Scanner; //importamos la clase Scanner

public class E9 
{
	//PROPIEDADES
	int n;		//n�mero de alumnos
	int c;		//contador
	double s;		//acumulador (suma)
	double e;		//edad
	double p;	//promedio
	
	//M�TODOS
	
	//creamos el objeto Scanner
	Scanner leer=new Scanner(System.in);
	
	void leer()
	{
		System.out.print("Ingresar el n�mero de alumnos: ");
		n=leer.nextInt();
		
	} //fin del m�todo leer
	
	
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
		
	} //fin del m�todo calcular
	
	
	void mostrar()
	{
		System.out.print("El promedio de edades es: "+p);
		
	} //fin del m�todo mostrar
	
	
	
	public static void main(String[] args)
	{
		//creamos el objeto E9
		E9 a=new E9();
		
		a.leer();
		a.calcular();
		a.mostrar();
		
	} //fin del m�todo main

} //fin de la clase E9

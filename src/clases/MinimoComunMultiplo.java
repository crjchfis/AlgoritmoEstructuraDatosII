/*
 * Segunda Clase
 * Mag. Rolando Chavez Guillen
 * 
 * Elabore un algoritmo orientado a objetos que permita calcular el m�nimo com�n m�ltiplo de dos n�meros.
 */

package clases;

import java.util.Scanner; //importamos la clase Scanner

public class MinimoComunMultiplo 
{

	//PROPIEDADES
	int n1,n2;
	int div=2;
	int m=1;
	int nm1,nm2;
	
	//M�TODOS
	
	//metodo para leer datos
	void leer()
	{
		//creamos el objeto Scanner
		Scanner leer=new Scanner(System.in);
		
		System.out.print("Ingresar el primer n�mero: ");
		n1=leer.nextInt();
		
		System.out.print("Ingresar el segundo n�mero: ");
		n2=leer.nextInt();
	
		//asignamos para mostrar
		nm1=n1; nm2=n2;
		
	} //fin del m�todo leer

	
	//m�todo para calcular el m�nimo com�n multiplo
	void calcular()
	{
		while(div<=n1 || div<=n2){
			
			if(n1 % div == 0 && n2 % div == 0){
				n1=n1/div;
				n2=n2/div;
				m=m*div;
			} else if(n1 % div == 0 && n2 % div != 0){
				n1=n1/div;
				m=m*div;
			} else if(n1 % div != 0 && n2 % div ==0){
				n2=n2/div;
				m=m*div;
			} else {
				div=div+1;
			} //fin del if
					
		} //fin del while
		
	} //fin del m�todo calcular

	
	//m�todo muestra los resultados
	void mostrar()
	{
		System.out.print("m.c.m.("+nm1+","+nm2+")"+" = "+m);
		
	} //fin del m�todo mostrar
	
		
	
	//metodo main
	public static void main(String[] args)
	{
		//creamos el objeto MinimoComunMultiplo
		MinimoComunMultiplo mcm=new MinimoComunMultiplo();
		
		mcm.leer();
		mcm.calcular();
		mcm.mostrar();
				
	} //fin del m�todo main
	
	
} //fin de la clase MinimoComun Multiplo

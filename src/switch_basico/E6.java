/*
 * Escriba un número de día de la semana y se imprimira su equivalente.
 */

package switch_basico;

import java.util.Scanner; //importamos la clase Scanner

public class E6 
{
	//PROPIEDADES
	int ds;		//día de la semana
	String s;	//semana
	
	//MÉTODOS
	
	void leer()
	{
		//creamos el objeto Scanner
		Scanner leer=new Scanner(System.in);
		
		System.out.print("Ingresar el número de la semana: ");
		ds=leer.nextInt();
		
	} //fin del método leer
	
	
	void calcular()
	{
		switch(ds)
		{
		case 1:
			s="lunes";
			break;
			
		case 2: 
			s="martes";
			break;
			
		case 3:
			s="miércoles";
			break;
			
		case 4:
			s="jueves";
			break;
			
		case 5: 
			s="viernes";
			break;
			
		case 6:
			s="sabado";
			break;
			
		case 7:
			s="domingo";
			break;
		} //fin del switch
		
	} //fin del método calcular
	
	
	void mostrar()
	{
		System.out.print("El día de la semana es: "+s);
		
	} //fin del método mostrar
	
	
	
	public static void main(String[] args)
	{
		//creamos el objeto E6
		E6 c=new E6();
		
		c.leer();
		c.calcular();
		c.mostrar();
		
	} //fin del método main
	
} //fin de la clase E6

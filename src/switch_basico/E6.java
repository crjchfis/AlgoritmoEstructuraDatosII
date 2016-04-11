/*
 * Escriba un n�mero de d�a de la semana y se imprimira su equivalente.
 */

package switch_basico;

import java.util.Scanner; //importamos la clase Scanner

public class E6 
{
	//PROPIEDADES
	int ds;		//d�a de la semana
	String s;	//semana
	
	//M�TODOS
	
	void leer()
	{
		//creamos el objeto Scanner
		Scanner leer=new Scanner(System.in);
		
		System.out.print("Ingresar el n�mero de la semana: ");
		ds=leer.nextInt();
		
	} //fin del m�todo leer
	
	
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
			s="mi�rcoles";
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
		
	} //fin del m�todo calcular
	
	
	void mostrar()
	{
		System.out.print("El d�a de la semana es: "+s);
		
	} //fin del m�todo mostrar
	
	
	
	public static void main(String[] args)
	{
		//creamos el objeto E6
		E6 c=new E6();
		
		c.leer();
		c.calcular();
		c.mostrar();
		
	} //fin del m�todo main
	
} //fin de la clase E6

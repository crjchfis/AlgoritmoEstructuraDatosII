/*
 * Ejercicio N� 8
 * Elabore un algoritmo que solicite un n�mero entero y muestre un mensaje
 * inidcando la vocal correspondiente, considerando que la vocal A=1.
 */

package switch_basico;

import java.util.Scanner; //importamos la clase Scanner

public class E8 
{
	//PROPIEDADES
	int n;			//n�mero entero
	String m;		//mensaje
		
	//M�TODOS
	
	void leer()
	{
		//creamos el objeto Scanner
		Scanner leer=new Scanner(System.in);
		
		System.out.print("Ingresar el n�mero entero: ");
		n=leer.nextInt();
		
	} //fin del m�todo leer
	
	
	void determinamos()
	{
		//determinamos el mensaje
		switch(n)
		{
		case 1:
			m="A";
			break;
			
		case 2:
			m="E";
			break;
			
		case 3:
			m="I";
			break;
			
		case 4:
			m="O";
			break;
		
		case 5:
			m="U";
			break;
		} //fin del switch
		
	} //fin del m�todo determinamos
	
	
	void mostrar()
	{
		System.out.print("La vocal es: "+m);
		
	} //fin del m�todo mostrar
	
	
	
	public static void main(String[] args)
	{
		//creamos el objeto E8
		E8 v=new E8();
		
		v.leer();
		v.determinamos();
		v.mostrar();
		
	} //fin del m�todo main
	
} //fin de la clase E8

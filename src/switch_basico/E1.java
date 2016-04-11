/*
 * Ejercicio N� 1
 * Elabore un algoritmo que permita ingresar un n�mero entero (1 a 10), y muestre su equivalente en
 * romano. 
 */

package switch_basico;

import java.util.Scanner; //importamos la clase Scanner

public class E1 
{
	//PROPIEDADES
	byte num;			//n�mero
	String nr;		//n�mero equivalente en romano
	
	//M�TODOS
	
	void leer()
	{
		//creamos el objeto Scanner
		Scanner leer=new Scanner(System.in);
		
		System.out.print("Ingresar un n�mero del 1-10: ");
		num=leer.nextByte();
		
	} //fin del m�todo leer
	
	
	void calcular()
	{
		//calculamos el n�mero equivalente en romano
		switch(num)
		{
		case 1:
			nr="I";
			break;
		
		case 2:
			nr="II";
			break;
			
		case 3:
			nr="III";
			break;
			
		case 4:
			nr="IV";
			break;
			
		case 5:
			nr="V";
			break;
			
		case 6:
			nr="VI";
			break;
			
		case 7:
			nr="VII";
			break;
			
		case 8:
			nr="VIII";
			break;
			
		case 9:
			nr="IX";
			break;
			
		case 10:
			nr="X";
			break;
		} //fin del switch
		
	} //fin del m�todo calcular
	
	
	void mostrar()
	{
		System.out.print("El n�mero romano equivalentes es: "+nr);
		
	} //fin del m�todo mostrar
	
	
	
	public static void main(String[] args)
	{
		//creamos el objeto E1
		E1 n=new E1();
		
		n.leer();
		n.calcular();
		n.mostrar();
		
	} //fin del m�todo main
		
} //fin de la clase E1

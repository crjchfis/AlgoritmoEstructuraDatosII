/*
 * Ejercicio N� 6
 * Determinar e imprimir los cinco primeros n�meros y la suma de estos.
 */

package while_basico;

public class E6 
{
	//PROPIEDADES
	int c;		//contador
	int s;		//acumulador (suma)
	
	//M�TODOS
	
	void determinar()
	{
		//inicialziamos el contador y acumulador
		c=1; s=0;
		
		while(c<=5)
		{
			System.out.println(c);
			s=s+c;
			c++;
		} //fin del while
		
	} //fin del m�todo determinar
	
	
	void mostrar()
	{
		System.out.print("La suma es: "+s);
		
	} //fin del m�todo mostrar
	
	
	
	public static void main(String[] args)
	{
		//creamos el objeto E6
		E6 d=new E6();
		
		d.determinar();
		d.mostrar();
		
	} //fin del m�todo main
	
} //fin de la clase E6

/*
 * Ejercicio N� 7
 * Determinar e imprimir los cinco primeros n�meros y el producto de estos.
 */

package while_basico;

public class E7 
{
	//PROPIEDADES
	int c;		//contador
	int p;		//acumulador (producto)
		
	//M�TODOS
	
	void determinar()
	{
		//inicializamos el contador y el acumulador
		c=1; p=1;
		
		while(c<=5)
		{
			System.out.println(c);
			p=p*c;
			c++;
		} //fin del while
		
	} //fin del m�todo determinar
	
	
	void mostrar()
	{
		System.out.print("El producto es: "+p);
		
	} //fin del m�todo mostrar
	
	
	
	public static void main(String[] args)
	{
		//creamos el objeto E7
		E7 i=new E7();
		
		i.determinar();
		i.mostrar();
		
	} //fin del m�todo main
	
} //fin de la clase E7

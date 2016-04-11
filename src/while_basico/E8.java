/*
 * Ejercicio N° 8
 * Se requiere un algoritmo para obtener la suma de diez cantidades
 * mediante la utilización de un ciclo "Mientras".
 */
package while_basico;

public class E8 
{
	//PROPIEDADES
	byte c;		//contador
	int s;		//acumulador (suma)
	
	//MÉTODOS
	
	void obtener()
	{
		//inicializamos el contador y acumulador
		c=1; s=0;
		
		while(c<=10)
		{
			System.out.println(c);
			s=s+c;
			c++;
		} //fin del while
		
	} //fin del método obtener
	
	
	void mostrar()
	{
		System.out.print("La suma es: "+s);
		
	} //fin del método mostrar
	
	
	
	public static void main(String[] args)
	{
		//creamos el objeto E8
		E8 o=new E8();
		
		o.obtener();
		o.mostrar();
		
	} //fin del método main
	
} //fin de la clase E8

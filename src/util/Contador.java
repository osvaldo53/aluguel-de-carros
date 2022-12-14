package util;

public class Contador {
	
	private static int contador = 0;
	
	public static Integer proximo() { //sempre que for chamado vai retornar um id diferente
		contador++;
		return contador;
	}
}

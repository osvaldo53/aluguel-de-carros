import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		boolean continuarPartida = true;
		
		Scanner scanner = new Scanner(System.in);
		Cenario mapa = new Cenario();
		String entrada;
		
		while (continuarPartida) {
			System.out.println("Entre com as posições x e y: (x,y)");
			entrada = scanner.nextLine();
			
			String[] numeros = entrada.split(",");
			
			int x = Integer.parseInt(numeros[0]);
			int y = Integer.parseInt(numeros[1]);
			System.out.println("x = " + x + " ; " + "y = " + y);
			
			if (entrada.equals("fim")) break;
			mapa.disparo(x,y);
			mapa.desenhaCenario();
		}
	
	}
}

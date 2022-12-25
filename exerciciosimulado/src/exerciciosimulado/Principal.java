package exerciciosimulado;

public class Principal {

	public static void main(String[] args) {
		int i = 0;
		for(i = 0 ; i < 5; i++) {
		    if (i == 2) {i++; continue;}
		    if (i == 3) break;
		    if (i == 4) break;
		}
		System.out.println((i-1) + ", " + (i-2));

	}

}

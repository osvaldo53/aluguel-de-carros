
public class Cenario {
	int[][] mapa;
	String[] desenhos;
	Pecas[] inimigos;

	public Cenario() {
		this.mapa = new int[10][10];
		this.mapa[1][1] = 1;
		this.mapa[2][2] = 2;
		this.desenhos = new String[] {".", "X", "*"}; //cria o array ja preenchido
		this.inimigos = new Pecas[5];
		for (int i = 0; i < 5; i++) {
			this.inimigos[i] = new Pecas();
		}
	}
	
	public void desenhaLinha(int[] linha) {
		
		String strLinha = "";
		for (int celula: linha) {
			strLinha += this.desenhos[celula] + " ";
		}
		System.out.println(strLinha);
	}
	
	public void desenhaCenario() {
		for(int[] linha: this.mapa) {
			this.desenhaLinha(linha);
		}
		
		for (int i = 0; i < 5; i++) {
			System.out.println((i+1) + "(" + this.inimigos[i].x + "," + this.inimigos[i].y + ")");
		}
	}
	
	public void disparo(int x, int y) {
		this.mapa[y][x] = 1;
	}
}

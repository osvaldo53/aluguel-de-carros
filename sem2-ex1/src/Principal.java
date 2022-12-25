
public class Principal {

	public static void main(String[] args) {
		Jogador jogador01 = new Jogador("Messi");
		
		jogador01.adicionarGols(3);
		jogador01.adicionarAssist(2);
		
		Jogador jogador02 = new Jogador("Cristiano Ronaldo");
		
		jogador02.adicionarGols(2);
		jogador02.adicionarAssist(3);
		
		jogador01.verQuantidadeDeGols();
		jogador01.verQuantidadeDeAssist();
		System.out.println();
		jogador02.verQuantidadeDeGols();
		jogador02.verQuantidadeDeAssist();
		
		
	}

}


public class Jogador {
	String nome;
	int gols;
	int assist;
	
	public Jogador(String nome) {
		this.nome = nome;
	}
	
	public void adicionarGols(int gols) {
		this.gols = gols;
	}
	
	public void adicionarAssist(int assist) {
		this.assist = assist;
	}
	
	public void verQuantidadeDeGols () {
		System.out.println("O jogador " + this.nome + " fez " + this.gols + " gols.");
	}
	
	public void verQuantidadeDeAssist () {
		System.out.println("O jogador " + this.nome + " fez " + this.assist + " assistências.");
	}
}

package exec3;

public abstract class Funcionario3 {
	protected String nome;
	protected double valorHora;
	protected double totalHoras;
	
	public String getNome() {
		return this.nome;
	}
	
	public Funcionario3(String nome, double valorHora, double totalHoras) {
		this.nome = nome;
		this.valorHora = valorHora;
		this.totalHoras = totalHoras;
	}
	
	public abstract double totalAReceber(); //metd abstrato nao tem corpo, quem for extender essa classe deve ter esse metod
	
}


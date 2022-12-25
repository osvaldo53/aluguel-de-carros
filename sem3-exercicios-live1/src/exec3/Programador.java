package exec3;

public class Programador extends Funcionario3 {

	public Programador(String nome, double valorHora, double totalHoras) {
		super(nome, valorHora, totalHoras);
		// TODO Auto-generated constructor stub
	}
	private final double BONIFICACAO = 0.05;
	@Override
	public double totalAReceber() {
		double totalAReceber = this.totalHoras * this.valorHora;
		double bonificacao = totalAReceber * this.BONIFICACAO;
		
		return totalAReceber + bonificacao;
	}

}

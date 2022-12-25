package exec1;

public class Funcionario {
	private String nome;
	
	private String cargo;
	
	private String departamento;
	
	public Funcionario(String nome, String cargo, String departamento) {
		this.nome = nome;
		this.cargo = cargo;
		this.departamento = departamento;
	}

	@Override
	public String toString() {
		return "Funcionario [nome=" + nome + ", cargo=" + cargo + ", departamento=" + departamento + "]";
	}
	
	
}

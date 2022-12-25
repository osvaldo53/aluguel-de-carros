
public class Aluno {
	Integer matricula;
	String nome;
	String email;
	
	
	public Aluno(Integer matricula, String nome) {
		this.matricula = matricula;
		this.nome = nome;
		this.email = nome.replaceAll(" ", ".") + matricula + "@alfamidia.com.br";
	}


	@Override
	public String toString() {
		return "Aluno [matricula=" + matricula + ", nome=" + nome + ", email=" + email + "]";
	}
	
	
}

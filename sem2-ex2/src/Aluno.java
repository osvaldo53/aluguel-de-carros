
public class Aluno {
	private String nome;
	private Double nota1;
	private Double nota2;
	private Double nota3;
	
	public Aluno (String nome) {
		this.nome = nome;
	}
	
	public void adicionarNota (int qualProva, double nota) {
		int somatorio = 0;
		
		if(nota1 != null) {
			somatorio += nota1;
		}
		
		if (nota2 != null) {
			somatorio += nota2;
		}
		
		if (nota3 != null) {
			somatorio += nota3;
		}
		
		if (somatorio + nota > 100) {
			System.out.println("Não foi possível adicionar a nota. Ultrapassou o limite 100");
			return;
		}
		
		switch (qualProva) {
			case 1: this.nota1 = nota;
			break;
			
			case 2: this.nota2 = nota;
			break;
			
			case 3: this.nota3 = nota;
			break;
			
			default: System.out.println("Prova inválida...");
		}
	}
	
	private Double retornaMedia() {
		return (this.nota1 + this.nota2 + this.nota3) / 3;
	}
	
	private Double retornaNota(boolean eMaiorNota) {
		
		Double nota = null;
		if(eMaiorNota) {
			
			if (this.nota1 >= this.nota2 && this.nota1 >= this.nota3) {
				nota = nota1;
			} else if (this.nota2 >= this.nota1 && this.nota2 >= this.nota3) {
				nota = nota2;
			} else {
				nota = nota3;
			}
		} else {
			if (this.nota1 <= this.nota2 && this.nota1 <= this.nota3) {
				nota = nota1;
			} else if (this.nota2 <= this.nota1 && this.nota2 <= this.nota3) {
				nota = nota2;
			} else {
				nota = nota3;
			}
		}
		
		return nota;
	}
	
	public String toString() {
		return "O aluno " + this.nome + " teve a média: " + this.retornaMedia() + " \n" 
				+ "sua maior nota: " + this.retornaNota(true) 
				+ "\n" + "Sua menor nota: " + this.retornaNota(false);
	}
}

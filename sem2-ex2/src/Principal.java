
public class Principal {

	public static void main(String[] args) {
		Aluno aluno01 = new Aluno("Maria");
		
		aluno01.adicionarNota(1, 35);
		aluno01.adicionarNota(2, 36);
		aluno01.adicionarNota(3, 10);
		
		System.out.println(aluno01);
	}

}

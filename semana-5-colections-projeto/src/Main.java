import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		boolean continua = true;
		AlunoBD alunoBD = new AlunoBD();
	
		do {
			System.out.println("Digite a matricula do aluno: ");
			int matricula = sc.nextInt();
			
			if(matricula == 0) {
				continua = false;
				break;
			}
			sc.nextLine(); //para corrigir bug de nao pular linha do nextInt
			
			System.out.println("Digite o nome do aluno: ");
			String nome = sc.nextLine();
			
			Aluno aluno = new Aluno(matricula, nome);
			alunoBD.salvar(aluno);
			
		} while(continua);

		System.out.println("Todos alunos: " + alunoBD.buscarTodos());
		System.out.println("Aluno com matricula 2020: " + alunoBD.buscarPorMatricula(2020));
		alunoBD.excluirPorMatricula(2020);
		System.out.println("Todos alunos: " + alunoBD.buscarTodos());
	} 

}

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Main {

	public static void main(String[] args) {
		
		// O HashSet nao permite itens duplicados, e tambem nao adiciona os itens em ordem na lista
		// O TreeSet organiza em ordem alfabetica, e nao aceita objetos nulos
		
//		HashSet<String> alunos = new HashSet<>();
		Set<String> alunos = new TreeSet<>();
		
		String aluno1 = "José da Silva";
		String aluno2 = "Maria Clara";
		String aluno3 = "João Roberto";
		String aluno4 = "Ana Lima";
		String aluno5 = "Bruno Costa";
		
		alunos.add(aluno1);
		alunos.add(aluno2);
		alunos.add(aluno3);
		alunos.add(aluno4);
		alunos.add(aluno5);
		
		System.out.println(alunos);

	}

}

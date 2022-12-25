import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Main {

	public static void main(String[] args) {

		//INTERFACE LIST
		
		
//		LinkedList<String> alunos = new LinkedList<>(); a diferença entre o arraylist e linked list está na performance
		
//		ArrayList<String> alunos = new ArrayList<>(); no lado esq. podemos chamar o mais generico, (polimorfismo) \/
		List<String> alunos = new ArrayList<>();
		
		String aluno1 = "José da Silva";
		String aluno2 = "Maria Clara";
		String aluno3 = "João Roberto";
		String aluno4 = "Ana Lima";
		
		alunos.add(aluno1);
		alunos.add(aluno2);
		alunos.add(aluno3);
		alunos.add(aluno4);
		
		System.out.println(alunos);
	}
}

// a diferença entre o arraylist e linked list está na performance

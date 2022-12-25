import java.util.HashMap;
import java.util.TreeMap;

public class Main {

	public static void main(String[] args) {
	// O hashmap não mantem ordem entre as chaves, ja o treemap ordena
		
		
	//	HashMap<Integer, String> alunos = new HashMap<>();
		TreeMap<Integer, String> alunos = new TreeMap<>();
		
		String aluno1 = "José da Silva";
		String aluno2 = "Maria Rodrigues";
		String aluno3 = "Pedro Melo";
		String aluno4 = "Enzo Farias";
		
		alunos.put(10, aluno1); // chave e dado
		alunos.put(20, aluno2);
		alunos.put(30, aluno3);
		alunos.put(40, aluno4);
		
		System.out.println(alunos.get(50));

	}

}

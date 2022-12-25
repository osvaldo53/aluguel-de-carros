package exec1;
import java.util.ArrayList;

import exec2.Animal;
import exec2.Cachorro;
import exec2.Humano;
import exec3.Administrador;
import exec3.Contador;
import exec3.Funcionario3;
import exec3.Programador;

public class Principal {

	public static void main(String[] args) {

		//exercicio 1
		
		ArrayList<Funcionario> funcionarios = new ArrayList<>();
		
		funcionarios.add(new Funcionario("José", "Programador", "TI"));
		funcionarios.add(new Funcionario("Mario", "DevOps", "TI"));
		funcionarios.add(new Funcionario("Joao", "Gerente de Projetos", "TI"));
		funcionarios.add(new Funcionario("Maria", "Analista de Testes", "TI"));
		funcionarios.add(new Funcionario("Marta", "Suporte", "TI"));
		funcionarios.add(new Funcionario("Antonia", "Encarregada", "Financeiro"));
		funcionarios.add(new Funcionario("Luisa", "Recrutadora", "RH"));
	
		for (Funcionario funcionario : funcionarios) {
			System.out.println(funcionario);
		}
		
		//exercicio 2
		
		Animal animal = new Cachorro(); //polimorfismo
		animal.comunicar();
		
		
		
		//exercicio 3
		ArrayList<Funcionario3> funcionarios2= new ArrayList<>();
		
		funcionarios2.add(new Programador("Maria", 70.0, 240));
		funcionarios2.add(new Contador("Jose", 70.0, 240));
		funcionarios2.add(new Administrador("Ana", 70.0, 240));
		
		for(Funcionario3 funcionario : funcionarios2) {
			System.out.println(funcionario.getNome() + "-" + funcionario.totalAReceber());
		}
		
		
		
	}

}

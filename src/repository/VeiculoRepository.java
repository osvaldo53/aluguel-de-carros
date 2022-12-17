package repository;

import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import model.Veiculo;

public class VeiculoRepository implements Repository<Veiculo> {

	private Map<Integer, Veiculo> veiculosRepository; //map vai simular banco de dados, sendo integer o id, e veiculo o dado
	
	public VeiculoRepository() {
		this.veiculosRepository = new HashMap<>();
	}
	
	@Override
	public List<Veiculo> buscarTodos() {
											//faltou this?
		Collection<Veiculo> veiculosColl = veiculosRepository.values(); //estou pegando só o dado(Veiculo) que esta la no map, no formato de collection(um tipo mais simples de lista)
		
		List<Veiculo> veiculos = veiculosColl.stream().collect(Collectors.toList()); // metodo para transformar a collection em uma list
		
		return veiculos;
	}

	@Override
	public Veiculo buscarPorId(Integer id) {
		return this.veiculosRepository.get(id);
	}

	@Override
	public void excluirPorId(Integer id) {
		this.veiculosRepository.remove(id);
		
	}

	@Override
	public Veiculo salvar(Veiculo t) {
		this.veiculosRepository.put(t.getId(), t);
		return t;
	}

}

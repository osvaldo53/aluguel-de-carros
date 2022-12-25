package repository;

import java.util.List;

public interface Repository<T> { // generics - quando a interface for implementada o T vai ser substituido pelo tipo q pedirmos
	
	public List<T> buscarTodos();
	
	public T buscarPorId(Integer id);
	
	public void excluirPorId(Integer id);
	
	public T salvar(T t);
}

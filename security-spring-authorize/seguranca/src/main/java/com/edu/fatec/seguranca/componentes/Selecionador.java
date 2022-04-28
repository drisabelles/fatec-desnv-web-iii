package com.edu.fatec.seguranca.componentes;

import java.util.List;

public interface Selecionador<T,ID> {
	public T selecionar(List<T> objetos, ID identificador);
}
package edu.daniel.abstracao.docs;

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Stream;

public interface Doc {
	Void put(String chave, Object valor);

	Object get(String chave);

	<T> Stream<T> filhos(String chave, Function<Map<String, Object>, T> constructor);

}

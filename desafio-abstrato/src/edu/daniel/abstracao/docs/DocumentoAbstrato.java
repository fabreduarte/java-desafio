package edu.daniel.abstracao.docs;

import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Function;
import java.util.stream.Stream;

public abstract class DocumentoAbstrato implements Doc {
	private final Map<String, Object> propriedades;

	protected DocumentoAbstrato(Map<String, Object> propriedades) {
		Objects.requireNonNull(propriedades, "Mapa de propriedades");
		this.propriedades = propriedades;
	}

	@Override
	public Void put(String chave, Object valor) {
		propriedades.put(chave, valor);
		return null;
	}

	@Override
	public Object get(String chave) {
		return propriedades.get(chave);
	}

	@Override
	public <T> Stream<T> filhos(String chave, Function<Map<String, Object>, T> constructor) {
		return Stream.ofNullable(get(chave))
				.filter(Objects::nonNull)
				.map(el -> (List<Map<String, Object>>) el)
				.findAny()
				.stream()
				.flatMap(Collection::stream)
				.map(constructor);
	}

	@Override
	public String toString() {
		return "DocumentoAbstrato [propriedades=" + propriedades + "]";
	}

}

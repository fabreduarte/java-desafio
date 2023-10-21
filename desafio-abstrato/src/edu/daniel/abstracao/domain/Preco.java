package edu.daniel.abstracao.domain;

import java.util.Optional;

import edu.daniel.abstracao.docs.Doc;
import edu.daniel.abstracao.domain.enums.Propriedades;

public interface Preco extends Doc {
	default Optional<Number> getPreco() {
		return Optional.ofNullable((Number) get(Propriedades.PRECO.toString()));
	}

}

package edu.daniel.abstracao.domain;

import java.util.Optional;

import edu.daniel.abstracao.docs.Doc;
import edu.daniel.abstracao.domain.enums.Propriedades;

public interface Tipo extends Doc {
	default Optional<String> getTipo() {
		return Optional.ofNullable((String) get(Propriedades.TIPO.toString()));
	}

}

package edu.daniel.abstracao.domain;

import java.util.Optional;

import edu.daniel.abstracao.docs.Doc;
import edu.daniel.abstracao.domain.enums.Propriedades;

public interface Modelo extends Doc {
	default Optional<String> getModelo() {
		return Optional.ofNullable((String) get(Propriedades.MODELO.toString()));
	}

}

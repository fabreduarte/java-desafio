package edu.daniel.abstracao.domain;

import java.util.stream.Stream;

import edu.daniel.abstracao.docs.Doc;
import edu.daniel.abstracao.domain.enums.Propriedades;

public interface Partes extends Doc {
	default Stream<Parte> getPartes() {
		return filhos(Propriedades.PARTES.toString(), Parte::new);
	}

}

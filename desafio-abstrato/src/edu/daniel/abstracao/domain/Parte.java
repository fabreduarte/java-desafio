package edu.daniel.abstracao.domain;

import java.util.Map;

import edu.daniel.abstracao.docs.DocumentoAbstrato;

public class Parte extends DocumentoAbstrato implements Tipo, Modelo, Preco {

	public Parte(Map<String, Object> propriedades) {
		super(propriedades);
	}

}

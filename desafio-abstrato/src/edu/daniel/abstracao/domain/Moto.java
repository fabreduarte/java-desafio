package edu.daniel.abstracao.domain;

import java.util.Map;

import edu.daniel.abstracao.docs.DocumentoAbstrato;

public class Moto extends DocumentoAbstrato implements Modelo, Preco, Partes {
	public Moto(Map<String, Object> propriedades) {
		super(propriedades);
	}

}

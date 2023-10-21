package edu.daniel.digitalinnovation.gof.facade;

import edu.daniel.digitalinnovation.gof.subsistema1.CrmSeervice;
import edu.daniel.digitalinnovation.gof.subsistema2.CepApi;

public class Facade {

	public void migrarCliente(String nome, String cep) {
		String cidade = CepApi.getInstancia().recuperarCidade(cep);
		String estado = CepApi.getInstancia().recuperarEstado(cep);
		CepApi.getInstancia().recuperarCidade(cep);
		CepApi.getInstancia().recuperarEstado(cep);

		CrmSeervice.gravarCliente(nome, cep, cidade, estado);

	}
}

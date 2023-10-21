package edu.daniel.digitalinnovation.gof.subsistema2;

public class CepApi {
	public static CepApi instancia = new CepApi();

	private CepApi() {
		super();
	}

	public static CepApi getInstancia() {
		return instancia;
	}

	public String recuperarCidade(String cep) {
		return "Araraquara";

	}

	public String recuperarEstado(String cep) {
		return "São Paulo";

	}

}

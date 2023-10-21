import java.util.List;
import java.util.Map;
import java.util.logging.Logger;

import edu.daniel.abstracao.domain.Moto;
import edu.daniel.abstracao.domain.enums.Propriedades;

public class App {
    public static void main(String[] args) throws Exception {
        Logger LOGGER = Logger.getLogger("Logger");

        LOGGER.info("Construindo a motoca");

        var propriedadesRodas = Map.of(
                Propriedades.TIPO.toString(), "roda",
                Propriedades.MODELO.toString(), "Viper",
                Propriedades.PRECO.toString(), 300L);

        var propriedadesGuidão = Map.of(
                Propriedades.TIPO.toString(), "guidão",
                Propriedades.MODELO.toString(), "Esportivo",
                Propriedades.PRECO.toString(), 200L);

        var motoPropriedades = Map.of(
                Propriedades.MODELO.toString(), "Ninja",
                Propriedades.PRECO.toString(), 30000L,
                Propriedades.PARTES.toString(), List.of(propriedadesGuidão, propriedadesRodas));

        var motoca = new Moto(motoPropriedades);

        LOGGER.info("Oia a moto");
        LOGGER.info("Modelo: " + motoca.getModelo());
        LOGGER.info("Preço " + motoca.getPreco());
        LOGGER.info("Partes: ");
        motoca.getPartes().forEach(parte -> LOGGER.info(
                "------ Partes ------" + parte.getTipo() + parte.getPreco() + parte.getModelo()));

    }
}

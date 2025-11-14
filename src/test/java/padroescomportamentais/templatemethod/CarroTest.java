package padroescomportamentais.templatemethod;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CarroTest {

    @Test
    void deveRetornarViagemEconomica() {
        Carro carro = new Carro();
        carro.setDistancia(72.0f); // (72.0 * 2.5) + 0.0 = 180.0
        carro.setCustoBase(0.0f);
        assertEquals("Viagem econômica", carro.verificarConsumo());
    }

    @Test
    void deveRetornarCustoElevado() {
        Carro carro = new Carro();
        carro.setDistancia(71.0f); // (71.0 * 2.5) + 0.0 = 177.5
        carro.setCustoBase(0.0f);
        assertEquals("Viagem com custo elevado", carro.verificarConsumo());
    }

    @Test
    void deveRetornarInformacoes() {
        Carro carro = new Carro();
        carro.setDistancia(40.0f);
        carro.setCustoBase(50.0f);
        carro.setPlaca("ABC-1234");
        carro.setModelo("Fusca");

        assertEquals("Carro{placa='ABC-1234', modelo='Fusca', resultado=150.0}", carro.getInfo());
    }
}
package padroescomportamentais.templatemethod;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class MotoTest {

    @Test
    void deveRetornarViagemEconomica() {
        Moto moto = new Moto();
        moto.setDistancia(48.0f); // (48.0 * 2.5) + 0.0 = 120.0
        moto.setCustoBase(0.0f);
        assertEquals("Viagem econômica", moto.verificarConsumo());
    }

    @Test
    void deveRetornarCustoElevado() {
        Moto moto = new Moto();
        moto.setDistancia(47.0f); // (47.0 * 2.5) + 0.0 = 117.5
        moto.setCustoBase(0.0f);
        assertEquals("Viagem com custo elevado", moto.verificarConsumo());
    }

    @Test
    void deveRetornarInformacoes() {
        Moto moto = new Moto();
        moto.setDistancia(100.0f); // (100.0 * 2.5) + 20.0 = 270.0
        moto.setCustoBase(20.0f);
        moto.setPlaca("XYZ-9876");
        moto.setModelo("CG 160");

        assertEquals("Moto{placa='XYZ-9876', modelo='CG 160', resultado=270.0}", moto.getInfo());
    }
}
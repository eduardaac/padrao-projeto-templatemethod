package padroescomportamentais.templatemethod;

public class Carro extends Veiculo {

    public String verificarConsumo() {
        if (this.calcularCustoTotal() >= 180.0f) {
            return "Viagem econômica";
        } else {
            return "Viagem com custo elevado";
        }
    }
    @Override
    public String getTipo() {
        return "Carro";
    }
}

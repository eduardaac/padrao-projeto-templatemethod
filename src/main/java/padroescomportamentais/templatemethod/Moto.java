package padroescomportamentais.templatemethod;

public class Moto extends Veiculo {

    public String verificarConsumo() {
        if (this.calcularCustoTotal() >= 120.0f) {
            return "Viagem econômica";
        } else {
            return "Viagem com custo elevado";
        }
    }
    @Override
    public String getTipo() {
        return "Moto";
    }
}

package padroescomportamentais.templatemethod;

public abstract class Veiculo {

    private String placa;
    protected String modelo;
    private float distancia;
    private float custoBase;

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public float getDistancia() {
        return distancia;
    }

    public void setDistancia(float distancia) {
        this.distancia = distancia;
    }

    public float getCustoBase() {
        return custoBase;
    }

    public void setCustoBase(float custoBase) {
        this.custoBase = custoBase;
    }

    public float calcularCustoTotal() {
        float custo = distancia * 2.5f;
        return custo + custoBase;
    }

    public abstract String verificarConsumo();

    public String getTipo() {
        return "Veiculo";
    }

    public String getInfo() {
        return getTipo() + "{" +
                "placa='" + this.placa + '\'' +
                ", modelo='" + this.modelo + '\'' +
                ", resultado=" + this.calcularCustoTotal() +
                '}';
    }
}

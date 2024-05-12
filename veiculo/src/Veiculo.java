public class Veiculo {

    private String placa;
    private int quantidadeRodas;
    private String marca;

    public Veiculo(String placa, int quantidadeRodas, String marca) {
        this.placa = placa;
        this.quantidadeRodas = quantidadeRodas;
        this.marca = marca;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public int getQuantidadeRodas() {
        return quantidadeRodas;
    }

    public void setQuantidadeRodas(int quantidadeRodas) {
        this.quantidadeRodas = quantidadeRodas;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    @Override
    public String toString() {
        return "Veiculo{" +
                "placa='" + placa + '\'' +
                ", quantidadeRodas=" + quantidadeRodas +
                ", marca='" + marca + '\'' +
                '}';
    }
}

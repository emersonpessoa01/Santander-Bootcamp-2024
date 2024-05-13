public class Moto extends Veiculo {

    private int cilindrada;

    public Moto(String placa, int quantidadeRodas, String marca, int cilindrada) {
        super(placa, quantidadeRodas, marca);
        this.cilindrada = cilindrada;
    }

    public int getCilindrada() {
        return cilindrada;
    }

    public void setCilindrada(int cilindrada) {
        this.cilindrada = cilindrada;
    }

    @Override
    public String toString() {
        return super.toString() + ", cilindrada=" + cilindrada +
                '}';
    }
}

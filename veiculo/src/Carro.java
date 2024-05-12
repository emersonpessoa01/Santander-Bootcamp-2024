public class Carro extends Veiculo {

    private int numeroPortas;
    private boolean arCondicionado;

    public Carro(String placa, int quantidadeRodas, String marca, int numeroPortas, boolean arCondicionado) {
        super(placa, quantidadeRodas, marca);
        this.numeroPortas = numeroPortas;
        this.arCondicionado = arCondicionado;
    }

    public int getNumeroPortas() {
        return numeroPortas;
    }

    public void setNumeroPortas(int numeroPortas) {
        this.numeroPortas = numeroPortas;
    }

    public boolean isArCondicionado() {
        return arCondicionado;
    }

    public void setArCondicionado(boolean arCondicionado) {
        this.arCondicionado = arCondicionado;
    }

    @Override
    public String toString() {
        return super.toString() + ", numeroPortas=" + numeroPortas +
                ", arCondicionado=" + arCondicionado +
                '}';
    }
}

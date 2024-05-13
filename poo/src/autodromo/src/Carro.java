public class Carro extends Veiculo {
    public void ligar() {
        System.out.println("Carro ligado");
        confereCambio();
        confereCombustivel();
    }

    private void confereCombustivel() {
        System.out.println("Combustivel ok");
    }

    private void confereCambio() {
        System.out.println("Cambio ok");
    }
}

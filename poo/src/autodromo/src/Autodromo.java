public class Autodromo {
    public static void main(String[] args) throws Exception {
        Carro jeep = new Carro();
        // jeep.ligar();
        jeep.setChassi("89276");

        Moto faze = new Moto();
        faze.setChassi("89277");
        // faze.ligar();

        Veiculo veiculo = faze;
        veiculo.ligar();
    }
}

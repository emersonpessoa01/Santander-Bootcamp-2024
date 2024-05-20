public class SistemaIbge {
    public static void main(String[] args) {
        for (EstadoBrasileiro e : EstadoBrasileiro.values()) {
            // System.out.println(e.getSigla() + " - " + e.getNomeMaiusculo());
        }
        //enum
        EstadoBrasileiro estado = EstadoBrasileiro.PIAUI;
        System.out.println(estado.getNome() + " - " + estado.getSigla() + " - " + estado.getNomeMaiusculo() + " - " + estado.getIbge());

    }
}

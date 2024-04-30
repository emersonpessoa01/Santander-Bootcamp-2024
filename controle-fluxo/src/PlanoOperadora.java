public class PlanoOperadora {
    public static void main(String[] args) {
        // Modo condicional convencional
        // String plano = "M"; // M / T

        // if (plano == "B") {
        // System.out.println("100 minutos de ligação");
        // } else if (plano == "M") {
        // System.out.println("100 minutos de ligação");
        // System.out.println("WhatsApp e Instagram grátis");
        // } else if (plano == "T") {
        // System.out.println("100 minutos de ligação");
        // System.out.println("WhatsApp e Instagram grátis");
        // System.out.println("5Gb Youtube");
        // }

        // Modo condicional switch/case
        String plano = "M"; // M / T

        switch (plano) {
            case "T": {
                System.out.println("5Gb Youtube");
                break;
            }
            case "M": {
                System.out.println("WhatsApp e Instagram grátis");
                break;

            }
            case "B": {
                System.out.println("100 minutos de ligação");
                break;

            }
        }
    }
}

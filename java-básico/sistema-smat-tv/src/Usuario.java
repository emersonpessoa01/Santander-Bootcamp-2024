public class Usuario {
    public static void main(String[] args) throws Exception {
        SmartTv smartTv = new SmartTv();

        System.out.println("TV ligada: " + smartTv.ligada);
        System.out.println("Canal Atual: " + smartTv.canal);
        System.out.println("TV Ligada: " + smartTv.volume);

        smartTv.ligar();
        System.out.println("Novo Status -> TV ligada: " + smartTv.ligada);

        smartTv.desligar();
        System.out.println("Novo Status -> TV ligada: " + smartTv.ligada);

        smartTv.aumentarVolume();
        System.out.println("Novo Status -> TV volume: " + smartTv.volume);

        smartTv.diminuirVolume();
        System.out.println("Novo Status -> TV volume: " + smartTv.volume);

        smartTv.aumentarCanal();
        System.out.println("Novo Status -> TV canal: " + smartTv.canal);

        smartTv.diminuirCanal();
        System.out.println("Novo Status -> TV canal: " + smartTv.canal);

        smartTv.mudarCanal(13);
        System.out.println("Novo Status -> TV mundar canal: " + smartTv.canal);

    }
}

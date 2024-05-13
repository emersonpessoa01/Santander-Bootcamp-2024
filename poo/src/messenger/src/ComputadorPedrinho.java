/*
 * Simulação do uso da classe MSNMessenger
 */
public class ComputadorPedrinho {
    public static void main(String[] args) {
        // abrindo MSN Messenger
        MSNMessenger msn = new MSNMessenger();
        msn.enviarMensagem();
        msn.receberMensagem();
        System.out.println("MSNMESSENGER");

        FacebookMessenger facebook = new FacebookMessenger();
        facebook.enviarMensagem();
        System.out.println("FACEBOOK");

        Telegram telegram = new Telegram();
        telegram.enviarMensagem();
        System.out.println("TELEGRAM");

    }
}
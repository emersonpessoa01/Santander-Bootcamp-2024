package apps;

public class Telegram extends ServicoMensagemInstantanea {

    @Override
    public void enviarMensagem() {
        validarConectadoInternet();
        System.out.println("Enviando mensagem pelo Telegram");

    }

    @Override
    public void receberMensagem() {
        System.out.println("Recebendo mensagem pelo Telegram");

    }
    // public void enviarMensagem() {
    // System.out.println("Enviando mensagem pelo Telegram");
    // validarConectadoInternet();
    // salvarHistoricoMensagem();
    // }

    // public void receberMensagem() {
    // System.out.println("Recebendo mensagem pelo Telegram");
    // }

    // private void validarConectadoInternet() {
    // System.out.println("Validando se está conectado a internet pelo Telegram");
    // }

    // private void salvarHistoricoMensagem() {
    // System.out.println("Salvando o histórico da mensagem pelo Telegram");
    // }
}

package apps;
public class FacebookMessenger extends ServicoMensagemInstantanea {

	@Override
	public void enviarMensagem() {
		validarConectadoInternet();
		System.out.println("Enviando mensagem pelo Facebook Messenger");

	}

	@Override
	public void receberMensagem() {
		System.out.println("Recebendo mensagem pelo Facebook Messenger");
		// TODO Auto-generated method stub
	}
	// public void enviarMensagem() {
	// System.out.println("Enviando mensagem pelo Facebook Messenger");
	// validarConectadoInternet();
	// salvarHistoricoMensagem();
	// }

	// public void receberMensagem() {
	// System.out.println("Recebendo mensagem pelo Facebook Messenger");
	// }

	// private void validarConectadoInternet() {
	// System.out.println("Validando se está conectado a internet pelo Facebook
	// Messenger");
	// }

	// private void salvarHistoricoMensagem() {
	// System.out.println("Salvando o histórico da mensagem pelo Facebook
	// Messenger");
	// }
}

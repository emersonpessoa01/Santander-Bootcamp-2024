package apps;
public class MSNMessenger extends ServicoMensagemInstantanea {
	@Override
	public void enviarMensagem() {
		validarConectadoInternet();
		// TODO Auto-generated method stub
		System.out.println("Enviando mensagem pelo MSNMessenger");
	}

	@Override
	public void receberMensagem() {
		// TODO Auto-generated method stub
		System.out.println("Recebendo mensagem pelo MSNMessenger");
	}
	// public void enviarMensagem() {
	// System.out.println("Enviando mensagem pelo MSNMessenger");
	// validarConectadoInternet();
	// salvarHistoricoMensagem();
	// }

	// public void receberMensagem() {
	// System.out.println("Recebendo mensagem pelo MSNMessenger");
	// }

	// private void validarConectadoInternet() {
	// System.out.println("Validando se está conectado a internet pelo
	// MSNMessenger");
	// }

	// private void salvarHistoricoMensagem() {
	// System.out.println("Salvando o histórico da mensagem pelo MSNMessenger");
	// }

}
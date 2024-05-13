public class MSNMessenger {
	public void enviarMensagem() {
		System.out.println("Enviando mensagem");
		validarConectadoInternet();
		salvarHistoricoMensagem();
	}

	public void receberMensagem() {
		System.out.println("Recebendo mensagem");
	}

	private void validarConectadoInternet() {
		System.out.println("Validando se está conectado a internet");
	}

	private void salvarHistoricoMensagem() {
		System.out.println("Salvando o histórico da mensagem");
	}

}
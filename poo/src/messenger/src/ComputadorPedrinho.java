/*
 * Simulação do uso da classe MSNMessenger
 */

import apps.*;


public class ComputadorPedrinho {
    public static void main(String[] args) {
        // abrindo MSN Messenger
        // MSNMessenger msn = new MSNMessenger();
        // msn.enviarMensagem();
        // msn.receberMensagem();
        // System.out.println("MSNMESSENGER");

        // FacebookMessenger facebook = new FacebookMessenger();
        // facebook.enviarMensagem();
        // facebook.receberMensagem();
        // System.out.println("FACEBOOK");

        // Telegram telegram = new Telegram();
        // telegram.enviarMensagem();
        // telegram.receberMensagem();
        // System.out.println("TELEGRAM");

        ServicoMensagemInstantanea smi = null;
		
		/*
		    NÃO SE SABE QUAL APP 
		    MAS QUALQUER UM DEVERÁ ENVIAR E RECEBER MENSAGEM
		 */
		String appEscolhido="msn"; 
		
		if(appEscolhido.equals("msn"))
			smi = new MSNMessenger();
		else if(appEscolhido.equals("fbm"))
			smi = new FacebookMessenger();
		else if(appEscolhido.equals("tlg"))
			smi = new Telegram();
		
			
		smi.enviarMensagem();
		smi.receberMensagem();  


    }
}
import java.util.Scanner;

import application.Iphone;

public class App {
    public static void main(String[] args) throws InterruptedException {
        Scanner sc = new Scanner(System.in);
        Iphone iphone = new Iphone();

        int opcao;

        do {
            System.out.println("Selecione uma opção no menu: \n" + "1: Fazer ligação \n"
                    + "2: Atender ligação \n" + "3: Ativar correio de voz \n" + "4: Selecionar música \n"
                    + "5: Tocar a música \n" + "6: Pausar a música \n" + "7: Exibir página \n"
                    + "8: Abrir nova aba no navegador \n" + "9: Atualizar página \n" + "0: Desligar \n"
                    + "Digite a opção:");
            opcao = sc.nextInt();
            switch (opcao) {
                case 1:
                    iphone.ligar();
                    Thread.sleep(1000);
                    break;
                case 2:
                    iphone.atender();
                    Thread.sleep(1000);
                    break;
                case 3:
                    iphone.iniciarCorreioVoz();
                    Thread.sleep(1000);
                    break;
                case 4:
                    iphone.selecionarMusica();
                    Thread.sleep(1000);
                    break;
                case 5:
                    iphone.tocar();
                    Thread.sleep(1000);
                    break;
                case 6:
                    iphone.pausar();
                    Thread.sleep(1000);
                    break;
                case 7:
                    iphone.exibirPagina();
                    Thread.sleep(1000);
                    break;
                case 8:
                    iphone.adicionarNovaAba();
                    Thread.sleep(1000);
                    break;
                case 9:
                    iphone.atualizarPagina();
                    Thread.sleep(1000);
                    break;
                case 0:
                    System.out.println("Desligando o aparelho");
                    Thread.sleep(900);
                    break;
                default:
                    System.out.println("Opção inválida. Insira um número de 0 a 9.");
                    Thread.sleep(1000);
            }

        } while (opcao != 0);
        sc.close();
    }

}

package dio.com.digital.bank;

public class Main {

    public static void main(String[] args) {
        Banco bancoInicial = new Banco(); //instancia novo banco

        bancoInicial.setNome("EmeBank"); //insere nome do banco

        Cliente emerson = new Cliente("Emerson Pessoa", bancoInicial);  //criado novo cliente emerson
        emerson.setNome("Emerson Pessoa"); //insere o nome do cliente

        Conta ccorrente = new ContaCorrente(emerson); //instanciada nova conta corrente

        ccorrente.depositar(100); //criado um deposito em conta corrente

        Cliente luciene = new Cliente("Luciene Ferreira", bancoInicial);  //instancia novo cliente
        Conta cpoupanca = new ContaPoupanca(luciene);  //instanciada nova conta poupanca

        ccorrente.imprimirExtrato();  //imprime extrato de ccorrente emerson
        cpoupanca.imprimirExtrato();  //imprime estrato de cpoupanca luciene

        ccorrente.transferir(48, cpoupanca);  //faz tranferencia de ccorrente emerson pra cpoupanca luciene

        ccorrente.imprimirExtrato(); //imprime extrato atualizado de ccorrente emerson
        cpoupanca.imprimirExtrato(); //imprime extrato atualizado de cpoupanca luciene
        bancoInicial.mostrarClientes(); //mostra lista de clientes

        Cliente fernanda = new Cliente("Fernanda Ferreira", bancoInicial);  //instancia novo cliente fernanda
        Conta ccorrente2 = new ContaCorrente(fernanda); //instancia nova ccorrente2 de fernanda
        ccorrente2.imprimirExtrato();  //imprime  ccorrente2 de fernanda
        bancoInicial.mostrarClientes(); //mostra lista atualizada de clientes do banco
    }

}
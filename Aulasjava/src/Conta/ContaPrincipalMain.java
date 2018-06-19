package Conta;

public class ContaPrincipalMain {
    public static void main(String[] args) {
        ContaBanco P1 = new ContaBanco();
        P1.setNumConta(36987);
        P1.setDono("Marcos");
        P1.abrirConta("CC");

        ContaBanco P2 = new ContaBanco();
        P2.setNumConta(25896);
        P2.setDono("Raquel");
        P2.abrirConta("CP");

        P1.depositar(100);
        P2.depositar(500);

        P2.sacar(100);
        P1.sacar(150);

        P1.fecharConta();

        P2.estadoAtual();
        P1.estadoAtual();
    }
}

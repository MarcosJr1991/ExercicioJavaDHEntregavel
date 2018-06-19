package Encapsulamento;

public class PrincipalMain {
    public static void main(String[] args) {
        ControleRemoto C = new ControleRemoto();
        C.ligar();
        C.maisVolume();
  //    C.ligarMudo();
        C.play();
        C.abrirMenu();
        C.fecharMenu();
}
}


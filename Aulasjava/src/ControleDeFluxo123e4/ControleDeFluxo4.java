package ControleDeFluxo123e4;

public class ControleDeFluxo4 {
    public static void main(String[] args) {
        byte dia = 8;
        switch (dia){
            case 1:
            case 7:
                System.out.println("FDS");
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                System.out.println("dia util");
             default:
                 System.out.println("opcao invalida");
        }
    }




}

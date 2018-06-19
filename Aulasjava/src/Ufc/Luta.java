package Ufc;

import java.util.Random;

public class Luta {
    //Atributos
    private Lutador desafiando;
    private Lutador desafiante;
    private int rounds;
    private boolean aprovada;
    //Métodos Públicos
    public void marcaLuta(Lutador l1, Lutador l2){
        if (l1.getCategoria().equals(l2.getCategoria())&& l1 != l2){
            this.aprovada = true;
            this.desafiando = l1;
            this.desafiante = l2;
        }else {
            this.aprovada = false;
            this.desafiando = null;
            this.desafiante = null;
        }
    }
    public void lutar(){
        if (this.aprovada){
            System.out.println("### DESAFIADO ###");
            this.desafiando.apresentar();
            System.out.println("### DESAFIANTE ###");
            this.desafiante.apresentar();
            //Objeto tipo random
            Random aletatorio = new Random();
            int vencedor = aletatorio.nextInt(3);//0 1 2
                System.out.println("===== RESULTADO DA LUTA =====");
            switch (vencedor){
                case 0://Empate
                    System.out.println("Empatou!");
                    this.desafiando.empatarLuta();
                    this.desafiante.empatarLuta();
                    break;
                case 1://Desafiado vence
                    System.out.println("Vitoria do " + this.desafiando.getNome());
                    this.desafiando.ganharLuta();
                    this.desafiante.perderLuta();
                break;
                case 2://Desafiante vence
                    System.out.println("Vitoria do " + this.desafiante.getNome());
                    this.desafiante.ganharLuta();
                    this.desafiando.perderLuta();
                 break;
            }
            System.out.println("========================");

        }else {
            System.out.println("A luta não pode acontecer!");
        }
    }
// Métodos Especiais

    public Lutador getDesafiando() {
        return desafiando;
    }

    public void setDesafiando(Lutador desafiando) {
        this.desafiando = desafiando;
    }

    public Lutador getDesafiante() {
        return desafiante;
    }

    public void setDesafiante(Lutador desafiante) {
        this.desafiante = desafiante;
    }

    public int getRounds() {
        return rounds;
    }

    public void setRounds(int rounds) {
        this.rounds = rounds;
    }

    public boolean isAprovada() {
        return aprovada;
    }

    public void setAprovada(boolean aprovada) {
        this.aprovada = aprovada;
    }
}

package ShowDoMilhao;

import java.util.Scanner;

public class Jogo {


        public void jogandoShowDoMilhao(boolean estaNoJogo) {

            // Criação do Objeto Scanner
            Scanner pegaAlgumaCoisa = new Scanner(System.in);

            // Enquanto estiver no jogo (igual a TRUE) vai rodar minha condição
            while(estaNoJogo){

                // Primeira pergunta
                System.out.println("Qual a capital do brasil?");
                System.out.println("a - brasilia");
                System.out.println("b - vila prudente");

                // Captura a Resposta digitada no terminal
                String minhaRespota = pegaAlgumaCoisa.next();

                switch (minhaRespota) {
                    case "a":
                        // A resposta sendo A
                        estaNoJogo = true;
                        System.out.println("acertou");
                        break;

                    // A resposta sendo B
                    case "b":
                        estaNoJogo = false;
                        System.out.println("errado");
                        break;
                }

                // Verificar se o jogador está no jogo, se não para o Loop!
                if (!estaNoJogo) {
                    break; // Termina o while
                }


                // Segunda pergunta
                System.out.println("Qual a capital do argentina?");
                System.out.println("a - buenos aires");
                System.out.println("b - boi nos ares");

                minhaRespota = pegaAlgumaCoisa.next();

                switch (minhaRespota) {
                    case "a":
                        // Ganhou 1 milhao!!!
                        estaNoJogo = false;
                        System.out.println("Ganhou um milhao!!!");
                        break;
                    // A resposta sendo B
                    case "b":
                        estaNoJogo = false;
                        System.out.println("errado");
                        break;
                }

                // Verificar se o jogador está no jogo, se não para o Loop!
                if (!estaNoJogo) {
                    break;
                }
            }

        }

        public void bemVindo() {
            System.out.println("bem vindo ao show do milhao");
        }
    }





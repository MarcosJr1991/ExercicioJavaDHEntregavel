package Jogo;

import java.util.Random;
import java.util.Scanner;

public class JoKemPo {
    public static void main(String[] args) {
        Scanner nameUser = new Scanner(System.in);
        System.out.print("Qual o Seu Nome? ");
        nameUser.next();


        System.out.println("********");

        System.out.println("Escolha uma opção: ");
        System.out.println("1- para PEDRA");
        System.out.println("2- para PAPEL");
        System.out.println("3- para TESOURA");
        System.out.print("Digite sua opção: ");

        Scanner optionUser = new Scanner (System.in);
        int valorHumano = Integer.valueOf(optionUser.nextInt());

        Random computerOption = new Random();
        int valorComputer = Integer.valueOf(computerOption.nextInt(2)+1);
        System.out.println("********");
        System.out.println("O COMPUTADOR ESCOLHEU:"+ valorComputer);

        System.out.println("********");
        if(valorComputer==1 && valorHumano==2){

            System.out.println("PAPEL vence PEDRA -  VC GANHOU!");

        }

        if(valorComputer==1 && valorHumano==3){

            System.out.println("PEDRA vence TESOURA - VC PERDEU!");
        }


        if(valorComputer==2 && valorHumano==1){

            System.out.println("PAPEL vence PEDRA - VC PERDEU!");
        }

        if(valorComputer==2 && valorHumano==3){

            System.out.println("TESOURA vence PAPEL - VC GANHOU!");
        }


        if(valorComputer==3 && valorHumano==1){

            System.out.println("PEDRA vence TESOURA - VC GANHOU!");
        }

        if(valorComputer==3 && valorHumano==2){

            System.out.println("TESOURA vence PAPEL - VC PERDEL!");
        }

        if(valorComputer==3 && valorHumano==3 ||valorComputer==2 && valorHumano==2 ||valorComputer==1 && valorHumano==1 ){

            System.out.println("EMPATE TENTE NOVAMENTE!!!!");
        }

    }
}

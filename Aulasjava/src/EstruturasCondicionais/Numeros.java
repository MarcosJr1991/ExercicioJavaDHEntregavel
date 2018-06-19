package EstruturasCondicionais;


import java.util.Scanner;

public class Numeros {
    public static void main(String[] args) {
    int n, s=0;
    String resp;
        Scanner TECLADO = new Scanner(System.in);
        do {
            System.out.print("DIGITE UM NUMERO: ");
            n = TECLADO.nextInt();
            s += n;
            System.out.print("QUER CONTINUAR? [S/N] ");
            resp = TECLADO.next();
        }while (resp.equals("S"));
        System.out.println("A soma de todos os valores é " + s);
    }
}

/*  int numero , somar = 0;
        String resp;
        Scanner teclado = new Scanner(System.in);
        do {
            System.out.println("Digite um numero: ");
            numero = teclado.nextInt();
            somar += numero; //somar = somar + numero;
            System.out.println("Quer continuar? [S/N] ");
            resp = teclado.next();
        }while (resp.equals("SIM"));
        System.out.println("A soma de todos os valores é " + somar);
    }*/
package TiposPrimitivosJava;

import java.util.Scanner;

public class TiposPrimitivos {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        System.out.print("Digite o nome do aluno: ");
        String nome = teclado.nextLine();
        System.out.print("A nota do aluno:");
        float nota = teclado.nextFloat();
        System.out.printf("A nota de %s é %.1f \n ",nome , nota);
    }
}

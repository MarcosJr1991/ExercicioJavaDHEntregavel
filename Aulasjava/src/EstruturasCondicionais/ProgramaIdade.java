package EstruturasCondicionais;

import java.util.Scanner;

public class ProgramaIdade {
    public static void main(String[] args) {
        Scanner Teclado = new Scanner(System.in);
        System.out.println("Em que ano você nasceu?");
        int nascimento = Teclado.nextInt();
        int idade = 2018-nascimento;
        System.out.println("Sua idade é " + idade);
        if (idade>=18){
            System.out.println("Maior de Idade");
        }else {
            System.out.println("Menor de Idade");
        }
    }
}
// Estrutura condicional Composta
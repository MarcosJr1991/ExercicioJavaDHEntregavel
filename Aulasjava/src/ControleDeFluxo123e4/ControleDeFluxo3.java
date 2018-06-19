package ControleDeFluxo123e4;

public class ControleDeFluxo3 {
    public static void main(String[] args) {
        byte Dia = 5;
        //char , int , byte, short, enum e String
        switch (Dia) {
            case 1:
                System.out.println("Domingo");
                break;
            case 2:
                System.out.println("Segunda");
                break;
            case 3:
                System.out.println("Terca");
                break;
            case 4:
                System.out.println("Quarta");
                break;
            case 5:
                System.out.println("Quinta");
            case 6:
                System.out.println("sexta");
                break;
            case 7:
                System.out.println("Sabado");
                break;
        }
        String sexo = "M";
        switch (sexo) {
            case "M":
                System.out.println("Masculino");
                break;
            case "F":
                System.out.println("Feminino");
                break;
        }


    }
}
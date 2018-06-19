package ControleDeFluxo123e4;

public class ControleDeFluxo1 {
    public static void main(String[] args) {
        //Idade < 15 categoria infantil
        //Idade >= 15 && Idade < 18 juvenil
        //Idade >= 18 adulto

        int Idade = 18;
        String Categoria;
        if (Idade > 18) {
            Categoria =  "infantil";
        }else if (Idade >=15 && Idade <18){
            Categoria =  "juvenil";
        }else {
            Categoria = "adulto";
        }
        System.out.println(Categoria);

    }
}
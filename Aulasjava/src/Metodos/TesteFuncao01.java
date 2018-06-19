package Metodos;

public class TesteFuncao01 {
    static int Soma (int a, int b){
        int s = a + b;
       return s;
    }
    public static void main(String[] args) {
        System.out.println("Começou o programa");
        int sm = Soma(5,2);
        System.out.println("A Soma é "+sm );
    }
}
// System.out.println("A Soma é "+ s);
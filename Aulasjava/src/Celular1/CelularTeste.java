package Celular1;

public class CelularTeste {
    public static void main(String[] args) {
        Celular C1 = new Celular("motorola.1234");
        Celular C2 = new Celular("motorola.1234");

        System.out.println(C1.equals(C2));
    }
}

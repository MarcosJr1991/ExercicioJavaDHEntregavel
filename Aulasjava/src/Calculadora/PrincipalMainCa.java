package Calculadora;

public class PrincipalMainCa {
    public static void main(String[] args) {
        Calculadora  Conta = new Calculadora();
        Calculadora  hp = new Calculadora();


        System.out.println("Metodo com inteiros");
        System.out.println("Metodo com Double : " + Conta.dividir(10,2));

        //Equals é um comparador
        System.out.println("marcos".equals("MARCOS"));


        System.out.println(Conta.equals(hp));

    }
}

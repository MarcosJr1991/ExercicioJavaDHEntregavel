package MetodosGetterSetterConstrutor;

public class PrincipalMain {
    public static void main(String[] args) {
        Caneta c1 = new Caneta("BIC ","AMARELO ",0.4f );
        //c1.setModelo("Bic");
        //c1.modelo ="BIC";

        //c1.setPonta(0.5f);
        //c1.ponta = 0.5f;
       // c1.status();
        //System.out.println("Tenho uma caneta " + c1.getModelo() + " de ponta " + c1.getPonta());
        c1.status();

        Caneta c2 = new Caneta("rabisca ","laranja ",1.5f);
        c2.status();
    }

}

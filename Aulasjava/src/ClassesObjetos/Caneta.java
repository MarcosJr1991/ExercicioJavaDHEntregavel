package ClassesObjetos;

public class Caneta {
    String modelo;
    String cor;
    float ponta;
    int carga;
    boolean tampada;
    void status(){
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Uma caneta " + this.cor);
        System.out.println("Ponta: " + this.ponta);
        System.out.println("Carga " + this.carga);
        System.out.println(" está tampada? " + this.tampada);

    }

    void rabiscar(){
        if (this.tampada == true){
            System.out.println("Erro! não posso rabiscar");
        }else {
            System.out.println("Estou rabiscando");
        }

    }
    void tampar(){
        this.tampada = true;
    }
    void destampar(){
        this.tampada = false;
    }

    public static void main(String[] args) {
        Caneta c1 = new Caneta();
        c1.cor = "Azul";
        c1.ponta = 0.5f;
 //     c1.tampar();
        c1.destampar();
        c1.status();
        c1.rabiscar();

        Caneta c2 = new Caneta();
        c2.modelo = "Big";
        c2.cor = "Verde";
        c2.tampar();
        c2.status();
        c2.rabiscar();

    }
}

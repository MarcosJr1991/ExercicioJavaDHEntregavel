package ClassesObjetos;

public class Caneta2 {
    public String modelo;
    public String cor;
    private float ponta;
    protected int carga;
    protected boolean tampada;
    public void status(){
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Uma caneta " + this.cor);
        System.out.println("Ponta: " + this.ponta);
        System.out.println("Carga: " + this.carga);
        System.out.println("Esta tampada? " + this.tampada);
    }
    public void rabiscar(){
        if (this.tampada == true){
            System.out.println("Erro! Não posso rabiscar");
        }else {
            System.out.println("Estou Rabiscando");
        }
    }
    protected void tampar(){
        this.tampada = true;
    }
    protected void destampar(){
        this.tampada = false;
    }

    public static void main(String[] args) {
        Caneta2 C1 = new Caneta2();
        C1.modelo = "Bic cristal";
        C1.cor = "Azul";
        //C1.ponta = 0.5f;
        C1.carga = 80;
        C1.tampada = true;
        C1.status();
        C1.rabiscar();
    }
}

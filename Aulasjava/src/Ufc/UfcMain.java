package Ufc;

public class UfcMain {
    public static void main(String[] args) {
     //   Lutador l = new Lutador();
          Lutador l[] = new Lutador[6];
          l[0]= new Lutador("Madruga","Brasil",25,1.75f,68.9f,11,2,1);
       // l.apresentar();
        l[1] = new Lutador("CHAVES","Italia",27,1.90f,99.8f,14,2,3);
        l[2] = new Lutador("KIKO","RUSSIA",35,1.87f,95.2f,5,9,2);
        l[3] = new Lutador("Blanka","alemanha",40,1.96f,110.0f,25,0,10);
        l[4] = new Lutador("Gohan","Espanha",24,1.77f,69.5f,35,0,0);
        l[5] = new Lutador("Magia","França",26,1.89f,111.0f,15,14,15);

     // l[3].ganharLuta();
     // l[3].status();
        Luta UFC01 = new Luta();
        UFC01.marcaLuta(l[0],l[4]);
        UFC01.lutar();
        l[0].status();
        l[4].status();

    }
}

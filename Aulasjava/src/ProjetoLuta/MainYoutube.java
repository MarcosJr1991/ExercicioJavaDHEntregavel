package ProjetoLuta;

public class MainYoutube {
    public static void main(String[] args) {
        Video v[] = new Video[3];
        v[0] = new Video("Lutadores Java");
        v[1] = new Video("Loucos Por Java");
        v[2] = new Video("Viciados EM Java");

       // Pessoa p = new Pessoa("Marcos",27,"M");
        Telespectadores t[] = new Telespectadores[2];
        t[0] = new Telespectadores("Marcos",27,"M","MJR");
        t[1] = new Telespectadores("Maria",28,"F","MARIAV");

        Visualizacao vis[] = new Visualizacao[5];
        vis[0] = new Visualizacao(t[0],v[2]); // Marcos assiste viciados em java
        vis[0].avaliar();
        System.out.println(vis[0].toString());

        vis[1] = new Visualizacao(t[0],v[1]); // Marcos assiste loucos java
        vis[0].avaliar(87.0f);
       // System.out.println(vis[1].toString());


       System.out.println(v[1].toString());
      /*  System.out.println("Videos\n--------------------------");
        System.out.println(v[0].toString());
        System.out.println(v[1].toString());
        System.out.println(v[2].toString());
        System.out.println("\nTelespectadores\n------------------");
        System.out.println(t[0].toString());
        System.out.println(t[1].toString());*/
    }
}

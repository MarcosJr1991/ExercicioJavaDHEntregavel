package ProjetoLivro;

public class PrincipalMain {
    public static void main(String[] args) {
        Pessoa[] p = new Pessoa[2];
        Livro[] l = new Livro[3];

        p[0] = new Pessoa("Marcos",27,"M");
        p[1] = new Pessoa("Maria",28,"F");

        l[0] = new Livro("Apredendo Java","JAVA DOCS",300,p[0]);
        l[1] = new Livro("O som e a furia","william faulkner",256,p[1]);
        l[2] = new Livro("Guerra e Paz","Liev Tolstoi",600,p[0]);

        l[0].abrir();
        l[0].folhear(200);
        l[0].avancarPag();
        System.out.println(l[0].detalhes());

        System.out.println(l[1].detalhes());
    }
}

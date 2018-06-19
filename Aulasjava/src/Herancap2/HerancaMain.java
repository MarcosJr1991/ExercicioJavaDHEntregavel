package Herancap2;

public class HerancaMain {
    public static void main(String[] args) {
        //Pessoa p1 = new Pessoa ();
        // Visitante v1 = new Visitante();
        //v1.setNome("Marcos");
        //v1.setIdade(27);
        //v1.setSexo("M");
        //System.out.println(v1.toString());

        Aluno a1 = new Aluno();
        a1.setNome(" Junior ");
        a1.setMatricula(1111);
        a1.setCurso("Informatica");
        a1.setIdade(16);
        a1.setSexo("M");
        a1.pagarMensalidade();

        Bolsista b1 = new Bolsista();
        b1.setMatricula(12222);
        b1.setNome("Madruga");
        b1.setBolsa(12.5f);
        b1.setSexo("M");
        b1.pagarMensalidade();
    }
}


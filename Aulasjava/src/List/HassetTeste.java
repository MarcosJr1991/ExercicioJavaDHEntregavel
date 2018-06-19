package List;

import java.util.HashSet;
import java.util.Set;

public class HassetTeste {
    public static void main(String[] args) {
        Set<String> nome = new HashSet<String>();

        nome.add("Russia");
        nome.add("Alemanha");
        nome.add("Franca");
        nome.add("Brasil");
        System.out.println(nome);
        imprimirString(nome);

    }

    public static void imprimirString(Set<String> ListaParaImprimir) {
        for (String algoDaMinhaLista : ListaParaImprimir) {
            System.out.println(algoDaMinhaLista);


        }
    }
    }





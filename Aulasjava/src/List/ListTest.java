package List;

import java.util.ArrayList;
import java.util.List;

public class ListTest {
    public static void main(String[] args) {
        List<String> minhaLista = new ArrayList<String>();
        minhaLista.add("Silvio");
        minhaLista.add("Marcos");
        minhaLista.add("Leandro");
        minhaLista.add("cassio");
        System.out.println(minhaLista);

        minhaLista.remove("Silvio");
        System.out.println("depois do remove");
        System.out.println(minhaLista);
        System.out.println("------------------------");
        imprimirString(minhaLista);
    }

    public static void imprimirString(List<String> ListaParaImprimir) {
        for (String algoDaMinhaLista : ListaParaImprimir) {
            System.out.println(algoDaMinhaLista);
        }
    }
}
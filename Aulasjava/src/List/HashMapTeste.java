package List;

import java.util.HashMap;
import java.util.Map;

public class HashMapTeste {
    public static void main(String[] args) {
        Map<String, Integer> Agenda = new HashMap<String, Integer>();
        Agenda.put("fizemos 4 gols contra voce", 8);
        Agenda.put("fizemos 4 gols contra voce", 9);
        Agenda.put("fizemos 4 gols contra voce", 7);

        imprimirString(Agenda);
    }

    public static void imprimirString(Map<String, Integer> ListaParaImprimir) {
        for (String Key : ListaParaImprimir.keySet()) {
            int conteudo = ListaParaImprimir.get(Key);


            System.out.println(Key + "  " + conteudo);
        }
    }
}
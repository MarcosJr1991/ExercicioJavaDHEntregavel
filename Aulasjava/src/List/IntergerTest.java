package List;

import java.util.ArrayList;
import java.util.List;

public class IntergerTest {
    public static void main(String[] args) {
        List<Integer> listamarcos = new ArrayList<Integer>();
        listamarcos.add(7);
        listamarcos.add(8);
        listamarcos.add(9);
        listamarcos.add(10);
        System.out.println(listamarcos);

        listamarcos.remove(Integer.valueOf(9));
        System.out.println(listamarcos);

    }


}

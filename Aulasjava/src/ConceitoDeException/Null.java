package ConceitoDeException;

public class Null {
    private static String nome;

    public static void main(String[] args) {
        try {
            boolean Tem_Valor = nome.contains("Marcos");
        }catch (NullPointerException e){
            System.out.println("Não Tem Valor Amigo!" + "Erro:" + e.toString());
        }
    }
}

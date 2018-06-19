package ConceitoDeException;

public class Array {
    public static void main(String[] args) {
        int numeros[] = {40, 30, 40};
        try {
            System.out.println(numeros[4]);
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Não Tem Essa Posição");
        }
    }
}

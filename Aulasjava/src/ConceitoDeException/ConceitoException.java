package ConceitoDeException;

public class ConceitoException {
    public static void main(String[] args) {
        int num = 10, num2 = 0, saida;
    try {
        saida = num / num2;
        System.out.println(saida);
    }catch (ArithmeticException e) {
        System.out.println("Deu Beyblade!");
        System.out.println(e.getMessage());
    }
    }

    }


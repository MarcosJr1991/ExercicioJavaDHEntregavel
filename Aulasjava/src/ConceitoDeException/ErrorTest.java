package ConceitoDeException;

public class ErrorTest {
    public static void main(String[] args) {
        //Stack Empilhamento da chamada em memoria
        stackOverflowError();
    }
    public static void stackOverflowError(){
        stackOverflowError();
    }
}

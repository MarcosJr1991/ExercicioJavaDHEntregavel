package ProjetoLuta;

public class Telespectadores extends Pessoa {
    private String login;
    private int totAssistido;

    public Telespectadores(String nome, int idade, String sexo, String login) {
        super(nome, idade, sexo);
        this.login = login;
        this.totAssistido = 0;
    }


    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public int getTotAssistido() {
        return totAssistido;
    }

    public void setTotAssistido(int totAssistido) {
        this.totAssistido = totAssistido;
    }

    @Override
    public String toString() {
        return "Telespectadores{" + super.toString()+
                "\nlogin='" + login + '\'' +
                ", totAssistido=" + totAssistido +
                '}';
    }
}

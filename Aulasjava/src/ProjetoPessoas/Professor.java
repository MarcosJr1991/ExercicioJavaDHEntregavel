package ProjetoPessoas;

public class Professor extends Pessoa{
    private String especialidades;
    private float salario;

    public void receberAumento(float aum){
        this.salario += aum;

    }

    public String getEspecialidades() {
        return especialidades;
    }

    public void setEspecialidades(String especialidades) {
        this.especialidades = especialidades;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }
}

package Celular1;
//IMEI CODIGO UNICO
public class Celular {
    private String nome;
    private String IMEI;
    public Celular(String nome, String IMEI){
        this.nome = nome;
        this.IMEI = IMEI;
    }

    public Celular(String s) {
    }
    // REFLEXIVO = VERDADEIRO.EQUALS(VERDADEIRO) TEM QUE SER TRUE PARA TUDO QUE FOR DIFERENTE DE NULL
    //Simetrico para x e y diferentes de null, x.equals(y) == true logo y.equals(x) tem que ser true
    //Transitividade para x,y,z diferentes de null, se x.equals(y) == true, logo y.equals(x) == true e x.equals(z) == true logo y.equals(z) tambem tem que ser true
    // para x diferente de null x.equals(null) tem que retornar false:
//Para Hascode
    //se x.equals(y) = true y.hascode() = x.Hascode();
    //y.hascode() == x.hascode() não necessariamente p equals deverá retornar true
    //x.equals(y) = false
    //y.hascode() != x.hascode() x.equals(y) deverá ser false

 //   @Override
 //   public int hashCode(){
 //       return IMEI != null ? IMEI.hashCode() : 1 ; // todo mundo em uma caxinha só
 //   }

 //   @Override
 //   public boolean equals(Object obj) {
 //       if (obj == null) ;
 //       return false;

 //       if (this == obj)
 //           return true;

 //       if (this.getClass()!=obj.getClass())
 //           return false;

 //       Celular outrocelular = (Celular) obj;
 //       return IMEI != null && IMEI.equals(outrocelular.getIMEI());
 //   }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getIMEI() {
        return IMEI;
    }

    public void setIMEI(String IMEI) {
        this.IMEI = IMEI;
    }
}

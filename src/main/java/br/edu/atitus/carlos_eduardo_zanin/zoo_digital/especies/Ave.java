package br.edu.atitus.carlos_eduardo_zanin.zoo_digital.especies;
public abstract class Ave extends Animal{
     
    private String corPenas;

    public Ave(String nome, Integer idade, String corPenas) {
        super(nome, "Ave", idade);
        this.corPenas = corPenas;
    }

    public String getCorPenas() {
        return corPenas;
    }

    public void setCorPenas(String corPenas) {
        this.corPenas = corPenas;
    }
    
    
    
}

package Telas;

public class Carro{
    private String desc,poten,cor;
    private Integer cod;
    
    public Carro (){}

    public Carro(Integer cod, String nome, String usu, String pass) {
        this.cod = cod;
        this.desc = desc;
        this.poten = poten;
        this.cor = cor;
    }
    
        public Carro(String nome, String usu, String pass) {
        this.desc = desc;
        this.poten = poten;
        this.cor = cor;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getPoten() {
        return poten;
    }

    public void setPoten(String poten) {
        this.poten = poten;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public Integer getCod() {
        return cod;
    }

    public void setCod(Integer cod) {
        this.cod = cod;
    }
        
}

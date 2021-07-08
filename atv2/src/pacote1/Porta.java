package pacote1;

public class Porta {
    public boolean aberta;
    public String cor;
    public double largura;
    public double altura;
    public double espessura;

    public Porta(boolean aberta, String cor, double largura, float altura, double espessura){
        this.aberta = aberta;
        this.cor = cor;
        this.largura = largura;
        this.altura = altura;
        this.espessura = espessura;
    }
    public void abre(){
        this.aberta = true;
    }
    public void fecha(){
        this.aberta = false;
    }
    public void pinta(String s){
        this.cor = s;
    }
    public boolean estaAberta(){
        if(this.aberta == true){
            return true;
        }else{
            return false;
        }
    }

}

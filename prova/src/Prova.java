public class Prova{
    public Double nota;
    public Double valia;
    public String data;
    public boolean feito;

    Prova(Double nota, Double valia, String data, boolean feito){
        this.nota = nota;
        this.valia = valia;
        this.data = data;
        this.feito = feito;
    }

    public double getNota(){
        return this.nota;
    }
    public void setNota(Double novanota){
        this.nota = novanota;
    }
    
    public double getValia(){
        return this.valia;
    }
    public void setValia(Double novavalia){
        this.valia = novavalia;
    }

    public String getData(){
        return this.data;
    }
    public void setData(String novadata){
        this.data = novadata;
    }

    public boolean getFeito(){
        return this.feito;
    }
    public void setFeito(Boolean agrfeito){
        this.feito = agrfeito;
    }
}
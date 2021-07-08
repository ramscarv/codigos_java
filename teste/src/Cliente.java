

public class Cliente {
    private String nome;
    private int rg;
    private String cpf;

    public Cliente(String nome, int rg, String cpf){
        this.nome = nome;
        this.rg = rg;
        this.cpf = cpf;
    }
    public int getRg(){
        return rg;
    }
    public void setRg(int rg){
        this.rg = rg;
    }
    public void setNome(String nome){
        this.nome = nome;
    }
    public String getNome(){
        return nome;
    }
    public void setCpf(String cpf){
        this.cpf = cpf;
    }
    public String getCpf(){
        return cpf;
    }
}

package pacote1;

public class Casa {
    public String cor;
    public int totalDePortas;
    public Porta[] portas;
    public int numDePortas;

    static int j = 0;
    
    public Casa(String cor, int numDePortas) {
        this.cor = cor;
        this.numDePortas = numDePortas;
        this.portas = new Porta[numDePortas];
    }
    public void pinta(String s){
        this.cor = s;
    }
    public void quantasPortasEstaoAbertas(){
            for (int i = 0; i < this.portas.length; i++) {
                if(achaPorta(this.portas[i]) == true) /*|| achaPorta(this.portas[i]) == false)*/{
                    System.out.println("porta na posicao: " + i);
                    mostraPorta(this.portas[i]);
                }
        }
    }
    
    int numDePortas(Casa c){
        return c.numDePortas;
   
    }
    public void addPorta(Porta p){
        this.portas[j] = p;
        j++;
    
    }
    boolean achaPorta(Porta p){
        for(int i = 0; i < this.portas.length; i++){
            if(p.aberta == true){
                return true;
            }
        }
        return false;

    }
    void mostraPorta(Porta p){
        System.out.println("COR DA PORTA: " + p.cor +" / Aberta: " + p.aberta + " / ALTURA: " + p.altura +" / LARGURA: " + p.largura +" / ESPESSURA: " + p.espessura);
    }
    
}

package pacote;

import pacote1.Casa;
import pacote1.Porta;

public class App {
    public static void main(String[] args){
        Porta p1 = new Porta(true, "preta", 1.3, 2, 0.05);
        Porta p2 = new Porta(false, "branca", 1.0, 3, 0.03);
        Casa kza = new Casa("verde", 2);
        System.out.println("casa de cor "+ kza.cor);
        kza.pinta("amarela");
        System.out.println("casa de cor "+ kza.cor);
        kza.addPorta(p1);
        kza.addPorta(p2);
        System.out.println("qnt de portas = " + numDePortas(kza));
        kza.quantasPortasEstaoAbertas();
    }

}

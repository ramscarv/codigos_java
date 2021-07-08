public class Atividade {
    public Prova prova;
    public Exercicio exercicio;
    public Seminario seminario;
    String dsc;

    Atividade(Prova prova, Exercicio exercicio, Seminario seminario, String dsc){
        this.prova = prova;
        this.exercicio = exercicio;
        this.seminario = seminario;
        this.dsc = dsc;
    }
}
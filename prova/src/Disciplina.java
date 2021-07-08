public class Disciplina{
    public String professor;
    public String nomedsc;
    public String periododsc;
    static int i = 0;

    Disciplina(String professor, String periododsc, String nomedsc){
        this.professor = professor;
        this.periododsc = periododsc;
        this.nomedsc = nomedsc;
    }

    String getProfessor(){
        return this.professor;
    }
    void setProfessor(String novoprofessor){
        this.professor = novoprofessor;
    }

    String getNome(){
        return this.nomedsc;
    }
    void setNome(String novonome){
        this.nomedsc = novonome;
    }

    String getPeriodo(){
        return this.periododsc;
    }
    void setPeriodo(String novoperiodo){
        this.periododsc = novoperiodo;
    }
}
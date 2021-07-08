public class Agenda {
    String nome;
    int numeroDeMatricula;
    String curso;
    Disciplina[] disciplina;
    Atividade[] atividade;
    String periodo;
    int numdedsc;
    static int i = 0;
    
    public Agenda(String nome, int numeroDeMatricula, String curso, String periodo, int numdedsc){
        this.nome = nome;
        this.numeroDeMatricula = numeroDeMatricula;
        this.curso = curso;
        this.periodo = periodo;
        this.numdedsc = numdedsc;
        this.disciplina = new Disciplina[numdedsc];
        this.atividade = new Atividade[3];
    }

    public String getNome(){
        return this.nome;
    }
    public void setNome(String novonome){
        this.nome = novonome;
    }

    public String getCurso(){
        return this.curso;
    }
    public void setCurso(String novocurso){
        this.curso = novocurso;
    }

    public int getNumeroDeMatricula(){
        return this.numeroDeMatricula;
    }

    public void setNumeroDeMatricula(int novonum){
        this.numeroDeMatricula = novonum;
    }
    
    public void setDisciplina(Disciplina d, int p){
        this.disciplina[p] = d;
    }
    public void setAtividade(Atividade atividade, int p){
        this.atividade[p] = atividade;
    }

    public void printAgenda(){
        System.out.println("\nNome: " + this.nome +" / Numero de Matricula: "+ this.numeroDeMatricula +" / Curso: "+ this.curso +" / Periodo : "+ this.periodo +" / Disciplinas " + this.disciplina.length);
        for(int j = 0; j < this.disciplina.length; j++){
            if(this.disciplina[j] != null){
                System.out.println("    Nome da Dsc: "+ this.disciplina[j].nomedsc +" / Professor: "+  this.disciplina[j].professor +" / Periodo: "+  this.disciplina[j].periododsc);
            }
        }
    }

    public void printAtividades(){
        double s = 0;
        System.out.println("\nAluno: " + this.nome);
        for(int j = 0; j < this.atividade.length; j++){
            if(this.atividade[j] != null){
                System.out.println("\nDisciplina: "+ this.atividade[j].dsc +" / Atividades###");
                System.out.println("    Exercicio/ Nota = "+ this.atividade[j].exercicio.nota +" / Valia = "+ this.atividade[j].exercicio.valia +" / Data "+ this.atividade[j].exercicio.data +" / Esta feita? " +this.atividade[j].exercicio.feito +
                                   "\n    Seminario/ Nota = "+ this.atividade[j].seminario.nota +" / Valia = "+ this.atividade[j].seminario.valia +" / Data "+ this.atividade[j].seminario.data +" / Esta feita? " +this.atividade[j].seminario.feito +
                                   "\n    Prova/ Nota = "+ this.atividade[j].prova.nota +" / Valia = "+ this.atividade[j].prova.valia +" / Data "+ this.atividade[j].prova.data +" / Esta feita? " +this.atividade[j].prova.feito+
                                   "\n    Prova + Exercicio + Seminario = "+ (this.atividade[j].prova.nota+this.atividade[j].seminario.nota+this.atividade[j].exercicio.nota));
                                   s += (this.atividade[j].prova.nota+this.atividade[j].seminario.nota+this.atividade[j].exercicio.nota);
            }
        }System.out.println("\n    Soma das Atividades = "+ s);
    }

    void media(double valor, int denominador){
         System.out.println("Media = "+ valor/denominador);
    }
}
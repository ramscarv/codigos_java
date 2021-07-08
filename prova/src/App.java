public class App {
    public static void main(String[] args) throws Exception {
        Exercicio exercicio1 = new Exercicio(0.0, 10.0, "18/05", false);
        Seminario seminario1 = new Seminario(8.0, 10.0, "23/02", true);
        Prova prova1 = new Prova(3.7, 6.0, "27/02", true);
        
        Exercicio exercicio2 = new Exercicio(5.0, 10.0, "13/02", true);
        Seminario seminario2 = new Seminario(6.0, 10.0, "26/03", true);
        Prova prova2 = new Prova(0.0, 10.0, "31/04", false);

        Exercicio exercicio3 = new Exercicio(0.0, 10.0, "30/04", false);
        Seminario seminario3 = new Seminario(0.0, 10.0, "10/05", false);
        Prova prova3 = new Prova(0.0, 10.0, "3/05", false);

        Exercicio exercicio4 = new Exercicio(10.0, 10.0, "13/02", true);
        Seminario seminario4 = new Seminario(8.0, 10.0, "23/02", true);
        Prova prova4 = new Prova(3.7, 6.0, "27/02", true);
        
        Exercicio exercicio5 = new Exercicio(5.0, 10.0, "13/02", true);
        Seminario seminario5 = new Seminario(6.0, 10.0, "26/03", true);
        Prova prova5 = new Prova(0.0, 10.0, "29.04", false);

        Exercicio exercicio6 = new Exercicio(0.0, 10.0, "10/05", false);
        Seminario seminario6 = new Seminario(0.0, 10.0, "30/04", false);
        Prova prova6 = new Prova(0.0, 10.0, "31/04", false);
        
        Atividade atividade1 = new Atividade(prova1, exercicio1, seminario1, "poo");
        Atividade atividade2 = new Atividade(prova2, exercicio2, seminario2, "sistemas embarcados");
        Atividade atividade3 = new Atividade(prova3, exercicio3, seminario3, "estrutura de dados");
        Atividade atividade4 = new Atividade(prova4, exercicio4, seminario4, "frances 2");
        Atividade atividade5 = new Atividade(prova5, exercicio5, seminario5, "literatura francesa");
        Atividade atividade6 = new Atividade(prova6, exercicio6, seminario6, "artes cenicas");
        
        Disciplina dsc1 = new Disciplina("carlos bruno", "manha 10h/12h segunda/quarta", "poo");
        Disciplina dsc2 = new Disciplina("hebert richards", "manha 10h/12h terca/quinta", "sistemas embarcados");
        Disciplina dsc3 = new Disciplina("dwan", "manha 8h/10h quarta/sexta", "estrutura de dados 2");
        Disciplina dsc4 = new Disciplina("maria helena", "tarde 14h/16h segunda/quarta/sexta", "frances 2");
        Disciplina dsc5 = new Disciplina("suraj khemra", "oite 20h/22h quarta/sexta", "literatura francesa");
        Disciplina dsc6 = new Disciplina("wolfumar", "manha 8h/10h segunda/quarta/sexta", "artes cenicas");
        
        Agenda agenda1 = new Agenda("ramses carvalho", 2017009328, "ciencia da computacao", "Integral", 3);
        Agenda agenda2 = new Agenda("priamo krlh", 2017008900, "letras frances", "Noturno", 2);
        Agenda agenda3 = new Agenda("pika molekkk", 2017008900, "artes visuais", "Nunca estudakkkk", 2);
        
        //System.out.println(agenda1.nome);
        //System.out.println(dsc1.professor);
        
        agenda1.setNome("Paulinho do corre");
        
        agenda1.setAtividade(atividade1, 0);
        agenda1.setAtividade(atividade2, 1);
        agenda1.setAtividade(atividade3, 2);
        agenda2.setAtividade(atividade4, 0);
        agenda2.setAtividade(atividade5, 1);
        agenda3.setAtividade(atividade6, 0);


        agenda1.setDisciplina(dsc1, 0);
        agenda1.setDisciplina(dsc2, 1);
        agenda1.setDisciplina(dsc3, 2);
        agenda2.setDisciplina(dsc4, 0);
        agenda2.setDisciplina(dsc5, 1);
        agenda3.setDisciplina(dsc6, 0);

        //agenda1.printAgenda();
        //agenda2.printAgenda();
        //agenda3.printAgenda();

        agenda1.printAtividades();
        agenda1.media(22.7, 2);
        agenda2.printAtividades();
        agenda2.media(32.7, 4);
    }
}
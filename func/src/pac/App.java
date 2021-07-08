package pac;

import pacote.Empresa;
import pacote.Funcionario;

public class App {
    public static void main(String[] args) throws Exception {
        Funcionario p1 = new Funcionario("ramses", "ladrao", 0);
        Funcionario p2 = new Funcionario("ram", "pilantra", 10);
        Funcionario p3 = new Funcionario("ses", "vagabundo", (float) 20.0);
        //System.out.println(p1.nome);
        //System.out.println(p2.nome);
        //System.out.println(p3.nome);
        Empresa emp1 = new Empresa("bar do ze", "00.000.000/00001-00", "cachaca", 3);
        System.out.println(emp1.nome);
        emp1.addFuncionario(p1);
        emp1.addFuncionario(p2);
        emp1.addFuncionario(p3);
        emp1.mostraEmpregados();
    }
}

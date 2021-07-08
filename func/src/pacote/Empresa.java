package pacote;

public class Empresa {
    public String nome;
    public String cnpj;
    public Funcionario[] empregados;
    public String ramo;
    public int numFuncionario;
static int i = 0;
    public Empresa(String nome, String cnpj, String ramo, int numFuncionario){
        this.nome = nome;
        this.cnpj = cnpj;
        this.ramo = ramo;
        this.numFuncionario = numFuncionario;
        this.empregados = new Funcionario[numFuncionario];
    }
    public void addFuncionario(Funcionario f){
        this.empregados[i] = f;
        i++;
    }
    public void mostraEmpregados(){
        for(int i = 0; i < this.empregados.length; i++){
            System.out.println("Funcionario na posicao: "+ i);
            mostraEmpregado(this.empregados[i]);
        }
    }
    int achaFuncionario(Funcionario f){
        for(int i = 0; i < this.empregados.length; i++){
            if(f == this.empregados[i]){
                return i;
            }
        }
        return 0;

    }
    void mostraEmpregado(Funcionario f){
        System.out.println("NOME DO FUNCIONARIO: " + f.nome +" / Funcao: " + f.funcao + " / Salario: " + f.salario);
    }
}

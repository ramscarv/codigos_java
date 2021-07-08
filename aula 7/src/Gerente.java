class Gerente extends Funcionario {
    int senha;
	int numeroDeFuncionariosGerenciados;

	public Gerente(String nome, String cpf, double salario, int senha, int qtdDeFuncGer) {
		super (nome, cpf, salario);					
		this.senha = senha;
		this.numeroDeFuncionariosGerenciados = qtdDeFuncGer;
		}

	public boolean autentica(int senha) {

		if (this.senha == senha) {
			System.out.println("Acesso Permitido!");
			return true;
		} else {
			System.out.println("Acesso Negado!");
			return false;
		}
	}

    public double getBonificacao(){
        return this.salario *= 1.15;
    }
}
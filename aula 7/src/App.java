public class App {
    public static void main(String[] args) throws Exception {
		Funcionario funcionario01 = new Funcionario("Ramses Carvalho", "034.202.502-31", 5000);
        Gerente gerente01 = new Gerente("Fernando Araujo", "805.422.013-45", 5751.67, 123456, 5);
		
        gerente01.senha = 123456;
		gerente01.numeroDeFuncionariosGerenciados = 5;
		
		gerente01.autentica(1123456);
		gerente01.autentica(123456);
		
		gerente01.nome = "José Araújo";
		
		System.out.println("O novo gerente é: " + gerente01.nome);
		System.out.println("O gerente " + gerente01.nome + " tem salario de : "+ gerente01.salario);
        gerente01.getBonificacao();
        System.out.println("O gerente " + gerente01.nome + " tem salario de : "+ gerente01.salario);
        System.out.println("O funcionario " + funcionario01.nome + " tem salario de : "+ funcionario01.salario);
        funcionario01.getBonificacao();
        System.out.println("O funcionario " + funcionario01.nome + " tem salario de : "+ funcionario01.salario);
        gerente01.setSalario(6000);
        System.out.println("O gerente " + gerente01.nome + " tem salario de : "+ gerente01.salario);
        gerente01.getBonificacao();
        System.out.println("O gerente " + gerente01.nome + " tem salario de : "+ gerente01.salario);
    }
}

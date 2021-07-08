public class App {
    public static void main(String[] args) throws Exception {
        Cliente cliente01 = new Cliente("Fernando Correa", 253289, "111.225.481-15");
		Cliente cliente02 = new Cliente("George Correa", 253289, "821.005.481-25");
		Cliente cliente03 = new Cliente("Claudio Isais", 103289, "001.125.101-03");
        Cliente cliente04 = new Cliente("Ramses Carvalho", 382707, "034.202.502-31");

		Conta conta01 = new Conta(32466, 530.0, 200.0, cliente01);
		Conta conta02 = new Conta(32467, 530.0, 200.0, cliente02);
		Conta conta03 = new Conta(32468, 530.0, 200.0, cliente03);
		
		Conta.imprimi();

        System.out.println(conta01.getSaldo());
        System.out.println(conta02.getNomeDoTitular());
        System.out.println(conta03.getLimite()+ "\n");
        conta01.depositar(700);
        conta02.setTitular(cliente04);
        conta03.transfere(conta02, 150);
        System.out.println(conta01.getSaldo());
        System.out.println(conta02.getNomeDoTitular());
        System.out.println(conta03.getLimite());
    }
}
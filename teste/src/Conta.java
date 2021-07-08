

public class Conta {
    private int numConta;
    private Cliente titular;
    private double saldo;
    private double limite;
    private static int totalDeContas = 0;

    public Conta(int numConta, double saldo, double limite, Cliente titular){
        this.numConta = numConta;
        this.saldo = saldo;
        this.limite = limite;
        this.titular = titular;
        this.totalDeContas += 1;
    }
    public int getNumConta() {
		return numConta;
	}
    public double getSaldo() {
		return saldo;
	}

	public double getLimite() {
		return limite;
	}

    public boolean sacar(double valor){
        if(valor >= this.saldo){
            this.saldo -= valor;
            return true;
        }else{
            return false;
        }
    }

    public boolean transfere(Conta destino, double valor){
        boolean retirada = this.sacar(valor);
        if(retirada){
            destino.depositar(valor);
            return true;
        }
        return false;
    }
    public void depositar(double valor){
        this.saldo += valor;
    }
    public Cliente getTitular() {
		return titular;
	}
	
	public void setTitular(Cliente titular) {
		this.titular = titular;
	}
	
	public String getNomeDoTitular() {
		return this.titular.getNome();
	}
	
	static void imprimi() {
		System.out.println("Quantidade de contas instânciadas: " + totalDeContas);
	}
}

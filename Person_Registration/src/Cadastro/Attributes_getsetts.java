package Cadastro;

public abstract class  Attributes_getsetts {

	protected String nome;
	protected int numeroConta;
	protected int agencia;
	protected int cpf;
	private double saldo, sacar, depositar;
	String str = "";
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getNumeroConta() {
		return numeroConta;
	}
	public void setNumeroConta(int numeroConta) {
		this.numeroConta = numeroConta;
	}
	public int getAgencia() {
		return agencia;
	}
	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}
	public int getCpf() {
		return cpf;
	}
	public void setCpf(int cpf) {
		this.cpf = cpf;
	}
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	public double getSacar() {
		return sacar;
	}
	public void setSacar(double sacar) {
		this.sacar = sacar;
	}
	public double getDepositar() {
		return depositar;
	}
	public void setDepositar(double depositar) {
		this.depositar = depositar;
	}
}

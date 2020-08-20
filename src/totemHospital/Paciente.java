package totemHospital;

public class Paciente {
	private String nome;
	private int idade;
	private int sintomas;
	private String cpf;
	
	public Paciente(String nome, String cpf, int sintomas, int idade) {
		super();
		this.nome = nome;
		this.idade = idade;
		this.sintomas = sintomas;
		this.cpf = cpf;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public int getSintomas() {
		return sintomas;
	}
	public void setSintomas(int sintomas) {
		this.sintomas = sintomas;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
}
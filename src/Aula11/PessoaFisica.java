package Aula11;

public class PessoaFisica extends Pessoa {
	private String cpf;
	private String rg;
	
	public PessoaFisica(String nome, String endereco, int telefone, 
			String cpf, String rg) {
		super(nome, endereco, telefone);
		this.cpf = cpf;
		this.rg = rg;
	}

	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getRg() {
		return rg;
	}
	public void setRg(String rg) {
		this.rg = rg;
	}

	@Override
	public String toString() {
		return "PessoaFisica [ |Nome= " + getNome() + " |CPF= " +cpf+ " |RG=" +rg+ " |Endereço= " +getEndereco()+ " |Telefone= " + getTelefone()+ "]";
	}
	
	
}

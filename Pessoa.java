public abstract class Pessoa {
	protected String nome;
	protected String cpf;
	Hospital hospital;
	
	Pessoa(String nome, String cpf){
		this.cpf = cpf;
		this.nome = nome;
	}

	public abstract void imprimir();
}
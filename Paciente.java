public class Paciente extends Pessoa {
	private String condicao;
	private String doenca;
	
	Paciente(String nome, String cpf, String condicao, String doenca){
		super(nome, cpf);
		this.condicao = condicao;
		this.doenca = doenca;
		hospital = Hospital.getInstancia();
	}
	
	public void imprimir() {
		System.out.println(toString());
	}
	
	public String toString() {
		return  "Hospital : " +hospital.nome + " Endereco : "+ hospital.endereco + "\n" 
				+ "Paciente : "+nome+" Cpf : "+cpf+"\n" 
				+ "Enfermidade : " + doenca + " Condição : " + condicao+"\n";
	}
}
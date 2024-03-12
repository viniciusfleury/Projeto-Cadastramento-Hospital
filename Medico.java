public class Medico extends Funcionarios {
	private String crm;
	private String especializacao;
	
	Medico(String crm, double salarioBruto, int horaextra, String especializacao, String nome, String cpf){
		super(salarioBruto, horaextra, nome, cpf);
		hospital = Hospital.getInstancia();
		this.crm = crm;
		this.especializacao = especializacao;
	}

	public double salarioLiquido(double salarioBruto) {
		return salarioBruto + ((0.1*salarioBruto)*horaextra);
	}
	
	public double getSalarioFinal() {
		return this.salarioLiquido(salarioBruto);
	}

	public String toString() {
		return  "Hospital : " +hospital.nome + " Endereco : "+ hospital.endereco + "\n" 
				+ "Medico(a) : "+nome+" Especializacao : " + especializacao+" Cpf : "+cpf +" Crm : "+crm+"\n" 
				+ "Salario : " + getSalarioFinal() + " Horas Extras : " + horaextra+"\n";
	}

	public void imprimir() {
			System.out.println(toString());
	}
}
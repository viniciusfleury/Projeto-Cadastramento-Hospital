public class Enfermeiro extends Funcionarios {
	private String crf;
	
	Enfermeiro(String crf, double salarioBruto, int horaextra, String nome, String cpf){
		super(salarioBruto, horaextra, nome, cpf);
		hospital = Hospital.getInstancia();
		this.crf = crf;
	}
	
	public double salarioLiquido(double salarioBruto) {
		return salarioBruto + ((0.05*salarioBruto)*horaextra);
	}
	
	public double getSalarioFinal() {
		return this.salarioLiquido(salarioBruto);
	}
	
	public String toString() {
		return  "Hospital : " +hospital.nome + " Endereco : "+ hospital.endereco + "\n" 
				+ "Enfermeiro(a) : "+nome+" Cpf : "+cpf+" Crf : "+crf+"\n" 
				+ "Salario : " + getSalarioFinal() + " Horas Extras : " + horaextra+"\n";
	}
	
	
	public void imprimir() {
			System.out.println(toString());
	}

}
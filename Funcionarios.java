public class Funcionarios extends Pessoa {
	protected double salarioBruto;
	protected int horaextra;
	
	Funcionarios(double salarioBruto, int horaextra, String nome, String cpf){
		super(nome, cpf);
		this.salarioBruto = salarioBruto;
		this.horaextra = horaextra;
	}
	
	public double salarioLiquido(double salarioBruto) {
		return salarioBruto;
	}
	
	public double getSalarioFinal() {
		return this.salarioLiquido(salarioBruto);
	}

	public void imprimir() {}

}